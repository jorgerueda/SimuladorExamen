/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Pregunta.SA;

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
import proyectodavid.Negocio.Pregunta.Pregunta;

/**
 *
 * @author jorgerueda
 */
public class SAPreguntaImp implements SAPregunta{

    protected EntityManager entityManager;
    
    
    public SAPreguntaImp(){
    
    EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("ProyectoDavidPU");

    this.entityManager = entityManagerFactory.createEntityManager();
    
    
    }
    
    @Override
    public int altaPregunta(Pregunta pregunta) {
        
        int exit =1;
        try{
            
       entityManager.getTransaction().begin();
       entityManager.persist(pregunta);
       entityManager.getTransaction().commit();
       
        }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
       }
       
       
        
    }

    @Override
    public int bajaPregunta(Pregunta pregunta) {
        int exit=1;
        try{
       Pregunta p = entityManager.find(Pregunta.class,pregunta.getId());
       entityManager.getTransaction().begin();
       entityManager.remove(p);
       entityManager.getTransaction().commit();
       }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
       }
        
    }

    @Override
    public Pregunta mostrarPregunta(int id) {
     entityManager.getTransaction().begin();
     Pregunta p = entityManager.find(Pregunta.class, id);
     entityManager.close();
     return p;
    }

    @Override
    public Collection<Pregunta> mostrarPreguntas() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("Pregunta.findAll");
        List <Pregunta> list = query.getResultList();
        entityManager.close();
        return list;
        
        
    }

    @Override
    public int editarPregunta(Pregunta pregunta) {
        int exit=1;
        try{
       entityManager.getTransaction().begin();
             

       Pregunta prg = entityManager.find(Pregunta.class,pregunta.getId());
        
       prg.setA(pregunta.getA());
       prg.setB(pregunta.getB());
       prg.setC(pregunta.getC());
       prg.setD(pregunta.getD());
       prg.setCategoria(pregunta.getCategoria());
       prg.setSolucion(pregunta.getSolucion());
       prg.setPregunta(pregunta.getPregunta());
      
       if(pregunta.getNamePhoto1()!=null){
         
            prg.setNamePhoto1(pregunta.getNamePhoto1());
            prg.setPhoto1(pregunta.getPhoto1());
            
       }
       if(pregunta.getNamePhoto2()!=null){
          
       prg.setNamePhoto2(pregunta.getNamePhoto2());
       prg.setPhoto2(pregunta.getPhoto2());
       
       }
       entityManager.getTransaction().commit();
       }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
        }
    }

    @Override
    public Collection<Pregunta> mostrarPreguntasRandom(String categoria, int numeroPreguntas) {
        entityManager.getTransaction().begin();
        Query query1= entityManager.createNamedQuery("Pregunta.findMaxId");
        query1.setParameter("categoria",categoria);
        int max = (int)query1.getSingleResult();
        
        String listaIndices = generarNumerosAleatorios(numeroPreguntas,max);
        Query query2 = entityManager.createNamedQuery("Pregunta.findRandom");
        query2.setParameter("lista", listaIndices);
        query2.setParameter("categoria",categoria);
        List <Pregunta> list = query2.setMaxResults(numeroPreguntas).getResultList();
        entityManager.close();
        return list;

    }
    
    public void prueba(){
        
        System.out.print(generarNumerosAleatorios(2,10));
        
    }
    
    public void prueba2(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Pregunta> q =  cb.createQuery(Pregunta.class);
       
        
    }
    
     private String generarNumerosAleatorios(int cantidad, int max){
         cantidad = cantidad*10;
         
         if(cantidad>max){
           cantidad= max;  
         }
         System.out.println(cantidad);
        List<Integer> lista = new ArrayList<Integer>();
        
        for (int i =0; i< cantidad; i++){
            
         int random=(int) (Math.random() * max) + 1;
         while (lista.contains(random)){
           random=(int) (Math.random() * max) + 1;
         }  
         
         lista.add(random);
         System.out.println(lista.toString());

        }
        String resultado =StringUtils.join(lista,',');  
        return resultado ;
        }

    @Override
    public Collection<Pregunta> PreguntasRandomByCategoria(String categoria, int numeroPreguntas) {
        entityManager.getTransaction().begin();
        Query query1= entityManager.createNamedQuery("Pregunta.SelectIdByCategoria");
        SACategoria servicioCategoria = FactoriaSA.getInstancia().generaSACategoria();
        Categoria c= servicioCategoria.mostrarCategoriaPorNombre(categoria);
        List <Pregunta> listP = new ArrayList<Pregunta>();
        if(c!=null){
        query1.setParameter("categoria",c);
        List <Integer> list = query1.getResultList();
        
        
        for(int i=0; i<numeroPreguntas; i++){
        int random=(int) (Math.random() * list.size());
   
        Pregunta p= new SAPreguntaImp().mostrarPregunta(list.get(random));
        
        listP.add(p);
        list.remove(random);
                } //endfor
        }//endif
        entityManager.close();
        return listP;
    }

    @Override
    public Collection<Pregunta> mostrarPreguntasByCategoria(Categoria c) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("Pregunta.findByCategoria");
        query.setParameter("categoria",c);
        List <Pregunta> list = query.getResultList();
        entityManager.close();
        return list;

    }
}

       