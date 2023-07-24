/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.DoctorDao;
import sanjeevaniapp.dao.EmpDao;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.dbutil.DBconnection;
import sanjeevaniapp.pojo.DoctorPojo;
import sanjeevaniapp.pojo.User;
import sanjeevaniapp.utilty.PasswordEncryption;

/**
 *
 * @author sumon
 */
public class RegisterDoctorFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterDoctorFrame
     */
   private Map<String,String>unRegDocList;
   private String logId,selEmpId,selEmpName;
   private String pwd1,pwd2;
   private String contactNo,emailId,qualification,specialist;
    public RegisterDoctorFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        unRegDocList=new HashMap<>();
        loadDoctorDetails();
        genNewDocId();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ComboEmpId = new javax.swing.JComboBox<>();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorLoginId = new javax.swing.JTextField();
        ComboDocGender = new javax.swing.JComboBox<>();
        txtDoctorpwd1 = new javax.swing.JPasswordField();
        txtDoctorpwd2 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        txtDoctorMobileNo = new javax.swing.JTextField();
        txtDoctorQualification = new javax.swing.JTextField();
        txtDoctorSpecialist = new javax.swing.JTextField();
        txtDoctorEmailId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 36)); // NOI18N
        jLabel2.setText("Sanjeevani Application");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/icons/HomePageBG.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -260, 1010, 670));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("  Doctor's Details");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Employee ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Doctor Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Login ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Retype Password");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Gender");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, -1));

        ComboEmpId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ComboEmpId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEmpIdActionPerformed(evt);
            }
        });
        jPanel2.add(ComboEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, -1));

        txtDoctorName.setEditable(false);
        txtDoctorName.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, -1));

        txtDoctorLoginId.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorLoginId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, -1));

        ComboDocGender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ComboDocGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "TRANSGENDER" }));
        ComboDocGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(ComboDocGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, -1));

        txtDoctorpwd1.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorpwd1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, -1));

        txtDoctorpwd2.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorpwd2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 140, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Doctor ID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Contact no.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Qualification");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 100, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Specialist");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Email ID");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, -1));

        txtDoctorId.setEditable(false);
        txtDoctorId.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 230, -1));

        txtDoctorMobileNo.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorMobileNo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 230, -1));

        txtDoctorQualification.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorQualification.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 230, -1));

        txtDoctorSpecialist.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorSpecialist.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 230, -1));

        txtDoctorEmailId.setBackground(new java.awt.Color(204, 255, 255));
        txtDoctorEmailId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel2.add(txtDoctorEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 700, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 210, 230));

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 730, 90, 30));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 730, 90, 30));

        btnRegister.setBackground(new java.awt.Color(204, 204, 204));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 153, 153));
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 690, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Add Doctor Frame");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       ManageDoctorFrame optionframe=new ManageDoctorFrame(); 
         optionframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DBconnection.closeConnection();
        System.exit(0);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void ComboEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEmpIdActionPerformed
        if(ComboEmpId.getSelectedIndex()==-1)
             return ;
         selEmpId=ComboEmpId.getSelectedItem().toString();
        
         selEmpName=unRegDocList.get(selEmpId);
         txtDoctorName.setText(selEmpName);
         
    }//GEN-LAST:event_ComboEmpIdActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(validateInputs()==false){
         JOptionPane.showMessageDialog(null, "Please input all the fields");
         return;
     }
     String passwordValid=matchPassword();
     if(passwordValid!=null){
         JOptionPane.showMessageDialog(null, passwordValid);
         return;
     }
     if(isContactNoValid()==false){
         JOptionPane.showMessageDialog(null, "Invalid mobile no");
         return;
     }
     try{
         DoctorPojo doc=new DoctorPojo();
         doc.setDoctorId(txtDoctorId.getText());
         doc.setDoctorName(selEmpName);
         doc.setEmailId(emailId);
         doc.setGender(ComboDocGender.getSelectedItem().toString());
         doc.setContactNo(contactNo);
         doc.setQualification(qualification);
         doc.setSpecialist(specialist);
         User user=new User();
         user.setLoginId(logId);
         String encPassword=new String(PasswordEncryption.getEncryptedPassword(pwd1));
         user.setPassword(encPassword);
         user.setUserName(selEmpName);
         user.setUsertype("DOCTOR");
         boolean result1=DoctorDao.addDoctor(doc);
         boolean result2=UserDao.addUser(user);
         if(result1==true && result2==true){
             JOptionPane.showMessageDialog(null, "Doctor successfully registered!");
             clearAll();
             return;
         }
        JOptionPane.showMessageDialog(null, "Registration unsuccessful!"); 
        return; 
                 
     }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB in RegisterDoctorFrame:"+ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDocGender;
    private javax.swing.JComboBox<String> ComboEmpId;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDoctorEmailId;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorLoginId;
    private javax.swing.JTextField txtDoctorMobileNo;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorQualification;
    private javax.swing.JTextField txtDoctorSpecialist;
    private javax.swing.JPasswordField txtDoctorpwd1;
    private javax.swing.JPasswordField txtDoctorpwd2;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorDetails() {
        try
        {
            unRegDocList=EmpDao.getUnRegisteredDoctors();
            Set<String> empIdSet=unRegDocList.keySet();
           // System.out.println("gggggggggggg");
            for(String empId:empIdSet)
            {
                ComboEmpId.addItem(empId);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB in RegisterDoctorFrame:"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void genNewDocId() {
        try{
            String docId=DoctorDao.getNewDocId();
            txtDoctorId.setText(docId);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB in RegisterDoctorFrame:"+ex.getMessage());
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        logId=txtDoctorLoginId.getText().trim();
        char[] p1=txtDoctorpwd1.getPassword();
        char[] p2=txtDoctorpwd2.getPassword();
        contactNo=txtDoctorMobileNo.getText().trim();
        qualification=txtDoctorQualification.getText().trim();
        specialist=txtDoctorSpecialist.getText().trim();
        emailId=txtDoctorEmailId.getText().trim();
        if(logId.isEmpty()||p1.length==0||p2.length==0||contactNo.isEmpty()||qualification.isEmpty()||emailId.isEmpty()||specialist.isEmpty())
          return false;
      pwd1=new String(p1);
      pwd2=new String(p2);
      return true;
    }

    private String matchPassword() {
        pwd1=pwd1.trim();
     pwd2=pwd2.trim();
     if(pwd1.length()<3 || pwd2.length()<3)
         return "Passwords must be of atleast 3 characters in length";
     if(pwd1.equals(pwd2)==false)
         return "Passwords do not match";
     return null;
    }

    private boolean isContactNoValid() {
        char[]mob=contactNo.toCharArray();
      for(char ch:mob){
          if(Character.isDigit(ch)==false)
              return false;
      }
      if(contactNo.length()==10)
            return true;
      return false;
    }
      private void clearAll(){
      txtDoctorLoginId.setText("");
      this.txtDoctorMobileNo.setText("");
      this.txtDoctorId.setText("");
      this.txtDoctorEmailId.setText("");
      this.txtDoctorpwd1.setText("");
      this.txtDoctorpwd2.setText("");
      this.txtDoctorQualification.setText("");
      this.txtDoctorSpecialist.setText("");
      this.unRegDocList.remove(selEmpId);
      this.ComboEmpId.removeItem(selEmpId);
      if(unRegDocList.size()==0){
          JOptionPane.showMessageDialog(null,"All doctors registered!");
          ManageDoctorFrame manageDoc=new ManageDoctorFrame();
          manageDoc.setVisible(true);
          this.dispose();
      }
   }
}
