/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author Acer
 */
public class FrameMOuseMotion extends javax.swing.JFrame {

    /**
     * Creates new form FrameMOuseMotion
     */
    public FrameMOuseMotion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStatus = new javax.swing.JLabel();
        lblnama = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        lblslider = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        lblStatus.setText("jLabel1");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(140, 70, 34, 14);

        lblnama.setText("nama");
        getContentPane().add(lblnama);
        lblnama.setBounds(140, 100, 26, 14);

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1);
        jSlider1.setBounds(50, 220, 200, 26);

        lblslider.setText("50%\n");
        getContentPane().add(lblslider);
        lblslider.setBounds(130, 190, 23, 14);

        jTextField2.setText("jTextField2");
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(80, 130, 140, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        // TODO add your handling code here:
        lblnama.setText(jTextField2.getText());
    }//GEN-LAST:event_jTextField2CaretUpdate

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
         lblslider.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
         lblStatus.setText("clicked at (" + evt.getX() + "," + evt.getY() 
             + ")");
     lblStatus.setLocation(evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         lblStatus.setText("(" +evt.getX() + "," +evt.getY()+ ")");
        lblStatus.setLocation(evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseMoved

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
            java.util.logging.Logger.getLogger(FrameMOuseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMOuseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMOuseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMOuseMotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMOuseMotion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lblslider;
    // End of variables declaration//GEN-END:variables
}
