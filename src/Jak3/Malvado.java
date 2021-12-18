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
public class Malvado extends Vehiculos implements Serializable{

   private int vidaM;
   private int AtaqueM;

   private static final long SerialVersionUID = 99770L;

    public Malvado(double velocidad, double pderrape, String nombre, double ataque, int vida) {
  
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
    
    @Override
    public String toString() {
        return super.nombre;
    }
    
}
