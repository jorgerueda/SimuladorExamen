/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Comandos.ComandosUsuarios;

import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Negocio.Usuario.SA.SAUsuario;
import proyectodavid.Negocio.Usuario.Usuario;
import proyectodavid.Presentacion.Comandos.Comando;
import proyectodavid.Presentacion.Comandos.RetornoComando;
import proyectodavid.Presentacion.Dispatcher.EventoVista;

/**
 *
 * @author jorgerueda
 */
public class ComandoAltaUsuario extends Comando{

    @Override
    public RetornoComando execute() {
        
                int id;
		SAUsuario servicioUsuario = FactoriaSA.getInstancia().generaSAUsuario();
                Usuario usuario = (Usuario)datos;
                id = servicioUsuario.altaUsuario(usuario);
                
                RetornoComando respuestaComando;

		if(id == 1){
			respuestaComando = new RetornoComando(EventoVista.ALTA_USUARIO_EXITO,id); //crea la respuesta de comando
		}else if (id == -1){
                    
                        respuestaComando = new RetornoComando(EventoVista.ALTA_USUARIO_FALLO_USUARIO_EXISTE,usuario); //crea la respuesta de comando
                }
		else {
			respuestaComando = new RetornoComando(EventoVista.ALTA_USUARIO_FALLO,id); //crea la respuesta de comando
		}
		
		
		return respuestaComando;
    }
    
}
