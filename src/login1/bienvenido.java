/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author 34680
 */
public class bienvenido extends javax.swing.JFrame {

    /**
     * Creates new form bienvenido
     */
    public bienvenido() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btt_cambio = new javax.swing.JButton();
        btt_saludar = new javax.swing.JButton();
        btt_carrera = new javax.swing.JButton();
        youtube = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        insta = new javax.swing.JLabel();
        telegram = new javax.swing.JLabel();
        google = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("BIENVENIDO@");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("CERRAR SESIÓN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/usuario.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        btt_cambio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btt_cambio.setText("CAMBIAR CONTRASEÑA");
        btt_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_cambioActionPerformed(evt);
            }
        });

        btt_saludar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btt_saludar.setText("SALUDAR");
        btt_saludar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_saludarActionPerformed(evt);
            }
        });

        btt_carrera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btt_carrera.setText("VER CARRERA");
        btt_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_carreraActionPerformed(evt);
            }
        });

        youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/YouTube_23392.png"))); // NOI18N
        youtube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                youtubeMouseClicked(evt);
            }
        });

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/twitter_socialnetwork_20007.png"))); // NOI18N
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });

        insta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/Instagram_icon-icons.com_66804.png"))); // NOI18N
        insta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instaMouseClicked(evt);
            }
        });

        telegram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/telegram_logo_icon_147228.png"))); // NOI18N
        telegram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telegramMouseClicked(evt);
            }
        });

        google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/Google_Chrome_icon-icons.com_66794.png"))); // NOI18N
        google.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                googleMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/onlineshop_78377.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btt_cambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btt_saludar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btt_carrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addComponent(youtube)
                .addGap(18, 18, 18)
                .addComponent(twitter)
                .addGap(18, 18, 18)
                .addComponent(insta)
                .addGap(18, 18, 18)
                .addComponent(telegram)
                .addGap(18, 18, 18)
                .addComponent(google)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btt_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btt_saludar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twitter)
                    .addComponent(insta)
                    .addComponent(youtube)
                    .addComponent(telegram)
                    .addComponent(jLabel3)
                    .addComponent(google))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login_ l = new login_();
        l.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btt_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_cambioActionPerformed
        // TODO add your handling code here:
        
        cambio cam = new cambio();
        cam.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btt_cambioActionPerformed

    private void btt_saludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_saludarActionPerformed
        // TODO add your handling code here:
       saludo s= new saludo();
       s.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btt_saludarActionPerformed

    private void btt_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_carreraActionPerformed
        // TODO add your handling code here:
        carrera cr= new carrera();
        cr.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btt_carreraActionPerformed

    private void youtubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtubeMouseClicked
        // TODO add your handling code here:
         if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
                if(desktop.isSupported( java.awt.Desktop.Action.BROWSE)){
                    try {
                        java.net.URI uri= new java.net.URI("https://www.youtube.com/");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException e) {
                    }
                }
        }
    }//GEN-LAST:event_youtubeMouseClicked

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        // TODO add your handling code here:
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
                if(desktop.isSupported( java.awt.Desktop.Action.BROWSE)){
                    try {
                        java.net.URI uri= new java.net.URI("https://twitter.com/");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException e) {
                    }
                }
        }
    }//GEN-LAST:event_twitterMouseClicked

    private void instaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instaMouseClicked
        // TODO add your handling code here:
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
                if(desktop.isSupported( java.awt.Desktop.Action.BROWSE)){
                    try {
                        java.net.URI uri= new java.net.URI("https://www.instagram.com/");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException e) {
                    }
                }
        }
    }//GEN-LAST:event_instaMouseClicked

    private void telegramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telegramMouseClicked
        // TODO add your handling code here:
        
         if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
                if(desktop.isSupported( java.awt.Desktop.Action.BROWSE)){
                    try {
                        java.net.URI uri= new java.net.URI("https://web.telegram.org/k/");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException e) {
                    }
                }
        }
    }//GEN-LAST:event_telegramMouseClicked

    private void googleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseClicked
        // TODO add your handling code here:
         if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
                if(desktop.isSupported( java.awt.Desktop.Action.BROWSE)){
                    try {
                        java.net.URI uri= new java.net.URI("https://www.google.es/");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException e) {
                    }
                }
        }
    }//GEN-LAST:event_googleMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop= java.awt.Desktop.getDesktop();
                if(desktop.isSupported( java.awt.Desktop.Action.BROWSE)){
                    try {
                        java.net.URI uri= new java.net.URI("https://11421j.000webhostapp.com/");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException e) {
                    }
                }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bienvenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_cambio;
    private javax.swing.JButton btt_carrera;
    private javax.swing.JButton btt_saludar;
    private javax.swing.JLabel google;
    private javax.swing.JLabel insta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel telegram;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel youtube;
    // End of variables declaration//GEN-END:variables
}
