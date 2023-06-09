/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.NhanVien;
import Service.NhanVienService;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author admin
 */
public class JPanelNhanVien extends javax.swing.JPanel {

    NhanVienService nvS = new NhanVienService();

    public JPanelNhanVien() {
        initComponents();
        loadTBV(nvS.getListDb());
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
        disableTextField((JTextComponent) txt_ngaysinh.getDateEditor().getUiComponent());
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nhanvien = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btn_taikhoan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_ma = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_nu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rdo_dilam = new javax.swing.JRadioButton();
        rdo_nghiviec = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txt_matkhau = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_diachi = new javax.swing.JTextArea();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_lammoi = new javax.swing.JButton();
        txt_ngaysinh = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        rdo_admin = new javax.swing.JRadioButton();
        rdo_staff = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1070, 680));
        setPreferredSize(new java.awt.Dimension(1070, 680));

        jPanel1.setBackground(new java.awt.Color(147, 214, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("          Nhân Viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tìm kiếm");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        txt_timkiem.setBorder(null);
        txt_timkiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyPressed(evt);
            }
        });
        jPanel2.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 180, 22));

        tbl_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã ", "Tên", "Ngày sinh", "Giới tính", "SDT", "Địa chỉ", "Mật Khẩu", "Ngày Tạo", "Ngày Sửa", "Chức Vụ", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_nhanvien);
        if (tbl_nhanvien.getColumnModel().getColumnCount() > 0) {
            tbl_nhanvien.getColumnModel().getColumn(0).setMinWidth(40);
            tbl_nhanvien.getColumnModel().getColumn(0).setMaxWidth(40);
            tbl_nhanvien.getColumnModel().getColumn(2).setMinWidth(100);
            tbl_nhanvien.getColumnModel().getColumn(2).setMaxWidth(200);
            tbl_nhanvien.getColumnModel().getColumn(3).setMinWidth(90);
            tbl_nhanvien.getColumnModel().getColumn(3).setMaxWidth(90);
            tbl_nhanvien.getColumnModel().getColumn(4).setMinWidth(60);
            tbl_nhanvien.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1060, 220));

        jSeparator1.setBackground(new java.awt.Color(147, 214, 255));
        jSeparator1.setForeground(new java.awt.Color(147, 214, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 180, -1));

        btn_taikhoan.setBackground(new java.awt.Color(147, 214, 255));
        btn_taikhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_taikhoan.setForeground(new java.awt.Color(255, 255, 255));
        btn_taikhoan.setText("Tài Khoản");
        btn_taikhoan.setBorderPainted(false);
        btn_taikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taikhoanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txt_ma.setBorder(null);
        jPanel2.add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 20));

        jSeparator2.setBackground(new java.awt.Color(147, 214, 255));
        jSeparator2.setForeground(new java.awt.Color(147, 214, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        txt_ten.setBorder(null);
        jPanel2.add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 160, 20));

        jSeparator3.setBackground(new java.awt.Color(147, 214, 255));
        jSeparator3.setForeground(new java.awt.Color(147, 214, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 160, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Giới tính");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        buttonGroup1.add(rdo_nam);
        rdo_nam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_nam.setSelected(true);
        rdo_nam.setText("Nam");
        jPanel2.add(rdo_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        buttonGroup1.add(rdo_nu);
        rdo_nu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_nu.setText("Nữ");
        jPanel2.add(rdo_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Chức vụ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        buttonGroup2.add(rdo_dilam);
        rdo_dilam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_dilam.setSelected(true);
        rdo_dilam.setText("Đi làm");
        jPanel2.add(rdo_dilam, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        buttonGroup2.add(rdo_nghiviec);
        rdo_nghiviec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_nghiviec.setText("Nghỉ việc");
        jPanel2.add(rdo_nghiviec, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("SDT");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        txt_sdt.setBorder(null);
        jPanel2.add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, 20));

        jSeparator5.setBackground(new java.awt.Color(147, 214, 255));
        jSeparator5.setForeground(new java.awt.Color(147, 214, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Mật Khẩu");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txt_matkhau.setBorder(null);
        jPanel2.add(txt_matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 20));

        jSeparator8.setBackground(new java.awt.Color(147, 214, 255));
        jSeparator8.setForeground(new java.awt.Color(147, 214, 255));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Địa chỉ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        txt_diachi.setColumns(20);
        txt_diachi.setRows(5);
        jScrollPane2.setViewportView(txt_diachi);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, 70));

        btn_them.setBackground(new java.awt.Color(147, 214, 255));
        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add20px.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setBorderPainted(false);
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        jPanel2.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, 33));

        btn_sua.setBackground(new java.awt.Color(147, 214, 255));
        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit20px.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.setBorderPainted(false);
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 80, 33));

        btn_xoa.setBackground(new java.awt.Color(147, 214, 255));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete20px.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.setBorderPainted(false);
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 80, 33));

        btn_lammoi.setBackground(new java.awt.Color(147, 214, 255));
        btn_lammoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_lammoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_lammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear20px.png"))); // NOI18N
        btn_lammoi.setText("Mới");
        btn_lammoi.setBorderPainted(false);
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_lammoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 80, 33));

        txt_ngaysinh.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txt_ngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Trạng thái");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        buttonGroup3.add(rdo_admin);
        rdo_admin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_admin.setSelected(true);
        rdo_admin.setText("admin");
        jPanel2.add(rdo_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        buttonGroup3.add(rdo_staff);
        rdo_staff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_staff.setText("staff");
        jPanel2.add(rdo_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (checkValidateInsert()) {
            addNV();
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (checkValidateUpdate()) {
            updateKH();
            btn_them.setEnabled(true);
            btn_sua.setEnabled(false);
            btn_xoa.setEnabled(false);
            txt_matkhau.setEditable(true);
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if (txt_ma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã để xóa");
            return;
        }
        int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (cf == JOptionPane.YES_OPTION) {
            deleteKH();
            btn_them.setEnabled(true);
            btn_sua.setEnabled(false);
            btn_xoa.setEnabled(false);
            txt_matkhau.setEditable(true);
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void tbl_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nhanvienMouseClicked
        btn_them.setEnabled(false);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);
        txt_ma.setEditable(false);
        txt_matkhau.setEditable(false);
        int a = tbl_nhanvien.getSelectedRow();

        txt_ma.setText(tbl_nhanvien.getValueAt(a, 1).toString().trim());
        txt_ten.setText(tbl_nhanvien.getValueAt(a, 2).toString().trim());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tbl_nhanvien.getValueAt(a, 3).toString());
            txt_ngaysinh.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(JPanelNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        txt_sdt.setText(tbl_nhanvien.getValueAt(a, 5).toString().trim());
        txt_diachi.setText(tbl_nhanvien.getValueAt(a, 6).toString().trim());
        if (tbl_nhanvien.getValueAt(a, 4).toString().equalsIgnoreCase("Nam")) {
            rdo_nam.setSelected(true);
        } else {
            rdo_nu.setSelected(true);
        }

        if (tbl_nhanvien.getValueAt(a, 10).toString().equalsIgnoreCase("Admin")) {
            rdo_admin.setSelected(true);
        } else {
            rdo_staff.setSelected(true);
        }

        if (tbl_nhanvien.getValueAt(a, 11).toString().equalsIgnoreCase("Đi làm")) {
            rdo_dilam.setSelected(true);
        } else {
            rdo_nghiviec.setSelected(true);
        }
        txt_matkhau.setText(tbl_nhanvien.getValueAt(a, 7).toString());
    }//GEN-LAST:event_tbl_nhanvienMouseClicked

    private void txt_timkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_timkiem.getText().isEmpty()) {
                loadTBV(nvS.getListDb());
            }
            loadTBV(nvS.getNhanVienByName(txt_timkiem.getText().trim()));
        }
    }//GEN-LAST:event_txt_timkiemKeyPressed

    private void btn_taikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taikhoanActionPerformed
        int index1 = tbl_nhanvien.getSelectedRow();
        if (index1 < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 nhân viên để vào trang tài khoản");
            return;
        }
        DoiMatKhau doiMatKhau = new DoiMatKhau(tbl_nhanvien.getValueAt(index1, 1).toString().trim());
        doiMatKhau.setVisible(true);
    }//GEN-LAST:event_btn_taikhoanActionPerformed

    private static void disableTextField(JTextComponent textComponent) {
        textComponent.setEditable(false);
        textComponent.setFocusable(false);
        textComponent.setBackground(null);
        textComponent.setBorder(null);
    }

    private void loadTBV(List<NhanVien> list) {
        DefaultTableModel mol = (DefaultTableModel) tbl_nhanvien.getModel();
        mol.setRowCount(0);
        for (NhanVien nv : list) {
            String tt = nv.getTrangThai() == 1 ? "Đi làm" : "Nghỉ việc";
            String role = nv.getIdChucVu() == 2 ? "Admin" : "Staff";
            mol.addRow(new Object[]{nv.getId(), nv.getMa(), nv.getTen(), nv.getNgaySinh(),
                nv.getGioiTinh(), nv.getSdt(), nv.getDiaChi(), nv.getMatKhau(), nv.getNgayTao(), nv.getNgayNhap(), role, tt});
        }
    }

    private void addNV() {
        LocalDate date = LocalDate.now();
        JDateChooser ngaySinh = new JDateChooser();
        String ma = txt_ma.getText().trim();
        String ten = txt_ten.getText().trim();
        ngaySinh.setDate(txt_ngaysinh.getDate());
        Date selectedDate = ngaySinh.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String gt;
        if (rdo_nam.isSelected()) {
            gt = "Nam";
        } else {
            gt = "Nữ";
        }

        String sdt = txt_sdt.getText().trim();
        String diaChi = txt_diachi.getText().trim();
        String matKhau = txt_matkhau.getText().trim();
        int tt;
        if (rdo_dilam.isSelected()) {
            tt = 1;
        } else {
            tt = 0;
        }

        int role;
        if (rdo_admin.isSelected()) {
            role = 2;
        } else {
            role = 3;
        }
        NhanVien nv = new NhanVien(ma, ten, dateFormat.format(selectedDate), gt, sdt, diaChi, matKhau, date.format(DateTimeFormatter.ISO_DATE), date.format(DateTimeFormatter.ISO_DATE), tt, role);
        int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Thêm", JOptionPane.YES_NO_OPTION);

        if (cf == JOptionPane.YES_OPTION) {
            boolean result = nvS.create(nv);
            if (result) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadTBV(nvS.getListDb());
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        }
    }

    private void updateKH() {
        LocalDate date = LocalDate.now();
        JDateChooser ngaySinh = new JDateChooser();
        String ma = txt_ma.getText().trim();
        String ten = txt_ten.getText().trim();
        ngaySinh.setDate(txt_ngaysinh.getDate());
        Date selectedDate = ngaySinh.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String gt;
        if (rdo_nam.isSelected()) {
            gt = "Nam";
        } else {
            gt = "Nữ";
        }

        String sdt = txt_sdt.getText().trim();
        String diaChi = txt_diachi.getText().trim();
        String matKhau = txt_matkhau.getText().trim();
        int tt;
        if (rdo_dilam.isSelected()) {
            tt = 1;
        } else {
            tt = 0;
        }

        int role;
        if (rdo_admin.isSelected()) {
            role = 2;
        } else {
            role = 3;
        }
        NhanVien nv = new NhanVien(ma, ten, dateFormat.format(selectedDate), gt, sdt, diaChi, matKhau, date.format(DateTimeFormatter.ISO_DATE), tt, role);
        int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Sửa", JOptionPane.YES_NO_OPTION);

        if (cf == JOptionPane.YES_OPTION) {
            boolean result = nvS.update(nv);
            if (result) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                loadTBV(nvS.getListDb());
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
        }
    }

    private void deleteKH() {
        String ma = txt_ma.getText().trim();
        NhanVien nv = new NhanVien();
        nv.setMa(ma);
        boolean result = nvS.delete(nv);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTBV(nvS.getListDb());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }
    
    private void clearForm() {
        btn_them.setEnabled(true);
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
        txt_ma.setEditable(true);
        txt_matkhau.setEditable(true);
        txt_ma.setText("");
        txt_ten.setText("");
        txt_ngaysinh.setDate(null);
        txt_sdt.setText("");
        txt_diachi.setText("");
        txt_matkhau.setText("");
        rdo_nam.setSelected(true);
        rdo_dilam.setSelected(true);
    }

    private boolean checkValidateInsert() {
        Pattern p = Pattern.compile("[^a-z0-9\\\\s]", Pattern.CASE_INSENSITIVE);
        Pattern p1 = Pattern.compile(".*[!@#$%^&*(),.?\\\":{}|<>].*", Pattern.CASE_INSENSITIVE);
        Matcher ma = p.matcher(txt_ma.getText());
        Matcher ten = p1.matcher(txt_ten.getText());
        Matcher matkhau = p.matcher(txt_matkhau.getText());

        JDateChooser ngayTao = new JDateChooser();
        ngayTao.setDate(txt_ngaysinh.getDate());
        Date selectedDate = ngayTao.getDate();

        if (txt_ma.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được trống");
            txt_ma.requestFocus();
            return false;
        } else if (ma.find()) {
            JOptionPane.showMessageDialog(this, "Mã không được chứa ký tự đặc biệt");
            txt_ma.requestFocus();
            return false;
        }

        if (checkMa(txt_ma.getText().trim()) == 1) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại");
            txt_ma.requestFocus();
            return false;
        }

        if (txt_ten.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không được trống");
            txt_ten.requestFocus();
            return false;
        } else if (ten.find()) {
            JOptionPane.showMessageDialog(this, "Tên không được chứa ký tự đặc biệt");
            txt_ten.requestFocus();
            return false;
        }

        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được trống");
            txt_ngaysinh.requestFocus();
            return false;
        }

        if (txt_sdt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được trống");
            txt_sdt.requestFocus();
            return false;
        } else if (!txt_sdt.getText().trim().matches("0[0-9]{9}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
            txt_sdt.requestFocus();
            return false;
        }

        if (txt_matkhau.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được trống");
            txt_matkhau.requestFocus();
            return false;
        } else if (matkhau.find()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được chứa ký tự đặc biệt");
            txt_matkhau.requestFocus();
            return false;
        }

        if (txt_diachi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được trống");
            txt_diachi.requestFocus();
            return false;
        }
        return true;
    }

    private boolean checkValidateUpdate() {
        Pattern p = Pattern.compile(".*[!@#$%^&*(),.?\\\":{}|<>].*", Pattern.CASE_INSENSITIVE);
        Matcher ten = p.matcher(txt_ten.getText());
        Matcher matkhau = p.matcher(txt_matkhau.getText());

        JDateChooser ngayTao = new JDateChooser();
        ngayTao.setDate(txt_ngaysinh.getDate());
        Date selectedDate = ngayTao.getDate();

        if (txt_ten.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không được trống");
            txt_ten.requestFocus();
            return false;
        } else if (ten.find()) {
            JOptionPane.showMessageDialog(this, "Tên không được chứa ký tự đặc biệt");
            txt_ten.requestFocus();
            return false;
        }

        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được trống");
            txt_ngaysinh.requestFocus();
            return false;
        }

        if (txt_sdt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được trống");
            txt_sdt.requestFocus();
            return false;
        } else if (!txt_sdt.getText().trim().matches("0[0-9]{9}")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
            txt_sdt.requestFocus();
            return false;
        }

        if (txt_matkhau.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được trống");
            txt_matkhau.requestFocus();
            return false;
        } else if (matkhau.find()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được chứa ký tự đặc biệt");
            txt_matkhau.requestFocus();
            return false;
        }

        if (txt_diachi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được trống");
            txt_diachi.requestFocus();
            return false;
        }
        return true;
    }

    private int checkMa(String ma) {
        for (NhanVien nv : nvS.getListDb()) {
            if (nv.getMa().trim().equalsIgnoreCase(ma)) {
                return 1;
            }
        }
        return 2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_taikhoan;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton rdo_admin;
    private javax.swing.JRadioButton rdo_dilam;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JRadioButton rdo_nghiviec;
    private javax.swing.JRadioButton rdo_nu;
    private javax.swing.JRadioButton rdo_staff;
    private javax.swing.JTable tbl_nhanvien;
    private javax.swing.JTextArea txt_diachi;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_matkhau;
    private com.toedter.calendar.JDateChooser txt_ngaysinh;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
