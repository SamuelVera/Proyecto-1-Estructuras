/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Personalizar extends javax.swing.JFrame {

    /**
     * Creates new form Personalizar
     */
    public Personalizar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
        //Objeto del MenuPrincipal
    MenuPrincipal aux = new MenuPrincipal();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt = new javax.swing.JLabel();
        Txt2 = new javax.swing.JLabel();
        Txt3 = new javax.swing.JLabel();
        Alto = new javax.swing.JSpinner();
        Ancho = new javax.swing.JSpinner();
        Nminas = new javax.swing.JSpinner();
        Cancelar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 165));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Txt.setText("Alto");
        getContentPane().add(Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Txt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Txt2.setText("Ancho");
        getContentPane().add(Txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        Txt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Txt3.setText("Minas");
        getContentPane().add(Txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        Alto.setModel(new javax.swing.SpinnerNumberModel(2, 2, 30, 1));
        getContentPane().add(Alto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, -1));

        Ancho.setModel(new javax.swing.SpinnerNumberModel(2, 2, 30, 1));
        getContentPane().add(Ancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, -1));

        Nminas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(Nminas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));

        Cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, 30));

        Confirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Confirmar.setText("Continuar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    static private int a = 1, b = 0, c = 1, d, k;
    public int getA(){
        return this.a;
    }
    static public int getTamaño1(){ //En búsqueda de la felicidad del tamaño de casilla
        if(a>28 && a<31) return 18;
        else if(a > 26 && a <= 28) return 20;
        else if(a > 24 && a <= 26) return 22;
        else if(a > 22 && a <= 24) return 24;
        else if(a > 20 && a <= 22) return 28;
        else if(a > 18 && a <= 20) return 32;
        else if(a > 16 && a <= 18) return 36;
        else if(a > 14 && a <= 16) return 42;
        else if(a > 12 && a <= 14) return 48;
        else if(a > 10 && a <= 12) return 52;
        else if(a > 8 && a <= 10) return 58;
        else if(a > 6 && a <= 8) return 64;
        else if(a > 4 && a <= 6) return 70;
        else if(a >= 2 && a <= 4) return 76;
        else return 0;
    }
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        
        try{
            this.a = Integer.parseInt(Alto.getModel().getValue().toString());
            this.b = Integer.parseInt(Ancho.getModel().getValue().toString());
            this.c = Integer.parseInt(Nminas.getModel().getValue().toString());
        }catch(NumberFormatException e){ //Capturar Excepción de Error en el formato del número
            System.out.println("Excepción "+e+" capturada");
        }
        if( this.a==this.b && this.c < this.a*this.b){
                this.d = (this.c*100)/(this.a*this.b);
                aux.colocar(this.a, this.c, this.d);
                this.setVisible(false);
                Tablero aux2 = new Tablero();
                aux2.setVisible(true);
        }else if(this.a!=this.b){
            JOptionPane.showMessageDialog(null, "ERROR!!! El Alto y Ancho deben ser IGUALES");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR!!! Hay MÁS minas que casillas");
        }
            
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        aux.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Personalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personalizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personalizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Alto;
    private javax.swing.JSpinner Ancho;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JSpinner Nminas;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel Txt2;
    private javax.swing.JLabel Txt3;
    // End of variables declaration//GEN-END:variables
}
