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
public class Malvado extends Vehiculos{

   private int vidaM;
   private int AtaqueM;

   

    public Malvado(double velocidad, double pderrape, String nombre, int ataque, int vida) {
  
        super(velocidad, pderrape, nombre, ataque, vida);
        
        super.setAtaque(setAtaqueM());
       super.setVida( setVidaM());
        
    }
    public int getVidaM() {
        return vidaM;
    }

    public int setVidaM() {
         Random r = new Random();
         int valorDado =1000 + r.nextInt(5000+1);
       
         return valorDado;
    }

    public int getAtaqueM() {
        return AtaqueM;
    }

    public int setAtaqueM() {
         Random r = new Random();
         int valorDado =300 + r.nextInt(700+1);
   
         return valorDado;
    }
    
    
}
