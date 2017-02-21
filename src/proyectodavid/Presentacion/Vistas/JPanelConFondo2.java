/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Vistas;

/**
 *
 * @author jorgerueda
 */
import proyectodavid.Presentacion.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
public class JPanelConFondo2 extends JPanel {
 
    private Image imagen;
    private Image imagen2=null;
 
    public JPanelConFondo2() {
    }
 
    public JPanelConFondo2(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(
                           getClass().getResource(nombreImagen)
                           ).getImage();
        }
    }
 
    public JPanelConFondo2(Image imagenInicial) {
        if (imagenInicial != null) {
            imagen = imagenInicial;
        }
    }
 
    public void setImagen(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(
                   getClass().getResource(nombreImagen)
                   ).getImage();
        } else {
            imagen = null;
        }
 
        repaint();
    }
 
    public void setImagen(Image nuevaImagen) {
        imagen = nuevaImagen;
 
        repaint();
    }
    
    
    public void setImagenes (Image imagen1, Image imagen2){
        this.imagen= imagen1;
        this.imagen2= imagen2;
        repaint();
    }
 
    
   
       
    
    @Override
    public void paint(Graphics g) {
        
        if (imagen2==null){
        if (imagen != null) {
         int anchura= ((getHeight()*imagen.getWidth(this))/imagen.getHeight(this)); // regla de tres para redimensionar la anchura respecto a la altura del Jframe
         int x= (this.getWidth() -anchura)  / 2; //para centrar la imagen
       
           // g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
          g.drawImage(imagen,x,0,anchura, getHeight(),this);
 
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        
        }else{
            if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight()/2,
                              this);
            g.drawImage(imagen2, 0, getHeight()/2, getWidth(), getHeight(),
                              this);
 
            setOpaque(false);
        } else {
            setOpaque(true);
        }
            
        }
 
        super.paint(g);
    }
}