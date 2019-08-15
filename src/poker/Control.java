/**
  Archivo: Control.java
  Fecha creación:		2019/08/01
  Última modificación:	2019/08/14
  Versión: 1.0
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558
  			Crhistian Alexander Garcia	   1832124

  Email:	nicolas.jaramillo@correounivalle.edu.co
  			garcia.crhistian@correounivalle.edu.co

*/

package poker;

import java.util.ArrayList;
import java.util.Collections;

// TODO: Auto-generated Javadoc
/**
 * The Class Control.
 */
public class Control {
	
    /** The baraja. */
    private Baraja baraja;
    
    /** The ganador. */
    private Ganador ganador;
    
    /** The jugadores. */
    private ArrayList<Jugador> jugadores; // 0 = Bot, 1 = player
    
    
    /**
     * Instantiates a new control.
     */
    public Control(){
        baraja = new Baraja();
        ganador = new Ganador();
        jugadores = new ArrayList<Jugador>();
        jugadores.add(new Bot(0));
        jugadores.add(new Jugador(1));
        
    }
    
    /**
     * Nueva ronda.
     */
    public void nuevaRonda() {
    	baraja = new Baraja();
    	baraja.revolver();
		jugadores.get(0).getCartasJugador().clear();
		jugadores.get(1).getCartasJugador().clear();
    }
    
    /**
     * Repartir cartas.
     */
    public void repartirCartas() {
    	for (int n=0; n<2; n++) {
    		for (int i=0; i<jugadores.size(); i++) {
            	Carta nuevaCarta = baraja.takeCard();
            	jugadores.get(i).addCarta(nuevaCarta);
        	}
    	}
    }
    
    /**
     * Repartir carta mesa.
     *
     * @return the carta
     */
    public Carta repartirCartaMesa() {
    	return baraja.takeCard();
    }
    
    /**
     * Gets the cartas.
     *
     * @param quien the quien
     * @return the cartas
     */
    public ArrayList<Carta> getCartas(int quien){
    	return jugadores.get(quien).getCartasJugador();
    }
    
    /**
     * Gets the cartera.
     *
     * @param quien the quien
     * @return the cartera
     */
    public Cartera getCartera(int quien) {
    	return jugadores.get(quien).getCartera();
    }
    
    /**
     * Ganador.
     *
     * @param cartasMesa the cartas mesa
     * @return the int
     */
    public int ganador(ArrayList<Carta> cartasMesa) {
    	return ganador.quienGana(cartasMesa, jugadores);
    }
}
