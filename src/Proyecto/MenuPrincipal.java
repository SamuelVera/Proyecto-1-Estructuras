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
 * 
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
        ID = new javax.swing.JFormattedTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonJugar.setBackground(new java.awt.Color(204, 204, 204));
        BotonJugar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BotonJugar.setForeground(new java.awt.Color(102, 102, 102));
        BotonJugar.setText("Jugar");
        BotonJugar.setOpaque(false);
        BotonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 50));

        BotonSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(102, 102, 102));
        BotonSalir.setText("Salir");
        BotonSalir.setOpaque(false);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 200, 50));

        Instrucciones.setEditable(false);
        Instrucciones.setColumns(20);
        Instrucciones.setRows(5);
        Instrucciones.setText("Instrucciones: ");
        Instrucciones.setOpaque(false);
        jScrollPane1.setViewportView(Instrucciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 430, 170));

        Texto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Texto.setText("Dificultad:");
        getContentPane().add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        Dificultad.add(btFacil);
        btFacil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btFacil.setText("Fácil");
        btFacil.setOpaque(false);
        getContentPane().add(btFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, 20));

        Dificultad.add(btNormal);
        btNormal.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btNormal.setText("Normal");
        btNormal.setOpaque(false);
        getContentPane().add(btNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, 20));

        Dificultad.add(btDificil);
        btDificil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btDificil.setText("Difícil");
        btDificil.setOpaque(false);
        getContentPane().add(btDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 80, 20));

        Dificultad.add(btPer);
        btPer.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btPer.setText("Personalizado");
        btPer.setOpaque(false);
        btPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerActionPerformed(evt);
            }
        });
        getContentPane().add(btPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 20));

        Texto1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Texto1.setText("ID de Jugador: ");
        getContentPane().add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        ID.setText(" ");
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 280, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Principal.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 510, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
            //Mensaje de confirmación (SI/NO) para salir del programa al pulsar boton salir
        int dialogButton;
        dialogButton = JOptionPane.showConfirmDialog (null, "¿Estas Seguro?","PRECAUCIÓN",JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {
            System.exit(0);
        }else remove(dialogButton);
    }//GEN-LAST:event_BotonSalirActionPerformed
        //Declaracion tablero
    static public Casilla tablero[][];
    protected Jugador user;
    static private int lado, nminas;
        //Getter para  tamaño del Lado y No de Minas
    static public int getLado(){
        return lado;
    }
    static public int getMinas(){
        return nminas;
    }
    static public Casilla[][] getTablero(){
        return tablero;
    }
        //Método para repartir las minas
    public void colocar(int lado, int c){
        tablero = new Casilla[lado][lado];
        int minaux=0, rand;
        Random random = new Random();
        /*Barrido del arreglo y repartición de minas de manera aleatoria
        en una casilla se depositara una mina cada 2 de 25 veces, se repetira
        varias veces el barrido, solo que en la siguientes veces que se repita
        ignorará las casillas que ya guardan una mina*/
        while(minaux < c){
            for(int i=0;i<lado;i++){
                for(int j=0;j<lado;j++){
                    rand = random.nextInt(25);
                    if(tablero[i][j] == null){
                        tablero[i][j] = new Vacio(true); //Objeto de vacio
                    }else if(rand >= 23 && minaux < c && tablero[i][j].vacio!=false){
                        tablero[i][j] = new Mina(false); //Objeto de mina
                        minaux++;
                    }
                }
            }
        }
    }
    private void BotonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugarActionPerformed
            //Objeto user de la clase Jugador
        user = new Jugador(ID.getText()); 
            //Busqueda de errores en manejo de la interfaz
        if(btFacil.isSelected()==false && btNormal.isSelected()==false && btDificil.isSelected()==false && btPer.isSelected()==false){
            JOptionPane.showMessageDialog(null, "ERROR!!! Selecciona una Dificultad");
        }else if(ID.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "ERROR!!! Introduce un ID");
        }else{
            int aux=0;
            if(btFacil.isSelected()){
                this.lado = 10; this.nminas=10; //10x10 y 10 minas (Dificultad Facil
                aux++;
            }else if(btNormal.isSelected()){
                this.lado = 15; this.nminas = 40; //15x15 y 40 minas (Dificultad Media)
                aux++;
            }else if(btDificil.isSelected()){
                this.lado = 22; this.nminas = 100;  //22x22 y 100 minas (Dificultad Difícil)
                aux++;
            }else if(btPer.isSelected()){
                Personalizar personal = new Personalizar();
                this.setVisible(false);
                personal.setVisible(true);
            }
            colocar(this.lado,this.nminas);
            if(aux==1){
                this.setVisible(false);
                Tablero aux2 = new Tablero();
                aux2.setVisible(true);
            }
        }
    }//GEN-LAST:event_BotonJugarActionPerformed

    private void btPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPerActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        
    }//GEN-LAST:event_IDActionPerformed

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
    protected javax.swing.JFormattedTextField ID;
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
