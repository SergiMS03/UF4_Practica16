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

    /**
     * @return the CartasUsuari
     */
    public ArrayList<Carta> getCartasUsuari() {
        return CartasUsuari;
    }

    /**
     * @param CartasUsuari the CartasUsuari to set
     */
    public void setCartasUsuari(ArrayList<Carta> CartasUsuari) {
        this.CartasUsuari = CartasUsuari;
    }

    /**
     * @return the BarajaMonton
     */
    public ArrayList<Carta> getBarajaMonton() {
        return BarajaMonton;
    }

    /**
     * @param BarajaMonton the BarajaMonton to set
     */
    public void setBarajaMonton(ArrayList<Carta> BarajaMonton) {
        this.BarajaMonton = BarajaMonton;
    }

    /**
     * @return the CartasTiradas
     */
    public ArrayList<Carta> getCartasTiradas() {
        return CartasTiradas;
    }

    /**
     * @param CartasTiradas the CartasTiradas to set
     */
    public void setCartasTiradas(ArrayList<Carta> CartasTiradas) {
        this.CartasTiradas = CartasTiradas;
    }
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
        Collections.shuffle(getBarajaMonton());
    }
    
    public void seguentCarta(){//Mostra seguent carta del monton
        
        if(getBarajaMonton().size() > 0){
            Carta c = getBarajaMonton().get(0);
            System.out.println("La següent carta: " + c.toString());
            getCartasUsuari().add(getBarajaMonton().get(0));
            getBarajaMonton().remove(0);

        }else{
            System.out.println("No quedan mes cartes al usuari");
        }
    }
    
    public int cartesDisponibles(){
        System.out.println("Cartas disponibles a repartir: " + getBarajaMonton().size());
        return getBarajaMonton().size();
    }
    
    public void demanarCartes(){
        Carta aux;
        int numCartas = utils.LlegirInt("Quantes cartes vols i tiraras? ");
        if (getCartasUsuari().size() < numCartas || getBarajaMonton().size() < numCartas) {
            System.out.println("No queden suficients cartes");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                aux = getCartasUsuari().get(0);
                getCartasUsuari().remove(0);
                getCartasUsuari().add(getBarajaMonton().get(0));
                getBarajaMonton().remove(0);
                getCartasTiradas().add(aux);
            }
        }
    }
    
    public void repartirCartes(){
        int numCartas = utils.LlegirInt("Quantes cartes vols per començar? ");
        if (getBarajaMonton().size() < numCartas) {
            System.out.println("No quedan suficients cartes");
        }
        else{
            for (int i = 0; i < numCartas; i++) {
                getCartasUsuari().add(getBarajaMonton().get(0));
                getBarajaMonton().remove(0);
            }
        }
    }
    
    public void VeureMunt(){
        Carta c;
        System.out.println("Cartas Munt: \n");
        for (int i = 0; i < getCartasTiradas().size(); i++) {
            c = getCartasTiradas().get(i);
            
            System.out.println(c.toString());
        }
    }
    
    /*Funciones por que si*/
    public void VeureUsu()
    {
        Carta c;
        System.out.println("CARTAS USUARI: \n");
        for (int i = 0; i < getCartasUsuari().size(); i++) {
            c = getCartasUsuari().get(i);
            
            System.out.println(c.toString());
        }
    }
    
    public void TirarUnaCarta(){
        getCartasTiradas().add(getCartasUsuari().get(0));
        getCartasUsuari().remove(0);
    }
}
