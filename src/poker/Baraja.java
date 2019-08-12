/**
  Archivo: Baraja.java
  Fecha creación:		2019/08/01
  Última modificación:	2019/08/14
  Versión: 0.4
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

*/

package poker;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

/**
 * 
 */
public class Baraja {
	
	private ArrayList<Carta> cartas, baraja;
	
	public Baraja() {
		cartas = new ArrayList<Carta> (52);
        for (int type = 1; type <= 4; type++) {
        	for (int value = 1; value <= 13; value++) {
        		String valor = "";
        		switch (value) {
        		case 11:
        			valor = "J";
        			break;
        		case 12:
        			valor = "Q";
        			break;
        		case 13:
        			valor = "K";
        			break;
        		default: // 1, 2, ..., 10.
        			valor = Integer.toString(value);
        		}
        		String tipo = "";
        		switch (type) {
        		case 1:
        			tipo = "S"; // Spades
        			break;
        		case 2:
        			tipo = "H"; // Hearts
        			break;
        		case 3:
        			tipo = "C"; // Clubs
        			break;
        		case 4:
        			tipo = "D"; // Diamonds
        			break;
        		}
        		Carta carta = new Carta(new ImageIcon("/img/cards/" + valor + tipo + ".png"), value, type);
        		cartas.add(carta);
        	}
        }
        baraja = cartas;
	}
	/**
	 * Revuelve la baraja
	 */
	public void revolver() {
		Collections.shuffle(baraja);
	}
	
	public Carta takeCard() {
		Carta carta = baraja.get(0);
		baraja.remove(0);
		return carta;
	}
}
