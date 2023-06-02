/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazcalculadora;



public class Principal extends javax.swing.JFrame {
    Operacionesespeciales operar=new Operacionesespeciales("Especial", "azul", 12, "abc123", "Will");

    
        //Declaracion de variables
        double num1, num2;
        
        
    
    public Principal() {
        initComponents(); 
        limpiar();
    }
    
    public void entrada(){
         num1 = Double.parseDouble(campoN1.getText());
         num2 = Double.parseDouble(campoN2.getText());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnrandom = new javax.swing.JButton();
        labelresult = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btndivi = new javax.swing.JButton();
        btnprimo = new javax.swing.JButton();
        btnraiz = new javax.swing.JButton();
        btnmedia = new javax.swing.JButton();
        btnpotencia = new javax.swing.JButton();
        btnlogaritmo = new javax.swing.JButton();
        btnseno = new javax.swing.JButton();
        btntangente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoN1 = new javax.swing.JTextField();
        campoN2 = new javax.swing.JTextField();
        btnsuma = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnraizcubica = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btncoseno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 51, 102));
        setLocation(new java.awt.Point(550, 200));
        setPreferredSize(new java.awt.Dimension(400, 450));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(450, 450));
        bg.setPreferredSize(new java.awt.Dimension(400, 450));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(450, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrandom.setBackground(new java.awt.Color(255, 255, 204));
        btnrandom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnrandom.setText("Random");
        btnrandom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnrandom.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnrandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrandomActionPerformed(evt);
            }
        });
        jPanel1.add(btnrandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 40));

        labelresult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelresult.setText("0");
        jPanel1.add(labelresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 120, 40));

        btnlimpiar.setBackground(new java.awt.Color(255, 255, 204));
        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlimpiar.setText("CE");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 52, 72));

        btndivi.setBackground(new java.awt.Color(255, 255, 204));
        btndivi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btndivi.setText("/");
        btndivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiviActionPerformed(evt);
            }
        });
        jPanel1.add(btndivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 40));

        btnprimo.setBackground(new java.awt.Color(255, 255, 204));
        btnprimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnprimo.setText("primo");
        btnprimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnprimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, 40));

        btnraiz.setBackground(new java.awt.Color(255, 255, 204));
        btnraiz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnraiz.setText("√ ");
        btnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizActionPerformed(evt);
            }
        });
        jPanel1.add(btnraiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 57, 40));

        btnmedia.setBackground(new java.awt.Color(255, 255, 204));
        btnmedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmedia.setText("media");
        btnmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmediaActionPerformed(evt);
            }
        });
        jPanel1.add(btnmedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 40));

        btnpotencia.setBackground(new java.awt.Color(255, 255, 204));
        btnpotencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnpotencia.setText("potencia");
        btnpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpotenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnpotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, 40));

        btnlogaritmo.setBackground(new java.awt.Color(255, 255, 204));
        btnlogaritmo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogaritmo.setText("Ln");
        btnlogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogaritmoActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogaritmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 40));

        btnseno.setBackground(new java.awt.Color(255, 255, 204));
        btnseno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnseno.setText("seno");
        btnseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsenoActionPerformed(evt);
            }
        });
        jPanel1.add(btnseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 40));

        btntangente.setBackground(new java.awt.Color(255, 255, 204));
        btntangente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntangente.setText("Tang");
        btntangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntangenteActionPerformed(evt);
            }
        });
        jPanel1.add(btntangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 70, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("CALCULADORA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Primer numero:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 135, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Segundo numero:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 138, -1));

        campoN1.setBackground(new java.awt.Color(204, 255, 255));
        campoN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoN1ActionPerformed(evt);
            }
        });
        jPanel1.add(campoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 140, -1));

        campoN2.setBackground(new java.awt.Color(204, 255, 255));
        campoN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoN2ActionPerformed(evt);
            }
        });
        jPanel1.add(campoN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, -1));

        btnsuma.setBackground(new java.awt.Color(255, 255, 204));
        btnsuma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        btnmulti.setBackground(new java.awt.Color(255, 255, 204));
        btnmulti.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnmulti.setText("x");
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });
        jPanel1.add(btnmulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 40));

        btnresta.setBackground(new java.awt.Color(255, 255, 204));
        btnresta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 40));

        btnraizcubica.setBackground(new java.awt.Color(255, 255, 204));
        btnraizcubica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnraizcubica.setText("3√ ");
        btnraizcubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizcubicaActionPerformed(evt);
            }
        });
        jPanel1.add(btnraizcubica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 57, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Resultado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        btncoseno.setBackground(new java.awt.Color(255, 255, 204));
        btncoseno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncoseno.setText("coseno");
        btncoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosenoActionPerformed(evt);
            }
        });
        jPanel1.add(btncoseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/fondo2.jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 400, 510));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoN1ActionPerformed

    private void campoN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoN2ActionPerformed

    
    //BOTON PARA RESTAR
    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
         double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
        double resultado = operar.calresta(num1,num2);
        labelresult.setText(String.valueOf(resultado));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnrestaActionPerformed

    
    //BOTON PARA DIVIDIR
    private void btndiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiviActionPerformed
         double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
        double resultado = operar.caldivi(num1,num2);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btndiviActionPerformed

    
    //BOTON PARA SUMAR
    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
        double resultado = operar.calsuma(num1,num2);
        labelresult.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnsumaActionPerformed

    
    //BOTON PARA MULTIPLICAR
    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
        double resultado = operar.calmulti(num1,num2);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnmultiActionPerformed

    
    //BOTON PARA RAIZ
    private void btnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizActionPerformed
      
        double num1 = Double.parseDouble(campoN1.getText());
        double resultado = operar.calraiz(num1);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnraizActionPerformed

    
    //BOTON PARA CALCULAR MEDIA
    private void btnmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmediaActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
        double resultado = operar.calmedia(num1,num2);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnmediaActionPerformed

    
    //BOTON PARA CALCULAR POTENCIA
    private void btnpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpotenciaActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
        double resultado = operar.calpotencia(num1,num2);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnpotenciaActionPerformed

    
    //BOTON PARA CALCULAR LOGARITMO
    private void btnlogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogaritmoActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double resultado = operar.callogaritmo(num1);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnlogaritmoActionPerformed

    
    //BOTON PARA SENO
    private void btnsenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsenoActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double resultado = operar.calseno(num1);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnsenoActionPerformed

    
    //BOTON PARA TANGENTE
    private void btntangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntangenteActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double resultado = operar.caltangente(num1);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btntangenteActionPerformed

    
    //BOTON PARA RAIZ CUBICA
    private void btnraizcubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizcubicaActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double resultado = operar.calraizcubica(num1);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnraizcubicaActionPerformed

    
    //BOTON PARA COSENO
    private void btncosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosenoActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double resultado = operar.calcoseno(num1);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btncosenoActionPerformed

    private void btnrandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrandomActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double resultado = operar.calrandom(num1);
        labelresult.setText(String.valueOf(resultado));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnrandomActionPerformed

    
    //BOTON DE CLEAR
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
      limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    
    //BOTON PARA  NUMERO PRIMO
    private void btnprimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimoActionPerformed
        
      double num1 = Double.parseDouble(campoN1.getText());
      boolean resultado = operar.calprimo((int) num1);
      labelresult.setText(String.valueOf(resultado));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnprimoActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btncoseno;
    private javax.swing.JButton btndivi;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlogaritmo;
    private javax.swing.JButton btnmedia;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnpotencia;
    private javax.swing.JButton btnprimo;
    private javax.swing.JButton btnraiz;
    private javax.swing.JButton btnraizcubica;
    private javax.swing.JButton btnrandom;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnseno;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton btntangente;
    private javax.swing.JTextField campoN1;
    private javax.swing.JTextField campoN2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelresult;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        campoN1.setText("");
        campoN2.setText("");
    }
   
}
