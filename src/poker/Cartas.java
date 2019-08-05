/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author crhistian
 */
public class Cartas extends JLabel{
    /**Cara trasera de la carta*/
    public static ImageIcon back;
    /**Cara delantera de la carta*/
    private ImageIcon front;
    
    public Cartas(ImageIcon image){
    	this.back = back;
    	this.front = image;
    	setIcon(back);
    	
    }
}
