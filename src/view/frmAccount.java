/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;


import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import dao.accountManagerDAO;
import dao.nhanVienDAO;
import database.JDBCUtil;
import java.awt.Component;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.accountManager;
import model.nhanVien;
import model.thongBaoLoi;
import model.validator;



public class frmAccount extends javax.swing.JPanel {
     

     private ArrayList<accountManager> list = new accountManagerDAO().getList();
     DefaultTableModel model; 
     private Component frmAccount;
     private int selectedIndex;
         
    public frmAccount() {
        initComponents();
//        
//         model = (DefaultTableModel) table_account.getModel();
//        
//         model.setColumnIdentifiers(new Object[]{
//            "STT", "Username", "Password", "Role"});
        loadArray();
        
    }
    
    int i = 1;
    public void loadArray(){
        model = (DefaultTableModel) table_account.getModel();
        model.setRowCount(0);
         for(accountManager ac : list) {
	        model.addRow(new Object[]{
	            i++, ac.getTenDangNhap(), ac.getMatKhau(), ac.getRole(), ac.getMaNV()
	        });
    }
         
    }
    
    public void xoatrang(){
        txtuser.setText("");
        txtpass.setText("");
        rdom.setSelected(false);
//        rdoe.setSelected(false);
//        buttonGroup2.setSelected((ButtonModel) rdom, false);
        txtuser.setEditable(true);
        cpass.setText("");
        txtmanv.setText("");
        list = new accountManagerDAO().getList();
        i = 1;
        loadArray();
    }
       
//      public void showTable(){
//         for(accountManager ac : list) {
//	        model.addRow(new Object[]{
//	            i++, ac.getTenDangNhap(), ac.getMatKhau(), ac.getRole()
//	        });
//    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        button1 = new java.awt.Button();
        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cpass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rdom = new javax.swing.JRadioButton();
        rdoe = new javax.swing.JRadioButton();
        rdoeb = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_account = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        button1.setLabel("button1");

        popupMenu1.setLabel("popupMenu1");

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-account-box_icon-icons.com_72491.png"))); // NOI18N
        jLabel1.setText("Account Manager");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("Username:");

        txtuser.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setText("Confirm Password:");

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setText("ID Employee:");

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel9.setText("Role:");

        buttonGroup2.add(rdom);
        rdom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdom.setText("Manager");

        buttonGroup2.add(rdoe);
        rdoe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoe.setText("Employee_A");

        buttonGroup2.add(rdoeb);
        rdoeb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoeb.setText("Employee_B");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoeb)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdom)
                    .addComponent(rdoe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(rdom)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoe)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoeb))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seo-social-web-network-internet_189_icon-icons.com_61521.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_4219.png"))); // NOI18N
        jButton2.setText("Xóa");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3844439-gear-setting-settings-wheel_110294.png"))); // NOI18N
        jButton3.setText("Sữa");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_reset_icon_137428.png"))); // NOI18N
        jButton5.setText("Reset");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        table_account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Username", "Password", "Role", "ID User"
            }
        ));
        table_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_accountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                table_accountMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(table_account);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Username:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-icon-32.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Find");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Show");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(171, 171, 171)
                                .addComponent(jLabel1))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
////         if (txtuser.getText().equals("") || txtpass.getText().equals("")){
////        StringBuilder sb = new StringBuilder(); //đối tượng lưu thông báo kt dữ liệu
////        validator.validatorEmty(txtuser, sb, "Vui lòng nhập Username!");
////        validator.validatorEmty(txtpass, sb, "Vui lòng nhập Password!");
////        if(sb.length() > 0){       // có thog báo trong sb
////        thongBaoLoi.showErrorDialog(this, sb.toString(), "Error");
////        return;
////        }
//         }
//        
        if(txtuser.getText().equals("") || txtpass.getText().equals("") || cpass.getText().equals("")||txtmanv.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!");
              return;
        }
        if(rdom.isSelected()==false && rdoe.isSelected()==false &&rdoeb.isSelected()==false){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn chức vụ!");
              return;
        }
        if(!(cpass.getText().equals(txtpass.getText()))){
             JOptionPane.showMessageDialog(this, "Vui lòng xác nhận lại mật khẩu!");
             return;
        }
        if(!(txtmanv.getText().equals(""))){
          String manv = txtmanv.getText();
          int n = 0;
          ArrayList<nhanVien> list = new nhanVienDAO().getList();
          for(nhanVien nv : list){        
              if(manv.equals(nv.getMaNhanVien())){
                  n++;
              }
          }
          if(n != 1){
                  JOptionPane.showMessageDialog(this, "Không có mã nhân viên này!");
                  return;
              }          
        }
        
        accountManager ac = new accountManager();
                ac.setTenDangNhap(txtuser.getText());
	        ac.setMatKhau(txtpass.getText());
                String role = "";
                if (rdom.isSelected()){
                    role="Manager";
                }
                if(rdoe.isSelected()){
                    role="Employee_A";
                }
                if(rdoeb.isSelected()){
                    role="Employee_B";
                }
                if(!(role.equals(""))){
                     int n = 0;
                  ArrayList<nhanVien> list2 = new nhanVienDAO().getList();
                 for(nhanVien nv : list2){        
                 if( txtmanv.getText().equals(nv.getMaNhanVien())||role.equals(nv.getChucVu())){
                  n++;
                      }
                       }
                 if(n != 1){
                 JOptionPane.showMessageDialog(this, "Chức vụ không đúng!");
                  return;
                    }      
                      }
                ac.setRole(role);   
                ac.setMaNV(txtmanv.getText());
	      
                
                list.add(ac);
                if(new accountManagerDAO().insert2(ac)){
                    JOptionPane.showMessageDialog(frmAccount, "Add success!");
                     i = 1;
                     loadArray();
                     txtuser.setText("");
                     txtpass.setText("");
                     rdom.setSelected(false);
                     rdoe.setSelected(false);
                     rdoeb.setSelected(false);
                     cpass.setText("");
                     txtmanv.setText("");
                }else {
                    JOptionPane.showMessageDialog(frmAccount, "Username không được trùng nhau!");
   
                }
          
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(txtuser.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nhập username cần xóa!");
               txtuser.requestFocus(); return;
        }
         accountManager ac = new accountManager();
                ac.setTenDangNhap(txtuser.getText());
            if(new accountManagerDAO().delete2(ac)){
                   JOptionPane.showMessageDialog(this, "Delete success!");
                    list = new accountManagerDAO().getList();
                    i = 1;
                    loadArray(); 
                    txtuser.setText("");
                     txtpass.setText("");
                     rdom.setSelected(false);
                     rdoe.setSelected(false);
                     txtmanv.setText("");
                     
            }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_accountMouseClicked
        selectedIndex = table_account.getSelectedRow();
        if(selectedIndex >= 0){
            txtuser.setText(table_account.getValueAt(selectedIndex, 1)+"");
            txtuser.setEditable(false);
            txtpass.setText(table_account.getValueAt(selectedIndex, 2)+"");
            txtmanv.setText(table_account.getValueAt(selectedIndex, 4)+"");
            String role = list.get(selectedIndex).getRole();
            if(role.equals("Manager")){
                rdom.setSelected(true);
            }else if(role.equals("Employee_A")){
                rdoe.setSelected(true);
                    }
             else rdoeb.setSelected(true);
        }
    }//GEN-LAST:event_table_accountMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       xoatrang();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtuser.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Nhập username để sữa! ");
               txtuser.requestFocus(); return;
        }
        if(!(cpass.getText().equals(txtpass.getText()))){
             JOptionPane.showMessageDialog(this, "Vui lòng xác nhận lại mật khẩu!");
             return;
        }
        accountManager ac = new accountManager();
        ac.setTenDangNhap(txtuser.getText());
        String role="";
       if (rdom.isSelected()){
                    role="Manager";
                }
       if(rdoe.isSelected()){
                    role="Employee_A";
                }
       if(rdoeb.isSelected()){
                    role="Employee_B";
                }
        ac.setRole(role);
        ac.setMatKhau(txtpass.getText());
        ac.setMaNV(txtmanv.getText());
        if(new accountManagerDAO().updata2(ac)){
                   JOptionPane.showMessageDialog(this, "Sửa thành công!");
                    list = new accountManagerDAO().getList();
                    i = 1;
                    loadArray(); 
                    txtuser.setText("");
                    txtpass.setText("");
                    rdom.setSelected(false);
                    rdoe.setSelected(false);
                    rdoeb.setSelected(false);
                    cpass.setText("");
                    txtmanv.setText("");
                    
            }
        
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_accountMouseExited
//        rdom.setSelected(false);
//        rdoe.setSelected(false);
    }//GEN-LAST:event_table_accountMouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if (txtsearch.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Nhập username để tìm!");
            return;
       }
       
        accountManager ac = new accountManager();
        ac.setTenDangNhap(txtsearch.getText());
        accountManager kq = (new accountManagerDAO().selectById(ac));
        list.clear();
        list.add(kq);
        
       
        i = 1;
        loadArray();
        
        
    }//GEN-LAST:event_jButton4ActionPerformed
//      public void showResult(){
//	       accountManager ac = list.get(list.size()-1);
//	        model.addRow(new Object[]{
//	            i++, ac.getTenDangNhap(), ac.getMatKhau(), ac.getRole()
//	        });
//	    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JRadioButton rdoe;
    private javax.swing.JRadioButton rdoeb;
    private javax.swing.JRadioButton rdom;
    private javax.swing.JTable table_account;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
