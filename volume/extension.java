/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplegui;

/**
 *
 * @author Admin
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Elton
 */
public class Volumeconverter extends javax.swing.JFrame {

    /**
     * Creates new form Volumeconverter
     */
    public Volumeconverter() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Volume Converter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Convert value of :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Convert :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uk gallons", "Liters", "Milliliters", "Cubic centimeters", "Cubic meters", "Cubic inches", "Cubic feet" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Into :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liters", "Uk gallons", "Milliliters", "Cubic centimeters", "Cubic meters", "Cubic inches", "Cubic feet" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Converted value :");

        jTextField2.setEditable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Convert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 265, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String box1 = (String)jComboBox1.getSelectedItem();
        String box2 = (String)jComboBox2.getSelectedItem();
        
        if(box1.equals("Uk gallons")&& box2.equals("Liters")){
            double V = Double.parseDouble(jTextField1.getText()); 
               
               double L = V * 4.54609;
               
               jTextField2.setText(String.valueOf(L));
        }else if(box1.equals("Uk gallons")&& box2.equals("Milliliters")){
             double V = Double.parseDouble(jTextField1.getText()); 
               
               double M = V * 4.54609 * 1000;
               
               jTextField2.setText(String.valueOf(M));
        }else if(box1.equals("Uk gallons")&& box2.equals("Cubic centimeters")){
             double V = Double.parseDouble(jTextField1.getText()); 
               
               double C = V * 4.54608 * 1000;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Uk gallons")&& box2.equals("Cubic meters")){
            double V = Double.parseDouble(jTextField1.getText()); 
               
               double Cm = V * 4.54609 * 0.001;
               
               jTextField2.setText(String.valueOf(Cm));
        }else if(box1.equals("Uk gallons")&& box2.equals("Cubic inches")){
            double V = Double.parseDouble(jTextField1.getText()); 
               
               double Cm = V * 4.54609 * 0.001;
               
               jTextField2.setText(String.valueOf(Cm));
        }else if(box1.equals("Uk gallons")&& box2.equals("Cubic feet")){
            double V = Double.parseDouble(jTextField1.getText()); 
               
               double Ci = V * 0.160543;
               
               jTextField2.setText(String.valueOf(Ci));
        }
        //para sa liters
        if(box1.equals("Liters")&& box2.equals("Uk gallons")){
            double V = Double.parseDouble(jTextField1.getText()); 
               
               double L = V / 4.54609;
               
               jTextField2.setText(String.valueOf(L));
        }else if(box1.equals("Liters")&& box2.equals("Milliliters")){
            double V = Double.parseDouble(jTextField1.getText()); 
               
               double L = V * 1000;
               
               jTextField2.setText(String.valueOf(L));
        }else if(box1.equals("Liters")&& box2.equals("Cubic meters")){
              double V = Double.parseDouble(jTextField1.getText()); 
               
               double L = V * 0.001;
               
               jTextField2.setText(String.valueOf(L));
        }else if(box1.equals("Liters")&& box2.equals("Cubic centimeters")){
              double V = Double.parseDouble(jTextField1.getText()); 
               
               double L = V * 1000;
               
               jTextField2.setText(String.valueOf(L));
        }else if(box1.equals("Liters")&& box2.equals("Cubic inches")){
              double V = Double.parseDouble(jTextField1.getText()); 
               
               double L = V * 61.0237;
               
               jTextField2.setText(String.valueOf(L));
        }else if(box1.equals("Liters")&& box2.equals("Cubic feet")){
              double V = Double.parseDouble(jTextField1.getText()); 
               
               double L = V * 0.0353147;
               
               jTextField2.setText(String.valueOf(L));
        }
        // para sa milliliters
        if(box1.equals("Milliliters")&& box2.equals("Uk gallons")){
            double V = Double.parseDouble(jTextField1.getText()); 
               double L = V /1000;
               double M = L / 4.54609;
               
               jTextField2.setText(String.valueOf(M));
        }else if(box1.equals("Milliliters")&& box2.equals("Liters")){
            double V = Double.parseDouble(jTextField1.getText()); 
              
               double M = V / 1000;
               
               jTextField2.setText(String.valueOf(M));
        }else if(box1.equals("Milliliters")&& box2.equals("Cubic centimeters")){
            double V = Double.parseDouble(jTextField1.getText()); 
              
              
               
               jTextField2.setText(String.valueOf(V));
        }else if(box1.equals("Milliliters")&& box2.equals("Cubic meters")){
            double V = Double.parseDouble(jTextField1.getText()); 
              
               double M = V * 0.000001;
               
               jTextField2.setText(String.valueOf(M));
        }else if(box1.equals("Milliliters")&& box2.equals("Cubic inches")){
            double V = Double.parseDouble(jTextField1.getText()); 
              
               double M = V * 0.0610237;
               
               jTextField2.setText(String.valueOf(M));
        }else if(box1.equals("Milliliters")&& box2.equals("Cubic feet")){
            double V = Double.parseDouble(jTextField1.getText()); 
              
               double M = V * (Math.pow(10, -5));
               
               jTextField2.setText(String.valueOf(M));
        }
        //para sa cubic centimeters
        if(box1.equals("Cubic centimeters")&& box2.equals("Uk gallons")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V / (1000 * 4.54609);
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic centimeters")&& box2.equals("Liters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V / 1000;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic centimeters")&& box2.equals("Milliliters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
            
               
               jTextField2.setText(String.valueOf(V));
        }else if(box1.equals("Cubic centimeters")&& box2.equals("Cubic meters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V / (1 * (Math.pow(10, 6)));
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic centimeters")&& box2.equals("Cubic inches")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V / 16.387;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic centimeters")&& box2.equals("Cubic feet")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V / 28316.8;
               
               jTextField2.setText(String.valueOf(C));
        }
        //para sa cubic meters
        if(box1.equals("Cubic meters")&& box2.equals("Uk gallons")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 219.969;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic meters")&& box2.equals("Liters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 1000;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic meters")&& box2.equals("Milliliters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 1000000;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic meters")&& box2.equals("Cubic centimeters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 1000000;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic meters")&& box2.equals("Cubic inches")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 61023.7;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic meters")&& box2.equals("Cubic feet")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 35.315;
               
               jTextField2.setText(String.valueOf(C));
        }
        //para ni sa cubic inches
        if(box1.equals("Cubic inches")&& box2.equals("Uk gallons")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 0.00454609;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic inches")&& box2.equals("Liters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 0.0163871;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic inches")&& box2.equals("Milliliters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 16.3871;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic inches")&& box2.equals("Cubic centimeters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 16.3871;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic inches")&& box2.equals("Cubic meters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 0.0000163871;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic inches")&& box2.equals("Cubic feet")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V / 1728;
               
               jTextField2.setText(String.valueOf(C));
        }
        // para sa cubic feet
        if(box1.equals("Cubic feet")&& box2.equals("Uk gallons")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 6.22884;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic feet")&& box2.equals("Liters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 0.0163871;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic feet")&& box2.equals("Milliliters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 28316.8;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic feet")&& box2.equals("Cubic centimeters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 28316.8;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic feet")&& box2.equals("Cubic meters")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 0.0283168;
               
               jTextField2.setText(String.valueOf(C));
        }else if(box1.equals("Cubic feet")&& box2.equals("Cubic inches")){
            double V = Double.parseDouble(jTextField1.getText()); 
  
               double C = V * 1728;
               
               jTextField2.setText(String.valueOf(C));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Volumeconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Volumeconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Volumeconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Volumeconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Volumeconverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
