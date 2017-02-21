/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Comandos.ComandosPregunta;

import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Negocio.Pregunta.Pregunta;
import proyectodavid.Negocio.Pregunta.SA.SAPregunta;
import proyectodavid.Presentacion.Comandos.Comando;
import proyectodavid.Presentacion.Comandos.RetornoComando;
import proyectodavid.Presentacion.Dispatcher.EventoVista;

/**
 *
 * @author jorgerueda
 */
public class ComandoAltaPregunta extends Comando {
    
    public RetornoComando execute() {
		
        
        
        
		int id;
                
           
		//crea el servicio de empleados, lo crea utilizando una f�brica
		SAPregunta servicioPregunta = FactoriaSA.getInstancia().generaSAPregunta();
		
		Pregunta pregunta = (Pregunta)datos; //hacemos casting de los datos del comando
		
		id = servicioPregunta.altaPregunta(pregunta);
		
		RetornoComando respuestaComando;

		if(id == 1){
			respuestaComando = new RetornoComando(EventoVista.ALTA_PREGUNTA_EXITO,id); //crea la respuesta de comando
		}
		else {
			respuestaComando = new RetornoComando(EventoVista.ALTA_PREGUNTA_FALLO,id); //crea la respuesta de comando
		}
		
		
		return respuestaComando;
	}
}


