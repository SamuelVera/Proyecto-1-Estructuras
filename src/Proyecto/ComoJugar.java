package Proyecto;

public class ComoJugar extends javax.swing.JFrame {

    /**
     * Constructor para Jform ComoJugar
     */
    public ComoJugar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

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
        jTextArea1.setText("Le damos la bienvenida cartógrafo \nexperto, usted tiene como objetivo la\nrealización de un mapa de la zona, más\nle advertimos que tenga sumo cuidado\npues la zona a estudiar esta plagada\nde minas explosivas y la detonación de\nuna podría suponerle la muerte. Para\nayudarse de esta tarea le daremos un\nequipo que divide el mapa en sectores\npara aislar los que tengan una mina, \nademás para ayudarse podra marcar los\nmismos con una bandera(hay mina) o un\ninterrogatorio(desconocido), con esto\naclarado le deseamos muy buena suerte.");
        barra.setViewportView(jTextArea1);

        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

        btEntendido.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        btEntendido.setText("Entendido");
        btEntendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntendidoActionPerformed(evt);
            }
        });
        getContentPane().add(btEntendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Tipo_Petgamino.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntendidoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btEntendidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barra;
    private javax.swing.JButton btEntendido;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
