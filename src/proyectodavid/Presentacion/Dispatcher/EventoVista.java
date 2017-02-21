/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Dispatcher;

/**
 *
 * @author jorgerueda
 */
public class EventoVista {
    public final static int ALTA_PREGUNTA_EXITO = 1010;
    public final static int BAJA_PREGUNTA_EXITO = 1020;
    public final static int MODIFICAR_PREGUNTA_EXITO = 1030;
    public final static int MOSTRAR_PREGUNTA_EXITO = 1040;
    public final static int MOSTRAR_PREGUNTAS_EXITO = 1050;

		
    public final static int ALTA_USUARIO_EXITO = 2010;
    public final static int BAJA_USUARIO_EXITO = 2020;
    public final static int MODIFICAR_USUARIO_EXITO = 2030;
    public final static int MOSTRAR_USUARIO_EXITO = 2040;
    public final static int MOSTRAR_USUARIOS_EXITO = 2050;
    public final static int AGREGAR_EXAMEN_EXITO = 2060;
    
    
    public final static int ALTA_CATEGORIA_EXITO = 3010;
    public final static int BAJA_CATEGORIA_EXITO = 3020;
    public final static int MODIFICAR_CATEGORIA_EXITO = 3030;
    //EVENTOS DE FALLO
		
    public final static int ALTA_PREGUNTA_FALLO = 1011;
    public final static int BAJA_PREGUNTA_FALLO = 1021;
    public final static int MODIFICAR_PREGUNTA_FALLO = 1031;
    public final static int MOSTRAR_PREGUNTA_FALLO = 1041;
    public final static int MOSTRAR_PREGUNTAS_FALLO = 1051;

		
    public final static int ALTA_USUARIO_FALLO = 2011;
    public final static int BAJA_USUARIO_FALLO = 2021;
    public final static int MODIFICAR_USUARIO_FALLO = 2031;
    public final static int MOSTRAR_USUARIO_FALLO = 2041;
    public final static int MOSTRAR_USUARIOS_FALLO= 2051;
    public final static int ALTA_USUARIO_FALLO_USUARIO_EXISTE = 2061;
    public final static int AGREGAR_EXAMEN_FALLO= 2071;
    
    public final static int ALTA_CATEGORIA_FALLO = 3011;
    public final static int BAJA_CATEGORIA_FALLO = 3021;
    public final static int MODIFICAR_CATEGORIA_FALLO = 3031;
    public final static int ALTA_CATEGORIA_FALLO_CATEGORIA_EXISTE = 2041;

    
}
