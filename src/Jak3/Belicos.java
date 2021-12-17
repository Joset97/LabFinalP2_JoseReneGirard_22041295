/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jak3;

import java.util.Random;


/**
 *
 * @author jrgir
 */
public class Belicos extends Vehiculos{
    
    int vidas=0;

    public Belicos(double velocidad, double pderrape, String nombre, int ataque, int vida) {
        super(velocidad, pderrape, nombre, ataque, vida);
    
    
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas() {
         Random r = new Random();
        this.vidas = vidas;
    }
    
    
    
    
}
