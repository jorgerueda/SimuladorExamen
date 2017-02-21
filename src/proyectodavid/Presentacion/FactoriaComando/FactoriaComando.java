/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.FactoriaComando;

import proyectodavid.Presentacion.Comandos.Comando;
import proyectodavid.Presentacion.FactoriaComando.Imp.FactoriaComandoImp;

/**
 *
 * @author jorgerueda
 */
public abstract class FactoriaComando {

	private static FactoriaComando factoriaComando;
	
	/**
	 * Constructor privado por ser singleton
	 */
	protected FactoriaComando(){}

	/**
	 * Crea un comando dado el id del evento y los datos
	 * @param id_comando el id del evento
	 * @param datos los datos con los que trabaja
	 * @return el comando creado
	 */
	public abstract Comando getComando(int id_comando, Object datos);
	
	/**
	 * Obtiene una instancia de la clase
	 * @return la instancia de la clase
	 */
	public static FactoriaComando getInstancia() {

		if (factoriaComando == null) {
			factoriaComando = new FactoriaComandoImp();
		}

		return factoriaComando;

	}
}
