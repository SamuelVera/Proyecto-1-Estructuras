package Proyecto;

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
        botonJugar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        btFacil = new javax.swing.JRadioButton();
        btMedia = new javax.swing.JRadioButton();
        btDificil = new javax.swing.JRadioButton();
        btPer = new javax.swing.JRadioButton();
        texto1 = new javax.swing.JLabel();
        id = new javax.swing.JFormattedTextField();
        comoJugar = new javax.swing.JButton();
        autor = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonJugar.setBackground(new java.awt.Color(204, 204, 204));
        botonJugar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        botonJugar.setForeground(new java.awt.Color(102, 102, 102));
        botonJugar.setText("Jugar");
        botonJugar.setOpaque(false);
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(botonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 50));

        botonSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(102, 102, 102));
        botonSalir.setText("Salir");
        botonSalir.setOpaque(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 50));

        texto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        texto.setText("Dificultad:");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        Dificultad.add(btFacil);
        btFacil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btFacil.setText("Fácil");
        btFacil.setOpaque(false);
        getContentPane().add(btFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 20));

        Dificultad.add(btMedia);
        btMedia.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btMedia.setText("Media");
        btMedia.setOpaque(false);
        getContentPane().add(btMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 20));

        Dificultad.add(btDificil);
        btDificil.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btDificil.setText("Difícil");
        btDificil.setOpaque(false);
        getContentPane().add(btDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 80, 20));

        Dificultad.add(btPer);
        btPer.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btPer.setText("Personalizado");
        btPer.setOpaque(false);
        btPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerActionPerformed(evt);
            }
        });
        getContentPane().add(btPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 20));

        texto1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        texto1.setText("ID de Jugador: ");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        id.setText(" ");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 280, 30));

        comoJugar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        comoJugar.setForeground(new java.awt.Color(102, 102, 102));
        comoJugar.setText("Como Jugar");
        comoJugar.setOpaque(false);
        comoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comoJugarActionPerformed(evt);
            }
        });
        getContentPane().add(comoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 200, 50));

        autor.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        autor.setText("Autor: Samuel Vera");
        getContentPane().add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 360, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Tipo_Petgamino.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Acción de clickear el botón de salida
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
            //Mensaje de confirmación (SI/NO) para salir del programa al pulsar boton salir
        int dialogButton;
        dialogButton = JOptionPane.showConfirmDialog (null, "¿Estas Seguro?","PRECAUCIÓN",JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {
            System.exit(0);
        }else remove(dialogButton);
    }//GEN-LAST:event_botonSalirActionPerformed
        
        //Declaracion a pasar al constructor del tablero y referenciable a nivel global
    static protected String ID2;
    static protected int lado, nminas;
    static protected TableroGrafico avanzar;
    
    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
            //Busqueda de errores en manejo de la interfaz
        ID2 = id.getText();
        if(btFacil.isSelected()==false && btMedia.isSelected()==false && btDificil.isSelected()==false && btPer.isSelected()==false){
            JOptionPane.showMessageDialog(null, "ERROR!!! Selecciona una Dificultad");
        }else if(id.getText().trim().length() == 0){
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
                this.dispose();
                personal.setVisible(true);
            }
            //colocar(this.lado,this.nminas);
            if(aux==1){
                avanzar = new TableroGrafico(this.lado, this.nminas);
                this.setVisible(false);
                this.dispose();
                avanzar.setVisible(true);
            }
        }
    }//GEN-LAST:event_botonJugarActionPerformed

    private void btPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPerActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void comoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comoJugarActionPerformed
        ComoJugar como = new ComoJugar();
        como.setVisible(true);
    }//GEN-LAST:event_comoJugarActionPerformed

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
    private javax.swing.ButtonGroup Dificultad;
    private javax.swing.JLabel autor;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JRadioButton btDificil;
    private javax.swing.JRadioButton btFacil;
    private javax.swing.JRadioButton btMedia;
    private javax.swing.JRadioButton btPer;
    private javax.swing.JButton comoJugar;
    private javax.swing.JLabel fondo;
    protected javax.swing.JFormattedTextField id;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel texto1;
    // End of variables declaration//GEN-END:variables
}
