/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.KhuyenMai;
import Service.KhuyenMaiService;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class JPanelKhuyenMai extends javax.swing.JPanel {

    DefaultTableModel defaultTableModel;
    KhuyenMaiService khuyenMaiService = new KhuyenMaiService();

    public JPanelKhuyenMai() {
        initComponents();
        fillTable(khuyenMaiService.getListKhuyenMai());
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
        disableTextField((JTextComponent) txt_ngaytao.getDateEditor().getUiComponent());
        disableTextField((JTextComponent) txt_ngayhethan.getDateEditor().getUiComponent());
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdo_tatca = new javax.swing.JRadioButton();
        rdo_dangdienra = new javax.swing.JRadioButton();
        rdo_daketthuc = new javax.swing.JRadioButton();
        rdo_sapdienra = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khuyenmai = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_ma = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_dieukien = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_giatri = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_ngaytao = new com.toedter.calendar.JDateChooser();
        txt_ngayhethan = new com.toedter.calendar.JDateChooser();
        rdo_khong = new javax.swing.JRadioButton();
        rdo_co = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1070, 680));
        setPreferredSize(new java.awt.Dimension(1070, 680));

        jPanel1.setBackground(new java.awt.Color(147, 214, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          Khuyến Mãi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rdo_tatca);
        rdo_tatca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdo_tatca.setText("Tất cả");
        rdo_tatca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdo_tatcaMouseClicked(evt);
            }
        });
        jPanel2.add(rdo_tatca, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        buttonGroup1.add(rdo_dangdienra);
        rdo_dangdienra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdo_dangdienra.setText("Đang diễn ra");
        rdo_dangdienra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdo_dangdienraMouseClicked(evt);
            }
        });
        jPanel2.add(rdo_dangdienra, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 34, -1, -1));

        buttonGroup1.add(rdo_daketthuc);
        rdo_daketthuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdo_daketthuc.setText("Đã kết thúc");
        rdo_daketthuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdo_daketthucMouseClicked(evt);
            }
        });
        jPanel2.add(rdo_daketthuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 34, -1, -1));

        buttonGroup1.add(rdo_sapdienra);
        rdo_sapdienra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdo_sapdienra.setText("Sắp diễn ra");
        rdo_sapdienra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdo_sapdienraMouseClicked(evt);
            }
        });
        jPanel2.add(rdo_sapdienra, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 34, -1, -1));

        tbl_khuyenmai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã", "Điều kiện", "Giá Trị", "Ngày Tạo", "Ngày Hết Hạn", "Trạng Thái"
            }
        ));
        tbl_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khuyenmaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khuyenmai);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, 760, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã giảm giá");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        txt_ma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ma.setBorder(null);
        jPanel2.add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 150, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 150, 11));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Điều Kiện");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        txt_dieukien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dieukien.setBorder(null);
        jPanel2.add(txt_dieukien, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 130, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 130, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngày Tạo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Trạng Thái");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, -1));

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
        jPanel2.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 90, 33));

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
        jPanel2.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, 87, 33));

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
        jPanel2.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 87, 33));

        btn_moi.setBackground(new java.awt.Color(147, 214, 255));
        btn_moi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_moi.setForeground(new java.awt.Color(255, 255, 255));
        btn_moi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear20px.png"))); // NOI18N
        btn_moi.setText("Mới");
        btn_moi.setBorderPainted(false);
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_moi, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, 87, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ngày Hết Hạn");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Giá Trị");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        txt_giatri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_giatri.setBorder(null);
        jPanel2.add(txt_giatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 150, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 150, 10));

        txt_ngaytao.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txt_ngaytao, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 150, -1));

        txt_ngayhethan.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txt_ngayhethan, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 150, -1));

        buttonGroup2.add(rdo_khong);
        rdo_khong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_khong.setText("Không");
        jPanel2.add(rdo_khong, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, -1, -1));

        buttonGroup2.add(rdo_co);
        rdo_co.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdo_co.setSelected(true);
        rdo_co.setText("Có");
        jPanel2.add(rdo_co, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText(">=");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khuyenmaiMouseClicked
        btn_them.setEnabled(false);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);
        txt_ma.setEditable(false);
        int index = tbl_khuyenmai.getSelectedRow();
        txt_ma.setText(tbl_khuyenmai.getValueAt(index, 1).toString().trim());
        txt_giatri.setText(tbl_khuyenmai.getValueAt(index, 3).toString().trim());
        txt_dieukien.setText(tbl_khuyenmai.getValueAt(index, 2).toString().trim());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tbl_khuyenmai.getValueAt(index, 4).toString().trim());
            txt_ngaytao.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(JPanelNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tbl_khuyenmai.getValueAt(index, 5).toString().trim());
            txt_ngayhethan.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(JPanelNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_khuyenmaiMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (checkValidate()) {
            int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Thêm", JOptionPane.YES_NO_OPTION);

            if (cf == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, khuyenMaiService.insert(getFieldInsert()));
                fillTable(khuyenMaiService.getListKhuyenMai());
                clearForm();
            }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        if (checkValidateUpdate()) {
            int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Sửa", JOptionPane.YES_NO_OPTION);

            if (cf == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, khuyenMaiService.update(getFieldUpdate()));
                fillTable(khuyenMaiService.getListKhuyenMai());
                btn_them.setEnabled(true);
                btn_sua.setEnabled(false);
                btn_xoa.setEnabled(false);
                clearForm();
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if (txt_ma.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được trống");
            txt_ma.requestFocus();
            return;
        }
        int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xóa", JOptionPane.YES_NO_OPTION);

        if (cf == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, khuyenMaiService.delete(txt_ma.getText()));
            fillTable(khuyenMaiService.getListKhuyenMai());
            btn_them.setEnabled(true);
            btn_sua.setEnabled(false);
            btn_xoa.setEnabled(false);
            clearForm();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        clearForm();
    }//GEN-LAST:event_btn_moiActionPerformed

    private void rdo_tatcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdo_tatcaMouseClicked
        fillTable(khuyenMaiService.getListKhuyenMai());
    }//GEN-LAST:event_rdo_tatcaMouseClicked

    private void rdo_sapdienraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdo_sapdienraMouseClicked
        LocalDate localDate = LocalDate.now();
        fillTableFilter(khuyenMaiService.fiterByStartDate(localDate.toString()));
    }//GEN-LAST:event_rdo_sapdienraMouseClicked

    private void rdo_dangdienraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdo_dangdienraMouseClicked
        LocalDate localDate = LocalDate.now();
        fillTableFilter(khuyenMaiService.fiterByBetweenDate(localDate.toString()));
    }//GEN-LAST:event_rdo_dangdienraMouseClicked

    private void rdo_daketthucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdo_daketthucMouseClicked
        LocalDate localDate = LocalDate.now();
        fillTableFilter(khuyenMaiService.fiterByEndDate(localDate.toString()));
    }//GEN-LAST:event_rdo_daketthucMouseClicked

    private static void disableTextField(JTextComponent textComponent) {
        textComponent.setEditable(false);
        textComponent.setFocusable(false);
        textComponent.setBackground(null);
        textComponent.setBorder(null);
    }

    private void fillTable(List<KhuyenMai> list) {
        defaultTableModel = (DefaultTableModel) tbl_khuyenmai.getModel();
        defaultTableModel.setRowCount(0);
        for (KhuyenMai km : list) {
            String tt = km.getTrangThai() == 1 ? "Có hiệu lực" : "Không có hiệu lực";
            if (km.getTrangThai() != 2) {
                defaultTableModel.addRow(new Object[]{km.getId(), km.getMa(), km.getDieuKien(), km.getGiaTri(),
                    km.getNgayTao(), km.getNgayHetHan(), tt});
            }
        }
    }

    private void fillTableFilter(List<KhuyenMai> list) {
        defaultTableModel = (DefaultTableModel) tbl_khuyenmai.getModel();
        defaultTableModel.setRowCount(0);
        for (KhuyenMai km : list) {
            String tt = km.getTrangThai() == 1 ? "Có hiệu lực" : "Không có hiệu lực";
            if (km.getTrangThai() != 2 && km.getTrangThai() != 0) {
                defaultTableModel.addRow(new Object[]{km.getId(), km.getMa(), km.getDieuKien(), km.getGiaTri(),
                    km.getNgayTao(), km.getNgayHetHan(), tt});
            }
        }
    }

    private KhuyenMai getFieldInsert() {
        JDateChooser ngayTao = new JDateChooser();
        ngayTao.setDate(txt_ngaytao.getDate());
        Date selectedDate = ngayTao.getDate();

        JDateChooser ngayHetHan = new JDateChooser();
        ngayHetHan.setDate(txt_ngayhethan.getDate());
        Date selectedDate1 = ngayHetHan.getDate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        KhuyenMai km = new KhuyenMai();
        km.setMa(txt_ma.getText());
        km.setGiaTri(Integer.parseInt(txt_giatri.getText().trim()));
        km.setDieuKien(Integer.parseInt(txt_dieukien.getText().trim()));
        km.setNgayTao(dateFormat.format(selectedDate));
        km.setNgayHetHan(dateFormat.format(selectedDate1));
        if (rdo_co.isSelected()) {
            km.setTrangThai(1);
        } else {
            km.setTrangThai(0);
        }
        return km;
    }

    private KhuyenMai getFieldUpdate() {
        JDateChooser ngayTao = new JDateChooser();
        ngayTao.setDate(txt_ngaytao.getDate());
        Date selectedDate = ngayTao.getDate();

        JDateChooser ngayHetHan = new JDateChooser();
        ngayHetHan.setDate(txt_ngayhethan.getDate());
        Date selectedDate1 = ngayHetHan.getDate();

        LocalDate date = LocalDate.now();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        KhuyenMai km = new KhuyenMai();
        km.setMa(txt_ma.getText());
        km.setGiaTri(Integer.parseInt(txt_giatri.getText().trim()));
        km.setDieuKien(Integer.parseInt(txt_dieukien.getText().trim()));
        km.setNgayTao(dateFormat.format(selectedDate));
        km.setNgayHetHan(dateFormat.format(selectedDate1));
        km.setNgayNhap(date.format(DateTimeFormatter.ISO_DATE));
        if (rdo_co.isSelected()) {
            km.setTrangThai(1);
        } else {
            km.setTrangThai(0);
        }
        return km;
    }

    private boolean checkValidate() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher ma = p.matcher(txt_ma.getText());
        JDateChooser ngayTao = new JDateChooser();
        ngayTao.setDate(txt_ngaytao.getDate());
        Date selectedDate = ngayTao.getDate();

        JDateChooser ngayHetHan = new JDateChooser();
        ngayHetHan.setDate(txt_ngayhethan.getDate());
        Date selectedDate1 = ngayHetHan.getDate();

        if (txt_ma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được trống");
            txt_ma.requestFocus();
            return false;
        } else if (ma.find()) {
            JOptionPane.showMessageDialog(this, "Mã không được chứa ký tự đặc biệt");
            txt_ma.requestFocus();
            return false;
        }

        if (checkMa(txt_ma.getText()) == 1) {
            JOptionPane.showMessageDialog(this, "Mã khách hàng đã tồn tại");
            txt_ma.requestFocus();
            return false;
        }

        if (checkGiaTri(Integer.parseInt(txt_giatri.getText().trim())) == 1) {
            JOptionPane.showMessageDialog(this, "Giá trị đã tồn tại");
            txt_giatri.requestFocus();
            return false;
        }

        if (txt_dieukien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Điều kiện không được trống");
            txt_dieukien.requestFocus();
            return false;
        }

        try {
            int giaTri = Integer.parseInt(txt_dieukien.getText());
            if (giaTri <= 0) {
                JOptionPane.showMessageDialog(this, "Điều kiện phải lớn hơn 0");
                txt_dieukien.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điều kiện phải là số");
            txt_dieukien.requestFocus();
            return false;
        }

        if (txt_giatri.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá trị không được trống");
            txt_giatri.requestFocus();
            return false;
        }
        try {
            int giaTri = Integer.parseInt(txt_giatri.getText());
            if (giaTri <= 0) {
                JOptionPane.showMessageDialog(this, "Giá trị phải lớn hơn 0");
                txt_giatri.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị phải là số");
            txt_giatri.requestFocus();
            return false;
        }

        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được trống");
            txt_ngaytao.requestFocus();
            return false;
        }

        if (selectedDate1 == null) {
            JOptionPane.showMessageDialog(this, "Ngày hết hạn không được trống");
            txt_ngayhethan.requestFocus();
            return false;
        }
        return true;
    }

    private void clearForm() {
        txt_ngaytao.setDate(null);
        txt_ngayhethan.setDate(null);

        txt_ma.setText("");
        txt_dieukien.setText("");
        txt_giatri.setText("");
        btn_them.setEnabled(true);
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
        txt_ma.setEditable(true);
    }

    private boolean checkValidateUpdate() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher ma = p.matcher(txt_ma.getText());

        if (txt_ma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được trống");
            txt_ma.requestFocus();
            return false;
        } else if (ma.find()) {
            JOptionPane.showMessageDialog(this, "Mã không được chứa ký tự đặc biệt");
            txt_ma.requestFocus();
            return false;
        }

        if (txt_dieukien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Điều kiện không được trống");
            txt_dieukien.requestFocus();
            return false;
        }

        try {
            int giaTri = Integer.parseInt(txt_dieukien.getText());
            if (giaTri <= 0) {
                JOptionPane.showMessageDialog(this, "Điều kiện phải lớn hơn 0");
                txt_dieukien.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Điều kiện phải là số");
            txt_dieukien.requestFocus();
            return false;
        }

        if (txt_giatri.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá trị không được trống");
            txt_giatri.requestFocus();
            return false;
        }
        try {
            int giaTri = Integer.parseInt(txt_giatri.getText());
            if (giaTri <= 0) {
                JOptionPane.showMessageDialog(this, "Giá trị phải lớn hơn 0");
                txt_giatri.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị phải là số");
            txt_giatri.requestFocus();
            return false;
        }

        if (txt_ngaytao.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được trống");
            txt_ngaytao.requestFocus();
            return false;
        }

        if (txt_ngayhethan.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được trống");
            txt_ngayhethan.requestFocus();
            return false;
        }
        return true;
    }

    private int checkMa(String ma) {
        for (int i = 0; i < khuyenMaiService.getListKhuyenMai().size(); i++) {
            KhuyenMai get = khuyenMaiService.getListKhuyenMai().get(i);
            if (get.getMa().trim().equalsIgnoreCase(ma)) {
                return 1;
            }
        }
        return 2;
    }

    private int checkGiaTri(int giatri) {
        for (int i = 0; i < khuyenMaiService.getListKhuyenMai().size(); i++) {
            KhuyenMai get = khuyenMaiService.getListKhuyenMai().get(i);
            if (get.getGiaTri() == giatri) {
                return 1;
            }
        }
        return 2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton rdo_co;
    private javax.swing.JRadioButton rdo_daketthuc;
    private javax.swing.JRadioButton rdo_dangdienra;
    private javax.swing.JRadioButton rdo_khong;
    private javax.swing.JRadioButton rdo_sapdienra;
    private javax.swing.JRadioButton rdo_tatca;
    private javax.swing.JTable tbl_khuyenmai;
    private javax.swing.JTextField txt_dieukien;
    private javax.swing.JTextField txt_giatri;
    private javax.swing.JTextField txt_ma;
    private com.toedter.calendar.JDateChooser txt_ngayhethan;
    private com.toedter.calendar.JDateChooser txt_ngaytao;
    // End of variables declaration//GEN-END:variables
}
