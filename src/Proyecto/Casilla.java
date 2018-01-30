package Proyecto;

/**
 * Clase abstracta Casilla, apartir de la cual se de herencia a dos subClases de
 * casillas
 */

public abstract class Casilla {
    protected boolean vacio = true; //true=Casilla Vacia // false=Casilla con mina
    protected boolean visual = false; //true=Casilla revelada // false=Casilla oculta
    
        //Constructor de la Casilla, para determinar su estado de vacio y si esta visualizada
    Casilla(boolean visual, boolean vacio){
        this.vacio = vacio;
        this.visual = visual;
    }
        //Getter del contenido de la casilla
    public abstract boolean isVacio();
        //Getter del estado de la casilla
    public abstract boolean isVisual();
        //Setter del estado de la casilla
    public abstract void setVisual(boolean visual);
}