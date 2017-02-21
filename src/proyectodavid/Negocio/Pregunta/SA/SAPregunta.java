/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Pregunta.SA;

import java.util.Collection;
import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Pregunta.Pregunta;

/**
 *
 * @author jorgerueda
 */
public interface SAPregunta {
    
    
    
    public int altaPregunta(Pregunta pregunta);
    public int bajaPregunta (Pregunta pregunta);
    public int editarPregunta(Pregunta pregunta);
    public Pregunta mostrarPregunta(int id);
    public Collection <Pregunta> mostrarPreguntas();
    public Collection <Pregunta> mostrarPreguntasByCategoria(Categoria c);
    public Collection <Pregunta> mostrarPreguntasRandom(String categoria, int numeroPreguntas);
    public Collection <Pregunta> PreguntasRandomByCategoria(String categoria, int numeroPreguntas);
    
    
}
