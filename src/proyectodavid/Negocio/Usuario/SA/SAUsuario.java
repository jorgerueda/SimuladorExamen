/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Usuario.SA;

import java.util.Collection;
import proyectodavid.Negocio.Pregunta.Pregunta;
import proyectodavid.Negocio.Usuario.Usuario;

/**
 *
 * @author jorgerueda
 */
public interface SAUsuario {
    
    public int altaUsuario(Usuario usuario);
    public int bajaUsuario (Usuario usuario);
    public Usuario mostrarUsuario(int id);
    public Usuario login(Usuario usuario);
    public Collection<Usuario> mostrarUsuarios();
    public Collection <Pregunta> mostrarPreguntasUsuario();
    public Usuario buscarPorUsuario(String nombreUsuario);
    public int editarUsuario(Usuario usuario);
    public int agregarSolucionPregunta(Usuario usuario);
    
}
