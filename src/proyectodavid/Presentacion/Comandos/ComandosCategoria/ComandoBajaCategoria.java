/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Comandos.ComandosCategoria;

import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Categoria.SA.SACategoria;
import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Presentacion.Comandos.Comando;
import proyectodavid.Presentacion.Comandos.RetornoComando;
import proyectodavid.Presentacion.Dispatcher.EventoVista;

/**
 *
 * @author jorgerueda
 */
public class ComandoBajaCategoria extends Comando{

    @Override
    public RetornoComando execute() {
        
    SACategoria servicioCategoria = FactoriaSA.getInstancia().generaSACategoria ();
    Categoria  categoria = (Categoria )datos;
    int id= servicioCategoria .bajaCategoria (categoria);
     RetornoComando respuestaComando;
    if(id == 1){
			respuestaComando = new RetornoComando(EventoVista.BAJA_CATEGORIA_EXITO,id); //crea la respuesta de comando
		}
		else {
			respuestaComando = new RetornoComando(EventoVista.BAJA_CATEGORIA_FALLO,id); //crea la respuesta de comando
		}
		
		
		return respuestaComando;
    
    }
    
                
                
    
    
}
