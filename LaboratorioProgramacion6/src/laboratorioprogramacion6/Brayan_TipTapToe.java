/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package laboratorioprogramacion6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Usuario
 */
public class Brayan_TipTapToe extends javax.swing.JFrame {

    private JButton[][] botonesLOL = new JButton[3][3];
    private JLabel turnoLabelLOL;
    private String turnoActualLOL = "X";
    private boolean juegoActivoLOL = true;

    
    /**
     * Creates new form Brayan_TipTapToe
     */
    public Brayan_TipTapToe() {
      
    initComponents();

        setTitle("Juego X-0");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        turnoLOL = new JLabel("Turno actual: Jugador X");
        turnoLOL.setBounds(50, 10, 300, 30);
        turnoLOL.setHorizontalAlignment(SwingConstants.CENTER);
        add(turnoLOL);

        
        JPanel tableroLOL = new JPanel();
        tableroLOL.setLayout(null);
        tableroLOL.setBounds(50, 50, 300, 300);
        add(tableroLOL);

        
        int botonAncho = 100, botonAlto = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botonesLOL[i][j] = new JButton("");
                botonesLOL[i][j].setBounds(j * botonAncho, i * botonAlto, botonAncho, botonAlto);
                int filaLOL = i;
                int columnaLOL = j;

                botonesLOL[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (juegoActivoLOL && botonesLOL[filaLOL][columnaLOL].getText().equals("")) {
                            botonesLOL[filaLOL][columnaLOL].setText(turnoActualLOL);

                            boolean ganadorLOL = false;

                          
                            for (int x = 0; x < 3; x++) {
                                if (botonesLOL[x][0].getText().equals(turnoActualLOL) &&
                                    botonesLOL[x][1].getText().equals(turnoActualLOL) &&
                                    botonesLOL[x][2].getText().equals(turnoActualLOL)) {
                                    ganadorLOL = true;
                                }
                            }

                            
                            for (int y = 0; y < 3; y++) {
                                if (botonesLOL[0][y].getText().equals(turnoActualLOL) &&
                                    botonesLOL[1][y].getText().equals(turnoActualLOL) &&
                                    botonesLOL[2][y].getText().equals(turnoActualLOL)) {
                                    ganadorLOL = true;
                                }
                            }

                           
                            if (botonesLOL[0][0].getText().equals(turnoActualLOL) &&
                                botonesLOL[1][1].getText().equals(turnoActualLOL) &&
                                botonesLOL[2][2].getText().equals(turnoActualLOL)) {
                                ganadorLOL = true;
                            }
                            if (botonesLOL[0][2].getText().equals(turnoActualLOL) &&
                                botonesLOL[1][1].getText().equals(turnoActualLOL) &&
                                botonesLOL[2][0].getText().equals(turnoActualLOL)) {
                                ganadorLOL = true;
                            }

                            if (ganadorLOL) {
                                JOptionPane.showMessageDialog(null, "¡Ganador: " + turnoActualLOL + "!");
                                juegoActivoLOL = false;
                                return;
                            }

                            
                            turnoActualLOL = turnoActualLOL.equals("X") ? "O" : "X";
                            turnoLOL.setText("Turno actual: Jugador " + turnoActualLOL);
                        }
                    }
                });

                tableroLOL.add(botonesLOL[i][j]);
            }
        }

        
       
       
       

            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroLOL = new javax.swing.JPanel();
        tableroLOL2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reiniciarBotonLOL = new javax.swing.JButton();
        salirBotonLOL = new javax.swing.JButton();
        turnoLOL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableroLOL.setLayout(new java.awt.GridLayout());

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tableroLOL2Layout = new javax.swing.GroupLayout(tableroLOL2);
        tableroLOL2.setLayout(tableroLOL2Layout);
        tableroLOL2Layout.setHorizontalGroup(
            tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableroLOL2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addGroup(tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton8)
                        .addGroup(tableroLOL2Layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addGap(26, 26, 26)
                            .addComponent(jButton7))
                        .addGroup(tableroLOL2Layout.createSequentialGroup()
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        tableroLOL2Layout.setVerticalGroup(
            tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableroLOL2Layout.createSequentialGroup()
                .addGroup(tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tableroLOL2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tableroLOL2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tableroLOL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tableroLOL2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableroLOL2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(145, 145, 145))
        );

        jLabel1.setText("Controles");

        reiniciarBotonLOL.setText("Reiniciar");
        reiniciarBotonLOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarBotonLOLActionPerformed(evt);
            }
        });

        salirBotonLOL.setText("Salir");
        salirBotonLOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBotonLOLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reiniciarBotonLOL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salirBotonLOL)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(turnoLOL)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(reiniciarBotonLOL)
                .addGap(3, 3, 3)
                .addComponent(turnoLOL)
                .addGap(9, 9, 9)
                .addComponent(salirBotonLOL)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(tableroLOL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(tableroLOL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableroLOL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableroLOL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void salirBotonLOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBotonLOLActionPerformed

 System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_salirBotonLOLActionPerformed

    private void reiniciarBotonLOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarBotonLOLActionPerformed
        // TODO add your handling code here:
        turnoActualLOL = "X"; 
    juegoActivoLOL = true; 
    turnoLOL.setText("Turno actual: Jugador X"); 
    
    for (int x = 0; x < 3; x++) {
        for (int y = 0; y < 3; y++) {
            botonesLOL[x][y].setText("");
        }
    }
         
        
      
        
    }//GEN-LAST:event_reiniciarBotonLOLActionPerformed

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
            java.util.logging.Logger.getLogger(Brayan_TipTapToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Brayan_TipTapToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Brayan_TipTapToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Brayan_TipTapToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Brayan_TipTapToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton reiniciarBotonLOL;
    private javax.swing.JButton salirBotonLOL;
    private javax.swing.JPanel tableroLOL;
    private javax.swing.JPanel tableroLOL2;
    private javax.swing.JLabel turnoLOL;
    // End of variables declaration//GEN-END:variables

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
