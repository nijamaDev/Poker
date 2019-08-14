/**
  Archivo: Poker.java
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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import externalCode.RotatedIcon;
import externalCode.RotatedIcon.Rotate;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

/**
 *
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
        game_tableCards = new ArrayList<Carta>();
        game_dineroLabel1 = new JLabel();
        game_dineroLabel2 = new JLabel();
        game_dineroLabel3 = new JLabel();
        game_apuestaLabel1 = new JLabel();
        game_apuestaLabel2 = new JLabel();
        game_apuestaLabel3 = new JLabel();
        game_apostarBut = new JButton();
        game_apuestaText = new JTextField();
        game_pasarBut = new JButton();
        game_cartasMostrar1 = new JLabel();
        game_cartasMostrar2 = new JLabel();
        game_cartasBotMostrar1 = new JLabel();
        game_cartasBotMostrar2 = new JLabel();
        game_mostrarBut = new JButton();
        endLayer = new JLayeredPane();
        end_bgLabel = new JLabel();
        end_gameOverLabel = new JLabel();
        end_aceptarBut = new JButton();
        end_salirBut = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        setName("POKER");
        this.setPreferredSize(new Dimension(1270, 730));
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

        start_logoLabel.setIcon(new ImageIcon(getClass().getResource("/img/logo.png")));
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

        game_bgLabel.setIcon(new ImageIcon(getClass().getResource("/img/bg.jpg")));
        game_bgLabel.setMaximumSize(new Dimension(1270, 700));
        game_bgLabel.setMinimumSize(new Dimension(1270, 700));
        game_bgLabel.setOpaque(true);
        game_bgLabel.setPreferredSize(new Dimension(1270, 700));
        gameLayer.add(game_bgLabel);
        game_bgLabel.setBounds(0, 0, 1270, 700);

        game_tableLabel.setIcon(new ImageIcon(getClass().getResource("/img/table.png")));
        gameLayer.setLayer(game_tableLabel, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_tableLabel);
        game_tableLabel.setBounds(311, 100, 647, 327);

        game_chair1Label.setIcon(new ImageIcon(getClass().getResource("/img/chair.png")));
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
        game_p1TableCards.setVisible(false);
        
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
        game_p2TableCards.setVisible(false);

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
        game_p3TableCards.setVisible(false);

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
        game_p4TableCards.setVisible(false);

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
        game_p5TableCards.setVisible(false);

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
        game_p6TableCards.setVisible(false);
        
        game_dineroLabel1.setIcon(new ImageIcon(getClass().getResource("/img/bg-dinero.png")));
        gameLayer.setLayer(game_dineroLabel1, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_dineroLabel1);
        game_dineroLabel1.setBounds(120, 500, 150, 50);
        
        game_dineroLabel2.setFont(new Font("Fira Sans", 0, 36));
        game_dineroLabel2.setIcon(new ImageIcon(getClass().getResource("/img/bg-text.png")));
        gameLayer.setLayer(game_dineroLabel2, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_dineroLabel2);
        game_dineroLabel2.setBounds(120, 555, 150, 50);
        
        game_dineroLabel3.setFont(new Font(Font.DIALOG, Font.BOLD, 26));
        game_dineroLabel3.setForeground(new Color(244,244,244));
        game_dineroLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        gameLayer.setLayer(game_dineroLabel3, JLayeredPane.MODAL_LAYER + 1);
        gameLayer.add(game_dineroLabel3);
        game_dineroLabel3.setSize(150, 50);
        game_dineroLabel3.setBounds(120, 555, 150, 50);
        
        game_apuestaLabel1.setIcon(new ImageIcon(getClass().getResource("/img/bg-apuesta.png")));
        gameLayer.setLayer(game_apuestaLabel1, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_apuestaLabel1);
        game_apuestaLabel1.setBounds(999, 500, 150, 50);
        
        game_apuestaLabel2.setFont(new Font("Fira Sans", 0, 36));
        game_apuestaLabel2.setIcon(new ImageIcon(getClass().getResource("/img/bg-text.png")));
        gameLayer.setLayer(game_apuestaLabel2, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_apuestaLabel2);
        game_apuestaLabel2.setBounds(999, 555, 150, 50);
        
        game_apuestaLabel3.setFont(new Font(Font.DIALOG, Font.BOLD, 26));
        game_apuestaLabel3.setForeground(new Color(244,244,244));
        game_apuestaLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        gameLayer.setLayer(game_apuestaLabel3, JLayeredPane.MODAL_LAYER + 1);
        gameLayer.add(game_apuestaLabel3);
        game_apuestaLabel3.setBounds(999, 555, 150, 50);

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
        game_pasarBut.setBounds(1012, 620, 126, 31);
        
        gameLayer.setLayer(game_cartasMostrar1, JLayeredPane.POPUP_LAYER + 2);
        gameLayer.add(game_cartasMostrar1);
        game_cartasMostrar1.setBounds(560, 455, 100, 154);
		game_cartasMostrar1.setVisible(false);
        
        gameLayer.setLayer(game_cartasMostrar2, JLayeredPane.POPUP_LAYER + 3);
        gameLayer.add(game_cartasMostrar2);
        game_cartasMostrar2.setBounds(590, 470, 100, 154);
		game_cartasMostrar2.setVisible(false);
		
		gameLayer.setLayer(game_cartasBotMostrar1, JLayeredPane.POPUP_LAYER + 2);
        gameLayer.add(game_cartasBotMostrar1);
        game_cartasBotMostrar1.setBounds(560, 5, 100, 154);
		game_cartasBotMostrar1.setVisible(false);
        
        gameLayer.setLayer(game_cartasBotMostrar2, JLayeredPane.POPUP_LAYER + 3);
        gameLayer.add(game_cartasBotMostrar2);
        game_cartasBotMostrar2.setBounds(590, 20, 100, 154);
		game_cartasBotMostrar2.setVisible(false);
        
        game_mostrarBut.setText("MOSTRAR CARTAS");
        game_mostrarBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                game_mostrarButActionPerformed(evt);
            }
        });
        gameLayer.setLayer(game_mostrarBut, JLayeredPane.MODAL_LAYER);
        gameLayer.add(game_mostrarBut);
        game_mostrarBut.setBounds(550, 650, 168, 31);

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

        end_gameOverLabel.setIcon(new ImageIcon(getClass().getResource("/img/gameOver.png")));
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

    /**
     * Botón de nueva partida
     * @param evt
     */
    private void start_nuevaButActionPerformed(ActionEvent evt) {
    	startLayer.setVisible(false);
    	nuevaPartida();
    }
    
    /**
     * Botón de reglas
     * @param evt
     */
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
    
    /**
     * Botón de apostar
     * @param evt
     */
    private void game_apostarButActionPerformed(ActionEvent evt) {
    	int text = 0;
    	try {
    		text = Integer.valueOf(game_apuestaText.getText());
    	} catch(Exception e) {
    		return;
    	}
    	if (!control.getCartera(1).puedeApostar(text))
    		return;
    	control.getCartera(1).addApuesta(text);
    	printDinero();
    }

    /**
     * Botón de pasar, determina el flujo del juego
     * @param evt
     */
    private void game_pasarButActionPerformed(ActionEvent evt) {
    	switch (estadoDelJuego) {
    	case 0: // Estado inicial, las cartas est�n tapadas, las cartas se destapan
    		mostrarCartasMesa();
    		break;
    	case 1: // Las 3 cartas est�n destapadas, Se destapa la 4ta carta
    	case 2: // 4 cartas est�n destapadas, se destapa la �ltima carta
    		agregarCartaMesa();
    		mostrarCartasMesa();
    		break;
    	case 3: // Las 5 cartas est�n destapadas, el jugador puede apostar antes de
    		    // que se revelen las cartas del oponente
    		game_cartasBotMostrar1.setVisible(true);
        	game_cartasBotMostrar2.setVisible(true);
        	game_p1TableCards.setVisible(false);
        	game_cartasMostrar1.setVisible(true);
        	game_cartasMostrar2.setVisible(true);
        	game_p2TableCards.setVisible(false);
        	mostrarCartas = true;
        	int ganador = control.ganador(game_tableCards);
    		if (ganador == 1) {
    			JOptionPane.showMessageDialog(this, "GANADOR\n"
    					+ "Has ganado: " + control.getCartera(0).getApuesta());
    		} else {
    			JOptionPane.showMessageDialog(this, "Has perdido.");
    		}
    		control.getCartera(ganador).ganador();
    		if (control.getCartera(1).getDinero() <= 0) {
    			JOptionPane.showMessageDialog(this, "¿No tienes dinero? ¡Fuera de aquí!");
            	endLayer.setVisible(true);
    		} else {
    			nuevaRonda();
    			return;
    		}
    		break;
    	}
    	estadoDelJuego++;
    	repaint();
    }
    
    /**
     * Botón de mostrar las cartas
     * @param evt
     */
    private void game_mostrarButActionPerformed(ActionEvent evt) {
    	if (mostrarCartas) {
    		game_mostrarBut.setText("MOSTRAR CARTAS");
    		game_cartasMostrar1.setVisible(false);
        	game_cartasMostrar2.setVisible(false);
        	game_p2TableCards.setVisible(true);
        	mostrarCartas = false;
    	} else {
    		game_mostrarBut.setText("OCULTAR CARTAS");
    		game_cartasMostrar1.setVisible(true);
        	game_cartasMostrar2.setVisible(true);
        	game_p2TableCards.setVisible(false);
        	mostrarCartas = true;
    	}
    	revalidate();
    	repaint();
    }
    
    private void end_aceptarButActionPerformed(ActionEvent evt) {
    	endLayer.setVisible(false);
    	startLayer.setVisible(true);
    }
    
    private void nuevaPartida() {
    	control = new Control();
    	nuevaRonda();
    }
    
    private void nuevaRonda() {
    	control.nuevaRonda();
    	game_cartasBotMostrar1.setVisible(false);
    	game_cartasBotMostrar2.setVisible(false);
    	game_p1TableCards.setVisible(true);
    	mostrarCartas = true;
    	game_mostrarButActionPerformed(null);
    	for (int i=0; i<cartasMesa; i++) {
        	gameLayer.remove(game_tableCards.get(i));
    	}
    	game_tableCards.clear();
    	cartasMesa = 0;
    	estadoDelJuego = 0;
    	control.repartirCartas();
    	control.getCartas(1).get(0).showCard(1);
    	game_cartasMostrar1.setIcon(control.getCartas(1).get(0).getIcon());
    	control.getCartas(1).get(1).showCard(1);
    	game_cartasMostrar2.setIcon(control.getCartas(1).get(1).getIcon());
    	
    	control.getCartas(0).get(0).showCard(1);
    	game_cartasBotMostrar1.setIcon(control.getCartas(0).get(0).getIcon());
    	control.getCartas(0).get(1).showCard(1);
    	game_cartasBotMostrar2.setIcon(control.getCartas(0).get(1).getIcon());
    	game_p1TableCards.setVisible(true);
    	game_p2TableCards.setVisible(true);
    	for (int i=0; i<3; i++) {
    		agregarCartaMesa();
    	}
    	control.getCartera(1).addApuesta(10); //apuesta inicial
    	printDinero();
    }
    
    private void agregarCartaMesa() {
    	Carta nuevaCartaMesa = control.repartirCartaMesa();
    	game_tableCards.add(nuevaCartaMesa);
		gameLayer.setLayer(game_tableCards.get(cartasMesa), JLayeredPane.POPUP_LAYER+1);
		gameLayer.add(game_tableCards.get(cartasMesa));
		game_tableCards.get(cartasMesa).setBounds(360 + (cartasMesa*110), 180, 100, 154);
		cartasMesa +=1;
		repaint();
		return;
    }
    
    private void mostrarCartasMesa() {
    	switch (estadoDelJuego) {
    	case 0:
    		for (int i=0; i<3; i++) {
        		game_tableCards.get(i).showCard(1);
        	}
    		break;
    	case 1:
    	case 2:
    		System.out.println(cartasMesa);
    		game_tableCards.get(cartasMesa-1).showCard(1);
    	}
    }
    
    private void printDinero() {
    	String text = Integer.toString(control.getCartera(1).getDinero());
    	game_dineroLabel3.setText(text);
    	text = Integer.toString(control.getCartera(1).getApuesta());
    	game_apuestaLabel3.setText(text);
    	repaint();
    }
    
    
    // Variables declaration
    private boolean mostrarCartas;
    private int estadoDelJuego;
    private int cartasMesa;
    private Control control;
    private JLayeredPane endLayer;
    private JButton end_aceptarBut;
    private JLabel end_bgLabel;
    private JLabel end_gameOverLabel;
    private JButton end_salirBut;
    private JLayeredPane gameLayer;
    private JButton game_apostarBut;
    private JLabel game_apuestaLabel1;
    private JLabel game_apuestaLabel2;
    private JLabel game_apuestaLabel3;
    private JTextField game_apuestaText;
    private JLabel game_chair1Label;
    private JLabel game_chair2Label;
    private JLabel game_chair3Label;
    private JLabel game_chair4Label;
    private JLabel game_chair5Label;
    private JLabel game_chair6Label;
    private JLabel game_dineroLabel1;
    private JLabel game_dineroLabel2;
    private JLabel game_dineroLabel3;
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
    private ArrayList<Carta> game_tableCards;
    private JButton game_pasarBut;
    private JLabel game_cartasMostrar1;
    private JLabel game_cartasMostrar2;
    private JLabel game_cartasBotMostrar1;
    private JLabel game_cartasBotMostrar2;
    private JButton game_mostrarBut;
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
