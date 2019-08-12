/**
  Archivo: Cartera.java
  Fecha creación:		2019/08/01
  Última modificación:	2019/08/14
  Versión: 0.4
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

*/

package poker;

// TODO: Auto-generated Javadoc
/**
 * Maneja la cantidad de dinero del jugador y las apuestas.
 */
public class Cartera {
	
	private static int apuesta = 0;
	
	
	/** El dinero. */
	private int dinero = 0;
	
	/**
	 * Inicializa una nueva cartera.
	 *
	 * @param dinero the dinero
	 */
	public Cartera(int dinero) {
		this.dinero = dinero;
	}
	
	/**
	 * Adds the dinero.
	 *
	 * @param suma the suma
	 */
	public void addDinero(int suma) {
		dinero += suma;
	}
	
	/**
	 * Adds to the apuesta.
	 *
	 * @param suma the apuesta
	 */
	public void addApuesta(int suma) {
		apuesta += suma;
	}
	
	/**
	 * Gets the dinero.
	 *
	 * @return the dinero
	 */
	public int getDinero() {
		return dinero;
	}
	
	/**
	 * Gets the apuesta.
	 *
	 * @return the apuesta
	 */
	public int getApuesta() {
		return apuesta;
	}
	
	/**
	 * ¿puede apostar?
	 *
	 * @param apuesta
	 * @return true, si el jugador puede apostar
	 */
	public boolean puedeApostar(int apuesta) {
		if (dinero < apuesta)
			return false;
		else return true;
	}
	
	public void ganador() {
		addDinero(apuesta);
		apuesta = 0;
	}
	
}
