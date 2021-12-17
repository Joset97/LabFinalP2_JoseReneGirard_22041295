/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jak3;

/**
 *
 * @author jrgir
 */
public class Jugadores {
    
   private String nombre;
   private int vida;
   private double atque;

    public Jugadores(String nombre, int vida, double atque) {
        this.nombre = nombre;
        this.vida = vida;
        this.atque = atque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getAtque() {
        return atque;
    }

    public void setAtque(double atque) {
        this.atque = atque;
    }
    
    
    
}
