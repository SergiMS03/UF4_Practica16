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
public class JocCartes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego j = new Juego();
        j.barreja();
        j.seguentCarta();
        j.repartirCartes();
        j.demanarCartes();
        j.VeureMunt();
        j.VeureUsu();
        j.TirarUnaCarta();
    }
    
}
