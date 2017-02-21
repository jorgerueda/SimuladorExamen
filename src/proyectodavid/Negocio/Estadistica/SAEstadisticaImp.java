/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Estadistica;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Categoria.SA.SACategoria;
import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Negocio.Estadistica.Estadistica;
import proyectodavid.Negocio.Usuario.SA.SAUsuario;
import proyectodavid.Negocio.Usuario.Usuario;

/**
 *
 * @author jorgerueda
 */
public class SAEstadisticaImp implements SAEstadistica{

    protected EntityManager entityManager;
    
    
    public SAEstadisticaImp(){
    
    EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("ProyectoDavidPU");

    this.entityManager = entityManagerFactory.createEntityManager();
    
    
    }
    
    @Override
    public int altaEstadistica(Estadistica estadistica) {
        
        
        int exit =1;
        try{
            
       entityManager.getTransaction().begin();
       //buscar si existe;
       Estadistica es=this.mostrarEstadisticaByCategoria(estadistica.getUsuario().getId(), estadistica.getCategoria());
       if(es!=null){ //si existe se edita
         Estadistica est = entityManager.find(Estadistica.class,es.getId());
         est.setOld(est.getActual());
         est.setContestadasOld(est.getContestadasNew());
         est.setActual(estadistica.getActual());
         est.setContestadasNew(estadistica.getContestadasNew());
         est.setCategoria(estadistica.getCategoria());
         est.setUsuario(estadistica.getUsuario());
         entityManager.getTransaction().commit();
           
       }else{//si no existe se crea
       
       estadistica.setOld(estadistica.getActual());
       estadistica.setContestadasOld(estadistica.getContestadasNew());
       entityManager.persist(estadistica);
       entityManager.getTransaction().commit();       
       }    
        }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
       }
       
       
        
    }

    @Override
    public int bajaEstadistica(Estadistica estadistica) {
      return 0;
    }

    @Override
    public Estadistica mostrarEstadistica(int id) {
     entityManager.getTransaction().begin();
     Estadistica p = entityManager.find(Estadistica.class, id);
     entityManager.close();
     return p;
    }

  

    @Override
    public int editarEstadistica(Estadistica estadistica) {
        int exit=1;
        try{
       entityManager.getTransaction().begin();
             

       Estadistica est = entityManager.find(Estadistica.class,estadistica.getId());
        
       est.setActual(estadistica.getActual());
       est.setOld(estadistica.getOld());
       
      
       entityManager.getTransaction().commit();
       }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
        }
    }

    @Override
    public Collection<Estadistica> mostrarEstadisticas(int idUsuario) {
      
        entityManager.getTransaction().begin();
        Query query1= entityManager.createNamedQuery("Estadistica.SelectEstadisticaByUser");
        SAUsuario servicioUsuario = FactoriaSA.getInstancia().generaSAUsuario();
        Usuario u= servicioUsuario.mostrarUsuario(idUsuario);
        List <Estadistica> listC  = new ArrayList<Estadistica>();
        if(u!=null){
        query1.setParameter("usuario",u);
        listC  = query1.getResultList();
        
        
       
        }//endif
        entityManager.close();
        return listC;
    }
 @Override
    public Estadistica mostrarEstadisticaByCategoria(int idUsuario, Categoria categoria) {
        if(!entityManager.getTransaction().isActive()){
            entityManager.getTransaction().begin();
        }
        SAUsuario servicioUsuario = FactoriaSA.getInstancia().generaSAUsuario();

        Usuario u= servicioUsuario.mostrarUsuario(idUsuario);
        Query query1= entityManager.createNamedQuery("Estadistica.SelectEstadisticaByCategoria");
        Estadistica es=null;
        List <Estadistica> listC  = new ArrayList<Estadistica>();
        if(u!=null){
        query1.setParameter("usuario",u);
        query1.setParameter("categoria",categoria);

        listC  = query1.getResultList();
        if(listC.size()>0){
        es= listC.get(0);
        }
        
       
        }//endif
        return es;
    }


   
}

       