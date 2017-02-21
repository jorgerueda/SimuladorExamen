/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Categoria.SA;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import proyectodavid.Negocio.Categoria.Categoria;

/**
 *
 * @author jorgerueda
 */
public class SACategoriaImp implements SACategoria {

    
    protected EntityManager entityManager;
    
    
    public SACategoriaImp(){
    
    EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("ProyectoDavidPU");

    this.entityManager = entityManagerFactory.createEntityManager();
   
    }
    
    
    @Override
    public int altaCategoria(Categoria categoria) {
        
         int exit =1;
        try{
            
       entityManager.getTransaction().begin();
       entityManager.persist(categoria);
       entityManager.getTransaction().commit();
       
        }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
       }
       
    }

    @Override
    public int bajaCategoria(Categoria categoria) {
       
        int exit=1;
        try{
       Categoria c = entityManager.find(Categoria.class,categoria.getId());
       entityManager.getTransaction().begin();
       entityManager.remove(c);
       entityManager.getTransaction().commit();
       }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
       }
        
    }

    @Override
    public int editarCategoria(Categoria categoria) {
        int exit=1;
        try{
       entityManager.getTransaction().begin();
             

       Categoria cat = entityManager.find(Categoria.class,categoria.getId());
        
       cat.setAcierto(categoria.getAcierto());
       cat.setFallo(categoria.getFallo());
       cat.setNombre(categoria.getNombre());
       cat.setNotaMinima(categoria.getNotaMinima());
       cat.setNumeroPreguntas(categoria.getNumeroPreguntas());
       cat.setTiempo(categoria.getTiempo());
       cat.setOrden(categoria.getOrden());
       entityManager.getTransaction().commit();
       }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
        }
    }

    @Override
    public Categoria mostrarCategoria(int id) {
        
     entityManager.getTransaction().begin();
     Categoria c= entityManager.find(Categoria.class, id);
     entityManager.close();
     return c;
    }
    
     @Override
    public Categoria mostrarCategoriaPorNombre(String nombre) {
        Categoria categoria = null;
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("Categoria.findByNombre");
        query.setParameter("nombre",nombre);
        List <Categoria> list = query.getResultList();
        if (!list.isEmpty()){
            categoria = list.get(0);
        }
        entityManager.close();
        return categoria;
        

    }

    @Override
    public Collection<Categoria> mostrarCategorias() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("Categoria.findAll");
        List <Categoria> list = query.getResultList();
        
         Collections.sort(list, new Comparator() {
         @Override
         public int compare(Object o1, Object o2) {
             Categoria p1,p2;
             p1=(Categoria)o1;
             p2=(Categoria) o2;
            return new Integer(p1.getOrden()).compareTo(new Integer(p2.getOrden()));         }
     });
    
        return list;

    }

    @Override
    public Vector<String> mostrarNombresCategoria() {
        Vector<String> data=new Vector<String>();   
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("Categoria.findAllNames");
        List <String> list = query.getResultList();
        for (String s : list){
            data.add(s);
        }
        return data;
    }
    
    
}
