/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Vistas;

import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.eclipse.persistence.jpa.jpql.Assert;
import proyectodavid.Negocio.Pregunta.Pregunta;
import proyectodavid.Negocio.Pregunta.SA.SAPreguntaImp;
import org.apache.commons.io.IOUtils;
import proyectodavid.Negocio.Categoria.Categoria;
import proyectodavid.Negocio.Categoria.SA.SACategoria;
import proyectodavid.Negocio.FactoriaSA.FactoriaSA;
import proyectodavid.Presentacion.Controlador.Evento;
import proyectodavid.Presentacion.Controlador.Imp.ControladorImp;
import proyectodavid.Presentacion.Dispatcher.EventoVista;

/**
 *
 * @author jorgerueda
 */
public class VistaPregunta extends javax.swing.JFrame  implements Vista {

    /**
     * Creates new form AltaPregunta
     */
    public VistaPregunta() {
        initComponents();
        this.modoEdit=false;
        setLocationRelativeTo(null);
         try{
         setIconImage(new ImageIcon(getClass().getResource("finantaxi.png")).getImage());
        }catch(Exception e){
            
        }
    }
    
    public VistaPregunta(Pregunta pregunta) {
        initComponents();
        setLocationRelativeTo(null);
        this.modoEdit=true;
        this.p= pregunta;
        actualizar(0,pregunta);
         try{
         setIconImage(new ImageIcon(getClass().getResource("finantaxi.png")).getImage());
        }catch(Exception e){
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPregunta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaB = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaC = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaA = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaD = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxSolucion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonImg2 = new javax.swing.JButton();
        jButtonImg1 = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabelImg2 = new javax.swing.JLabel();
        jLabelImg1 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminarPhoto1 = new javax.swing.JButton();
        jButtonEliminarPhoto2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextAreaPregunta.setColumns(20);
        jTextAreaPregunta.setLineWrap(true);
        jTextAreaPregunta.setRows(5);
        jTextAreaPregunta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaPregunta);

        jTextAreaB.setColumns(20);
        jTextAreaB.setLineWrap(true);
        jTextAreaB.setRows(5);
        jTextAreaB.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextAreaB);

        jTextAreaC.setColumns(20);
        jTextAreaC.setLineWrap(true);
        jTextAreaC.setRows(5);
        jTextAreaC.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextAreaC);

        jTextAreaA.setColumns(20);
        jTextAreaA.setLineWrap(true);
        jTextAreaA.setRows(5);
        jTextAreaA.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextAreaA);

        jTextAreaD.setColumns(20);
        jTextAreaD.setLineWrap(true);
        jTextAreaD.setRows(5);
        jTextAreaD.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextAreaD);

        jLabel1.setText("Pregunta");

        jLabel2.setText("A");

        jLabel3.setText("B");

        jLabel4.setText("C");

        jLabel5.setText("D");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(FactoriaSA.getInstancia().generaSACategoria().mostrarNombresCategoria()));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jComboBoxSolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        jLabel6.setText("Categoria");

        jLabel7.setText("Solución");

        jButtonImg2.setText("Imagen Respuesta");
        jButtonImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImg2ActionPerformed(evt);
            }
        });

        jButtonImg1.setText("Imagen pregunta");
        jButtonImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImg1ActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEliminarPhoto1.setForeground(new java.awt.Color(204, 0, 0));
        jButtonEliminarPhoto1.setText("X");
        jButtonEliminarPhoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPhoto1ActionPerformed(evt);
            }
        });

        jButtonEliminarPhoto2.setForeground(new java.awt.Color(204, 0, 0));
        jButtonEliminarPhoto2.setText("X");
        jButtonEliminarPhoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarPhoto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEliminarPhoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jButtonAceptar)
                            .addGap(107, 107, 107)
                            .addComponent(jButtonCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonImg1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonImg2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonImg1)
                                .addComponent(jButtonEliminarPhoto1))
                            .addComponent(jLabelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonImg2)
                        .addComponent(jButtonEliminarPhoto2))
                    .addComponent(jLabelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImg1ActionPerformed
    int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        this.jLabelImg1.setText(file.getName());
        this.dirPhoto1= fileChooser.getSelectedFile().getAbsolutePath();
        this.isImagenPregunta=true;
    }
    
            }//GEN-LAST:event_jButtonImg1ActionPerformed

    private void jButtonImg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImg2ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
         this.jLabelImg2.setText(file.getName());
        this.dirPhoto2= fileChooser.getSelectedFile().getAbsolutePath();
        this.isImagenRespuesta=true;
    }
    }//GEN-LAST:event_jButtonImg2ActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        Pregunta  pregunta = recopilarInformacion();
       if (modoEdit){
      
        pregunta.setId(this.p.getId());
        ControladorImp.getInstancia().execute(Evento.MODIFICAR_PREGUNTA, pregunta);
       }else{
        ControladorImp.getInstancia().execute(Evento.ALTA_PREGUNTA, pregunta);
       }
       this.dispose();
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEliminarPhoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPhoto1ActionPerformed
        this.jLabelImg1.setText(null);
        this.dirPhoto1= null;  
        this.isImagenPregunta=false;
    }//GEN-LAST:event_jButtonEliminarPhoto1ActionPerformed

    private void jButtonEliminarPhoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarPhoto2ActionPerformed
        this.jLabelImg2.setText(null);
        this.dirPhoto2= null;  
        this.isImagenRespuesta=false;    }//GEN-LAST:event_jButtonEliminarPhoto2ActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    
    private Pregunta recopilarInformacion(){
        
        Pregunta  pregunta = new Pregunta();
        pregunta.setPregunta(this.jTextAreaPregunta.getText());
        pregunta.setA(this.jTextAreaA.getText());
        pregunta.setB(this.jTextAreaB.getText());
        pregunta.setC(this.jTextAreaC.getText());
        pregunta.setD(this.jTextAreaD.getText());  
        SACategoria servicioCategoria = FactoriaSA.getInstancia().generaSACategoria();
        Categoria categoria=servicioCategoria.mostrarCategoriaPorNombre(this.jComboBoxCategoria.getSelectedItem().toString());
        pregunta.setCategoria(categoria);
        pregunta.setSolucion(this.jComboBoxSolucion.getSelectedItem().toString());
        if(this.isImagenPregunta){
        try{
           FileInputStream f_in = new FileInputStream(this.dirPhoto1); 
           pregunta.setPhoto1(IOUtils.toByteArray(f_in));
           pregunta.setNamePhoto1(this.jLabelImg1.getText());
        }catch(Exception e){
            Assert.fail("No se puede leer imagen");
        }
        }else{pregunta.setPhoto1(null);}
        
        
         if(this.isImagenRespuesta){
        try{
           FileInputStream f_in = new FileInputStream(this.dirPhoto2); 
           pregunta.setPhoto2(IOUtils.toByteArray(f_in));
           pregunta.setNamePhoto2(this.jLabelImg2.getText());
        }catch(Exception e){
            Assert.fail("No se puede leer imagen");
        }
        }else{pregunta.setPhoto2(null);}
        
        return pregunta;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPregunta().setVisible(true);
            }
        });
    }
    
    private boolean isImagenPregunta=false;
    private boolean isImagenRespuesta=false;
    private Pregunta p;
    private boolean modoEdit;
    private String dirPhoto1=null;
    private String dirPhoto2=null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminarPhoto1;
    private javax.swing.JButton jButtonEliminarPhoto2;
    private javax.swing.JButton jButtonImg1;
    private javax.swing.JButton jButtonImg2;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxSolucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImg1;
    private javax.swing.JLabel jLabelImg2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaA;
    private javax.swing.JTextArea jTextAreaB;
    private javax.swing.JTextArea jTextAreaC;
    private javax.swing.JTextArea jTextAreaD;
    private javax.swing.JTextArea jTextAreaPregunta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(int id_evento_vista, Object datos) {
     
       if(id_evento_vista == EventoVista.ALTA_PREGUNTA_EXITO){
			JOptionPane.showMessageDialog(null, "Se ha creado el Usuario con exito con ID:  " + (int)datos,"Nuevo Usuario", JOptionPane.INFORMATION_MESSAGE);		
		}	
	
		else if (id_evento_vista == EventoVista.ALTA_PREGUNTA_FALLO){
			JOptionPane.showMessageDialog(null, "ERROR!! Ha ocurrido un error", "Nuevo Usuario", JOptionPane.ERROR_MESSAGE);
		}else if ( id_evento_vista == 0){
                    
                Pregunta preg = (Pregunta)datos;
                jTextAreaA.setText(preg.getA());
                jTextAreaB.setText(preg.getB());
                jTextAreaC.setText(preg.getC());
                jTextAreaD.setText(preg.getD());  
                jTextAreaPregunta.setText(preg.getPregunta());
                jComboBoxCategoria.setSelectedItem(preg.getCategoria().getNombre());
                jComboBoxSolucion.setSelectedItem(preg.getSolucion());
                jLabelImg1.setText(preg.getNamePhoto1());
                jLabelImg2.setText(preg.getNamePhoto2());
                
    }
    }
}
