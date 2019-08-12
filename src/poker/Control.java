/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;

/**
 * 
 */
public class Control {
	
    private Baraja baraja;
    private Ganador ganador;
    private ArrayList<Jugador> jugadores; // 0 = player, 1 = Bot
    
    
    public Control(){
        baraja = new Baraja();
        ganador = new Ganador();
        jugadores = new ArrayList<Jugador>();
        jugadores.add(new Jugador(0));
        jugadores.add(new Bot(1));
        
    }
    
    public void darCarta(int quien) {
    	Carta nuevaCarta = baraja.takeCard();
    	jugadores.get(quien).addCarta(nuevaCarta);
    	
    }
}
