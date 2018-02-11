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
        switch (getA()) {
            case 30:
                return 21;
            case 29:
                return 22;
            case 28:
                return 23;
            case 27:
                return 24;
            case 26:
                return 25;
            case 25:
                return 26;
            case 24:
                return 28;
            case 23:
                return 29;
            case 22:
                return 30;
            case 21:
                return 32;
            case 20:
                return 34;
            case 19:
                return 36;
            case 18:
                return 38;
            case 17:
                return 40;
            case 16:
                return 43;
            case 15:
                return 48;
            case 14:
                return 50;
            case 13:
                return 53;
            case 12:
                return 57;
            case 11:
                return 62;
            case 10:
                return 68;
            case 9:
                return 76;
            case 8:
                return 85;
            case 7:
                return 97;
            case 6:
                return 110;
            case 5:
                return 140;
            case 4:
                return 170;
            case 3:
                return 240;
            case 2:
                return 300;
            default:
                return 0;
        }
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
