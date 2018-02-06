package Proyecto;

import javax.swing.JOptionPane;

/**
 * Clase a partir de la cual se crea y despliega la ventana de personalización
 */
public class Personalizar extends javax.swing.JFrame {

    /**
     * Constructor de nuevo JForm Personalizar
     */
    public Personalizar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Despligue del JForm
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
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

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
        Alto.setOpaque(false);
        getContentPane().add(Alto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, -1));

        Ancho.setModel(new javax.swing.SpinnerNumberModel(2, 2, 30, 1));
        Ancho.setOpaque(false);
        getContentPane().add(Ancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, -1));

        Nminas.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Nminas.setOpaque(false);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("Nota: Elige la misma cantidad de filas y columnas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_mapa_topografia.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    static private int a = 1, b = 0, c = 1;
        //Retornar el tamaño del lado del tablero
    static public int getA(){
        return a;
    }
    static public int getTamaño1(){
            /*Tamaños adecuados para la que la cantidad de casillas no sobrepase
            el tamaño en pixeles del tablero*/
        if(getA()==30) return 21;
        else if(getA() == 29) return 22;
        else if(getA() == 28) return 23;
        else if(getA() == 27) return 24;
        else if(getA() == 26) return 25;
        else if(getA() == 25) return 26;
        else if(getA() == 24) return 28;
        else if(getA() == 23) return 29;
        else if(getA() == 22) return 30;
        else if(getA() == 21) return 32;
        else if(getA() == 20) return 34;
        else if(getA() == 19) return 36;
        else if(getA() == 18) return 38;
        else if(getA() == 17) return 40;
        else if(getA() == 16) return 43;
        else if(getA() == 15) return 48;
        else if(getA() == 14) return 50;
        else if(getA() == 13) return 53;
        else if(getA() == 12) return 57;
        else if(getA() == 11) return 62;
        else if(getA() == 10) return 68;
        else if(getA() == 9) return 76;
        else if(getA() == 8) return 85;
        else if(getA() == 7) return 97;
        else if(getA() == 6) return 110;
        else if(getA()== 5) return 140;
        else if(getA() == 4) return 170;
        else if(getA() == 3) return 240;
        else if(getA() == 2) return 300;
        else return 0;
    }
        //Clickear confirmación de los datos personalizados
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        try{
            a = Integer.parseInt(Alto.getModel().getValue().toString());
            b = Integer.parseInt(Ancho.getModel().getValue().toString());
            c = Integer.parseInt(Nminas.getModel().getValue().toString());
        }catch(NumberFormatException e){ //Capturar Excepción de Error en el formato del número
            System.out.println("Excepción "+e+" capturada");
        }
        if(a==b && c < b*a){ //Paso de la ventana de Personalización a la del tablero
                MenuPrincipal.nminas = c;
                this.setVisible(false);
                MenuPrincipal.avanzar = new TableroGrafico(a,c);
                MenuPrincipal.avanzar.setVisible(true);
        }else if(a!=b){
            JOptionPane.showMessageDialog(null, "ERROR!!! El Alto y Ancho deben ser IGUALES");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR!!! Hay MÁS minas que casillas");
        }
            
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.setVisible(false);
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /**/
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

        // Crear y hacer display del JForm
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
    private javax.swing.JLabel Fondo;
    private javax.swing.JSpinner Nminas;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel Txt2;
    private javax.swing.JLabel Txt3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
