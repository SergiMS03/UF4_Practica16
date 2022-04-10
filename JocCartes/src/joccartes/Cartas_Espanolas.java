/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joccartes;

/**
 *
 * @author ausias
 */
public class Cartas_Espanolas extends Carta {

    public Cartas_Espanolas(int numCarta, int numPalo) {
        super(numCarta, numPalo);
    }

    @Override
    public String toString() {
        String str = null;
        if (getNum() == 1) {
            str = ("AS de " + getPalo());
        }
        else if (getNum() == 10) {
            str = ("Sota de " + getPalo());
        }
        else if (getNum() == 11) {
            str = ("Caballo de " + getPalo());
        }
        else if (getNum() == 12) {
            str = ("Rey de " + getPalo());
        }else {
            str = (getNum() + " de " + getPalo());
        }
        return str;
    }
}
