/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Proyecto;

import java.awt.Dimension;
/**
 *
 * @author Samuel Vera
 * Carnet: 20171110080
 * CI: 26475783
*/

public class Tablero extends javax.swing.JFrame {

    /**
     * Crea nuevo JForm Tablero
     */
    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * El el método se llama desde el constructor de la clase 
     * del JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDtxt = new javax.swing.JLabel();
        Dificultad = new javax.swing.JLabel();
        TableroD = new javax.swing.JPanel();
        Mostrar = new javax.swing.JToggleButton();

        IDtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IDtxt.setText("ID:");

        Dificultad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dificultad.setText("Dificultad:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableroD.setMaximumSize(null);
        TableroD.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(TableroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Mostrar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Mostrar.setText("Mostrar Tablero");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Declaración del arreglo de objeto botones para formar un tablero dinámico
    static CasillaGrafica[][] tabDinamico;
    
    public static CasillaGrafica[][] getTabDinamico(){
        return tabDinamico;
    }
        //Método para construir la interfaz tablero dependiente de la dificultad
    private void construir(){
        int tamaño1 = 0, tamaño2 = 0;
        this.setLocation(250, 0);
        this.setSize(800,770);
        TableroD.setPreferredSize(new Dimension(800,770));
        if(MenuPrincipal.getLado() == 10 && MenuPrincipal.getMinas() == 10){
            tabDinamico = new CasillaGrafica[MenuPrincipal.getLado()][MenuPrincipal.getLado()];
            Dificultad.setText("Dificultad: Fácil");
            this.setSize(900,750);
            TableroD.setPreferredSize(new Dimension(750,750));
            tamaño1 = 65;
            tamaño2 = 65;
        }else if(MenuPrincipal.getLado() == 15 && MenuPrincipal.getMinas() == 40){
            tabDinamico = new CasillaGrafica[MenuPrincipal.getLado()][MenuPrincipal.getLado()];
            Dificultad.setText("Dificultad: Media");
            this.setSize(900,750);
            TableroD.setPreferredSize(new Dimension(750,750));
            tamaño1 = 43;
            tamaño2 = 43;
        }else if(MenuPrincipal.getLado() == 22 && MenuPrincipal.getMinas() == 100){
            tabDinamico = new CasillaGrafica[MenuPrincipal.getLado()][MenuPrincipal.getLado()];
            Dificultad.setText("Dificultad: Difícil");
            tamaño1 = 27;
            tamaño2 = 30;
        }else{
            tabDinamico = new CasillaGrafica[Personalizar.getA()][Personalizar.getA()];
            Dificultad.setText("Dificultad: Personalizado");
            tamaño1 = Personalizar.getTamaño1();
            tamaño2 = Personalizar.getTamaño1();
        }
        for(int i=0;i<tabDinamico.length;i++){
            for(int j=0;j<tabDinamico.length;j++){
                     //Construcción del objeto de la Casilla Gráfica
                tabDinamico[i][j] = new CasillaGrafica(j,i,tamaño1,tamaño2);
                    //Guardar coordenadas de la casilla
                tabDinamico[i][j].setCoord(j,i);
                    //Añadir la casilla al tablero
                TableroD.add(tabDinamico[i][j]);
            }
        }
    }
    
    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        construir();
        TableroD.remove(Mostrar);
    }//GEN-LAST:event_MostrarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dificultad;
    private javax.swing.JLabel IDtxt;
    private javax.swing.JToggleButton Mostrar;
    private javax.swing.JPanel TableroD;
    // End of variables declaration//GEN-END:variables

}
