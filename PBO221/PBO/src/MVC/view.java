package MVC;

import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Invinity
 */
public class view extends javax.swing.JFrame {
    
    Controller c = new Controller();

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
    }

//    method fungsi untuk get value dari radio button
    public String getValueRadButton() {
//        buat variabel untuk simpan hasil dari radio button
        String valueRadButton = null;
        
        if (manRButton.isSelected()) {
            valueRadButton = manRButton.getText().toString();
        } else if (womanRButton.isSelected()) {
            valueRadButton = womanRButton.getText().toString();
        }
        
        return valueRadButton;
    }
    
//    method fungsi untuk get value dari check box
    public String getValueCheckBox() {
        String valueCheckBox = "";
        
        JCheckBox[] job = new JCheckBox[]{
            cBoxAccouting, 
            cBoxAdministration, 
            cBoxGraphDesign, 
            cBoxNetworking
        };
        
        for (int i = 0; i < job.length; i++) {
            
            if (job[i].isSelected()) {
                valueCheckBox = job[i].getText().toString() + "\n " + valueCheckBox;
            }
            
        }
        
        return valueCheckBox;
    }
    
//    method fungsi untuk get value dari combo box
    public String getValueComboBox() {
        String valueCombo = "";
        
//        jika tidak ada yang dipilih
        if (comboDepartment.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "ANDA MASIH BELUM MEMILIH DEPARTMENT", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE
            );
            valueCombo = "";
        } else {
            valueCombo = comboDepartment.getSelectedItem().toString();
        }
        
        return valueCombo;
    }
    
//    method fungsi untuk get value dari JDateChooser
    public String getValueDate() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        
        String valueDate = null;
        
//        cek jika date kosong
        if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "ANDA MASIH BELUM MEMILIH TANGGAL", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE
            );
        } else {
            sdf.applyPattern(jDateChooser1.getDateFormatString());
            valueDate = sdf.format(jDateChooser1.getDate());
        }
        
        return valueDate;
    }
    
    void displayJTable() {
//        header table
        String kolom[] = {
            "FULL NAME",
            "SEX",
            "COMPETENCY",
            "DEPARTMENT",
            "WORK START DATE"
        };
                
//        rows
//        baris data: arraylist
        Object[][] data = new Object[c.getArrayListSize()][5];
        
//        tampilkan dengan perulangan
        int i = 0;
        while (i < c.getArrayListSize()) {
            String temp[] = {
                c.getArrayList().get(i).getFullName(),
                c.getArrayList().get(i).getSex(),
                c.getArrayList().get(i).getCompetency(),
                c.getArrayList().get(i).getDepartment(),
                c.getArrayList().get(i).getWorkStartDate()
            };
            
            data[i] = temp;
            i++;
        }
        
        DefaultTableModel dtm = new DefaultTableModel(data, kolom);
        tableEmp.setModel(dtm);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        competency = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        workStartDate = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        manRButton = new javax.swing.JRadioButton();
        womanRButton = new javax.swing.JRadioButton();
        save = new javax.swing.JButton();
        cBoxAccouting = new javax.swing.JCheckBox();
        cBoxNetworking = new javax.swing.JCheckBox();
        cBoxAdministration = new javax.swing.JCheckBox();
        cBoxGraphDesign = new javax.swing.JCheckBox();
        comboDepartment = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmp = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(189, 224, 254));

        title.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        title.setText("EMPLOYEES");

        fullName.setText("FULL NAME");

        sex.setText("SEX");

        competency.setText("COMPETENCY");

        department.setText("DEPARTMENT");

        workStartDate.setText("WORK START DATE");

        fullNameField.setText("Enter Full Name");
        fullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameFieldActionPerformed(evt);
            }
        });

        sexButtonGroup.add(manRButton);
        manRButton.setText("Man");
        manRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manRButtonActionPerformed(evt);
            }
        });

        sexButtonGroup.add(womanRButton);
        womanRButton.setText("Woman");
        womanRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womanRButtonActionPerformed(evt);
            }
        });

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cBoxAccouting.setText("Accounting");
        cBoxAccouting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxAccoutingActionPerformed(evt);
            }
        });

        cBoxNetworking.setText("Networking");

        cBoxAdministration.setText("Administration");

        cBoxGraphDesign.setText("Graphic Designer");
        cBoxGraphDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxGraphDesignActionPerformed(evt);
            }
        });

        comboDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Department", "IT", "HR", "FA" }));
        comboDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartmentActionPerformed(evt);
            }
        });

        tableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEmp);

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");

        jDateChooser1.setDateFormatString("d - M - y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(competency)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullName)
                                    .addComponent(sex)
                                    .addComponent(department)
                                    .addComponent(workStartDate))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(manRButton)
                                        .addGap(39, 39, 39)
                                        .addComponent(womanRButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cBoxAdministration)
                                            .addComponent(cBoxAccouting))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cBoxNetworking)
                                            .addComponent(cBoxGraphDesign)))
                                    .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton)
                            .addComponent(deleteButton))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullName)
                            .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sex)
                            .addComponent(manRButton)
                            .addComponent(womanRButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(competency)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cBoxAccouting)
                                .addComponent(cBoxNetworking)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cBoxAdministration)
                            .addComponent(cBoxGraphDesign))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(department)
                            .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(workStartDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(save)
                                .addGap(93, 93, 93))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldActionPerformed

    private void manRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manRButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manRButtonActionPerformed

    private void womanRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womanRButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_womanRButtonActionPerformed

    private void cBoxAccoutingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxAccoutingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxAccoutingActionPerformed

    private void cBoxGraphDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxGraphDesignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxGraphDesignActionPerformed

    private void comboDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDepartmentActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
//        insert data
        if (fullNameField.getText() != null &&
                getValueRadButton() != null &&
                getValueCheckBox() != "" &&
                getValueComboBox() != "" &&
                getValueDate() != null) {
            c.insert(
                    fullNameField.getText(), 
                    getValueRadButton(), 
                    getValueCheckBox(), 
                    getValueComboBox(), 
                    getValueDate()
            );
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "INPUT DATA SUCCESS", 
                    "SUCCESS", 
                    JOptionPane.INFORMATION_MESSAGE
            );
//            fullNameField.remove(fullNameField);
//            sexButtonGroup.clearSelection();
        } else {
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "DATA MASIH BELUM LENGKAP", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
        
        displayJTable();
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cBoxAccouting;
    private javax.swing.JCheckBox cBoxAdministration;
    private javax.swing.JCheckBox cBoxGraphDesign;
    private javax.swing.JCheckBox cBoxNetworking;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JLabel competency;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel department;
    private javax.swing.JLabel fullName;
    private javax.swing.JTextField fullNameField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton manRButton;
    private javax.swing.JButton save;
    private javax.swing.JLabel sex;
    private javax.swing.ButtonGroup sexButtonGroup;
    private javax.swing.JTable tableEmp;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    private javax.swing.JRadioButton womanRButton;
    private javax.swing.JLabel workStartDate;
    // End of variables declaration//GEN-END:variables
}