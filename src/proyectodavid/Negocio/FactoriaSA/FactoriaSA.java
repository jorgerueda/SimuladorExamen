/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Negocio.FactoriaSA;

import proyectodavid.Negocio.Categoria.SA.SACategoria;
import proyectodavid.Negocio.Estadistica.SAEstadistica;
import proyectodavid.Negocio.FactoriaSA.Imp.FactoriaSAImp;
import proyectodavid.Negocio.Pregunta.SA.SAPregunta;
import proyectodavid.Negocio.Usuario.SA.SAUsuario;

/**
 *
 * @author jorgerueda
 */
public abstract class FactoriaSA {

	private static FactoriaSA instancia;

	public static FactoriaSA getInstancia() {

		if (instancia == null)
			instancia = new FactoriaSAImp();
		
		return instancia;
	}

	public abstract SAUsuario generaSAUsuario();
	public abstract SAPregunta generaSAPregunta();
        public abstract SACategoria generaSACategoria();
         public abstract SAEstadistica generaSAEstadistica();

}