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
        this.dificultad.setText("Minas:" +this.nminas);
        this.ID.setText("ID: "+Jugador.getId());
    }

    /**
     * El método se llama desde el constructor de la clase 
     * del JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroD = new javax.swing.JPanel();
        dificultad = new javax.swing.JLabel();
        mostrar = new javax.swing.JToggleButton();
        dificultad1 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
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

        dificultad.setFont(new java.awt.Font("Tahoma", 0, 22));
        dificultad.setText("");
        getContentPane().add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 140, 70));

        mostrar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        mostrar.setText("Mostrar Mapa");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        dificultad1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        dificultad1.setText("");
        getContentPane().add(dificultad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 140, 70));

        ID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 220, 40));

        ID1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        getContentPane().add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 170, 20));

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Mapa_1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 960, 1140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Declaración del arreglo de las gráficas de la casilla
    private static CasillaGrafica[][] tabDinamico;
    private static Casilla[][] casillas;
    private final int lado, nminas;
    
        //Getter para los arreglos de los tableros
    public static CasillaGrafica[][] getTabDinamico(){
        return tabDinamico;
    }
    
    public static Casilla[][] getTablero(){
        return casillas;
    }
        //Método para construir la interfaz tablero dependiente de la dificultad
    private void construir(int lado, int nminas){
        int tamaño = 0;
        this.setLocationRelativeTo(null);
        this.tableroD.setPreferredSize(new Dimension(800,770));
        if(lado == 10 && nminas == 10){ //Dificultad Facil
            this.setSize(900,750);
            this.tableroD.setPreferredSize(new Dimension(750,750));
            tamaño = 65;
        }else if(lado == 15 && nminas == 40){   //Dificultad Media
            this.setSize(900,750);
            this.tableroD.setPreferredSize(new Dimension(750,750));
            tamaño = 43;
        }else if(lado == 22 && nminas == 100){  //Dificultad Dificil
            tamaño = 30;
        }else{  //Dificultad Personalizada
            tamaño = Personalizar.getTamaño();
        }
        this.dificultad.setText("");
        this.ID.setText("");
        this.dificultad1.setText("Minas: "+nminas);
        this.ID1.setText("ID: "+Jugador.getId());
            //El arreglo para las gráficas debe ser del mismo tamaño que el contruido en MenuPrincipal
        this.tabDinamico = new CasillaGrafica[lado][lado];
        for(int i=0;i<this.tabDinamico.length;i++){
            for(int j=0;j<this.tabDinamico.length;j++){
                     //Construcción del objeto de la Casilla Gráfica
                this.tabDinamico[i][j] = new CasillaGrafica(j,i,tamaño,tamaño);
                    //Añadir la casilla al tablero
                this.tableroD.add(this.tabDinamico[i][j]);
            }
       
        }
    }
    
        //Método para repartir los contenidos de las casillas
    protected void colocarCasillas(int lado, int limiteMinas){
        this.casillas = new Casilla[lado][lado];
        int minaux=0, rand;
        Random random = new Random();
        /*Barrido del arreglo y repartición de minas de manera aleatoria
        en una casilla se depositara una mina cada 2 de 25 veces, se repetira
        varias veces el barrido, solo que en la siguientes veces que se repita
        ignorará las casillas que ya guardan una mina*/
        while(minaux < limiteMinas){
            for(int i=0;i<this.casillas.length;i++){
                for(int j=0;j<this.casillas.length;j++){
                    rand = random.nextInt(25);
                    if(this.casillas[i][j] == null){
                        this.casillas[i][j] = new Vacio(true); //Objeto de vacio
                    }else if(rand >= 23 && minaux < limiteMinas && this.casillas[i][j].vacio!=false){
                        this.casillas[i][j] = new Mina(false); //Objeto de mina
                        minaux++;
                    }
                }
            }
        }
    }
        //Clickear boton de mostrar
    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        colocarCasillas(this.lado,this.nminas);
        construir(this.lado,this.nminas);
        this.mostrar.setEnabled(false);
        this.mostrar.setVisible(false);
    }//GEN-LAST:event_mostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel dificultad;
    private javax.swing.JLabel dificultad1;
    private javax.swing.JLabel fondo;
    private javax.swing.JToggleButton mostrar;
    private javax.swing.JPanel tableroD;
    // End of variables declaration//GEN-END:variables
}