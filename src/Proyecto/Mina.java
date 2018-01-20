/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Samuel Vera
 * Carnet: 20171110080
 * CI: 26475783
 */
public class Mina extends Casilla{
    Mina(boolean visual){   //Constructor de visualizar y deterinar mina o vacio
        super(false,visual);
    }
    protected void setMarca(int marca){ //Colocar marca a la casilla
        super.setMarca(marca);
    }
    protected void setVisual(boolean visual){
        super.setVisual(visual);
    }
}
