/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Dispatcher.Imp;

import proyectodavid.Negocio.Usuario.Usuario;
import proyectodavid.Presentacion.Dispatcher.Dispatcher;
import proyectodavid.Presentacion.Dispatcher.EventoVista;
import proyectodavid.Presentacion.Vistas.VistaCategoria;
import proyectodavid.Presentacion.Vistas.VistaUsuario;
import proyectodavid.Presentacion.Vistas.administracionCategorias;
import proyectodavid.Presentacion.Vistas.administracionPreguntas;
import proyectodavid.Presentacion.Vistas.administracionUsuarios;

/**
 *
 * @author jorgerueda
 */
public class DispatcherImp extends Dispatcher {

	@Override
	public void dispatch(int id_evento_vista, Object datos) {
	
		switch(id_evento_vista){
		
							//PREGUNTAS
		
			case EventoVista.ALTA_PREGUNTA_EXITO: administracionPreguntas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_PREGUNTA_FALLO: administracionPreguntas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.BAJA_PREGUNTA_EXITO: administracionPreguntas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.BAJA_PREGUNTA_FALLO: administracionPreguntas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.MODIFICAR_PREGUNTA_EXITO: administracionPreguntas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.MODIFICAR_PREGUNTA_FALLO: administracionPreguntas.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			
			
							//USUARIOS
			
			case EventoVista.ALTA_USUARIO_EXITO: administracionUsuarios.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_USUARIO_FALLO: administracionUsuarios.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.ALTA_USUARIO_FALLO_USUARIO_EXISTE: new VistaUsuario().actualizar(id_evento_vista, datos); break;
                        case EventoVista.BAJA_USUARIO_EXITO: administracionUsuarios.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.BAJA_USUARIO_FALLO: administracionUsuarios.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MODIFICAR_USUARIO_EXITO: administracionUsuarios.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.MODIFICAR_USUARIO_FALLO: administracionUsuarios.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                                                        
                                                        //CATEGORIAS
			case EventoVista.ALTA_CATEGORIA_EXITO: administracionCategorias.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.ALTA_CATEGORIA_FALLO: administracionCategorias.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.ALTA_CATEGORIA_FALLO_CATEGORIA_EXISTE: new VistaCategoria().actualizar(id_evento_vista, datos); break;
                        case EventoVista.BAJA_CATEGORIA_EXITO: administracionCategorias.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.BAJA_CATEGORIA_FALLO: administracionCategorias.obtenerInstancia().actualizar(id_evento_vista, datos); break;
			case EventoVista.MODIFICAR_CATEGORIA_EXITO: administracionCategorias.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                        case EventoVista.MODIFICAR_CATEGORIA_FALLO: administracionCategorias.obtenerInstancia().actualizar(id_evento_vista, datos); break;
                                                        
					
		}	
	}

}
