/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JOptionPane;


public class GameOver extends javax.swing.JFrame {
    
    /**
     * Crea nuevo JFrame // GameOver
     * @param a
     */
    private MenuPrincipal menu = new MenuPrincipal();
    public GameOver(int a) {
        initComponents();
        this.Derrota.setVisible(false);
        this.Derrota2.setVisible(false);
        this.Victoria.setVisible(true);
        this.Victoria2.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     *
     */
    public GameOver() {
        initComponents();
        this.Derrota.setVisible(true);
        this.Derrota2.setVisible(true);
        this.Victoria.setVisible(false);
        this.Victoria2.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * Código generado por el JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVolver = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        Victoria = new javax.swing.JLabel();
        Victoria2 = new javax.swing.JLabel();
        Derrota = new javax.swing.JLabel();
        Derrota2 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btVolver.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btVolver.setForeground(new java.awt.Color(102, 102, 102));
        btVolver.setText("Volver a Jugar");
        btVolver.setOpaque(false);
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        btSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btSalir.setForeground(new java.awt.Color(102, 102, 102));
        btSalir.setText("Salir");
        btSalir.setOpaque(false);
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 190, -1));

        Victoria.setFont(new java.awt.Font("Gabriola", 2, 48)); // NOI18N
        Victoria.setForeground(new java.awt.Color(204, 255, 255));
        Victoria.setText("¡¡¡VICTORIA!!!"); // NOI18N
        getContentPane().add(Victoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 300, 60));

        Victoria2.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        Victoria2.setForeground(new java.awt.Color(204, 255, 255));
        Victoria2.setText("ENHORABUENA");
        getContentPane().add(Victoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, -1));

        Derrota.setFont(new java.awt.Font("Comic Sans MS", 2, 48)); // NOI18N
        Derrota.setForeground(new java.awt.Color(204, 0, 0));
        Derrota.setText("¡DERROTA!");
        getContentPane().add(Derrota, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        Derrota2.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        Derrota2.setForeground(new java.awt.Color(204, 0, 0));
        Derrota2.setText("INTENTALO DE NUEVO");
        getContentPane().add(Derrota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        ID.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ID.setText("ID: "+MenuPrincipal.ID2);
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Tipo_Petgamino.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        menu.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btVolverActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        //Mensaje de confirmación (SI/NO) para salir del programa al pulsar boton salir
        int dialogButton;
        dialogButton = JOptionPane.showConfirmDialog (null, "¿Estas Seguro?","PRECAUCIÓN",JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {
            System.exit(0);
        }else remove(dialogButton);
    }//GEN-LAST:event_btSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derrota;
    private javax.swing.JLabel Derrota2;
    private javax.swing.JLabel Fondo;
    private static javax.swing.JLabel ID;
    private javax.swing.JLabel Victoria;
    private javax.swing.JLabel Victoria2;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVolver;
    // End of variables declaration//GEN-END:variables
}
