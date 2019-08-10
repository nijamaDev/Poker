/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import externalCode.RotatedIcon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *   Las cartas tienen una parte trasera, una cara frontal, un valor y un tipo.
 */
public class Cartas extends JLabel{
	
    /**Cara trasera de la carta*/
    private final ImageIcon back = new ImageIcon("src/img.cards/back.png");
    /**Cara delantera de la carta*/
    private ImageIcon front;
    /** Valor y tipo de la carta*/
    private int value, type;
    
    public Cartas(ImageIcon front, int value, int type){
        this.front = front;
        this.value = value; // 1 = As, 2 = 2, ... 11 = J, 12 = Q, 13 = K
        this.type = type;  // 1 = Picas, 2 = Corazones, 3 = Tréboles, 4 = Diamantes
        setIcon(back);
    }
    
    public Cartas(Cartas card){
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
