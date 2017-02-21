/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.FactoriaSA.Imp;

import proyectodavid.Negocio.Categoria.SA.SACategoria;
import proyectodavid.Negocio.Categoria.SA.SACategoriaImp;
import proyectodavid.Negocio.Estadistica.SAEstadistica;
import proyectodavid.Negocio.Estadistica.SAEstadisticaImp;
import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Negocio.Pregunta.SA.SAPregunta;
import proyectodavid.Negocio.Pregunta.SA.SAPreguntaImp;
import proyectodavid.Negocio.Usuario.SA.SAUsuario;
import proyectodavid.Negocio.Usuario.SA.SAUsuarioImp;

/**
 *
 * @author jorgerueda
 */

public class FactoriaSAImp extends FactoriaSA {

    @Override
    public SAUsuario generaSAUsuario() {
        return new SAUsuarioImp();
    }

    @Override
    public SAPregunta generaSAPregunta() {
        return new SAPreguntaImp();
    }

    @Override
    public SACategoria generaSACategoria() {
        return new SACategoriaImp();
    }

    @Override
    public SAEstadistica generaSAEstadistica() {       
    return new SAEstadisticaImp();   
    }

	
	
}