/**
  Archivo: Carta.java
  Fecha creaci�n:		2019/08/01
  �ltima modificaci�n:	2019/08/14
  Versi�n: 0.4
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

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
        this.value = card.value; // 1 = As, 2 = 2, ... 11 = J, 12 = Q, 13 = K
        this.type = card.type;  // 1 = Picas, 2 = Corazones, 3 = Tréboles, 4 = Diamantes
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
                setIcon(new RotatedIcon(front, (double) 45));
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
