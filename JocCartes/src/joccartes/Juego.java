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
    
    public void seguentCarta(){//Mostra seguent carta del monton
        
        if(BarajaMonton.size() > 0){
            Carta c = BarajaMonton.get(0);
            System.out.println("La següent carta: " + c.toString());
            CartasUsuari.add(BarajaMonton.get(0));
            BarajaMonton.remove(0);

        }else{
            System.out.println("No quedan mes cartes al usuari");
        }
    }
    
    public int cartesDisponibles(){
        System.out.println("Cartas disponibles a repartir: " + BarajaMonton.size());
        return BarajaMonton.size();
    }
    
    public void demanarCartes(){
        Carta aux;
        int numCartas = utils.LlegirInt("Quantes cartes vols i tiraras? ");
        if (CartasUsuari.size() < numCartas || BarajaMonton.size() < numCartas) {
            System.out.println("No queden suficients cartes");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                aux = CartasUsuari.get(0);
                CartasUsuari.remove(0);
                CartasUsuari.add(BarajaMonton.get(0));
                BarajaMonton.remove(0);
                CartasTiradas.add(aux);
            }
        }
    }
    
    public void repartirCartes(){
        int numCartas = utils.LlegirInt("Quantes cartes vols per començar? ");
        if (BarajaMonton.size() < numCartas) {
            System.out.println("No quedan suficients cartes");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                CartasUsuari.add(BarajaMonton.get(0));
                BarajaMonton.remove(0);
            }
        }
    }
    
    public void VeureMunt(){
        Carta c;
        System.out.println("Cartas Munt: \n");
        for (int i = 0; i < CartasTiradas.size(); i++) {
            c = CartasTiradas.get(i);
            
            System.out.println(c.toString());
        }
    }
    
    public void VeureUsu()
    {
        Carta c;
        System.out.println("CARTAS USUARI: \n");
        for (int i = 0; i < CartasUsuari.size(); i++) {
            c = CartasUsuari.get(i);
            
            System.out.println(c.toString());
        }
    }
    
}
