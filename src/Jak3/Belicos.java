/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jak3;

import java.io.Serializable;
import java.util.Random;


/**
 *
 * @author jrgir
 */
public class Belicos extends Vehiculos implements Serializable{
    
    int vidas=0;
    private static final long SerialVersionUID = 99770L;

    public Belicos(double velocidad, double pderrape, String nombre, int ataque, int vida) {
        super(velocidad, pderrape, nombre, ataque, vida);
    
    vidas= setVidas();
    }

    public int getVidas() {
        return vidas;
    }

    public int setVidas() {
         Random r = new Random();
         int valorDado =super.vida/2 + r.nextInt(super.vida+1);
         
       return valorDado;
    }

    @Override
    public String toString() {
        return super.nombre;
    }
    
    
    
    
}
