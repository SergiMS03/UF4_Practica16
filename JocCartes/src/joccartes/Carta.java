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
    
     private enum palo{
        OROS,
        COPAS,
        BASTOS,
        ESPADAS
    }
    
    public Carta(int num, palo palo){
        this.num = num;
        this.palo = palo;
    }
    
    public Carta(){}
}
