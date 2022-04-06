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
        Collections.shuffle(BarajaMonton);
    }
    
    public Carta seguentCarta(){
        Carta aux = new Carta();
        if(BarajaMonton.size() > 0){
            aux = BarajaMonton.get(0);
            BarajaMonton.remove(0);
        }else{
            System.out.println("No quedan mes cartes a la baralla");
        }
        return aux;
    }
    
    public int cartesDisponibles(){
        return BarajaUsuari.size();
    }
    
    public void demanarCartes(){
        Carta aux;
        int numCartas = utils.LlegirIntLimitat("", 1, BarajaUsuari.size());
        if (BarajaUsuari.size() < numCartas) {
            System.out.println("No queden cartas");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                aux = BarajaUsuari.get(0);
                BarajaUsuari.remove(0);
                BarajaUsuari.add(BarajaMonton.get(0));
                BarajaMonton.remove(0);
                BarajaMonton.add(aux);
            }
        }
    }
    
    public void repartirCartes(){
        int numCartas = utils.LlegirIntLimitat("", 1, BarajaUsuari.size());
        if (BarajaUsuari.size() < numCartas) {
            System.out.println("No queden cartas");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                
                BarajaUsuari.remove(0);
                BarajaUsuari.add(BarajaMonton.get(0));
                BarajaMonton.remove(0);
                
            }
        }
    }
    
    public void VeureMunt(){
        for (int i = 0; i < BarajaMonton.size(); i++) {
            BarajaMonton.get(i);
        }
    }
    
}
