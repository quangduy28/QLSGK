/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import dao.sachGiaoKhoaDAO;
import database.JDBCUtil;
import java.awt.Component;
import java.awt.Frame;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.sachGiaoKhoa;

public class frmTTsach extends javax.swing.JPanel {

    private ArrayList<sachGiaoKhoa> list = new sachGiaoKhoaDAO().getList();
    DefaultTableModel model;

    private int selectedIndex;

    private Component frmTTsach;

    public frmTTsach() {
        initComponents();
        //note // load nd dâtbase
//        model = (DefaultTableModel) table.getModel();
//        
//        model.setColumnIdentifiers(new Object[]{
//            "STT", "Mã sách", "Tên sách", "Năm xuất bản", "Chủ biên", "Nhà xuất bản", "Số Lượng"
//        });
////        showTable();
        loadArray();
    }
    int i = 1;

    public void loadArray() {
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (sachGiaoKhoa sgk : list) {
            model.addRow(new Object[]{
                i++, sgk.getMaSach(), sgk.getTenSach(), sgk.getNamXuatBan(), sgk.getTenChuBien(), sgk.getTenNXB(), sgk.getSoLuong()
            });
        }
    }

    public void xoatrang() {
        txtname.setText("");
        txttensach.setText("");
        txtnamxuatban.setText("");
        txtchubien.setText("");
        txtnhaxuatban.setText("");
        txtsl.setText("");
        list = new sachGiaoKhoaDAO().getList();
        i = 1;
        loadArray();
//         showTable();
        txtname.setEditable(true);
        txtname.setBackground(new java.awt.Color(0, 255, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txttensach = new javax.swing.JTextField();
        txtnamxuatban = new javax.swing.JTextField();
        txtchubien = new javax.swing.JTextField();
        txtnhaxuatban = new javax.swing.JTextField();
        txtsl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();

        jLabel11.setText("jLabel11");

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book-3_icon-icons.com_49257.png"))); // NOI18N
        jLabel1.setText("THÔNG TIN SÁCH GIÁO KHOA");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Mã sách:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Tên sách:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Năm xuất bản:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Chủ biên: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Nhà xuất bản:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Số lượng:");

        txtname.setBackground(new java.awt.Color(0, 255, 255));
        txtname.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txttensach.setBackground(new java.awt.Color(51, 255, 255));
        txttensach.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtnamxuatban.setBackground(new java.awt.Color(51, 255, 255));
        txtnamxuatban.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtchubien.setBackground(new java.awt.Color(51, 255, 255));
        txtchubien.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtnhaxuatban.setBackground(new java.awt.Color(51, 255, 255));
        txtnhaxuatban.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtsl.setBackground(new java.awt.Color(51, 255, 255));
        txtsl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttensach, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtnamxuatban)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtname)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtchubien)
                    .addComponent(txtnhaxuatban)
                    .addComponent(txtsl, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtchubien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnamxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        jLabel10.setText("Thông tin");

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_icon-icons.com_74429 (1).png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(null);
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setMaximumSize(new java.awt.Dimension(70, 39));
        jButton1.setMinimumSize(new java.awt.Dimension(70, 39));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document_delete_256_icon-icons.com_75995.png"))); // NOI18N
        jButton2.setText("Xoá");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wrench_tools_configuration_setting_settings_icon_189322.png"))); // NOI18N
        jButton3.setText("Sữa");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/recyclebin_full_22796.png"))); // NOI18N
        jButton4.setText("Reset");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane2.setBackground(new java.awt.Color(51, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(51, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Năm xuất bản", "Chủ biên", "Nhà xuất bản", "Số lượng"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        table.getAccessibleContext().setAccessibleName("");

        btnsearch.setText("Tìm kiếm");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        txtsearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsearch)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        xoatrang();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtname.getText().equals("") || txttensach.getText().equals("") || txtnamxuatban.getText().equals("") || txtchubien.getText().equals("") || txtnhaxuatban.getText().equals("") || txtsl.getText().equals("")) {
            JOptionPane.showMessageDialog(frmTTsach, "Vui lòng nhập đủ thông tin!");
            return;
        }
        sachGiaoKhoa sgk = new sachGiaoKhoa();
        sgk.setMaSach(txtname.getText());
        sgk.setTenSach(txttensach.getText());
        sgk.setNamXuatBan(Integer.valueOf(txtnamxuatban.getText()));
        sgk.setTenChuBien(txtchubien.getText());
        sgk.setTenNXB(txtnhaxuatban.getText());
        sgk.setSoLuong(Integer.valueOf(txtsl.getText()));

        list.add(sgk);
        if (new sachGiaoKhoaDAO().insert2(sgk)) {
            JOptionPane.showMessageDialog(frmTTsach, "Add success! ");
            //list  = new sachGiaoKhoaDAO().getList();
            i = 1;
            loadArray();
            txtname.setText("");
            txttensach.setText("");
            txtnamxuatban.setText("");
            txtchubien.setText("");
            txtnhaxuatban.setText("");
            txtsl.setText("");
        } else {
            JOptionPane.showMessageDialog(frmTTsach, "ID trùng");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(frmTTsach, "Nhập mã sách cần xóa!");
            txtname.requestFocus();
        }
        sachGiaoKhoa sgk = new sachGiaoKhoa();
        sgk.setMaSach(txtname.getText());

        if (new sachGiaoKhoaDAO().delete2(sgk)) {
            JOptionPane.showMessageDialog(frmTTsach, "Xóa thành công! ");
            list = new sachGiaoKhoaDAO().getList();
            i = 1;
            loadArray();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//
//        if(list.size() == 0){
//             JOptionPane.showMessageDialog(frmTTsach, "Hãy nhập thêm sách rồi sửa!");
//        } else if (selectedIndex == -1){   //k có j để sửa
//            JOptionPane.showMessageDialog(frmTTsach, "Hãy chọn dòng trong bảng muốn sửa!");
//        } else {
//            
//         sachGiaoKhoaDAO sd = new sachGiaoKhoaDAO(); 
//         sachGiaoKhoa s = new sachGiaoKhoa();
//         s.setMaSach(list.get(selectedIndex).getMaSach());
//         s.setTenSach(txttensach.getText());
//         s.setNamXuatBan(Integer.valueOf(txtnamxuatban.getText()));
//         s.setTenChuBien(txtchubien.getText());
//         s.setTenNXB(txtnhaxuatban.getText());
//
////             txtname.setText(s.getMaSach());
////             txtname.setEditable(false);
////             txttensach.setText(s.getTenSach());
////             txtnamxuatban.setText(s.getNamXuatBan()+"");
////             txtchubien.setText(s.getTenChuBien());
////             txtnhaxuatban.setText(s.getTenNXB());
////             
//            if(sd.updata(s)>0){
//                JOptionPane.showMessageDialog(frmTTsach, "Sửa success! ");
//                xoatrang();
//            }
//             
//        }
        if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(frmTTsach, "Nhập mã sách! ");
            txtname.requestFocus();
            return;
        }
        try {
            Connection c = JDBCUtil.getConnection();
            String sql = "update sachGiaoKhoa set tenSach=?, namXB=?, tenChuBien=?, tenNXB=?, soLuong=? " + " where id=?";
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, txttensach.getText());
            ps.setInt(2, Integer.valueOf(txtnamxuatban.getText()));
            ps.setString(3, txtchubien.getText());
            ps.setString(4, txtnhaxuatban.getText());
            ps.setString(6, txtname.getText());
            ps.setInt(5, Integer.valueOf(txtsl.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(frmTTsach, "Success! ");
            c.close();
            list = new sachGiaoKhoaDAO().getList();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frmTTsach, "Error! ");
        }
        i = 1;
        loadArray();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        selectedIndex = table.getSelectedRow();
        if (selectedIndex >= 0) {
            txtname.setText(table.getValueAt(selectedIndex, 1) + "");
            txtname.setEditable(false);
//             txtname.setBackground(new java.awt.Color(204, 204, 204));
            txttensach.setText(table.getValueAt(selectedIndex, 2) + "");
            txtnamxuatban.setText(table.getValueAt(selectedIndex, 3) + "");
            txtchubien.setText(table.getValueAt(selectedIndex, 4) + "");
            txtnhaxuatban.setText(table.getValueAt(selectedIndex, 5) + "");
            txtsl.setText(table.getValueAt(selectedIndex, 6) + "");

        }

    }//GEN-LAST:event_tableMouseClicked

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        if (txtsearch.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập tên sách để tìm!");
            return;
        }
        int n = 0;
        ArrayList<sachGiaoKhoa> list2 = new sachGiaoKhoaDAO().getList();
        ArrayList<sachGiaoKhoa> list3 = new ArrayList<>();
        for (sachGiaoKhoa sgk : list2) {
            if (sgk.getTenSach().toUpperCase().contains(txtsearch.getText().toUpperCase().trim())) {
                list3.add(sgk);
                n++;
            }
        }
        if (n == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy!");
        }
        list.clear();
        list.addAll(list3);
        i = 1;
        loadArray();

    }//GEN-LAST:event_btnsearchActionPerformed

//	    public void showResult(){
//	       sachGiaoKhoa sgk = list.get(list.size()-1);
//	        model.addRow(new Object[]{
//	            i++, sgk.getMaSach(), sgk.getTenSach(), sgk.getNamXuatBan() ,sgk.getTenChuBien(), sgk.getTenNXB()
//	        });
//	    }
//            public void addSGK(sachGiaoKhoa s){
//                list.add(s);
//                showTable();
//            }
//            public void settingSGK(sachGiaoKhoa s){
//                list.remove(selectedIndex);
//                this.addSGK(s);
//            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtchubien;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnamxuatban;
    private javax.swing.JTextField txtnhaxuatban;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsl;
    private javax.swing.JTextField txttensach;
    // End of variables declaration//GEN-END:variables

}
