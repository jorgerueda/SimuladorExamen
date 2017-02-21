/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodavid.Presentacion.Vistas;
import javax.swing.ImageIcon;
import proyectodavid.Negocio.Usuario.Usuario;
import proyectodavid.Presentacion.Vistas.administracionUsuarios;
/**
 *
 * @author jorgerueda
 */
public class VistaAdministrador extends javax.swing.JFrame implements Vista{
        static private VistaAdministrador vistaAdministrador;
    /**
     * Creates new form VistaAdministrador
     */
    public VistaAdministrador(Usuario usr) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario=usr;
         try{
         setIconImage(new ImageIcon(getClass().getResource("finantaxi.png")).getImage());
        }catch(Exception e){
            
        }
        
    }
     public VistaAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        
         try{
         setIconImage(new ImageIcon(getClass().getResource("finantaxi.png")).getImage());
        }catch(Exception e){
            
        }
    }
     
     static public VistaAdministrador obtenerInstancia(){
		   if(vistaAdministrador == null){
			   vistaAdministrador = new VistaAdministrador();
		   }
		   
		   return vistaAdministrador;
	  }
     
     static public VistaAdministrador obtenerInstancia(Usuario usr){
		   if(vistaAdministrador == null){
			   vistaAdministrador = new VistaAdministrador(usr);
		   }
		   
		   return vistaAdministrador;
	  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonUsuarios = new javax.swing.JButton();
        jButtonPreguntas = new javax.swing.JButton();
        jButtonCategorias = new javax.swing.JButton();
        jButtonExamen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonUsuarios.setText("Usuarios");
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });

        jButtonPreguntas.setText("Preguntas");
        jButtonPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreguntasActionPerformed(evt);
            }
        });

        jButtonCategorias.setText("Categorías");
        jButtonCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategoriasActionPerformed(evt);
            }
        });

        jButtonExamen.setText("Hacer Exámen");
        jButtonExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExamenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonExamen, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jButtonUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jButtonPreguntas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCategorias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButtonCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
       
        administracionUsuarios.obtenerInstancia().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreguntasActionPerformed
        administracionPreguntas.obtenerInstancia().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPreguntasActionPerformed

    private void jButtonExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExamenActionPerformed
         new Test(usuario,false).setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButtonExamenActionPerformed

    private void jButtonCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategoriasActionPerformed
        administracionCategorias.obtenerInstancia().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonCategoriasActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador(null).setVisible(true);
            }
        });
    }
    private Usuario usuario;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCategorias;
    private javax.swing.JButton jButtonExamen;
    private javax.swing.JButton jButtonPreguntas;
    private javax.swing.JButton jButtonUsuarios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(int id_evento_vista, Object datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}