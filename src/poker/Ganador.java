/**
  Archivo: Ganador.java
  Fecha creación:		2019/08/01
  Última modificación:	2019/08/14
  Versión: 0.8
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

*/
package poker;

import java.util.ArrayList;

/**
 * Determina al ganador de la ronda
 */
public class Ganador {
	
	/**
	 * Retorna el la posición del ganador
	 * @param cartasMesa
	 * @param jugadores
	 * @return ganador
	 */
	public int quienGana(ArrayList<Carta> cartasMesa, ArrayList<Jugador> jugadores) {
		ArrayList<Carta> cartasEvaluar = new ArrayList<Carta>(7);
		ArrayList<Integer> puntajeJugadores = new ArrayList<Integer> (jugadores.size());
		int ganador=0;
		
		
		for (int i=0; i<jugadores.size(); i++) {
			cartasEvaluar.clear();
			cartasEvaluar.addAll(jugadores.get(i).getCartasJugador());
			cartasEvaluar.addAll(cartasMesa);
			
			puntajeJugadores.add(evaluar7Cartas(cartasEvaluar));
		}
		for (int i=0; i<puntajeJugadores.size()-1; i++) {
			if (puntajeJugadores.get(i) < puntajeJugadores.get(i+1)) {
				ganador = i+1;
			}
		}
		
		return ganador;
	}
	
	/**
	 *  Retorna el puntaje de la mejor combinación de 5 cartas de un jugador
	 *  Recibe 7 cartas
	 * @param cartasEvaluar
	 * @return
	 */
	private int evaluar7Cartas(ArrayList<Carta> cartasEvaluar) {
		ArrayList<Integer> puntajeManos = new ArrayList<Integer> ();
		ArrayList<Carta> cartas5 = new ArrayList<Carta>();
		for (int i=0; i<6; i++) {
			for (int j=i+1; j<7; j++) {
				cartas5.clear();
				cartas5.addAll(cartasEvaluar);
				cartas5.remove(j);
				cartas5.remove(i);
				puntajeManos.add(evaluarMano(cartas5));
			}
		}
		int mejorPuntaje = 0;
		for (int i=0; i<puntajeManos.size()-1; i++) {
			if (puntajeManos.get(i) < puntajeManos.get(i+1)) {
				mejorPuntaje = i+1;
			}
		}
		return puntajeManos.get(mejorPuntaje);
	}
	
	/**
	 * Le da un valor numérico a un grupo de 5 cartas de poker.
	 * @param cartas
	 * @return valor de la mano
	 */
	private int evaluarMano(ArrayList<Carta> cartas) {
		if (cartas == null) {
			return -1;
		}
		for (int i = 0; i < 5; i++) {
			if (cartas.get(i) == null) {
				return -1;
			}
		}
		return 0;
	}
	
	/**
	 * Retorna la mano ganadora del jugador que ganó
	 * @param ganador
	 * @return Cartas ganadoras
	 */
	public ArrayList<Carta> manoGanadora(Jugador ganador){
		return null;
	}
}
