/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.FactoriaComando.Imp;

import proyectodavid.Presentacion.Comandos.Comando;
import proyectodavid.Presentacion.Comandos.ComandosCategoria.ComandoAltaCategoria;
import proyectodavid.Presentacion.Comandos.ComandosCategoria.ComandoBajaCategoria;
import proyectodavid.Presentacion.Comandos.ComandosCategoria.ComandoEditarCategoria;
import proyectodavid.Presentacion.Comandos.ComandosPregunta.ComandoAltaPregunta;
import proyectodavid.Presentacion.Comandos.ComandosPregunta.ComandoBajaPregunta;
import proyectodavid.Presentacion.Comandos.ComandosPregunta.ComandoEditarPregunta;
import proyectodavid.Presentacion.Comandos.ComandosPregunta.ComandoMostrarPregunta;
import proyectodavid.Presentacion.Comandos.ComandosPregunta.ComandoMostrarPreguntas;
import proyectodavid.Presentacion.Comandos.ComandosUsuarios.ComandoAgregarExamen;
import proyectodavid.Presentacion.Comandos.ComandosUsuarios.ComandoAltaUsuario;
import proyectodavid.Presentacion.Comandos.ComandosUsuarios.ComandoBajaUsuario;
import proyectodavid.Presentacion.Comandos.ComandosUsuarios.ComandoEditarUsuario;
import proyectodavid.Presentacion.Controlador.Evento;
import proyectodavid.Presentacion.FactoriaComando.FactoriaComando;

/**
 *
 * @author jorgerueda
 */
public class FactoriaComandoImp extends FactoriaComando {

    @Override
    public Comando getComando(int id_comando, Object datos) {
      Comando comando = null;
		
		switch (id_comando){

		//Preguntas
		case Evento.ALTA_PREGUNTA: comando = new ComandoAltaPregunta(); break;
		case Evento.BAJA_PREGUNTA: comando = new ComandoBajaPregunta(); break;
		case Evento.MODIFICAR_PREGUNTA: comando = new ComandoEditarPregunta(); break;
                case Evento.MOSTRAR_PREGUNTA: comando = new ComandoMostrarPregunta(); break;
                case Evento.MOSTRAR_PREGUNTAS: comando = new ComandoMostrarPreguntas(); break;
                
                //Usuarios
                case Evento.ALTA_USUARIO: comando = new ComandoAltaUsuario(); break;
		case Evento.BAJA_USUARIO: comando = new ComandoBajaUsuario(); break;
		case Evento.MODIFICAR_USUARIO: comando = new ComandoEditarUsuario(); break;
                case Evento.AGREGAR_EXAMEN: comando = new ComandoAgregarExamen();break;
               // case Evento.MOSTRAR_USUARIO: comando = new ComandoMostrarUsuario(); break;
                // case Evento.MOSTRAR_USUARIOS: comando = new ComandoMostrarUsuarios(); break;

                  //Categorias
                
                case Evento.ALTA_CATEGORIA: comando = new ComandoAltaCategoria(); break;
		case Evento.BAJA_CATEGORIA: comando = new ComandoBajaCategoria(); break;
		case Evento.MODIFICAR_CATEGORIA: comando = new ComandoEditarCategoria(); break;

		
		}		
		return comando;
	}
}
