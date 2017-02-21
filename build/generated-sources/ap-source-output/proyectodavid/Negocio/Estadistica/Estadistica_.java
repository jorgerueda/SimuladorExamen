package proyectodavid.Negocio.Estadistica;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Usuario.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:41:30")
@StaticMetamodel(Estadistica.class)
public class Estadistica_ { 

    public static volatile SingularAttribute<Estadistica, Integer> id;
    public static volatile SingularAttribute<Estadistica, Integer> old;
    public static volatile SingularAttribute<Estadistica, Usuario> usuario;
    public static volatile SingularAttribute<Estadistica, Integer> contestadasNew;
    public static volatile SingularAttribute<Estadistica, Integer> actual;
    public static volatile SingularAttribute<Estadistica, Categoria> Categoria;
    public static volatile SingularAttribute<Estadistica, Integer> contestadasOld;

}