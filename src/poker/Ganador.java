/**
  Archivo: Ganador.java
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
import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The class Ganador. Determina al ganador de la ronda.
 */
public class Ganador {
	
	/** The straight flush types. */
	private final int[] straight_flush_types = {4, 5, 8};
	                 // 4 = STRAIGHT, 5 = FLUSH, 8 = STRAIGHT_FLUSH
	
	/** The repeated types. */
                 	private final int[][] repeated_types = {
	        {0},     // 0 = HIGH_CARD,
	        {1, 2},  // 1 = ONE_PAIR, 2 = TWO_PAIR,
	        {3, 6},	 // 3 = THREE_OF_A_KIND, 6 = FULL_HOUSE,
	        {7}      // 7 = FOUR_OF_A_KIND,
	    };
	
	/** Los tipos ordenados en valor de la jugada:
	 *  	    0 = HIGH_CARD, 
	 *          1 = ONE_PAIR,
	 *          2 = TWO_PAIR,
	 *          3 = THREE_OF_A_KIND,
	 *          4 = STRAIGHT,
	 *          5 = FLUSH,
	 *          6 = FULL_HOUSE,
	 *          7 = FOUR_OF_A_KIND,
	 *          8 = STRAIGHT_FLUSH. */
	private final int[][] indices = new int[5][2];
	
	/** The val cartas. */
	private final int[] valCartas = new int[13]; // cada posición representa la cantidad de cartas con ese valor
	
	/** The mazo. */
	private final int[] mazo = new int[4];
	
	/** The is straight. */
	private boolean isStraight = false;
	
	/** The is flush. */
	private boolean isFlush = false;
			
	/**
	 * Retorna el la posición del ganador.
	 *
	 * @param cartasMesa the cartas mesa
	 * @param jugadores the jugadores
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
	 *  Recibe 7 cartas.
	 *
	 * @param cartasEvaluar the cartas evaluar
	 * @return the int
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
	 *
	 * @param cartas the cartas
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
		isFlush = false;
		Arrays.fill(valCartas, 0);
		Arrays.fill(mazo, 0);
		for (int i=0; i<5; i++) {
			Carta carta = cartas.get(i);
			valCartas[carta.getValue()]++; // +1 por cada carta con ese valor
			mazo[carta.getType()]++; // +1 en el palo de la carta por cada carta de las 5
		}
		isFlush = mazo[cartas.get(0).getType()] == 5; //si el mazo de la primera carta está 5 veces es porque todas las cartas son del mismo mazo
		isStraight = false;
		int contador = 0; // contador de cartas con valores seguidos (escalera)
		int i2 = 0;
		for (int i = 12; i >= 0; i--) {
			if (valCartas[i] > 0) {
				contador++;
				isStraight = contador == 5; // si el contador llega a 5 hay escalera.
				indices[i2][0] = i;  // guarda el valor de la carta en la matriz
				indices[i2][1] = valCartas[i]; // guarda la cantidad de veces que se repite la carta
				indicesOrdenar(i2);
				i2++;
			} else
				contador = 0;
		}
		isStraight = isStraight || straight5toAce(contador);
		return calcularMano();
	}
	
	/**
	 * Ordena la matriz de indices de las cartas que más se repiten a las que menos.
	 *
	 * @param num the num
	 */
	private void indicesOrdenar(int num) {
		int i = num;
		while (i > 0 && indices[i - 1][1] < indices[i][1]) {
			int [] aux = indices[i - 1];
			indices[i - 1] = indices[i];
			indices[i] = aux;
			i--;
		}
	}
	
	/**
	 * si hay un AS y el contador es 4, entonces es porque las cartas son:
	 * As, 5, 4, 3, 2 (straight to ace)
	 * La función comprueba si este es el caso y reacomoda los indices de las cartas para que sea:
	 * 5, 4, 3, 2, As.
	 *
	 * @param contador the contador
	 * @return true si hay un straight to ace
	 */
	private boolean straight5toAce(int contador) { 
		boolean straight5toAce = false;
		if (valCartas[12] == 1 && contador == 4) { // valCartas[12] == 1 indica que hay un As
			straight5toAce = true;           //el contador solo es 4 cuando hay un 2, 3, 4 y 5
			for (int i = 0; i < indices.length-1; i++) { // reacomoda las cartas
				indices[i][0] = indices[i+1][0];
			}
			indices[indices.length - 1][0] = 12;
		}
		return straight5toAce;
	}
	
	/**
	 * Calcular mano.
	 *
	 * @return the int
	 */
	private int calcularMano() {
		int jugada;
		if (isStraight) {
			if (isFlush)
				jugada = straight_flush_types[2];  // straight flush
			else jugada = straight_flush_types[0]; // straight only
		} else if (isFlush) {
			jugada = straight_flush_types[1]; // flush only
		} else
			jugada = repeated_types[indices[0][1] - 1] // indice 0, la cantidad de veces que se repite la carta que más se repite
								   [indices[1][1] - 1];// indice 1, la cantidad de veces que se repite la segunda carta que más se repite
		return valorMano(jugada);
	}
	
	/**
	 * Valor mano. Le da un valor numerico a cada jugada
	 *
	 * @param jugada the jugada
	 * @return the int
	 */
	private int valorMano(int jugada) {
		int valorMano = jugada;
		int i = 0;
		int j = 0;
		while (j < 5) {
			for (int k = 0; k < indices[i][1]; k++) {
				valorMano = valorMano*13 + indices[i][0];
				j++;
			}
			i++;
		}
		return valorMano;
	}
	
	/**
	 * Mano ganadora.
	 *
	 * @param ganador the ganador
	 * @return the array list
	 */
	public ArrayList<Carta> manoGanadora(Jugador ganador){
		return null;
	}
}
