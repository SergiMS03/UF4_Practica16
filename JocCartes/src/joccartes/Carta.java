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
public class Carta {
    private int num;
    private palo palo;
    
     public enum palo{
        OROS,
        COPAS,
        BASTOS,
        ESPADAS
    }
    
    public Carta(int num, int numPalo){
        this.num = num;
        switch (numPalo){
            case 0:
                palo = palo.BASTOS;
                break;
            case 1:
                palo = palo.COPAS;
                break;
            case 2:
                palo = palo.ESPADAS;
                break;
            case 3:
                palo = palo.OROS;
                break;
        }
        
    }
    
    public Carta(){}
    
    public String toString(){
        String result = this.getNum() + " de "+ this.getPalo();
        return result;
    }

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
