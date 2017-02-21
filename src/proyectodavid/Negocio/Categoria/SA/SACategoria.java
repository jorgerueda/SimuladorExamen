/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.Categoria.SA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import proyectodavid.Negocio.Categoria.Categoria;

/**
 *
 * @author jorgerueda
 */
public interface SACategoria {
    
    public int altaCategoria(Categoria categoria);
    public int bajaCategoria (Categoria categoria);
    public int editarCategoria(Categoria categoria);
    public Categoria mostrarCategoria(int id);
    public Collection <Categoria> mostrarCategorias();
    public Categoria mostrarCategoriaPorNombre(String Nombre);
    public Vector <String> mostrarNombresCategoria();
    
    
}
