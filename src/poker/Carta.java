/**
  Archivo: Carta.java
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

import externalCode.RotatedIcon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *   Las cartas tienen una parte trasera, una cara frontal, un valor y un tipo.
 */
public class Carta extends JLabel{
	
    /**Cara trasera de la carta*/
    private final ImageIcon back = new ImageIcon(getClass().getResource("/img/cards/back.png"));
    /**Cara delantera de la carta*/
    private ImageIcon front;
    /** Valor y tipo de la carta*/
    private int value, type;
    
    public Carta() {
    	
    }
    
    public Carta(ImageIcon front, int value, int type){
        this.front = front;
        this.value = value; // 1 = As, 2 = 2, ... 11 = J, 12 = Q, 13 = K
        this.type = type;  // 1 = Picas, 2 = Corazones, 3 = Tréboles, 4 = Diamantes
        setIcon(back);
    }
    
    public Carta(Carta card){
        this.front = card.front;
        this.value = card.value; // 0 = 2, 1 = 3 ... 9 = J, 10 = Q, 11 = K, 12 = As
        this.type = card.type;  // 0 = Picas, 1 = Corazones, 2 = Tréboles, 3 = Diamantes
        setIcon(back);
    }
    
    public void showCard(int twist) {
        switch (twist){
            case 0:
                setIcon(back);
                return;
            case 1:
                setIcon(front);
                return;
            case 2:
                setIcon(new RotatedIcon(front, (double) 10));
        }
    }

    public ImageIcon getFront() {
        return front;
    }

    public int getValue() {
        return value;
    }

    public int getType() {
        return type;
    }
    
}
