package acetijosyminijuegos1;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Juego3 extends javax.swing.JFrame {
    public Juego3() {
        initComponents();
        setSize(1150, 700);
        
        jButton9.setVisible(false);
        
        jButton1.putClientProperty("valor", "4");
        jButton2.putClientProperty("valor", "7");
        jButton3.putClientProperty("valor", "2");
        jButton4.putClientProperty("valor", "8");
        jButton5.putClientProperty("valor", "3");
        jButton6.putClientProperty("valor", "1");
        jButton7.putClientProperty("valor", "6");
        jButton8.putClientProperty("valor", "5");
        jButton9.putClientProperty("valor", "");

        ajustarImagenBoton(jButton1, "/acetijosyminijuegos1/Foto4.png");
        ajustarImagenBoton(jButton2, "/acetijosyminijuegos1/Foto7.png");
        ajustarImagenBoton(jButton3, "/acetijosyminijuegos1/Foto2.png");
        ajustarImagenBoton(jButton4, "/acetijosyminijuegos1/Foto8.png");
        ajustarImagenBoton(jButton5, "/acetijosyminijuegos1/Foto3.png");
        ajustarImagenBoton(jButton6, "/acetijosyminijuegos1/Foto1.png");
        ajustarImagenBoton(jButton7, "/acetijosyminijuegos1/Foto6.png");
        ajustarImagenBoton(jButton8, "/acetijosyminijuegos1/Foto5.png");
        ajustarImagenBoton(jButton9, "/acetijosyminijuegos1/Foto9.png");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setText("Volver al menu");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setText("Organizalos en orden");

        jButton11.setText("Comprobar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jLabel1)
                    .addComponent(jButton11))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton1.getText());
            jButton2.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton1.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton1.getText());
            jButton3.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton1.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton1.getText());
            jButton4.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton1.getIcon());
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton1.getText());
            jButton5.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton1.getIcon());
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton1.getText());
            jButton6.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton6, jButton1.getIcon());
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton1.getText());
            jButton7.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton1.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton1.getText());
            jButton8.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton1.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton1.getText());
            jButton9.putClientProperty("valor", jButton1.getClientProperty("valor"));
            jButton1.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton1.getIcon());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton2.getText());
            jButton1.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton2.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton2.getText());
            jButton3.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton2.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton2.getText());
            jButton4.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton2.getIcon());
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton2.getText());
            jButton5.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton2.getIcon());
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton2.getText());
            jButton6.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton6, jButton2.getIcon());
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton2.getText());
            jButton7.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton2.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton2.getText());
            jButton8.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton2.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton2.getText());
            jButton9.putClientProperty("valor", jButton2.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton2.getIcon());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton3.getText());
            jButton1.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton3.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton3.getIcon());
        }
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton3.getText());
            jButton2.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton3.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton3.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton3.getText());
            jButton4.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton3.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton3.getIcon());
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton3.getText());
            jButton5.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton3.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton3.getIcon());
            
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton3.getText());
            jButton6.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton3.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton8, jButton3.getIcon());
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton3.getText());
            jButton7.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton3.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton3.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton3.getText());
            jButton8.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton2.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton3.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton3.getText());
            jButton9.putClientProperty("valor", jButton3.getClientProperty("valor"));
            jButton3.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton3.getIcon());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton4.getText());
            jButton1.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton4.getIcon());
        }
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton4.getText());
            jButton2.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton4.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton4.getText());
            jButton3.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton4.getIcon());
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton4.getText());
            jButton5.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton4.getIcon());
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton4.getText());
            jButton6.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton6, jButton4.getIcon());
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton4.getText());
            jButton7.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton4.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton4.getText());
            jButton8.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton4.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton4.getText());
            jButton9.putClientProperty("valor", jButton4.getClientProperty("valor"));
            jButton4.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton4.getIcon());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton5.getText());
            jButton1.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton5.getIcon());
        }
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton5.getText());
            jButton2.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton5.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton5.getText());
            jButton3.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton5.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton5.getText());
            jButton4.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton5.getIcon());
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton5.getText());
            jButton6.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton6, jButton5.getIcon());
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton5.getText());
            jButton7.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton5.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton5.getText());
            jButton8.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton5.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton5.getText());
            jButton9.putClientProperty("valor", jButton5.getClientProperty("valor"));
            jButton5.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton5.getIcon());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton6.getText());
            jButton1.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton6.getIcon());
        }
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton6.getText());
            jButton2.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton6.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton6.getText());
            jButton3.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton6.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton6.getText());
            jButton4.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton6.getIcon());
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton6.getText());
            jButton5.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton6.getIcon());
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton6.getText());
            jButton7.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton6.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton6.getText());
            jButton8.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton6.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton6.getText());
            jButton9.putClientProperty("valor", jButton6.getClientProperty("valor"));
            jButton6.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton6.getIcon());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton7.getText());
            jButton1.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton7.getIcon());
        }
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton7.getText());
            jButton2.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton7.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton7.getText());
            jButton3.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton7.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton7.getText());
            jButton4.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton7.getIcon());
            
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton7.getText());
            jButton5.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton7.getIcon());
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton7.getText());
            jButton6.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton6, jButton7.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton7.getText());
            jButton8.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton7.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton7.getText());
            jButton9.putClientProperty("valor", jButton7.getClientProperty("valor"));
            jButton7.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton7.getIcon());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton8.getText());
            jButton1.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton8.getIcon());
        }
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton8.getText());
            jButton2.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton8.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton8.getText());
            jButton3.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton8.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton8.getText());
            jButton4.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton8.getIcon());
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton8.getText());
            jButton5.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton8.getIcon());
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton8.getText());
            jButton6.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton6, jButton8.getIcon());
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton8.getText());
            jButton7.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton8.getIcon());
        }
        if (jButton9.isVisible() == false){
            //jButton9.setText(jButton8.getText());
            jButton9.putClientProperty("valor", jButton8.getClientProperty("valor"));
            jButton8.setVisible(false);
            jButton9.setVisible(true);
            ajustarImagenBoton(jButton9, jButton8.getIcon());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jButton1.isVisible() == false){
            //jButton1.setText(jButton9.getText());
            jButton1.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton1.setVisible(true);
            ajustarImagenBoton(jButton1, jButton9.getIcon());
        }
        if (jButton2.isVisible() == false){
            //jButton2.setText(jButton9.getText());
            jButton2.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton2.setVisible(true);
            ajustarImagenBoton(jButton2, jButton9.getIcon());
        }
        if (jButton3.isVisible() == false){
            //jButton3.setText(jButton9.getText());
            jButton3.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton3.setVisible(true);
            ajustarImagenBoton(jButton3, jButton9.getIcon());
        }
        if (jButton4.isVisible() == false){
            //jButton4.setText(jButton9.getText());
            jButton4.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton4.setVisible(true);
            ajustarImagenBoton(jButton4, jButton9.getIcon());
        }
        if (jButton5.isVisible() == false){
            //jButton5.setText(jButton9.getText());
            jButton5.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton5.setVisible(true);
            ajustarImagenBoton(jButton5, jButton9.getIcon());
        }
        if (jButton6.isVisible() == false){
            //jButton6.setText(jButton9.getText());
            jButton6.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton6.setVisible(true);
            ajustarImagenBoton(jButton6, jButton9.getIcon());
            
        }
        if (jButton7.isVisible() == false){
            //jButton7.setText(jButton9.getText());
            jButton7.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton7.setVisible(true);
            ajustarImagenBoton(jButton7, jButton9.getIcon());
        }
        if (jButton8.isVisible() == false){
            //jButton8.setText(jButton9.getText());
            jButton8.putClientProperty("valor", jButton9.getClientProperty("valor"));
            jButton9.setVisible(false);
            jButton8.setVisible(true);
            ajustarImagenBoton(jButton8, jButton9.getIcon());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false); // Ocultar el frame actual
        new Menu().setVisible(true); // Mostrar el menu
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        /*
        if ("1".equals(jButton1.getText()) && "2".equals(jButton2.getText()) && "3".equals(jButton3.getText()) && "4".equals(jButton4.getText()) && "5".equals(jButton5.getText()) && "6".equals(jButton6.getText()) && "7".equals(jButton7.getText()) && "8".equals(jButton8.getText())) {
            //boolean resuelto = false;
            JOptionPane.showMessageDialog(this, "¡Correcto! La tercera letra es: O.", "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Incorrecto. Intenta de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        */
        if ("1".equals(jButton1.getClientProperty("valor")) && 
        "2".equals(jButton2.getClientProperty("valor")) && 
        "3".equals(jButton3.getClientProperty("valor")) && 
        "4".equals(jButton4.getClientProperty("valor")) && 
        "5".equals(jButton5.getClientProperty("valor")) && 
        "6".equals(jButton6.getClientProperty("valor")) && 
        "7".equals(jButton7.getClientProperty("valor")) && 
        "8".equals(jButton8.getClientProperty("valor"))) {

            JOptionPane.showMessageDialog(this, "¡Correcto! La tercera letra es: A.", "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Incorrecto. Intenta de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed
    
    public void ajustarImagenBoton(JButton boton, String rutaImagen) {
        /*
        // Cargar la imagen
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource(rutaImagen));
        // Escalar la imagen al tamaño del botón
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
            boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH
        );
        // Asignar la imagen redimensionada al botón
        boton.setIcon(new ImageIcon(imagenEscalada));
        */
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource(rutaImagen));
        boton.setIcon(escalarImagen(iconoOriginal, boton.getWidth(), boton.getHeight()));
    }
    
    private void ajustarImagenBoton(JButton boton, Icon icono) {
    /*
    if (icono instanceof ImageIcon) {
        Image imagen = ((ImageIcon) icono).getImage();
        Image imagenEscalada = imagen.getScaledInstance(
            boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH
        );
        boton.setIcon(new ImageIcon(imagenEscalada));
    }
    */
    if (icono instanceof ImageIcon) {
        boton.setIcon(escalarImagen((ImageIcon) icono, boton.getWidth(), boton.getHeight()));
    }
}
    
    private ImageIcon escalarImagen(ImageIcon icono, int ancho, int alto) {
        Image imagenOriginal = icono.getImage();
        // Solo escala si el tamaño es diferente
        if (imagenOriginal.getWidth(null) != ancho || imagenOriginal.getHeight(null) != alto) {
            //imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            return icono;
        }
        Image imagenEscalada = imagenOriginal.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imagenEscalada);
    }
    
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
            java.util.logging.Logger.getLogger(Juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
