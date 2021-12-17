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
public class Ataque extends Vehiculos {

    private double attk;
   private Random r = new Random();
    

    public Ataque(double velocidad, double pderrape, String nombre, double ataque, int vida) {
        super(velocidad, pderrape, nombre, ataque, vida);
        double valorDado = super.ataque * 0.5 + r.nextInt((int) super.ataque * 1 + 1);
        this.attk = valorDado;

        super.setAtaque(this.attk+ataque);
    }

    public double getAttk() {
        return attk;
    }

    public void setAttk(double attk) {
        this.attk = attk;
    }

}
