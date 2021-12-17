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
public class Bueno extends Jugadores{
    
       private boolean malvado;

    public Bueno(boolean malvado, String nombre, int vida, double atque) {
        super(nombre, vida, atque);
        this.malvado = false;
    }

    public boolean isMalvado() {
        return malvado;
    }

    public void setMalvado(boolean malvado) {
        this.malvado = malvado;
    }

        
}

