/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class DilSecimi extends javax.swing.JFrame {

    Set<String> diller = new LinkedHashSet<>();

    /**
     * Creates new form DilSecimi
     */
    public DilSecimi() {
        initComponents();
    }

    public void goster() {
        String mesaj = "Şu dil seçildi : ";

        for (String s : diller) {
            mesaj += s + " ";
        }

        JOptionPane.showMessageDialog(this, mesaj, "Seçilen Dil", HEIGHT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        javaRadioButton = new javax.swing.JRadioButton();
        pythonRadioButton = new javax.swing.JRadioButton();
        phpRadioButton = new javax.swing.JRadioButton();
        gosterButton = new javax.swing.JButton();
        dillerComboBox = new javax.swing.JComboBox<>();
        gosterComboButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dil Seçimi");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dil Seçimi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        buttonGroup1.add(javaRadioButton);
        javaRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        javaRadioButton.setText("Java");

        buttonGroup1.add(pythonRadioButton);
        pythonRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pythonRadioButton.setText("Python");

        buttonGroup1.add(phpRadioButton);
        phpRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phpRadioButton.setText("PHP");

        gosterButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gosterButton.setText("GÖSTER");
        gosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterButtonActionPerformed(evt);
            }
        });

        dillerComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dillerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dil Seçiniz", "Java", "Python", "PHP" }));

        gosterComboButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gosterComboButton.setText("GÖSTER");
        gosterComboButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterComboButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phpRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pythonRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(javaRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gosterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dillerComboBox, 0, 120, Short.MAX_VALUE)
                    .addComponent(gosterComboButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(javaRadioButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pythonRadioButton)
                    .addComponent(dillerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(phpRadioButton)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gosterComboButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gosterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterButtonActionPerformed
        if (javaRadioButton.isSelected()) {
            diller.add("Java");
        } else {
            diller.remove("Java");
        }

        if (pythonRadioButton.isSelected()) {
            diller.add("Python");
        } else {
            diller.remove("Python");
        }

        if (phpRadioButton.isSelected()) {
            diller.add("PHP");
        } else {
            diller.remove("PHP");
        }

        goster();
    }//GEN-LAST:event_gosterButtonActionPerformed

    private void gosterComboButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterComboButtonActionPerformed
        String mesaj = "Şu dil seçildi : " + dillerComboBox.getSelectedItem();

        JOptionPane.showMessageDialog(this, mesaj, "Seçilen Dil", WIDTH);
    }//GEN-LAST:event_gosterComboButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DilSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DilSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DilSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DilSecimi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DilSecimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dillerComboBox;
    private javax.swing.JButton gosterButton;
    private javax.swing.JButton gosterComboButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton javaRadioButton;
    private javax.swing.JRadioButton phpRadioButton;
    private javax.swing.JRadioButton pythonRadioButton;
    // End of variables declaration//GEN-END:variables
}

// JRadioButton kullanırken sadece bir tane buton seçmek istiyorsak
// ButtonGroup kullanmalıyız ve eklediğimiz JRadioButton'ları bu
// ButtonGroup içine dahil etmeliyiz.
