package Jak3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jrgir
 */
public class Vehiculos {

    protected double velocidad;
    protected double pderrape;
    protected String nombre;
    protected int ataque;
    protected int vida;

    public Vehiculos(double velocidad, double pderrape, String nombre, int ataque, int vida) {
        this.velocidad = velocidad;
        this.pderrape = pderrape;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPderrape() {
        return pderrape;
    }

    public void setPderrape(double pderrape) {
        this.pderrape = pderrape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    
}
