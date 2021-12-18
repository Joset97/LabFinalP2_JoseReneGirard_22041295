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
public class Salto extends Vehiculos implements Serializable{

    Random r = new Random();
    int valorDado = r.nextInt(100);
    int salto;
 private static final long SerialVersionUID = 99770L;
    public Salto(int salto, double velocidad, double pderrape, String nombre, int ataque, int vida) {
        super(velocidad, pderrape, nombre, ataque, vida);
        this.salto = valorDado;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getValorDado() {
        return valorDado;
    }

    public void setValorDado(int valorDado) {
        this.valorDado = valorDado;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

}
