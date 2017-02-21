package proyectodavid.Negocio.Usuario;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyectodavid.Negocio.Pregunta.Pregunta;
import proyectodavid.Negocio.Usuario.ClavesUsuarioPregunta;
import proyectodavid.Negocio.Usuario.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:41:30")
@StaticMetamodel(UsuarioPregunta.class)
public class UsuarioPregunta_ { 

    public static volatile SingularAttribute<UsuarioPregunta, Usuario> idUsuario;
    public static volatile SingularAttribute<UsuarioPregunta, ClavesUsuarioPregunta> ida;
    public static volatile SingularAttribute<UsuarioPregunta, Pregunta> idPregunta;
    public static volatile SingularAttribute<UsuarioPregunta, String> solucion_user;
    public static volatile SingularAttribute<UsuarioPregunta, Boolean> aprobado;

}