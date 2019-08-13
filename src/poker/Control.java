/**
  Archivo: Control.java
  Fecha creación:		2019/08/01
  Última modificación:	2019/08/14
  Versión: 0.8
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

*/

package poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */
public class Control {
	
    private Baraja baraja;
    private Ganador ganador;
    private ArrayList<Jugador> jugadores; // 0 = Bot, 1 = player
    
    
    public Control(){
        baraja = new Baraja();
        ganador = new Ganador();
        jugadores = new ArrayList<Jugador>();
        jugadores.add(new Bot(0));
        jugadores.add(new Jugador(1));
        
    }
    
    public void repartirCartas() {
    		baraja.revolver();
    	for (int n=0; n<2; n++) {
    		for (int i=0; i<jugadores.size(); i++) {
            	Carta nuevaCarta = baraja.takeCard();
            	jugadores.get(i).addCarta(nuevaCarta);
        	}
    	}
    }
    
    public Carta repartirCartaMesa() {
    	return baraja.takeCard();
    }
    
    public ArrayList<Carta> getCartas(int quien){
    	return jugadores.get(quien).getCartasJugador();
    }
    
    public Cartera getCartera(int quien) {
    	return jugadores.get(quien).getCartera();
    }
    
    public int ganador(ArrayList<Carta> cartasMesa) {
    	return ganador.quienGana(cartasMesa, jugadores);
    }
}
