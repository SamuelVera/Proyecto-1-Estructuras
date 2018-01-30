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

/**
 * 
 * CLASE EN LA CUAL COMIENZA LA EJECUCIÓN DEL PROGRAMA
 * 
 */

public class MenuPrincipal extends javax.swing.JFrame {


    /**
     * Constructo de la clase del MenuPrincipal vetana
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
        Texto = new javax.swing.JLabel();
        btFacil = new javax.swing.JRadioButton();
        btMedia = new javax.swing.JRadioButton();
        btDificil = new javax.swing.JRadioButton();
        btPer = new javax.swing.JRadioButton();
        Texto1 = new javax.swing.JLabel();
        ID = new javax.swing.JFormattedTextField();
        ComoJugar = new javax.swing.JButton();
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
        getContentPane().add(BotonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 50));

        BotonSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(102, 102, 102));
        BotonSalir.setText("Salir");
        BotonSalir.setOpaque(false);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 200, 50));

        Texto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Texto.setText("Dificultad:");
        getContentPane().add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 20));

        Dificultad.add(btFacil);
        btFacil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btFacil.setText("Fácil");
        btFacil.setOpaque(false);
        getContentPane().add(btFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 20));

        Dificultad.add(btMedia);
        btMedia.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btMedia.setText("Media");
        btMedia.setOpaque(false);
        getContentPane().add(btMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 20));

        Dificultad.add(btDificil);
        btDificil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btDificil.setText("Difícil");
        btDificil.setOpaque(false);
        getContentPane().add(btDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 80, 20));

        Dificultad.add(btPer);
        btPer.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btPer.setText("Personalizado");
        btPer.setOpaque(false);
        btPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerActionPerformed(evt);
            }
        });
        getContentPane().add(btPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, 20));

        Texto1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Texto1.setText("ID de Jugador: ");
        getContentPane().add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        ID.setText(" ");
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 280, 30));

        ComoJugar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ComoJugar.setForeground(new java.awt.Color(102, 102, 102));
        ComoJugar.setText("Como Jugar");
        ComoJugar.setOpaque(false);
        ComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComoJugarActionPerformed(evt);
            }
        });
        getContentPane().add(ComoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Principal.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Acción de clickear el botón de salida
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
            //Mensaje de confirmación (SI/NO) para salir del programa al pulsar boton salir
        int dialogButton;
        dialogButton = JOptionPane.showConfirmDialog (null, "¿Estas Seguro?","PRECAUCIÓN",JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {
            System.exit(0);
        }else remove(dialogButton);
    }//GEN-LAST:event_BotonSalirActionPerformed
        //Declaracion del arreglo tablero de Casillas
    static protected Casilla tablero[][];
    static String ID2;
    Tablero aux2 = new Tablero();
    static private int lado, nminas;
        //Getter para tamaño del  y No de Minas
    public static int getMinas(){
        return nminas;
    }
    public static Casilla[][] getTablero(){
        return tablero;
    }
    public static int getLado() {
        return lado;
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
            for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero.length;j++){
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
            //Busqueda de errores en manejo de la interfaz
        ID2 = ID.getText();
        if(btFacil.isSelected()==false && btMedia.isSelected()==false && btDificil.isSelected()==false && btPer.isSelected()==false){
            JOptionPane.showMessageDialog(null, "ERROR!!! Selecciona una Dificultad");
        }else if(ID.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "ERROR!!! Introduce un ID");
        }else{
            int aux=0;
            if(btFacil.isSelected()){
                this.lado = 10; this.nminas=10; //10x10 y 10 minas (Dificultad Facil
                aux++;
            }else if(btMedia.isSelected()){
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
                aux2.setVisible(true);
            }
        }
    }//GEN-LAST:event_BotonJugarActionPerformed

    private void btPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPerActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        
    }//GEN-LAST:event_IDActionPerformed

    private void ComoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComoJugarActionPerformed
        ComoJugar como = new ComoJugar();
        como.setVisible(true);
    }//GEN-LAST:event_ComoJugarActionPerformed

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
    private javax.swing.JButton ComoJugar;
    private javax.swing.ButtonGroup Dificultad;
    private javax.swing.JLabel Fondo;
    protected javax.swing.JFormattedTextField ID;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel Texto1;
    private javax.swing.JRadioButton btDificil;
    private javax.swing.JRadioButton btFacil;
    private javax.swing.JRadioButton btMedia;
    private javax.swing.JRadioButton btPer;
    // End of variables declaration//GEN-END:variables
}
