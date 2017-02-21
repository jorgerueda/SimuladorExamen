/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Usuario.SA;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import proyectodavid.Negocio.Usuario.Usuario;

/**
 *
 * @author jorgerueda
 */
public class SAUsuarioPreguntaImp implements SAUsuarioPregunta{
    protected EntityManager entityManager;

    public SAUsuarioPreguntaImp() {
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProyectoDavidPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public int borrarByUsuario(Usuario usuario) {
     Query query = entityManager.createNamedQuery("UsuarioPregunta.removeByUsuario");
     query.setParameter("usuario", usuario);
     query.executeUpdate();
     entityManager.close();
     return 0;
    }
    
}
