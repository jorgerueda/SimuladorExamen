/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Dispatcher;

import proyectodavid.Presentacion.Dispatcher.Imp.DispatcherImp;

/**
 *
 * @author jorgerueda
 */
public abstract class Dispatcher {
	
	private static Dispatcher dispatcher;
	
	/**
	 * Constructor privado por ser singleton
	 */
	protected Dispatcher(){}
	
	/**
	 * Obtiene una instancia de la clase
	 * @return la instancia de la clase
	 */
	public static Dispatcher getInstancia() {
	
		if(dispatcher == null){
			dispatcher = new DispatcherImp();
		}
		
		return dispatcher;
	
	}

	/**
	 * permite actualizar la vista en funcion de un evento producido
	 * @param id_evento_vista el id del evento de la vista
	 * @param datos los datos necesarios por si hay algun cambio
	 */
	public abstract void dispatch(int id_evento_vista, Object datos);
}
