package proyectodavid.Negocio.Categoria;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyectodavid.Negocio.Pregunta.Pregunta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:41:30")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, Integer> id;
    public static volatile SingularAttribute<Categoria, String> nombre;
    public static volatile SingularAttribute<Categoria, Double> acierto;
    public static volatile SingularAttribute<Categoria, Integer> orden;
    public static volatile SingularAttribute<Categoria, Integer> tiempo;
    public static volatile ListAttribute<Categoria, Pregunta> lista_preguntas;
    public static volatile SingularAttribute<Categoria, Double> fallo;
    public static volatile SingularAttribute<Categoria, Integer> numeroPreguntas;
    public static volatile SingularAttribute<Categoria, Integer> notaMinima;

}