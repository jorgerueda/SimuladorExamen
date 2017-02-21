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
public class RetornoComando {
	
	private int id_evento_vista; //tiene el id de la respuesta y los datos devueltos
	private Object datos;
	
	public RetornoComando(int id_evento_vista, Object datos){
		this.id_evento_vista = id_evento_vista;
		this.datos = datos;
	}
	
	public int getId_evento_vista() {
		return id_evento_vista;
	}
	public void setId_evento_vista(int id_evento_vista) {
		this.id_evento_vista = id_evento_vista;
	}
	public Object getDatos() {
		return datos;
	}
	public void setDatos(Object datos) {
		this.datos = datos;
	}

}