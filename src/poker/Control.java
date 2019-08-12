/**
  Archivo: Control.java
  Fecha creación:		2019/08/01
  Última modificación:	2019/08/14
  Versión: 0.4
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

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
