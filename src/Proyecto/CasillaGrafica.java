package Proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Samuel Vera
 * CI: 26475783
 * Carnet: 20171110080
 */

public class CasillaGrafica extends JButton implements ActionListener{
    private int i,j;
    private Casilla[][] tablero = MenuPrincipal.getTablero();
    private CasillaGrafica[][] tablero2 = Tablero.getTabDinamico();
    
        //Constructor de los parámetros gráficos de la casilla
    CasillaGrafica(int x, int y, int alto, int ancho){
        setLocation(x, y);//Parámetros posición en y, en x
        setPreferredSize(new Dimension(ancho,alto));
        addActionListener(this); //Implementación del Action Listener para evento de click
        this.setBackground(Color.gray);
    }
    public void setCoord(int i, int j){    //Coordenada de la casilla
        this.i = i;
        this.j = j;
    }

    @Override //Implementación del Action Listener para evento de click
    public void actionPerformed(ActionEvent e) {
        int aux;
        JFrame frame = new JFrame(); //Ventana de selección con opciones personalizadas
        String[] opcion = new String[2];
        opcion[0] = "Mostrar";
        opcion[1] = "Marcar";
        aux = JOptionPane.showOptionDialog(frame.getContentPane(),"CASILLA("+this.i+","+this.j+")","¿Mostrar o Marcar?",0,JOptionPane.INFORMATION_MESSAGE,null,opcion,null);
            //La variable auxiliar se vuelve igual al índice de lo seleccionado en el arreglo del tipo String
        if(aux == 1){ //Opción de marcar casilla
            opcion[0] = "Bandera";
            opcion[1] = "Desconocido";
            aux = JOptionPane.showOptionDialog(frame.getContentPane(),"Selecciona un tipo de marca","",0,JOptionPane.INFORMATION_MESSAGE,null,opcion,null);
            if(aux == 0){ //Poner icono de la bandera en el botón
                setImagen("src\\Imagenes\\Bandera_Amarilla.png",0,0,false);
            }else if(aux == 1){ //Poner icono de interrogación en el botón
                setImagen("src\\Imagenes\\Misterio.png",0,0,false);
            }
        }else if(aux == 0){ //Opción de mostrar la casilla
            determinarCasilla();
        }
    }
        //Determinar contenido de la casilla
    private void determinarCasilla(){
        if(tablero[this.i][this.j].isVacio() == false){
            perder();
        }else if(tablero[this.i][this.j].isVacio() == true){
            buscar();
        }
    }
        //Buscar casillas de los alrededores
    private void buscar(){
        
    }
        //Pérdida de partida
    private void perder(){
        for(int k=0;k<tablero.length;k++){
            for(int l=0;l<tablero.length;l++){
                if(tablero[k][l].isVacio() == false){
                    tablero2[k][l].setBackground(Color.red);
                    setImagen("src\\Imagenes\\Mina.png",k,l,true);
                }
            }
        }
    }
        //Colocar o cambiar imagen de la casilla
    private void setImagen(String a, int b, int c, boolean d){
        ImageIcon img = new ImageIcon(a);
        Image image = img.getImage(); //Transformación de ImageIcon a Image
        //Escalado de la imagen acorde a las dimensiones de la casilla
        Image newimg = image.getScaledInstance(this.getHeight(), this.getWidth(),  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(newimg); //Transformación de vuelta a ImageIcon
        if(d == false){
            this.setIcon(img);
        }else if(d == true){
            tablero2[b][c].setIcon(img);
        }
    }
}