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
    private ArrayList<Carta> CartasUsuari = new ArrayList<>();
    private ArrayList<Carta> BarajaMonton = new ArrayList<>();
    private ArrayList<Carta> CartasTiradas = new ArrayList<>();
    
    public Juego(){
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                Carta c = new Carta(j, i);
                BarajaMonton.add(c);
            }
        }
    }
    
    public void barreja(){
        Collections.shuffle(BarajaMonton);
    }
    
    public void seguentCarta(){
        
        if(BarajaMonton.size() > 0){
            CartasUsuari.add(BarajaMonton.get(0));
            BarajaMonton.remove(0);
        }else{
            System.out.println("No quedan mes cartes al usuari");
        }
    }
    
    public int cartesDisponibles(){
        return BarajaMonton.size();
    }
    
    public void demanarCartes(){
        Carta aux;
        int numCartas = utils.LlegirInt("Quantes cartes vols? ");
        if (CartasUsuari.size() < numCartas || BarajaMonton.size() < numCartas) {
            System.out.println("No queden suficients cartes");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                aux = CartasUsuari.get(0);
                CartasUsuari.remove(0);
                CartasUsuari.add(BarajaMonton.get(0));
                BarajaMonton.remove(0);
                BarajaMonton.add(aux);
            }
        }
    }
    
    public void repartirCartes(){
        int numCartas = utils.LlegirIntLimitat("Quantes cartes vols? ", 1, CartasUsuari.size());
        if (CartasUsuari.size() < numCartas) {
            System.out.println("No quedan mes cartes al munt");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                
                CartasUsuari.remove(0);
                CartasUsuari.add(BarajaMonton.get(0));
                BarajaMonton.remove(0);
                
            }
        }
    }
    
    public void VeureMunt(){
        Carta c;
        for (int i = 0; i < CartasTiradas.size(); i++) {
            c = CartasTiradas.get(i);
            System.out.println(c.toString());
        }
    }
    
}
