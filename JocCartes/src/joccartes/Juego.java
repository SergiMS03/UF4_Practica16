/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joccartes;

import java.util.ArrayList;
import java.util.Collections;
import Utils.utils;

/**
 *
 * @author ausias
 */
public class Juego {
    private ArrayList<Carta> BarajaUsuari = new ArrayList<>();
    private ArrayList<Carta> BarajaMonton = new ArrayList<>();
    
    //CONSTRUCTOR POR DEFECTO, SIN PARAMETROS
    
    public void barreja(){
        Collections.shuffle(BarajaUsuari);
    }
    
    public Carta seguentCarta(){
        Carta aux = new Carta();
        if(BarajaUsuari.size() > 0){
            aux = BarajaUsuari.get(0);
            BarajaUsuari.remove(0);
        }else{
            System.out.println("No quedan mes cartes a la baralla");
        }
        return aux;
    }
    
    public int cartesDisponibles(){
        return BarajaUsuari.size();
    }
    
    public ArrayList<Carta> demanarCartes(){//També es repartirCartes
        ArrayList<Carta> aux = new ArrayList<>();
        if (BarajaUsuari.size() <= 0) {
            System.out.println("No queden cartas");
        }
        else{
            int numCartas = utils.LlegirIntLimitat("", 1, BarajaUsuari.size());
            for (int i = 0; i < numCartas; i++) {
                aux.add(seguentCarta());
            }
        }
        return aux;
    }
    
    public void VeureMunt(){
        for (int i = 0; i < BarajaUsuari.size(); i++) {
            
        }
    }
    
}
