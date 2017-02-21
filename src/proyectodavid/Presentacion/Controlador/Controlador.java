/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Controlador;

import proyectodavid.Presentacion.Controlador.Imp.ControladorImp;

/**
 *
 * @author jorgerueda
 */
public abstract class Controlador {

	private static Controlador controlador;


	protected Controlador(){}
	
	
	public static Controlador getInstancia() {
	
		if(controlador == null){
			controlador = new ControladorImp();
		}
		
		return controlador;
	
	}

	
	public abstract void execute(int id_evento, Object datos);
	
}