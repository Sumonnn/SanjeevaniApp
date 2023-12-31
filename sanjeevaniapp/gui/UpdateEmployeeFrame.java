/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.EmpDao;
import sanjeevaniapp.dbutil.DBconnection;
import sanjeevaniapp.pojo.EmpPojo;
import sanjeevaniapp.pojo.UserProfile;

/**
 *
 * @author sumon
 */

public class UpdateEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmployeeFrame
     */
    private String empName,empSal;
    public UpdateEmployeeFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        loadEmpId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEmpBack = new javax.swing.JButton();
        btnEmpLogout = new javax.swing.JButton();
        btnEmpUpdate = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboEmpId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ComboEmpDepartement = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        txtEmpSalary = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel2.setText("Sanjeevani Application");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 370, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Update Employee");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        btnEmpBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmpBack.setForeground(new java.awt.Color(0, 204, 204));
        btnEmpBack.setText("Back");
        btnEmpBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmpBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 170, 30));

        btnEmpLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmpLogout.setForeground(new java.awt.Color(0, 204, 204));
        btnEmpLogout.setText("Logout");
        btnEmpLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmpLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 205, 130, 30));

        btnEmpUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmpUpdate.setForeground(new java.awt.Color(0, 204, 204));
        btnEmpUpdate.setText("Update");
        btnEmpUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmpUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 205, 240, 30));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 204, 204));
        btnHome.setText("Home");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 5, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Employee Details");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EMP ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 60, 20));

        ComboEmpId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboEmpId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEmpIdActionPerformed(evt);
            }
        });
        jPanel2.add(ComboEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Departement");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 100, 20));

        ComboEmpDepartement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ComboEmpDepartement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "DOCTOR", "RECEPTIONIST" }));
        ComboEmpDepartement.setEnabled(false);
        jPanel2.add(ComboEmpDepartement, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Emp Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Salary");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 60, -1));

        txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 220, -1));

        txtEmpSalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txtEmpSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 220, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1020, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1060, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void btnEmpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpBackActionPerformed
        ManageEmployeeFrame optionsFrame=new ManageEmployeeFrame();
        optionsFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmpBackActionPerformed

    private void btnEmpLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpLogoutActionPerformed
      DBconnection.closeConnection();
            System.exit(0);
    }//GEN-LAST:event_btnEmpLogoutActionPerformed

    private void ComboEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEmpIdActionPerformed
       try
       {
           String empId=ComboEmpId.getSelectedItem().toString();
           EmpPojo emp=EmpDao.getEmployeeDetails(empId);
           txtEmpName.setText(emp.getEmpName());
           txtEmpSalary.setText(String.valueOf(emp.getEmpSal()));
           ComboEmpDepartement.setSelectedItem(emp.getEmpDept().toUpperCase());
       }
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null," Error In DB in UpdateFrame "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
       }
    }//GEN-LAST:event_ComboEmpIdActionPerformed

    private void btnEmpUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpUpdateActionPerformed
        boolean isInputValid=validdateInputs();
        if(!isInputValid){
          JOptionPane.showMessageDialog(null,"Please input all fields","Error",JOptionPane.ERROR_MESSAGE);
          return;
      }
        try
        {
            double esal=Double.parseDouble(empSal);
            EmpPojo emp=new EmpPojo();
            emp.setEmpId(ComboEmpId.getSelectedItem().toString());
            emp.setEmpDept(ComboEmpDepartement.getSelectedItem().toString());
            emp.setEmpName(empName);
            emp.setEmpSal(esal);
            boolean result=EmpDao.updateEmployee(emp);
            if(result)
            {
                JOptionPane.showMessageDialog(null,"Record updated successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
              if(UserProfile.getUserId().equalsIgnoreCase(emp.getEmpId()))
                  UserProfile.setUserName(empName);
              return;
            }
            JOptionPane.showMessageDialog(null,"Record not updated!","Failure!",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Error In DB in UpdateFrame "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
      catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please input numeric value for salary","Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnEmpUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEmpDepartement;
    private javax.swing.JComboBox<String> ComboEmpId;
    private javax.swing.JButton btnEmpBack;
    private javax.swing.JButton btnEmpLogout;
    private javax.swing.JButton btnEmpUpdate;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpSalary;
    // End of variables declaration//GEN-END:variables

    private void loadEmpId() {
        try{
            List<String>empIdList=EmpDao.getAllEmployeeId();
            for(String id:empIdList){
                ComboEmpId.addItem(id);
            }
        }
       catch(SQLException ex)
       {
                JOptionPane.showMessageDialog(null,"Error In DB in UpdateFrame "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }

    private boolean validdateInputs() {
        empName=txtEmpName.getText().trim();
        empSal=txtEmpSalary.getText().trim();
        if(empName.isEmpty()||empSal.isEmpty())
            return false;
        return true;
    }
}
