/**
  Archivo: Poker.java
  Fecha creaci�n:		Aug 11, 2019
  �ltima modificaci�n:	mes d, 2019
  Versi�n: 0.1
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558

  Email:	nicolas.jaramillo@correounivalle.edu.co

*/
package poker;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import externalCode.RotatedIcon;
import externalCode.RotatedIcon.Rotate;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author ZNK5
 */
public class Poker extends JFrame {

    /**
     * Creates new form Poker
     */
    public Poker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        mainPane = new JLayeredPane();
        startLayer = new JLayeredPane();
        start_bgLabel = new JLabel();
        start_logoLabel = new JLabel();
        start_nuevaBut = new JButton();
        start_reglasBut = new JButton();
        start_salirBut = new JButton();
        gameLayer = new JLayeredPane();
        game_bgLabel = new JLabel();
        game_tableLabel = new JLabel();
        game_chair1Label = new JLabel();
        game_p1Pane = new JLayeredPane();
        game_p1TableCards = new JLabel();
        game_chair2Label = new JLabel();
        game_p2Pane = new JLayeredPane();
        game_p2TableCards = new JLabel();
        game_chair3Label = new JLabel();
        game_p3Pane = new JLayeredPane();
        game_p3TableCards = new JLabel();
        game_chair4Label = new JLabel();
        game_p4Pane = new JLayeredPane();
        game_p4TableCards = new JLabel();
        game_chair5Label = new JLabel();
        game_p5Pane = new JLayeredPane();
        game_p5TableCards = new JLabel();
        game_chair6Label = new JLabel();
        game_p6Pane = new JLayeredPane();
        game_p6TableCards = new JLabel();
        game_dineroLabel1 = new JLabel();
        game_dineroLabel2 = new JLabel();
        game_apuestaLabel1 = new JLabel();
        game_apuestaLabel2 = new JLabel();
        game_apostarBut = new JButton();
        game_apuestaText = new JTextField();
        game_pasarBut = new JButton();
        endLayer = new JLayeredPane();
        end_bgLabel = new JLabel();
        end_gameOverLabel = new JLabel();
        end_aceptarBut = new JButton();
        end_salirBut = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setName("POKER");
        setPreferredSize(new Dimension(1270, 720));
        setResizable(false);
        getContentPane().setLayout(null);
        this.setTitle("POKER");
        this.setIconImage(new ImageIcon(getClass().getResource("/img/cards/back.png")).getImage());
        
        mainPane.setPreferredSize(new Dimension(1270, 700));
        
        //------------------------ START LAYER------------------------

        startLayer.setPreferredSize(new Dimension(1270, 700));

        start_bgLabel.setBackground(new Color(30, 30, 30));
        start_bgLabel.setOpaque(true);
        start_bgLabel.setPreferredSize(new Dimension(1270, 700));
        startLayer.add(start_bgLabel);
        start_bgLabel.setBounds(0, 0, 1270, 700);

        start_logoLabel.setIcon(new ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        startLayer.setLayer(start_logoLabel, JLayeredPane.MODAL_LAYER);
        startLayer.add(start_logoLabel);
        start_logoLabel.setBounds(335, 80, 600, 333);

        start_nuevaBut.setText("NUEVA PARTIDA");
        start_nuevaBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        start_nuevaBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                start_nuevaButActionPerformed(evt);
            }
        });
        startLayer.setLayer(start_nuevaBut, JLayeredPane.MODAL_LAYER);
        startLayer.add(start_nuevaBut);
        start_nuevaBut.setBounds(574, 500, 138, 31);

        start_reglasBut.setText("REGLAS");
        start_reglasBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        start_reglasBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                start_reglasButActionPerformed(evt);
            }
        });
        startLayer.setLayer(start_reglasBut, JLayeredPane.MODAL_LAYER);
        startLayer.add(start_reglasBut);
        start_reglasBut.setBounds(597, 550, 83, 31);

        start_salirBut.setText("SALIR");
        start_salirBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        start_salirBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	System.exit(0);
            }
        });
        startLayer.setLayer(start_salirBut, JLayeredPane.MODAL_LAYER);
        startLayer.add(start_salirBut);
        start_salirBut.setBounds(603, 600, 69, 31);

        mainPane.setLayer(startLayer, JLayeredPane.PALETTE_LAYER);
        mainPane.add(startLayer);
        startLayer.setBounds(0, 0, 1270, 700);
        
        //-------------------- GAME LAYER -----------------------------

        gameLayer.setPreferredSize(new Dimension(1270, 700));

        game_bgLabel.setIcon(new ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        game_bgLabel.setMaximumSize(new Dimension(1270, 700));
        game_bgLabel.setMinimumSize(new Dimension(1270, 700));
        game_bgLabel.setOpaque(true);
        game_bgLabel.setPreferredSize(new Dimension(1270, 700));
        gameLayer.add(game_bgLabel);
        game_bgLabel.setBounds(0, 0, 1270, 700);

        game_tableLabel.setIcon(new ImageIcon(getClass().getResource("/img/table.png"))); // NOI18N
        gameLayer.setLayer(game_tableLabel, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_tableLabel);
        game_tableLabel.setBounds(311, 100, 647, 327);

        game_chair1Label.setIcon(new ImageIcon(getClass().getResource("/img/chair.png"))); // NOI18N
        gameLayer.setLayer(game_chair1Label, JLayeredPane.PALETTE_LAYER);
        gameLayer.add(game_chair1Label);
        game_chair1Label.setBounds(560, 0, 150, 150);

        game_p1Pane.setPreferredSize(new Dimension(100, 100));
        gameLayer.setLayer(game_p1Pane, JLayeredPane.POPUP_LAYER);
        gameLayer.add(game_p1Pane);
        game_p1Pane.setBounds(575, 100, 100, 100);
        
        game_p1TableCards.setIcon((new RotatedIcon(new ImageIcon(getClass().getResource("/img/cards/back-mini.png")), Rotate.UPSIDE_DOWN)));
        game_p1Pane.add(game_p1TableCards);
        game_p1TableCards.setSize(100, 100);
        game_p1TableCards.setLocation(0, 0);
        //game_p1TableCards.setVisible(false);
        
        game_chair2Label.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/chair.png")), Rotate.UPSIDE_DOWN));
        game_chair2Label.setPreferredSize(new Dimension(150, 150));
        gameLayer.setLayer(game_chair2Label, JLayeredPane.PALETTE_LAYER);
        gameLayer.add(game_chair2Label);
        game_chair2Label.setBounds(560, 380, 150, 150);

        game_p2Pane.setPreferredSize(new Dimension(100, 100));
        gameLayer.setLayer(game_p2Pane, JLayeredPane.POPUP_LAYER);
        gameLayer.add(game_p2Pane);
        game_p2Pane.setBounds(600, 325, 100, 100);
        
        game_p2TableCards.setIcon(new ImageIcon(getClass().getResource("/img/cards/back-mini.png")));
        game_p2Pane.add(game_p2TableCards);
        game_p2TableCards.setSize(100, 100);
        game_p2TableCards.setLocation(0, 0);
        //game_p2TableCards.setVisible(false);

        game_chair3Label.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/chair.png")), (double) 135));
        game_chair3Label.setPreferredSize(new Dimension(150, 150));
        gameLayer.setLayer(game_chair3Label, JLayeredPane.PALETTE_LAYER);
        gameLayer.add(game_chair3Label);
        game_chair3Label.setBounds(820, 320, 150, 150);

        game_p3Pane.setPreferredSize(new Dimension(100, 100));
        gameLayer.setLayer(game_p3Pane, JLayeredPane.POPUP_LAYER);
        gameLayer.add(game_p3Pane);
        game_p3Pane.setBounds(800, 300, 100, 100);
        
        game_p3TableCards.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/cards/back-mini.png")), (double) - 45));
        game_p3Pane.add(game_p3TableCards);
        game_p3TableCards.setSize(100, 100);
        game_p3TableCards.setLocation(0, 0);
        //game_p3TableCards.setVisible(false);

        game_chair4Label.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/chair.png")), (double) -45));
        game_chair4Label.setPreferredSize(new Dimension(150, 150));
        gameLayer.setLayer(game_chair4Label, JLayeredPane.PALETTE_LAYER);
        gameLayer.add(game_chair4Label);
        game_chair4Label.setBounds(240, 80, 150, 150);

        game_p4Pane.setPreferredSize(new Dimension(120, 90));
        gameLayer.setLayer(game_p4Pane, JLayeredPane.POPUP_LAYER);
        gameLayer.add(game_p4Pane);
        game_p4Pane.setBounds(333, 140, 120, 90);
        
        game_p4TableCards.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/cards/back-mini.png")), (double) 135));
        game_p4Pane.add(game_p4TableCards);
        game_p4TableCards.setSize(100, 100);
        game_p4TableCards.setLocation(0, 0);
        //game_p4TableCards.setVisible(false);

        game_chair5Label.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/chair.png")), (double) -135));
        game_chair5Label.setPreferredSize(new Dimension(150, 150));
        gameLayer.setLayer(game_chair5Label, JLayeredPane.PALETTE_LAYER);
        gameLayer.add(game_chair5Label);
        game_chair5Label.setBounds(260, 320, 150, 150);

        game_p5Pane.setPreferredSize(new Dimension(100, 100));
        gameLayer.setLayer(game_p5Pane, JLayeredPane.POPUP_LAYER);
        gameLayer.add(game_p5Pane);
        game_p5Pane.setBounds(333, 300, 100, 100);
        
        game_p5TableCards.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/cards/back-mini.png")), (double) 45));
        game_p5Pane.add(game_p5TableCards);
        game_p5TableCards.setSize(100, 100);
        game_p5TableCards.setLocation(0, 0);
        //game_p5TableCards.setVisible(false);

        game_chair6Label.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/chair.png")), (double) 45));
        game_chair6Label.setPreferredSize(new Dimension(150, 150));
        gameLayer.setLayer(game_chair6Label, JLayeredPane.PALETTE_LAYER);
        gameLayer.add(game_chair6Label);
        game_chair6Label.setBounds(820, 80, 150, 150);

        game_p6Pane.setPreferredSize(new Dimension(100, 100));
        gameLayer.setLayer(game_p6Pane, JLayeredPane.POPUP_LAYER);
        gameLayer.add(game_p6Pane);
        game_p6Pane.setBounds(817, 140, 100, 100);
        
        game_p6TableCards.setIcon(new RotatedIcon(new ImageIcon(getClass().getResource("/img/cards/back-mini.png")), (double) -135));
        game_p6Pane.add(game_p6TableCards);
        game_p6TableCards.setSize(100, 100);
        game_p6TableCards.setLocation(0, 0);
        //game_p6TableCards.setVisible(false);

        game_dineroLabel1.setIcon(new ImageIcon(getClass().getResource("/img/bg-dinero.png")));
        gameLayer.setLayer(game_dineroLabel1, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_dineroLabel1);
        game_dineroLabel1.setBounds(120, 500, 150, 50);
        
        game_dineroLabel2.setFont(new Font("Fira Sans", 0, 36));
        game_dineroLabel2.setIcon(new ImageIcon(getClass().getResource("/img/bg-text.png")));
        gameLayer.setLayer(game_dineroLabel2, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_dineroLabel2);
        game_dineroLabel2.setBounds(120, 555, 150, 50);
        
        game_apuestaLabel1.setIcon(new ImageIcon(getClass().getResource("/img/bg-apuesta.png")));
        gameLayer.setLayer(game_apuestaLabel1, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_apuestaLabel1);
        game_apuestaLabel1.setBounds(999, 500, 150, 50);
        
        game_apuestaLabel2.setFont(new Font("Fira Sans", 0, 36));
        game_apuestaLabel2.setIcon(new ImageIcon(getClass().getResource("/img/bg-text.png")));
        gameLayer.setLayer(game_apuestaLabel2, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_apuestaLabel2);
        game_apuestaLabel2.setBounds(999, 555, 150, 50);

        game_apostarBut.setText("APOSTAR");
        game_apostarBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                game_apostarButActionPerformed(evt);
            }
        });
        gameLayer.setLayer(game_apostarBut, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_apostarBut);
        game_apostarBut.setBounds(100, 620, 100, 31);

        game_apuestaText.setHorizontalAlignment(JTextField.CENTER);
        game_apuestaText.setText("0");
        gameLayer.setLayer(game_apuestaText, JLayeredPane.POPUP_LAYER);
        gameLayer.add(game_apuestaText);
        game_apuestaText.setBounds(200, 620, 90, 30);

        game_pasarBut.setText("PASAR TURNO");
        game_pasarBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                game_pasarButActionPerformed(evt);
            }
        });
        gameLayer.setLayer(game_pasarBut, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_pasarBut);
        game_pasarBut.setBounds(1000, 620, 126, 31);

        mainPane.setLayer(gameLayer, JLayeredPane.DEFAULT_LAYER);
        mainPane.add(gameLayer);
        gameLayer.setBounds(0, 0, 1270, 700);
        
        //------------------- END LAYER -------------------------

        endLayer.setPreferredSize(new Dimension(1270, 700));

        end_bgLabel.setBackground(new Color(0, 0, 0));
        end_bgLabel.setOpaque(true);
        end_bgLabel.setPreferredSize(new Dimension(1270, 700));
        endLayer.add(end_bgLabel);
        end_bgLabel.setBounds(0, 0, 1270, 700);

        end_gameOverLabel.setIcon(new ImageIcon(getClass().getResource("/img/gameOver.png"))); // NOI18N
        endLayer.setLayer(end_gameOverLabel, JLayeredPane.POPUP_LAYER);
        endLayer.add(end_gameOverLabel);
        end_gameOverLabel.setBounds(361, 150, 547, 122);

        end_aceptarBut.setText("ACEPTAR");
        end_aceptarBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        end_aceptarBut.setPreferredSize(new Dimension(90, 32));
        end_aceptarBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                end_aceptarButActionPerformed(evt);
            }
        });
        endLayer.setLayer(end_aceptarBut, JLayeredPane.MODAL_LAYER);
        endLayer.add(end_aceptarBut);
        end_aceptarBut.setBounds(590, 500, 100, 32);

        end_salirBut.setText("SALIR");
        end_salirBut.setCursor(new Cursor(Cursor.HAND_CURSOR));
        end_salirBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	System.exit(0);
            }
        });
        endLayer.setLayer(end_salirBut, JLayeredPane.MODAL_LAYER);
        endLayer.add(end_salirBut);
        end_salirBut.setBounds(603, 550, 69, 31);

        mainPane.setLayer(endLayer, JLayeredPane.MODAL_LAYER);
        mainPane.add(endLayer);
        endLayer.setBounds(0, 0, 1270, 700);
        endLayer.setVisible(false);

        getContentPane().add(mainPane);
        mainPane.setBounds(0, 0, 1270, 700);

        pack();
    }

    private void start_nuevaButActionPerformed(ActionEvent evt) {
    	startLayer.setVisible(false);
    }
    
    private void start_reglasButActionPerformed(ActionEvent evt) {
        URL url=null;
        try {
            url = new URL("https://www.pokerstars.es/poker/games/texas-holdem/");
            try {
                Desktop.getDesktop().browse(url.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
    }
    
    private void game_apostarButActionPerformed(ActionEvent evt) {
    	// TODO add your handling code here:
    	Carta cartaPrueba = new Carta(new ImageIcon(getClass().getResource("/img/cards/AS.png")), 1, 1);
    	cartaPrueba.setPreferredSize(new Dimension(200, 306));
    	//cartaPrueba.setOpaque(true);
    	cartaPrueba.showCard(1);
    	gameLayer.setLayer(cartaPrueba, JLayeredPane.DRAG_LAYER);
    	gameLayer.add(cartaPrueba);
    	cartaPrueba.setBounds(500, 394, 150, 225);
    	gameLayer.revalidate();
    	gameLayer.repaint();
    	System.out.println("apostar");
    	
    }

    private void game_pasarButActionPerformed(ActionEvent evt) {
    	endLayer.setVisible(true);
    }
    
    private void end_aceptarButActionPerformed(ActionEvent evt) {
    	endLayer.setVisible(false);
    	startLayer.setVisible(true);
    }
    
    
  
    // Variables declaration
    private JLayeredPane endLayer;
    private JButton end_aceptarBut;
    private JLabel end_bgLabel;
    private JLabel end_gameOverLabel;
    private JButton end_salirBut;
    private JLayeredPane gameLayer;
    private JButton game_apostarBut;
    private JLabel game_apuestaLabel1;
    private JLabel game_apuestaLabel2;
    private JTextField game_apuestaText;
    private JLabel game_chair1Label;
    private JLabel game_chair2Label;
    private JLabel game_chair3Label;
    private JLabel game_chair4Label;
    private JLabel game_chair5Label;
    private JLabel game_chair6Label;
    private JLabel game_dineroLabel1;
    private JLabel game_dineroLabel2;
    private JLabel game_bgLabel;
    private JLayeredPane game_p1Pane;
    private JLayeredPane game_p2Pane;
    private JLayeredPane game_p3Pane;
    private JLayeredPane game_p4Pane;
    private JLayeredPane game_p5Pane;
    private JLayeredPane game_p6Pane;
    private JLabel game_p1TableCards;
    private JLabel game_p2TableCards;
    private JLabel game_p3TableCards;
    private JLabel game_p4TableCards;
    private JLabel game_p5TableCards;
    private JLabel game_p6TableCards;
    private JButton game_pasarBut;
    private JLabel game_tableLabel;
    private JLayeredPane mainPane;
    private JLayeredPane startLayer;
    private JLabel start_bgLabel;
    private JLabel start_logoLabel;
    private JButton start_nuevaBut;
    private JButton start_reglasBut;
    private JButton start_salirBut;
    // End of variables declaration
}
