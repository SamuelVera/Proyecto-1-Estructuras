/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author samue
 */
public class ComoJugar extends javax.swing.JFrame {

    /**
     * Creates new form ComoJugar
     */
    public ComoJugar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btEntendido = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(java.awt.SystemColor.controlHighlight);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Le damos la bienvenida cartógrafo \nexperto, usted tiene como objetivo la\nrealización de un mapa de la zona, más\nle advertimos que tenga sumo cuidado\npues la zona a estudiar esta plagada\nde minas explosivas y la detonación de\nuno podría suponerle la muerte. Para\nayudarse de esta tarea le daremos un\nequipo que divide el mapa en sectores\npara aislar los que tengan una mina, \nademás para ayudarse podra marcar los\nmismos con una bandera(hay mina) o un\ninterrogatorio(desconocido), con esto\naclarado le deseamos muy buena suerte.");
        barra.setViewportView(jTextArea1);

        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

        btEntendido.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btEntendido.setText("Entendido");
        btEntendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntendidoActionPerformed(evt);
            }
        });
        getContentPane().add(btEntendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntendidoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btEntendidoActionPerformed

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
            java.util.logging.Logger.getLogger(ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComoJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComoJugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barra;
    private javax.swing.JButton btEntendido;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
