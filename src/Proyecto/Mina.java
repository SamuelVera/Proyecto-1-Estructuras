package Proyecto;

/**
 * clase Mina, los objetos de esta clase son Casillas con minas
 * Sub Clase de Casilla
 */
public class Mina extends Casilla{
        //Constructor del estado de visualización de la casilla y su contenido
    Mina(boolean vacio){
        super(false,vacio);
    }
    @Override
    public boolean isVacio() {
        return this.vacio;
    }
    @Override
    public boolean isVisual() {
        return this.visual;
    }
    @Override
    public void setVisual(boolean visual){
        this.visual = visual;
    }
}
