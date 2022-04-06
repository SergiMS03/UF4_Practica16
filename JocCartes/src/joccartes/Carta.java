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
        String result = this.num + " de "+ this.palo;
        return result;
    }
}
