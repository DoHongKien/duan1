/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.NhanVien;
import Service.NhanVienService;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class JPanelNhanVien extends javax.swing.JPanel {
     NhanVienService nvS = new NhanVienService();
    List<NhanVien> list = new ArrayList<>();
    int index = 0;
    private static final Pattern DATE_PATTERN = Pattern.compile("^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$"
            + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
            + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
            + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");

    public JPanelNhanVien() {
        initComponents();
        loadTBV();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nhanvien = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btn_taikhoan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ma = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_ngaysinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_nu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdo_dilam = new javax.swing.JRadioButton();
        rdo_nghiviec = new javax.swing.JRadioButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_lammoi = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_diachi = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        txt_ngayTao = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        txt_ngayNhap = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1070, 680));
        setPreferredSize(new java.awt.Dimension(1070, 680));

        jPanel1.setBackground(new java.awt.Color(186, 79, 84));

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txt_timkiem.setBorder(null);
        txt_timkiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyPressed(evt);
            }
        });
        jPanel2.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 22));

        tbl_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã ", "Tên", "Ngày sinh", "Giới tính", "SDT", "Địa chỉ", "Trạng thái"
            }
        ));
        tbl_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_nhanvien);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 628, 329));

        jSeparator1.setForeground(new java.awt.Color(186, 79, 84));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 5));

        btn_taikhoan.setBackground(new java.awt.Color(186, 79, 84));
        btn_taikhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_taikhoan.setForeground(new java.awt.Color(255, 255, 255));
        btn_taikhoan.setText("Tài Khoản");
        btn_taikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taikhoanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, 30));

        jButton1.setBackground(new java.awt.Color(186, 79, 84));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(">>");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 50, 30));

        jButton2.setBackground(new java.awt.Color(186, 79, 84));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<<");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 50, 30));

        jButton3.setBackground(new java.awt.Color(186, 79, 84));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 40, 30));

        jButton4.setBackground(new java.awt.Color(186, 79, 84));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText(">");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 40, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        txt_ma.setBorder(null);
        jPanel3.add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 20));

        txt_ten.setBorder(null);
        jPanel3.add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txt_ngaysinh.setBorder(null);
        jPanel3.add(txt_ngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Giới tính");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        buttonGroup1.add(rdo_nam);
        rdo_nam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_nam.setSelected(true);
        rdo_nam.setText("Nam");
        jPanel3.add(rdo_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        buttonGroup1.add(rdo_nu);
        rdo_nu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_nu.setText("Nữ");
        jPanel3.add(rdo_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("SDT");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txt_sdt.setBorder(null);
        jPanel3.add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Địa chỉ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Trạng thái");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        buttonGroup2.add(rdo_dilam);
        rdo_dilam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_dilam.setSelected(true);
        rdo_dilam.setText("Đi làm");
        jPanel3.add(rdo_dilam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        buttonGroup2.add(rdo_nghiviec);
        rdo_nghiviec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_nghiviec.setText("Nghỉ việc");
        jPanel3.add(rdo_nghiviec, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        btn_them.setBackground(new java.awt.Color(186, 79, 84));
        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        jPanel3.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 100, 32));

        btn_sua.setBackground(new java.awt.Color(186, 79, 84));
        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 87, 32));

        btn_xoa.setBackground(new java.awt.Color(186, 79, 84));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 87, 32));

        btn_lammoi.setBackground(new java.awt.Color(186, 79, 84));
        btn_lammoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_lammoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_lammoi.setText("Mới");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });
        jPanel3.add(btn_lammoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 87, 32));

        jSeparator2.setForeground(new java.awt.Color(186, 79, 84));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 10));

        jSeparator3.setForeground(new java.awt.Color(186, 79, 84));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, 10));

        jSeparator4.setForeground(new java.awt.Color(186, 79, 84));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 10));

        jSeparator5.setForeground(new java.awt.Color(186, 79, 84));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, 10));

        txt_diachi.setColumns(20);
        txt_diachi.setRows(5);
        jScrollPane2.setViewportView(txt_diachi);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, 70));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Ngày Tạo");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txt_ngayTao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ngayTao.setBorder(null);
        jPanel3.add(txt_ngayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 174, -1));

        jSeparator6.setForeground(new java.awt.Color(186, 79, 84));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 174, 10));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Ngày Nhập");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        txt_ngayNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ngayNhap.setBorder(null);
        jPanel3.add(txt_ngayNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 174, -1));

        jSeparator7.setForeground(new java.awt.Color(186, 79, 84));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 174, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        addNV();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        updateKH();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
      if (txt_ma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã để xóa");
            return;
        }
        int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (cf == JOptionPane.YES_OPTION) {
            deleteKH();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
      txt_ma.setText("");
        txt_ten.setText("");
        txt_ngaysinh.setText("");
        txt_sdt.setText("");
        txt_diachi.setText("");
        rdo_nam.setSelected(true);
        rdo_dilam.setSelected(true);
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void tbl_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nhanvienMouseClicked
        int a = tbl_nhanvien.getSelectedRow();

        txt_ma.setText(tbl_nhanvien.getValueAt(a, 1).toString());
        txt_ten.setText(tbl_nhanvien.getValueAt(a, 2).toString());
        txt_ngaysinh.setText(tbl_nhanvien.getValueAt(a, 3).toString());
        txt_sdt.setText(tbl_nhanvien.getValueAt(a, 5).toString());
        txt_diachi.setText(tbl_nhanvien.getValueAt(a, 6).toString());
        if (tbl_nhanvien.getValueAt(a, 4).toString().equalsIgnoreCase("Nam")) {
            rdo_nam.setSelected(true);
        } else {
            rdo_nu.setSelected(true);
        }

        if (tbl_nhanvien.getValueAt(a, 7).toString().equalsIgnoreCase("Đi làm")) {
            rdo_dilam.setSelected(true);
        } else {
            rdo_nghiviec.setSelected(false);
        }
    }//GEN-LAST:event_tbl_nhanvienMouseClicked

    private void txt_timkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (txt_timkiem.getText().isEmpty()) {
//                fillTable(nhanVienService.getListNV());
//            }
//            fillTable(nhanVienService.getListNVByMa(txt_timkiem.getText()));
//        }
    }//GEN-LAST:event_txt_timkiemKeyPressed

    private void btn_taikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taikhoanActionPerformed
        int index1 = tbl_nhanvien.getSelectedRow();
        if (index1 < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 nhân viên để vào trang tài khoản");
            return;
        }
        DoiMatKhau doiMatKhau = new DoiMatKhau(tbl_nhanvien.getValueAt(index1, 1).toString());
        doiMatKhau.setVisible(true);
    }//GEN-LAST:event_btn_taikhoanActionPerformed

private void loadTBV() {
        list = nvS.getListDb();
        DefaultTableModel mol = (DefaultTableModel) tbl_nhanvien.getModel();
        mol.setRowCount(0);
        for (NhanVien nv : list) {
            mol.addRow(new Object[]{nv.getId(), nv.getMa(), nv.getTen(), nv.getNgaySinh(),
                nv.getGioiTinh(), nv.getSdt(), nv.getDiaChi(),
                nv.getTrangThai()});
        }
        tbl_nhanvien.setModel(mol);
        if (tbl_nhanvien.getRowCount() > 0) {
            mouseClickTBV(0);
            tbl_nhanvien.setRowSelectionInterval(0, 0);
        }
    }

    private void addNV() {
        String ma = txt_ma.getText().trim();
        String ten = txt_ten.getText().trim();
        String ngaySinh = txt_ngaysinh.getText().trim();
        String gt;
        if (rdo_nam.isSelected()) {
            gt = "nam";
        } else {
            gt = "nữ";
        }
        String ngayTao = txt_ngayTao.getText().trim();
        String ngaySua = txt_ngayNhap.getText().trim();
        String sdt = txt_sdt.getText().trim();
        String diaChi = txt_diachi.getText().trim();
        int tt;
        if (rdo_dilam.isSelected()) {
            tt = 1;
        } else {
            tt = 0;
        }
        NhanVien nv = new NhanVien(0,ma, ten, ngaySinh, gt, sdt, diaChi, ngayTao, ngaySua, tt);
            boolean result = nvS.create(nv);
            if (result == true) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadTBV();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        
    }

    private void updateKH() {
        int index = tbl_nhanvien.getSelectedRow();
        list = nvS.getListDb();
        NhanVien nv = list.get(index);
        String ma = txt_ma.getText();
        String ten = txt_ten.getText();
        String ngaySinh = txt_ngaysinh.getText();
        String gt;
        if (rdo_nam.isSelected() == true) {
            gt = "nam";
        } else {
            gt = "nữ";
        }
        String ngayTao = txt_ngayTao.getText().trim();
        String ngaySua = txt_ngayNhap.getText().trim();
        String sdt = txt_sdt.getText();
        String diaChi = txt_diachi.getText();
        NhanVien vCheck = nvS.getDB(ma);
        if (vCheck == null) {
            nv = new NhanVien(nv.getId(), ma, ten, ngaySinh, gt, sdt, diaChi, ngayTao, ngaySua, nv.getTrangThai());
            boolean result = nvS.update(nv);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            loadTBV();
        } else if (nv.getMa().equals(ma)) {
            nv = new NhanVien(nv.getId(), ma, ten, ngaySinh, gt, sdt, diaChi, ngayTao, ngaySua, nv.getTrangThai());
            boolean result = nvS.update(nv);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            loadTBV();
        } else {
            JOptionPane.showMessageDialog(this, "Không thể sửa mã nhân viên");
        }
    }

    private void deleteKH() {
        int index = tbl_nhanvien.getSelectedRow();
        NhanVien nv = list.get(index);
        boolean result = nvS.delete(nv);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTBV();
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }

    private void mouseClickTBV(int index) {
        list = nvS.getListDb();
        NhanVien nv = list.get(index);
        txt_ma.setText(nv.getMa());
        txt_ten.setText(nv.getTen());
        txt_ngaysinh.setText(nv.getNgaySinh());
        txt_sdt.setText(nv.getSdt());
        txt_diachi.setText(nv.getDiaChi());
        txt_ngayTao.setText(nv.getNgayTao());
        txt_ngayNhap.setText(nv.getNgayNhap());
        if (nv.getGioiTinh().equalsIgnoreCase("Nam")) {
            rdo_nam.setSelected(true);
            return;
        } else {
            rdo_nu.setSelected(true);
        }
        if (nv.getTrangThai() == 1) {
            rdo_dilam.setSelected(true);
        } else {
            rdo_nghiviec.setSelected(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_taikhoan;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JRadioButton rdo_dilam;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JRadioButton rdo_nghiviec;
    private javax.swing.JRadioButton rdo_nu;
    private javax.swing.JTable tbl_nhanvien;
    private javax.swing.JTextArea txt_diachi;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_ngayNhap;
    private javax.swing.JTextField txt_ngayTao;
    private javax.swing.JTextField txt_ngaysinh;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
