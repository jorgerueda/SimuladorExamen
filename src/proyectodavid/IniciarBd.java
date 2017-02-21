/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Categoria.SA.SACategoria;
import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Negocio.Pregunta.Pregunta;
import proyectodavid.Negocio.Usuario.Usuario;

/**
 *
 * @author jorgerueda
 */
public class IniciarBd {
    
    
    
   public  IniciarBd(){
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoDavidPU");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       Usuario usuario= new Usuario();
       usuario.setUsuario("123456");
       usuario.setApellidos("Admin");
       usuario.setNombre("Admin");
       usuario.setRol("Administrador");
       usuario.setPass("123456"); 
       Categoria categoria1= new Categoria("PSICOTECNICA",50,20,25,1.0,0.0,1);
       Categoria categoria2= new Categoria("PLANOS",6,15,2,1.0,-0.1,2);
       Categoria categoria3= new Categoria("ITINERARIOS",12,15,6,1.0,-0.1,3);
       Categoria categoria4= new Categoria("CENTROS DE INTERES",12,10,6,1.0,-0.1,4);
       Categoria categoria5= new Categoria("LEGISLACION",15,15,8,1.0,-0.1,5);
       Categoria categoria6= new Categoria("TARIFAS",30,30,18,1.0,-0.1,6);
       
       entityManager.getTransaction().begin();
       entityManager.persist(usuario);
       entityManager.persist(categoria1);
       entityManager.persist(categoria2);
       entityManager.persist(categoria3);
       entityManager.persist(categoria4);
       entityManager.persist(categoria5);
       entityManager.persist(categoria6);
       entityManager.getTransaction().commit();
       entityManager.close();
        
    }
   
   
    public  IniciarBd(int nada){
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoDavidPU");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
       Pregunta q1;
       
      SACategoria servicioCategoria = FactoriaSA.getInstancia().generaSACategoria();
      
      Collection<Categoria> categorias = servicioCategoria.mostrarCategorias();
   /*   
     Categoria psico =servicioCategoria.mostrarCategoriaPorNombre("PSICOTECNICA");
     Categoria planos =servicioCategoria.mostrarCategoriaPorNombre("PLANOS");
     Categoria itini =servicioCategoria.mostrarCategoriaPorNombre("ITINERARIOS");
     Categoria centros =servicioCategoria.mostrarCategoriaPorNombre("CENTROS DE INTERES");
     Categoria leg =servicioCategoria.mostrarCategoriaPorNombre("LEGISLACION");
     Categoria tarifa =servicioCategoria.mostrarCategoriaPorNombre("TARIFAS");
*/
       for (int i= 0;i<60;i++){
           String p = "p"+i;
           String a = "a"+i;
           String b= "b"+i;
           String c= "c"+i;
           String d= "d"+i;
           
           for(Categoria cat :categorias){
               
           q1= new Pregunta(p+cat.getNombre(),a,b,c,d,cat,"A");
           entityManager.persist(q1);
           }
            
          
       }
     
       entityManager.getTransaction().commit();
       entityManager.close();
        
    }
    
}
