package proyectodavid.Negocio.Usuario;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyectodavid.Negocio.Usuario.UsuarioPregunta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:41:30")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile CollectionAttribute<Usuario, UsuarioPregunta> lista_preguntas;
    public static volatile SingularAttribute<Usuario, Integer> intentosRealizados;
    public static volatile SingularAttribute<Usuario, Integer> intentos;
    public static volatile SingularAttribute<Usuario, String> rol;
    public static volatile SingularAttribute<Usuario, String> pass;

}