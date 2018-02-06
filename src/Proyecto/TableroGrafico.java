package Proyecto;

import java.awt.Dimension;
import java.util.Random;
/**
 * Clase del JFrame para desplegar los gráficos del tablero
*/

public class TableroGrafico extends javax.swing.JFrame {

    /**
     * Crea nuevo JForm Tablero
     */
    public TableroGrafico(int lado, int nminas) {
        initComponents();
        this.lado = lado;
        this.nminas = nminas;
        this.setLocationRelativeTo(null);
    }

    /**
     * El el método se llama desde el constructor de la clase 
     * del JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroD = new javax.swing.JPanel();
        dificultad = new javax.swing.JLabel();
        mostrar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hud = new javax.swing.JTextPane();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableroD.setBackground(new java.awt.Color(204, 153, 0));
        tableroD.setMaximumSize(null);
        tableroD.setOpaque(false);
        tableroD.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(tableroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dificultad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 10));

        mostrar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        mostrar.setText("Mostrar Mapa");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        hud.setEditable(false);
        hud.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hud.setText("Minas: "+MenuPrincipal.nminas);
        hud.setAutoscrolls(false);
        hud.setFocusable(false);
        hud.setOpaque(false);
        hud.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(hud);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 280, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_mapa_topografia.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Declaración del arreglo de las gráficas de la casilla
    private static CasillaGrafica[][] tabDinamico;
    private static Casilla[][] casillas;
    private int lado, nminas;
    public static CasillaGrafica[][] getTabDinamico(){
        return tabDinamico;
    }
    
    public static Casilla[][] getTablero(){
        return casillas;
    }
        //Método para construir la interfaz tablero dependiente de la dificultad
    private void construir(int lado, int nminas){
        int tamaño1 = 0, tamaño2 = 0;
        this.setLocation(250, 0);
        this.setSize(800,770);
        hud.setLocation(450, 1000);
        tableroD.setPreferredSize(new Dimension(800,770));
        if(lado == 10 && nminas == 10){
            this.setSize(900,750);
            tableroD.setPreferredSize(new Dimension(750,750));
            tamaño1 = 65;
            tamaño2 = 65;
        }else if(lado == 15 && nminas == 40){
            this.setSize(900,750);
            tableroD.setPreferredSize(new Dimension(750,750));
            tamaño1 = 43;
            tamaño2 = 43;
        }else if(lado == 22 && nminas == 100){
            tamaño1 = 27;
            tamaño2 = 30;
        }else{
            tamaño1 = Personalizar.getTamaño1();
            tamaño2 = Personalizar.getTamaño1();
        }
        dificultad.setText("Minas:" +nminas);
            //El arreglo para las gráficas debe ser del mismo tamaño que el contruido en MenuPrincipal
        tabDinamico = new CasillaGrafica[lado][lado];
        for(int i=0;i<tabDinamico.length;i++){
            for(int j=0;j<tabDinamico.length;j++){
                     //Construcción del objeto de la Casilla Gráfica
                tabDinamico[i][j] = new CasillaGrafica(j,i,tamaño1,tamaño2);
                    //Añadir la casilla al tablero
                tableroD.add(tabDinamico[i][j]);
            }
        }
    }
        //
    protected void colocar(int lado, int limiteMinas){
        casillas = new Casilla[lado][lado];
        int minaux=0, rand;
        Random random = new Random();
        /*Barrido del arreglo y repartición de minas de manera aleatoria
        en una casilla se depositara una mina cada 2 de 25 veces, se repetira
        varias veces el barrido, solo que en la siguientes veces que se repita
        ignorará las casillas que ya guardan una mina*/
        while(minaux < limiteMinas){
            for(int i=0;i<casillas.length;i++){
                for(int j=0;j<casillas.length;j++){
                    rand = random.nextInt(25);
                    if(casillas[i][j] == null){
                        casillas[i][j] = new Vacio(true); //Objeto de vacio
                    }else if(rand >= 23 && minaux < limiteMinas && casillas[i][j].vacio!=false){
                        casillas[i][j] = new Mina(false); //Objeto de mina
                        minaux++;
                    }
                }
            }
        }
    }
        //Clickear boton de mostrar
    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        colocar(this.lado,this.nminas);
        construir(this.lado,this.nminas);
        mostrar.setEnabled(false);
        mostrar.setVisible(false);
    }//GEN-LAST:event_mostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dificultad;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextPane hud;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton mostrar;
    private javax.swing.JPanel tableroD;
    // End of variables declaration//GEN-END:variables
}