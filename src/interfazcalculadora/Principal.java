/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazcalculadora;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiJFrame extends JFrame {

    private BufferedImage imagen;

    public MiJFrame () {
        try {
            // Cargar la imagen desde el paquete fondo
            imagen = ImageIO.read (getClass ().getResource ("fondo/fondo2.jpeg"));
        } catch (IOException e) {
            e.printStackTrace ();
        }
        // Crear un JPanel personalizado
        JPanel panel = new JPanel () {
            @Override
            public void paintComponent (Graphics g) {
                super.paintComponent (g);
                // Dibujar la imagen en el panel
                g.drawImage (imagen, 0, 0, getWidth (), getHeight (), this);
            }
        };
        
        
        // Agregar el panel al JFrame
        this.setContentPane (panel);
        this.setSize (500, 500);
        this.setVisible (true);
    }
    

    public static void main (String[] args) {
        new MiJFrame ();
    }
}

public class Principal extends javax.swing.JFrame {

    Operaciones operar = new Operaciones();
    
        //Declaracion de variables
        double num1;
        double num2;
        
    
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoN1 = new javax.swing.JTextField();
        campoN2 = new javax.swing.JTextField();
        btnsuma = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelresult = new javax.swing.JLabel();
        btndivi = new javax.swing.JButton();
        btnraiz = new javax.swing.JButton();
        btnmedia = new javax.swing.JButton();
        btnpotencia = new javax.swing.JButton();
        btnlogaritmo = new javax.swing.JButton();
        btnseno = new javax.swing.JButton();
        btntangente = new javax.swing.JButton();
        btnraizcubica = new javax.swing.JButton();
        btncoseno = new javax.swing.JButton();
        btnrandom = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btnprimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 51, 102));
        setLocation(new java.awt.Point(550, 200));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CALCULADORA");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Primer numero:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Segundo numero:");

        campoN1.setBackground(new java.awt.Color(204, 255, 204));
        campoN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoN1ActionPerformed(evt);
            }
        });

        campoN2.setBackground(new java.awt.Color(204, 255, 204));
        campoN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoN2ActionPerformed(evt);
            }
        });

        btnsuma.setBackground(new java.awt.Color(255, 255, 204));
        btnsuma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        btnmulti.setBackground(new java.awt.Color(255, 255, 204));
        btnmulti.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnmulti.setText("x");
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        btnresta.setBackground(new java.awt.Color(255, 255, 204));
        btnresta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Resultado");

        btndivi.setBackground(new java.awt.Color(255, 255, 204));
        btndivi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btndivi.setText("/");
        btndivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiviActionPerformed(evt);
            }
        });

        btnraiz.setBackground(new java.awt.Color(255, 255, 204));
        btnraiz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnraiz.setText("√ ");
        btnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizActionPerformed(evt);
            }
        });

        btnmedia.setBackground(new java.awt.Color(255, 255, 204));
        btnmedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmedia.setText("media");
        btnmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmediaActionPerformed(evt);
            }
        });

        btnpotencia.setBackground(new java.awt.Color(255, 255, 204));
        btnpotencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnpotencia.setText("potencia");
        btnpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpotenciaActionPerformed(evt);
            }
        });

        btnlogaritmo.setBackground(new java.awt.Color(255, 255, 204));
        btnlogaritmo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogaritmo.setText("Ln");
        btnlogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogaritmoActionPerformed(evt);
            }
        });

        btnseno.setBackground(new java.awt.Color(255, 255, 204));
        btnseno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnseno.setText("seno");
        btnseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsenoActionPerformed(evt);
            }
        });

        btntangente.setBackground(new java.awt.Color(255, 255, 204));
        btntangente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntangente.setText("Tang");
        btntangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntangenteActionPerformed(evt);
            }
        });

        btnraizcubica.setBackground(new java.awt.Color(255, 255, 204));
        btnraizcubica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnraizcubica.setText("3√ ");
        btnraizcubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizcubicaActionPerformed(evt);
            }
        });

        btncoseno.setBackground(new java.awt.Color(255, 255, 204));
        btncoseno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncoseno.setText("coseno");
        btncoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosenoActionPerformed(evt);
            }
        });

        btnrandom.setBackground(new java.awt.Color(255, 255, 204));
        btnrandom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnrandom.setText("Random");
        btnrandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrandomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Para un optimo funcionamiento por favor llena ambos espacios");

        btnlimpiar.setBackground(new java.awt.Color(255, 255, 204));
        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnlimpiar.setText("CE");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnprimo.setBackground(new java.awt.Color(255, 255, 204));
        btnprimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnprimo.setText("primo");
        btnprimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(labelresult, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnmedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnpotencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnlogaritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btntangente))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnsuma)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnmulti)
                                    .addGap(18, 18, 18)
                                    .addComponent(btndivi)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnresta)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnraizcubica, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnseno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncoseno)
                                .addGap(18, 18, 18)
                                .addComponent(btnrandom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnprimo)
                                .addGap(25, 25, 25)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoN2)
                    .addComponent(campoN1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsuma)
                    .addComponent(btndivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnraiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnraizcubica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmulti)
                    .addComponent(btnresta, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmedia)
                    .addComponent(btnpotencia)
                    .addComponent(btnlogaritmo)
                    .addComponent(btntangente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseno)
                    .addComponent(btncoseno)
                    .addComponent(btnrandom)
                    .addComponent(btnprimo))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelresult))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18))
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
        entrada();
        
        operar.calresta(num1,num2);
        
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnrestaActionPerformed

    
    //BOTON PARA DIVIDIR
    private void btndiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiviActionPerformed
        entrada();
        
        operar.caldivi(num1,num2);
        
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btndiviActionPerformed

    
    //BOTON PARA SUMAR
    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
    
        entrada();
        
        operar.calsuma(num1,num2);
        
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnsumaActionPerformed

    
    //BOTON PARA MULTIPLICAR
    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
       
        entrada();
        
        operar.calmulti(num1,num2);
        
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnmultiActionPerformed

    
    //BOTON PARA RAIZ
    private void btnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizActionPerformed
           entrada();
        
        operar.calraiz(num1);
        num2=1;
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnraizActionPerformed

    
    //BOTON PARA CALCULAR MEDIA
    private void btnmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmediaActionPerformed
           entrada();
        
        operar.calmedia(num1,num2);
        
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnmediaActionPerformed

    
    //BOTON PARA CALCULAR POTENCIA
    private void btnpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpotenciaActionPerformed
           entrada();
        
        operar.calpotencia(num1,num2);
        
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnpotenciaActionPerformed

    
    //BOTON PARA CALCULAR LOGARITMO
    private void btnlogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogaritmoActionPerformed
        entrada();
        
        operar.callogaritmo(num1);
        num2= 0;
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnlogaritmoActionPerformed

    
    //BOTON PARA SENO
    private void btnsenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsenoActionPerformed
            entrada();
        
        operar.calseno(num1);
        num2= 0;
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnsenoActionPerformed

    
    //BOTON PARA TANGENTE
    private void btntangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntangenteActionPerformed
           entrada();
        
        operar.caltangente(num1);
        num2= 0;
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btntangenteActionPerformed

    
    //BOTON PARA RAIZ CUBICA
    private void btnraizcubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizcubicaActionPerformed
         entrada();
        
        operar.calraizcubica(num1);
        num2= 0;
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnraizcubicaActionPerformed

    
    //BOTON PARA COSENO
    private void btncosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosenoActionPerformed
        entrada();
        
        operar.calcoseno(num1);
        num2= 0;
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btncosenoActionPerformed

    private void btnrandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrandomActionPerformed
        entrada();
        
        operar.calrandom(num1);
        num2= 0;
        labelresult.setText(String.valueOf(operar.result));
        
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_btnrandomActionPerformed

    
    //BOTON DE CLEAR
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
      limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    
    //BOTON PARA  NUMERO PRIMO
    private void btnprimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimoActionPerformed
         entrada();
        
        operar.calprimo(num1);
        num2= 0;
        labelresult.setText(String.valueOf(operar.result));
        
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelresult;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        campoN1.setText("");
        campoN2.setText("");
    }
   
}
