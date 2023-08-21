/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4c1labi;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author norma
 */
public class Tempera extends javax.swing.JFrame {

    /**
     * Creates new form Tempera
     */
    public Tempera() {
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

        jLTitulo = new javax.swing.JLabel();
        jLIngreTem = new javax.swing.JLabel();
        jTTempera = new javax.swing.JTextField();
        jBConvertidor = new javax.swing.JButton();
        jLResultado = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTitulo.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(204, 51, 0));
        jLTitulo.setText("  Convertidor");

        jLIngreTem.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLIngreTem.setForeground(new java.awt.Color(204, 51, 0));
        jLIngreTem.setText("   Ingrese temperatura");

        jBConvertidor.setBackground(new java.awt.Color(153, 51, 0));
        jBConvertidor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBConvertidor.setForeground(new java.awt.Color(0, 0, 0));
        jBConvertidor.setText("Convertir");
        jBConvertidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConvertidorActionPerformed(evt);
            }
        });

        jLResultado.setBackground(new java.awt.Color(153, 51, 0));
        jLResultado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLResultado.setForeground(new java.awt.Color(153, 51, 0));
        jLResultado.setText("Resultado");

        jBLimpiar.setBackground(new java.awt.Color(153, 51, 0));
        jBLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLIngreTem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jBConvertidor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTTempera)
                            .addComponent(jLResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIngreTem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTempera, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBConvertidor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jBLimpiar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConvertidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConvertidorActionPerformed
        // TODO add your handling code here:
          try {
        double temp= Double.parseDouble(jTTempera.getText());
       
            
            DecimalFormat formatoDecimal = new DecimalFormat("0.00");
            
            double celsius = Double.parseDouble(jTTempera.getText());
        
            double fahrenheit = celsius * 9/5 + 32;
            jLResultado.setText("Temp.°F es: " + formatoDecimal.format(fahrenheit));
        } catch (NumberFormatException nf) {
            
            JOptionPane.showMessageDialog(this, "Ingrese un numero.");
            jTTempera.setText("");
          }
        
    }//GEN-LAST:event_jBConvertidorActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
         jTTempera.setText("");
         jLResultado.setText("Resultado");
    }//GEN-LAST:event_jBLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Tempera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tempera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tempera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tempera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tempera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConvertidor;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLIngreTem;
    private javax.swing.JLabel jLResultado;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTTempera;
    // End of variables declaration//GEN-END:variables
}
