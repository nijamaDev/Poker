/**
  Archivo: Jugador.java
  Fecha creación:		2019/08/01
  Última modificación:	2019/08/14
  Versión: 0.8
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

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
	protected int puesto;
	
	public Jugador(int puesto) {
		this.puesto = puesto;
	}
	
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
	
	/**
	 * Devuelve el puesto en el que está¡ sentado el jugador
	 * @return el puesto
	 */
	public int getPuesto() {
		return puesto;
	}
}
