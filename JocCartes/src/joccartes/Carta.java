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
public abstract class Carta {
    private int num;
    private palo palo;
    
     public enum palo{
        DIAMANTES,
        PICAS,
        CORAZONES,
        TREBOLES,
        OROS,
        BASTOS,
        COPAS,
        ESPADAS
    }
    
    public Carta(int num, int numPalo) {
        this.num = num;
        if (numPalo == 0) {
            palo = palo.DIAMANTES;
        }
        else if (numPalo == 1) {
            palo = palo.CORAZONES;
        }
        else if (numPalo == 2) {
            palo = palo.PICAS;
        }
        else if (numPalo == 3) {
            palo = palo.TREBOLES;
        }
        else if (numPalo == 4) {
            palo = palo.OROS;
        }
        else if (numPalo == 5) {
            palo = palo.BASTOS;
        }
        else if (numPalo == 6) {
            palo = palo.COPAS;
        }
        else if (numPalo == 7) {
            palo = palo.ESPADAS;
        }
    }
    
    public Carta(){}
    
    public abstract String toString();

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the palo
     */
    public palo getPalo() {
        return palo;
    }

    /**
     * @param palo the palo to set
     */
    public void setPalo(palo palo) {
        this.palo = palo;
    }
}
