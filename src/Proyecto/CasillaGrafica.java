/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel Vera
 * CI: 26475783
 * Carnet: 20171110080
 */
public class CasillaGrafica extends JButton implements ActionListener{
    private int i,j;
        //Constructor de los parámetros gráficos dela casilla
    CasillaGrafica(int x, int y, int alto, int ancho){
        setLocation(x, y);//Parámetros posicion en y, en x
        setPreferredSize(new Dimension(ancho,alto));
        addActionListener(this); //Implementación del Action Listener para evento de click
    }
    public void setCoord(int i, int j){    //Coordenada de la casilla
        this.i = i;
        this.j = j;
    }

    @Override //Implementación del Action Listener para evento de click
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = new String("Mostrar");
        options[1] = new String("Marcar");
        JOptionPane.showOptionDialog(frame.getContentPane(),"CASILLA("+this.i+","+this.j+")","¿Mostrar o Marcar?",0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
        
    }
}
