/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author ZNK5
 */
public class Poker extends javax.swing.JFrame {

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JLayeredPane();
        startLayer = new javax.swing.JLayeredPane();
        start_bgLabel = new javax.swing.JLabel();
        start_logoLabel = new javax.swing.JLabel();
        start_nuevaBut = new javax.swing.JButton();
        start_reglasBut = new javax.swing.JButton();
        start_salirBut = new javax.swing.JButton();
        gameLayer = new javax.swing.JLayeredPane();
        endLayer = new javax.swing.JLayeredPane();
        end_bgLabel = new javax.swing.JLabel();
        end_gameOverLabel = new javax.swing.JLabel();
        end_aceptarBut = new javax.swing.JButton();
        end_salirBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1270, 700));
        getContentPane().setLayout(null);

        mainPane.setPreferredSize(new java.awt.Dimension(1270, 700));

        startLayer.setPreferredSize(new java.awt.Dimension(1270, 700));

        start_bgLabel.setBackground(new java.awt.Color(30, 30, 30));
        start_bgLabel.setOpaque(true);
        start_bgLabel.setPreferredSize(new java.awt.Dimension(1270, 700));
        startLayer.add(start_bgLabel);
        start_bgLabel.setBounds(0, 0, 1270, 700);

        start_logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        startLayer.setLayer(start_logoLabel, javax.swing.JLayeredPane.MODAL_LAYER);
        startLayer.add(start_logoLabel);
        start_logoLabel.setBounds(335, 80, 600, 333);

        start_nuevaBut.setText("NUEVA PARTIDA");
        start_nuevaBut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        start_nuevaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_nuevaButActionPerformed(evt);
            }
        });
        startLayer.setLayer(start_nuevaBut, javax.swing.JLayeredPane.MODAL_LAYER);
        startLayer.add(start_nuevaBut);
        start_nuevaBut.setBounds(574, 500, 122, 32);

        start_reglasBut.setText("REGLAS");
        startLayer.setLayer(start_reglasBut, javax.swing.JLayeredPane.MODAL_LAYER);
        startLayer.add(start_reglasBut);
        start_reglasBut.setBounds(597, 550, 76, 32);

        start_salirBut.setText("SALIR");
        start_salirBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_salirButActionPerformed(evt);
            }
        });
        startLayer.setLayer(start_salirBut, javax.swing.JLayeredPane.MODAL_LAYER);
        startLayer.add(start_salirBut);
        start_salirBut.setBounds(603, 600, 64, 32);

        mainPane.setLayer(startLayer, javax.swing.JLayeredPane.MODAL_LAYER);
        mainPane.add(startLayer);
        startLayer.setBounds(0, 0, 1270, 700);

        gameLayer.setPreferredSize(new java.awt.Dimension(1270, 700));
        mainPane.add(gameLayer);
        gameLayer.setBounds(0, 0, 1270, 700);

        endLayer.setPreferredSize(new java.awt.Dimension(1270, 700));

        end_bgLabel.setBackground(new java.awt.Color(244, 244, 244));
        end_bgLabel.setOpaque(true);
        end_bgLabel.setPreferredSize(new java.awt.Dimension(1270, 700));
        endLayer.add(end_bgLabel);
        end_bgLabel.setBounds(0, 0, 1270, 700);

        end_gameOverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameOver.png"))); // NOI18N
        endLayer.setLayer(end_gameOverLabel, javax.swing.JLayeredPane.POPUP_LAYER);
        endLayer.add(end_gameOverLabel);
        end_gameOverLabel.setBounds(356, 150, 590, 160);

        end_aceptarBut.setText("ACEPTAR");
        end_aceptarBut.setPreferredSize(new java.awt.Dimension(90, 32));
        endLayer.setLayer(end_aceptarBut, javax.swing.JLayeredPane.MODAL_LAYER);
        endLayer.add(end_aceptarBut);
        end_aceptarBut.setBounds(590, 500, 90, 32);

        end_salirBut.setText("SALIR");
        end_salirBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_salirButActionPerformed(evt);
            }
        });
        endLayer.setLayer(end_salirBut, javax.swing.JLayeredPane.MODAL_LAYER);
        endLayer.add(end_salirBut);
        end_salirBut.setBounds(603, 550, 64, 32);

        mainPane.setLayer(endLayer, javax.swing.JLayeredPane.POPUP_LAYER);
        mainPane.add(endLayer);
        endLayer.setBounds(0, 0, 1270, 700);
        endLayer.setVisible(false);

        getContentPane().add(mainPane);
        mainPane.setBounds(0, 0, 1270, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void end_salirButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_salirButActionPerformed
        System.exit(0);
    }//GEN-LAST:event_end_salirButActionPerformed

    private void start_salirButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_salirButActionPerformed
        System.exit(0);
    }//GEN-LAST:event_start_salirButActionPerformed

    private void start_nuevaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_nuevaButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start_nuevaButActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane endLayer;
    private javax.swing.JButton end_aceptarBut;
    private javax.swing.JLabel end_bgLabel;
    private javax.swing.JLabel end_gameOverLabel;
    private javax.swing.JButton end_salirBut;
    private javax.swing.JLayeredPane gameLayer;
    private javax.swing.JLayeredPane mainPane;
    private javax.swing.JLayeredPane startLayer;
    private javax.swing.JLabel start_bgLabel;
    private javax.swing.JLabel start_logoLabel;
    private javax.swing.JButton start_nuevaBut;
    private javax.swing.JButton start_reglasBut;
    private javax.swing.JButton start_salirBut;
    // End of variables declaration//GEN-END:variables
}
