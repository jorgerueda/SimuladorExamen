/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import proyectodavid.Presentacion.Vistas.Login;

/**
 *
 * @author jorgerueda
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Login().setVisible(true);

    }
    
}
