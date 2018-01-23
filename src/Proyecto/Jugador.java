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
public class Jugador {
    private String id;
    private int mres;
    
    Jugador(String id){
        this.id = id;
    }
    public void setRes(int mres){
        this.mres = mres;
    }
    public int getRes(){
        return mres;
    }
    public String getID(){
        return this.id;
    }
}
