/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Controlador.Imp;

import proyectodavid.Presentacion.Comandos.Comando;
import proyectodavid.Presentacion.Comandos.RetornoComando;
import proyectodavid.Presentacion.Controlador.Controlador;
import proyectodavid.Presentacion.Dispatcher.Dispatcher;
import proyectodavid.Presentacion.FactoriaComando.FactoriaComando;

/**
 *
 * @author jorgerueda
 */
public class ControladorImp extends Controlador {
	
	@Override
	public void execute(int id_evento, Object datos) {
		
		Comando comando = FactoriaComando.getInstancia().getComando(id_evento, datos);
		comando.setDatos(datos); //le da los datos al comando
		RetornoComando respuesta = comando.execute(); //lo ejecuta
		Dispatcher.getInstancia().dispatch(respuesta.getId_evento_vista(), respuesta.getDatos()); 
		//redirige la vista en funcion de la respuesta
	}
}
