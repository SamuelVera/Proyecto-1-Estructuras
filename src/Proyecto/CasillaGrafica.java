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
 * Clase con la cual se crea la interfaz gráfica de cada casilla, además que
 * se implementa el evento de click de la interfaz ActionListener para que el
 * usuario interactue al clickear sobre la casilla
 */

public class CasillaGrafica extends JButton implements ActionListener{
    private int i,j; //Coordenadas de la casilla
        //Tablero con objetos incializados en la clase MenuPrincipal
    private Casilla[][] tablero = TableroGrafico.getTablero();
        //Tablero grafico con objetos inicializados en la clase TableroGrafico
    private CasillaGrafica[][] tablero2 = TableroGrafico.getTabDinamico();
    
        //Constructor de los parámetros gráficos de la casilla
    CasillaGrafica(int x, int y, int alto, int ancho){
        setLocation(x, y);//Parámetros posición en y, en x
        setPreferredSize(new Dimension(ancho,alto)); //Tamaño de la casilla
        addActionListener(this); //Implementación del Action Listener para evento de click
        this.setBackground(Color.getHSBColor(40, 95, 51));
        setCoord(x,y);
    }
    public void setCoord(int j, int i){ //Establecer coordenada de la casilla
        this.i = i;
        this.j = j;
    }

        /*Implementación del método actionPerformed Action Listener
          para el evento del click*/
    @Override 
    public void actionPerformed(ActionEvent e) {
        int aux;
        JFrame frame = new JFrame(); //Ventana de selección con opciones personalizadas
        String[] opcion = new String[2]; //Arreglo con opciones para la ventana
        opcion[0] = "Mostrar";
        opcion[1] = "Marcar";
            /*Se almacena el valor del indice del arreglo que va acorde a la opción
              seleccionada en la variable auxiliar*/
        aux = JOptionPane.showOptionDialog(frame.getContentPane(),"CASILLA("+this.i+","+this.j+")","¿Mostrar o Marcar?",0,JOptionPane.INFORMATION_MESSAGE,null,opcion,null);
        if(aux == 1){ //Opción de marcar casilla selecionada
            opcion[0] = "Bandera";
            opcion[1] = "Desconocido";
            /*Se almacena en la variable auxiliar el valor del indice que va a 
              corresponder con la opción seleccionada*/
            aux = JOptionPane.showOptionDialog(frame.getContentPane(),"Selecciona un tipo de marca","",0,JOptionPane.INFORMATION_MESSAGE,null,opcion,null);
            if(aux == 0){ //Poner icono de la bandera en el botón
                setIcono("src\\Imagenes\\Bandera_Amarilla.png");
            }else if(aux == 1){ //Poner icono de interrogación en el botón
                setIcono("src\\Imagenes\\Misterio.png");
            }
        }else if(aux == 0){ //Opción de mostrar la casilla selecionada
            opcionCasilla();
        }
    }
        //Método en el que se determina el contenido de la casilla
    private void opcionCasilla(){
        if(tablero[this.i][this.j].isVacio() == false){ //La casilla contiene una mina
            perder();
        }else if(tablero[this.i][this.j].isVacio() == true){ //La casilla esta vacia
            buscar(this.i,this.j);
            ganar();
        }
    }
    /*En el método "buscar" se implementa recursividad para hallar el contenido de
      las casillas adyacentes. Se contemplan los siguientes casos en el mismo:
        **Se aplica recursividad**
            -Si las 8 casillas adyacentes no poseen mina, además se procede a evaluar
            esas mismas 8 casillas en busqueda de minas.
        **Casos base para detener la recursividad**
            -Si el índice no existe en los límites de la matriz
            -Si la casilla ya ha sido visitada
            -Si alguna casilla adyacente posee una bomba
    */
    private int buscar(int x, int y){
        if(x>=0 && y>=0 && x<tablero.length && y<tablero.length){ //Buscar si el índice existe
          if(tablero[x][y].isVisual()==false){ //Determinar si la casilla ya ha sido visitada
            int nBombas;
            nBombas = 0;
              //Barrido de casillas adyacentes en búsqueda de bombas
            for (int k=x-1;k<x+2;k++){
              for (int l=y-1;l<y+2;l++){
                 //Evitar excepciones donde se evalue un indice mayor al del arreglo o negativo
                if(k>=0 && l>=0 && (k!=x || l!=y) && k<tablero.length && l<tablero.length){
                  if(tablero[k][l].isVisual() == false && tablero[k][l].isVacio() == false){
                    nBombas++;
                  }
                }
              }
            }
            tablero[x][y].setVisual(true);
            tablero2[x][y].setEnabled(false);
            if(nBombas == 0){        
              buscar(x-1,y-1); //Arriba a la izquierda
              buscar(x-1,y);   //Arriba
              buscar(x-1,y+1); //Arriba a la derecha
              buscar(x,y-1);   //Izquierda
              buscar(x,y+1);   //Derecha
              buscar(x+1,y-1); //Abajo a la izquierda
              buscar(x+1,y);   //Abajo
              buscar(x+1,y+1); //Abajo a la derecha
            }else{
              numeroIcono(nBombas,x,y);
              return 0; //Caso en el que hay una bomba adyacente
            }
          }else {
            return 0; //Caso de la casilla ya ha sido visitada
          }
        }else{
            return 0; //Caso de índice inexistente
        }
        return 0;
    }
        //Método para seleccionar el número que se le colocará a la casilla
    private void numeroIcono(int nBombas, int x, int y){
        switch (nBombas) {
            case 1:
                setIcono("src\\Imagenes\\Uno.png",x,y);
                break;
            case 2:
                setIcono("src\\Imagenes\\Dos.png",x,y);
                break;
            case 3:
                setIcono("src\\Imagenes\\Tres.png",x,y);
                break;
            case 4:
                setIcono("src\\Imagenes\\Cuatro.png",x,y);
                break;
            case 5:
                setIcono("src\\Imagenes\\Cinco.png",x,y);
                break;
            case 6:
                setIcono("src\\Imagenes\\Seis.png",x,y);
                break;
            case 7:
                setIcono("src\\Imagenes\\Siete.png",x,y);
                break;
            case 8:
                setIcono("src\\Imagenes\\Ocho.png",x,y);
                break;
            default:
                break;
        }
    }
        //Método de pérdida de la partida
    private void perder(){
        this.setIcono("src\\Imagenes\\Mina.png");
        this.setEnabled(false);
        this.setBackground(Color.red);
        for(int k=0;k<tablero.length;k++){ //Barrido del arreglo para revelar las minas
            for(int l=0;l<tablero.length;l++){
                if(tablero[k][l].isVacio() == false){
                    setIcono("src\\Imagenes\\Mina.png",k,l);
                }
                tablero2[k][l].setEnabled(false);
            }
        }
        GameOver over = new GameOver();
        over.setVisible(true);
    }
        //Método para determinar si hay condición de victoria
    private void ganar(){
        int aux=0, aux2=0;
        for(int k=0;k<tablero.length;k++){
            for(int l=0;l<tablero.length;l++){
                if(tablero[k][l].isVisual()==true){
                    aux++;
                }
                if(tablero[k][l].isVacio()==false)
                {
                    aux2++;
                }
            }
        }
            //Condición de victoria
        if(aux == (tablero.length*tablero.length)-aux2){
            GameOver over = new GameOver(1);
            over.setVisible(true);
        }
    }
        //Método para colocarCasillas o cambiar imagen de la casilla
        //Parametros: Dirección e indices
    private void setIcono(String direccion, int x, int y){
        ImageIcon img = new ImageIcon(direccion);
        Image image = img.getImage(); //Transformación de ImageIcon a Image
        //Escalado de la imagen acorde a las dimensiones de la casilla
        Image newimg = image.getScaledInstance(this.getHeight(), this.getWidth(),  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(newimg); //Transformación de vuelta a ImageIcon
        tablero2[x][y].setIcon(img); //Colocar la imagen
    }
        //Sobrecarga del metodo setImage
        //Parametros Dirección
    private void setIcono(String direccion){
        ImageIcon img = new ImageIcon(direccion);
        Image image = img.getImage(); //Transformación de ImageIcon a Image
        //Escalado de la imagen acorde a las dimensiones de la casilla
        Image newimg = image.getScaledInstance(this.getHeight(), this.getWidth(),  java.awt.Image.SCALE_SMOOTH);
        img = new ImageIcon(newimg); //Transformación de vuelta a ImageIcon
        this.setIcon(img); //Colocar la imagen
    }
}