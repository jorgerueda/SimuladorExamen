/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Estadistica;

import java.util.Collection;
import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Estadistica.Estadistica;

/**
 *
 * @author jorgerueda
 */
public interface SAEstadistica {
    
    
    
    public int altaEstadistica(Estadistica estadistica);
    public int bajaEstadistica (Estadistica estadistica);
    public int editarEstadistica(Estadistica estadistica);
    public Estadistica mostrarEstadistica(int id);
    public Collection <Estadistica> mostrarEstadisticas( int idUsuario);
    public Estadistica mostrarEstadisticaByCategoria (int idUsuario, Categoria categoria);
    
    
}
