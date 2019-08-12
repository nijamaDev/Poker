/**
  Archivo: Jugador.java
  Fecha creación:		Jul 14, 2019
  Última modificación:	Jul 22, 2019
  Versión: 0.9
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor         1840558
  			Crhistian Alexander Garcia		1832124

  Email:	nicolas.jaramillo@correounivalle.edu.co
  			garcia.crhistian@correounivalle.edu.co
*/

package poker;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Jugador.
 */
public class Jugador {
	
	
	/** The Cartas del jugador. */
	protected ArrayList<Carta> CartasDelJugador = new ArrayList<Carta>();
	private Cartera cartera;
	
	/**
	 * Adds the Carta.
	 *
	 * @param nuevaCarta the nueva Carta
	 */
	public void addCarta(Carta nuevaCarta) {
		CartasDelJugador.add(nuevaCarta);
	}
	
	/**
	 * Val Cartas.
	 *
	 * @return the int
	 */
	public int valCartas() {
		return 0;
	}
	
	/**
	 * Gets the Cartas jugador.
	 *
	 * @return the Cartas jugador
	 */
	public ArrayList<Carta> getCartasJugador() {
		return CartasDelJugador;
	}
	
	/**
	 * Devuelve la cartera
	 *
	 * @return la cartera del jugador
	 */
	public Cartera getCartera() {
		return cartera;
	}
}
