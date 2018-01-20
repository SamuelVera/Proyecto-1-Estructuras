/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Vera
 * Carnet: 20171110080
 * CI: 26475783
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Componentes de la Vetana
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * Codigo Generado de la Clase JForm en el que se inicializa el constructor
     * de la clase para para el objeto de la ventana presente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dificultad = new javax.swing.ButtonGroup();
        BotonJugar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Instrucciones = new javax.swing.JTextArea();
        Texto = new javax.swing.JLabel();
        btFacil = new javax.swing.JRadioButton();
        btNormal = new javax.swing.JRadioButton();
        btDificil = new javax.swing.JRadioButton();
        btPer = new javax.swing.JRadioButton();
        Texto1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonJugar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BotonJugar.setText("Jugar");
        BotonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 50));

        BotonSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 200, 50));

        Instrucciones.setColumns(20);
        Instrucciones.setRows(5);
        Instrucciones.setText("Instrucciones: ");
        jScrollPane1.setViewportView(Instrucciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 430, 170));

        Texto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Texto.setText("Dificultad:");
        getContentPane().add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        Dificultad.add(btFacil);
        btFacil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btFacil.setText("Fácil");
        getContentPane().add(btFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, 20));

        Dificultad.add(btNormal);
        btNormal.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btNormal.setText("Normal");
        getContentPane().add(btNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, 20));

        Dificultad.add(btDificil);
        btDificil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btDificil.setText("Difícil");
        getContentPane().add(btDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 80, 20));

        Dificultad.add(btPer);
        btPer.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btPer.setText("Personalizado");
        getContentPane().add(btPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 20));

        Texto1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Texto1.setText("ID de Jugador: ");
        getContentPane().add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        ID.setToolTipText("Introduce una ID...");
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 280, 30));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
            //Mensaje de confirmación (SI/NO) para salir del programa al pulsar boton salir
        int dialog = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null,"¿Seguro que desea salir?","Confirmación",dialog);
        if(dialog == JOptionPane.YES_OPTION){   //Salida del programa
            System.exit(0);
        }if(dialog == JOptionPane.NO_OPTION){   //Cerrar Ventana del mensaje
            remove(dialog);
        }
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed
        //Declaracion tablero
    public Casilla tablero[][];
        //Método para repartir las minas
    private void colocar(int a, int b, int c, int bound){
        tablero = new Casilla[a][b];
        int minaux=0;
        Random random = new Random();
        int rand;
        /*Para un azar más realista se barren primero las filas pares
        y luego las impares, esto con el fin de evitar que se acumulen 
        muchas minas en la mitad superior del tablero y las mismas esten
        más dispersas*/
        for(int i=0;i<a;i=i+2){
            for(int j=0;j<b;j++){
                rand = random.nextInt(10);
                if(rand <= bound && minaux < c){
                    tablero[i][j] = new Mina(true); //Objeto de mina
                    minaux++;
                }else{
                    tablero[i][j] = new Vacio(true); //Objeto de vacio
                }
            }
        }
        for(int i=1;i<a;i=i+2){
            for(int j=0;j<b;j++){
                rand = random.nextInt(10);
                if(rand <= bound && minaux < c){
                    tablero[i][j] = new Mina(true); //Objeto de mina
                    minaux++;
                }else{
                    tablero[i][j] = new Vacio(true); //Objeto de vacio
                }
            }
        }
    }
    private void BotonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugarActionPerformed
            //Objeto user de la clase Jugador
        Jugador user = new Jugador(ID.getText()); 
            //Busqueda de errores en manejo de la interfaz
        if(btFacil.isSelected()==false && btNormal.isSelected()==false && btDificil.isSelected()==false && btPer.isSelected()==false){
            JOptionPane.showMessageDialog(null, "ERROR!!! Selecciona una Dificultad");
        }else if(user.getID()==""){
            JOptionPane.showMessageDialog(null, "ERROR!!! Introduce un ID");
        }else{
            if(btFacil.isSelected()){
                colocar(10,10,10,1);  //10x10 y 10 minas (Dificultad Facil)
            }else if(btNormal.isSelected()){
                colocar(15,15,40,1); //15x15 y 40 minas (Dificultad Normal)
            }else if(btDificil.isSelected()){
                colocar(22,22,100,2);  //22x22 y 100 minas (Dificultad Difícil)
            }else if(btPer.isSelected()){
                
            }
        }
    }//GEN-LAST:event_BotonJugarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonJugar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.ButtonGroup Dificultad;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField ID;
    private javax.swing.JTextArea Instrucciones;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel Texto1;
    private javax.swing.JRadioButton btDificil;
    private javax.swing.JRadioButton btFacil;
    private javax.swing.JRadioButton btNormal;
    private javax.swing.JRadioButton btPer;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
