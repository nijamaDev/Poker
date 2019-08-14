/**
  Archivo: Baraja.java
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

import javax.swing.ImageIcon;

/**
 * 
 */
public class Baraja {
	
	private ArrayList<Carta> cartas, baraja;
	
	public Baraja() {
		cartas = new ArrayList<Carta> (52);
        for (int type = 0; type < 4; type++) {
        	for (int value = 0; value < 13; value++) {
        		String valor = "";
        		switch (value) {
        		case 9:
        			valor = "J";
        			break;
        		case 10:
        			valor = "Q";
        			break;
        		case 11:
        			valor = "K";
        			break;
        		case 12:
        			valor ="A";
        			break;
        		default: // case 0, 1, 2, ..., 9.
        			valor = Integer.toString(value + 2);
        		}
        		String tipo = "";
        		switch (type) {
        		case 0:
        			tipo = "S"; // Spades
        			break;
        		case 1:
        			tipo = "H"; // Hearts
        			break;
        		case 2:
        			tipo = "C"; // Clubs
        			break;
        		case 3:
        			tipo = "D"; // Diamonds
        			break;
        		}
        		ImageIcon imgCarta = new ImageIcon(getClass().getResource("/img/cards/" + valor + tipo + ".png"));
        		Carta carta = new Carta(imgCarta, value, type);
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
	
	public void nuevaBaraja() {
		baraja = cartas;
	}
}
