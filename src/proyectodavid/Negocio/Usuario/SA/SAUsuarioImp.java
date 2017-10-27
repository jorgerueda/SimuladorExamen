/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Usuario.SA;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import proyectodavid.IniciarBd;
import proyectodavid.Negocio.Estadistica.Estadistica;
import proyectodavid.Negocio.Estadistica.SAEstadistica;
import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Negocio.Pregunta.Pregunta;
import proyectodavid.Negocio.Usuario.Usuario;

/**
 *
 * @author jorgerueda
 */
public class SAUsuarioImp implements SAUsuario{
    protected EntityManager entityManager;
    
    
    public SAUsuarioImp (){
     
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoDavidPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
    @Override
    public int altaUsuario(Usuario usuario) {
        
        int exit=1;
        try{
       entityManager.getTransaction().begin();
       entityManager.persist(usuario);
       entityManager.getTransaction().commit();
       }catch(RollbackException e){
        System.out.println ("Entro db ");    
        exit= -1;
        
        }catch(Exception ex){
         System.out.println ("Entro e ");    
         exit= 0; 
        }finally{
        entityManager.close();
        return exit;
       }
    }

    @Override
    public int bajaUsuario(Usuario usuario) {
        
        int exit=1;
        try{
       Usuario usr = entityManager.find(Usuario.class,usuario.getId());
       
       SAEstadistica servicioEstadistica = FactoriaSA.getInstancia().generaSAEstadistica();
       Collection <Estadistica> listC=servicioEstadistica.mostrarEstadisticas(usr.getId());
       
       for( Estadistica es : listC){
          servicioEstadistica = FactoriaSA.getInstancia().generaSAEstadistica();  
             servicioEstadistica.bajaEstadistica(es);
         }       

       entityManager.getTransaction().begin();
       entityManager.remove(usr);
       entityManager.getTransaction().commit();
       }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
       }
    }

    @Override
    public Usuario mostrarUsuario(int id) {
        
         System.out.println("entro en mostrarUsuario");
         entityManager.getTransaction().begin();
         Usuario usr = entityManager.find(Usuario.class,id);
         System.out.println("el usuario mostrado es:");
         System.out.println("usr");     
         entityManager.close();
         return usr;
      
        
    }

    @Override
    public Collection<Usuario> mostrarUsuarios() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("Usuario.findAll");
        List <Usuario> list = query.getResultList();
        entityManager.close();
        return list;
        
    }

    @Override
    public Collection<Pregunta> mostrarPreguntasUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Usuario buscarPorUsuario(String nombreUsuario){
     Usuario usr= null;
     entityManager.getTransaction().begin();
     Query query = entityManager.createNamedQuery("Usuario.findByUsuario");
     query.setParameter("usuario",nombreUsuario);
     List <Usuario> list = query.getResultList();
     if (!list.isEmpty()){
     usr = list.get(0);
     }
     entityManager.close();
    return usr;
        
    }

    @Override
    public Usuario login(Usuario usuario) {
        
     if ( usuario.getUsuario().equals("CrearAdmin") && usuario.getPass().equals("CrearAdmin")){
      System.out.println("entroLogin");
      new IniciarBd();
      return null;
  
     }else if ( usuario.getUsuario().equals("CrearPreguntas") && usuario.getPass().equals("CrearPreguntas")){
      new IniciarBd(1);
      return null;
  
     }else{   
     Usuario usr= null;
     entityManager.getTransaction().begin();
     Query query = entityManager.createNamedQuery("Usuario.findByUsuario");
     query.setParameter("usuario", usuario.getUsuario());
     List <Usuario> list = query.getResultList();
     if (!list.isEmpty()){
     usr = list.get(0);
      if (!usr.getPass().equals(usuario.getPass())){
           usr = null;
      }
     }
     entityManager.close();
    return usr;
     }
    }

    @Override
    public int editarUsuario(Usuario usuario) {
         int exit=1;
        try{
       entityManager.getTransaction().begin();
       Usuario usr = entityManager.find(Usuario.class,usuario.getId());
       
       usr.setApellidos(usuario.getApellidos());
       usr.setNombre(usuario.getNombre());
       usr.setIntentos(usuario.getIntentos());
       usr.setPass(usuario.getPass());
       usr.setRol(usuario.getRol());
       usr.setUsuario(usuario.getUsuario());
       usr.setLista_preguntas(usuario.getLista_preguntas());
       usr.setIntentosRealizados(usuario.getIntentosRealizados());
       entityManager.getTransaction().commit();
       }catch(Exception e){
            
        exit= 0;
        
        }finally{
        entityManager.close();
        return exit;
       }
    }

    @Override
    public int agregarSolucionPregunta(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
