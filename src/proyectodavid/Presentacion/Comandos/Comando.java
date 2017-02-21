/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Comandos;

/**
 *
 * @author jorgerueda
 */
public abstract class Comando {

	protected Object datos;

	public abstract RetornoComando execute();
	

	public void setDatos(Object datos){
		this.datos = datos;
	}
	

	public Object getDatos(){
		return this.datos;
	}
}