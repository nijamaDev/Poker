/**
  Archivo: Cartera.java
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

// TODO: Auto-generated Javadoc
/**
 * The class Cartera. Maneja la cantidad de dinero del jugador y las apuestas.
 */
public class Cartera {
	
	/** The apuesta. */
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
	private void addDinero(int suma) {
		dinero += suma;
	}
	
	/**
	 * Adds to the apuesta.
	 *
	 * @param suma the apuesta
	 */
	public void addApuesta(int suma) {
		dinero += -suma;
		apuesta += 2*suma;
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
	 * �puede apostar?.
	 *
	 * @param apuesta the apuesta
	 * @return true, si el jugador puede apostar
	 */
	public boolean puedeApostar(int apuesta) {
		if (dinero < apuesta)
			return false;
		return true;
	}
	
	/**
	 * Ganador.
	 */
	public void ganador() {
		addDinero(apuesta);
		apuesta = 0;
	}
	
}
