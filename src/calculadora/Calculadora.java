
package calculadora;

import java.awt.Color;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {


    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript"); 
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jpanel2 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResulado = new javax.swing.JLabel();
        btn_color = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_div = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_porc = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jButton5.setForeground(new java.awt.Color(60, 63, 65));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton5.setText("C");
        jButton5.setAlignmentY(0.0F);
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N

        jButton6.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jButton6.setForeground(new java.awt.Color(60, 63, 65));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButton6.setText("C");
        jButton6.setAlignmentY(0.0F);
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel2.setBackground(new java.awt.Color(234, 255, 255));
        jpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(0, 0, 0));
        txtOperacion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(60, 63, 65));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jpanel2.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 25, 280, 30));

        txtResulado.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        txtResulado.setForeground(new java.awt.Color(60, 63, 65));
        txtResulado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jpanel2.add(txtResulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 63, 280, 60));

        btn_color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_modoClaro.png"))); // NOI18N
        btn_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colorActionPerformed(evt);
            }
        });
        jpanel2.add(btn_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 35, 35));

        getContentPane().add(jpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_div.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_div.setForeground(new java.awt.Color(60, 63, 65));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setAlignmentY(0.0F);
        btn_div.setBorder(null);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel3.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        btn_8.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_8.setForeground(new java.awt.Color(60, 63, 65));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setAlignmentY(0.0F);
        btn_8.setBorder(null);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        btn_exp.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(60, 63, 65));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_exp.setText("CE");
        btn_exp.setAlignmentY(0.0F);
        btn_exp.setBorder(null);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel3.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        btn_porc.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_porc.setForeground(new java.awt.Color(60, 63, 65));
        btn_porc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_porc.setText("%");
        btn_porc.setAlignmentY(0.0F);
        btn_porc.setBorder(null);
        btn_porc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_porc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcActionPerformed(evt);
            }
        });
        jPanel3.add(btn_porc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        btn_c.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_c.setForeground(new java.awt.Color(60, 63, 65));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setAlignmentY(0.0F);
        btn_c.setBorder(null);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel3.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btn_9.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_9.setForeground(new java.awt.Color(60, 63, 65));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setAlignmentY(0.0F);
        btn_9.setBorder(null);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        btn_7.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_7.setForeground(new java.awt.Color(60, 63, 65));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setAlignmentY(0.0F);
        btn_7.setBorder(null);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btn_multi.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_multi.setForeground(new java.awt.Color(60, 63, 65));
        btn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_multi.setText("X");
        btn_multi.setAlignmentY(0.0F);
        btn_multi.setBorder(null);
        btn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });
        jPanel3.add(btn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        btn_resta.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(60, 63, 65));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setAlignmentY(0.0F);
        btn_resta.setBorder(null);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        btn_6.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_6.setForeground(new java.awt.Color(60, 63, 65));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setAlignmentY(0.0F);
        btn_6.setBorder(null);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        btn_5.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_5.setForeground(new java.awt.Color(60, 63, 65));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setAlignmentY(0.0F);
        btn_5.setBorder(null);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        btn_2.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_2.setForeground(new java.awt.Color(60, 63, 65));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setAlignmentY(0.0F);
        btn_2.setBorder(null);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        btn_4.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_4.setForeground(new java.awt.Color(60, 63, 65));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setAlignmentY(0.0F);
        btn_4.setBorder(null);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btn_1.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_1.setForeground(new java.awt.Color(60, 63, 65));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setAlignmentY(0.0F);
        btn_1.setBorder(null);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btn_0.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_0.setForeground(new java.awt.Color(60, 63, 65));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setAlignmentY(0.0F);
        btn_0.setBorder(null);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btn_3.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_3.setForeground(new java.awt.Color(60, 63, 65));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setAlignmentY(0.0F);
        btn_3.setBorder(null);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btn_suma.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(60, 63, 65));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setAlignmentY(0.0F);
        btn_suma.setBorder(null);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        btn_igual.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_igual.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setAlignmentY(0.0F);
        btn_igual.setBorder(null);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel3.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        btn_punto.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(60, 63, 65));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setAlignmentY(0.0F);
        btn_punto.setBorder(null);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        String text = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(text);
        btn_igual.doClick();
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_porcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_porcActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        try {
           String resultado = se.eval(txtOperacion.getText()).toString();
           txtResulado.setText(resultado);
        } catch (Exception e) {
            txtResulado.setText("0");
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResulado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_sumaActionPerformed

    boolean modoDark = false; 
    
    private void btn_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colorActionPerformed
        if (!modoDark){
        jpanel2.setBackground(Color.decode("#212b41"));
        jPanel3.setBackground(Color.decode("#2e3951"));
        txtOperacion.setForeground(Color.decode("#009688"));
        txtResulado.setForeground(Color.decode("#009688"));
        
       
        cambiarDarkbtn2(btn_c);
        cambiarDarkbtn2(btn_div);
        cambiarDarkbtn2(btn_exp);
        cambiarDarkbtn2(btn_multi);
        cambiarDarkbtn2(btn_porc);
        cambiarDarkbtn2(btn_resta);
        cambiarDarkbtn2(btn_suma);
        
        
        btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn2_igual_dark.png")));
        btn_igual.setForeground(Color.decode("#000020"));
        
        btn_color.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn_modoDark.png")));
       
         
        cambiarDarkbtn1(btn_punto);
        cambiarDarkbtn1(btn_0);
        cambiarDarkbtn1(btn_1);
        cambiarDarkbtn1(btn_2);
        cambiarDarkbtn1(btn_3);
        cambiarDarkbtn1(btn_4);
        cambiarDarkbtn1(btn_5);
        cambiarDarkbtn1(btn_6);
        cambiarDarkbtn1(btn_7);
        cambiarDarkbtn1(btn_8);
        cambiarDarkbtn1(btn_9);
        modoDark = true;
        }else{
            
            jpanel2.setBackground(Color.decode("#eaffff"));
            jPanel3.setBackground(Color.decode("#ffffff"));
            txtOperacion.setForeground(Color.decode("#3c3f41"));
            txtResulado.setForeground(Color.decode("#3c3f41"));
            
            cambiarNormalbtn(btn_0);
            cambiarNormalbtn(btn_1);
            cambiarNormalbtn(btn_2);
            cambiarNormalbtn(btn_3);
            cambiarNormalbtn(btn_4);
            cambiarNormalbtn(btn_5);
            cambiarNormalbtn(btn_6);
            cambiarNormalbtn(btn_7);
            cambiarNormalbtn(btn_8);
            cambiarNormalbtn(btn_9);
            cambiarNormalbtn(btn_punto);
            cambiarNormalbtn(btn_suma);
            cambiarNormalbtn(btn_resta);
            cambiarNormalbtn(btn_multi);
            cambiarNormalbtn(btn_div);
            cambiarNormalbtn(btn_exp);
            cambiarNormalbtn(btn_c);
            cambiarNormalbtn(btn_porc);
            
            btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn2_igual.png")));
            btn_igual.setForeground(Color.decode("#ffffff"));
            
            btn_color.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn_modoClaro.png")));
            
            modoDark = false;
        }
    }//GEN-LAST:event_btn_colorActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void cambiarNormalbtn(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn1.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn1_presionado.png")));
        btn.setForeground(Color.decode("#3c3f41"));
    }
    
    public void cambiarDarkbtn1(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn3_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn1_dark.png")));
        btn.setForeground(Color.decode("#009688"));
    
    }
    
    public void cambiarDarkbtn2(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn1_presionado_dark.png")));
        btn.setForeground(Color.decode("#009688"));
    }

    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText() + digito);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_color;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_porc;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResulado;
    // End of variables declaration//GEN-END:variables
}
