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
public class Cartas_Francesas extends Carta {

    public Cartas_Francesas(int numCarta, int numPalo) {
        super(numCarta, numPalo);
    }

    @Override
    public String toString() {
        String str;
        String color;
        if (getPalo() == palo.DIAMANTES || getPalo() == palo.CORAZONES){
            color = " ROJO";
        }
        else{
            color = " NEGRO";
        }
        if (getNum() == 1) {
            str = ("A de " + getPalo() + color);
        }
        else if (getNum() == 11) {
            str = ("J de " + getPalo() + color);
        }
        else if (getNum() == 12) {
            str = ("Q de " + getPalo() + color);
        }
        else if (getNum() == 13) {
            str = ("K de " + getPalo() + color);
        }else {
            str = (getNum() + " de " + getPalo() + color);
        }
        return str;
    }

}
