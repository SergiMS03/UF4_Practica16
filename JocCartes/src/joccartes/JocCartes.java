/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joccartes;

import Utils.utils;

/**
 *
 * @author ausias
 */
public class JocCartes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int baralla = escollirBaralla();
        int quitar_8_9 = 0;
        if(baralla == 1){
            quitar_8_9 = treure_8i9();
        }
        Juego j = new Juego(baralla, quitar_8_9);
        j.barreja();
        j.seguentCarta();
        j.repartirCartes();
        j.demanarCartes();
        j.VeureMunt();
        j.VeureUsu();
        j.TirarUnaCarta();
    }
    
    static int escollirBaralla() {
        System.out.println("1 - Española");
        System.out.println("2 - Francesa");
        int tipusBaralla = utils.LlegirIntLimitat("Esculleix amb quina baralla jugaràs: ", 1, 2);
        return tipusBaralla;
    }
    
    static int treure_8i9() {
        System.out.println("1 - Si");
        System.out.println("2 - No");
        int treure = utils.LlegirIntLimitat("Vols que el 8 i el 9 estiguin a la baralla?: ", 1, 2);
        return treure;
    }
    
}
