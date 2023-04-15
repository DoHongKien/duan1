/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Vga;
import Service.VGAService;
import java.awt.Image;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quyen
 */
public class CRUDvga extends javax.swing.JFrame {

    VGAService vgaS = new VGAService();
    List<Vga> list = new ArrayList<>();

    public CRUDvga() {
        initComponents();
        setTitle("VGA");
        loadTBV();
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVGA = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rdo_con = new javax.swing.JRadioButton();
        rdo_het = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(750, 350));
        setPreferredSize(new java.awt.Dimension(750, 400));

        jPanel1.setName("Hãng"); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblVGA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã VGA", "Tên VGA", "Ngày Tạo", "Ngày Sửa", "Trạng Thái"
            }
        ));
        tblVGA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVGAMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVGA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 350));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Mã VGA");

        txt_ma.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tên VGA");

        txtTen.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(147, 214, 255));

        jSeparator2.setForeground(new java.awt.Color(147, 214, 255));

        btn_them.setBackground(new java.awt.Color(147, 214, 255));
        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add20px.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setBorderPainted(false);
        btn_them.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_them.setPreferredSize(new java.awt.Dimension(85, 25));
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setBackground(new java.awt.Color(147, 214, 255));
        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit20px.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.setBorderPainted(false);
        btn_sua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sua.setPreferredSize(new java.awt.Dimension(85, 35));
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(147, 214, 255));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete20px.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.setBorderPainted(false);
        btn_xoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_xoa.setMinimumSize(new java.awt.Dimension(85, 35));
        btn_xoa.setPreferredSize(new java.awt.Dimension(85, 35));
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_moi.setBackground(new java.awt.Color(147, 214, 255));
        btn_moi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_moi.setForeground(new java.awt.Color(255, 255, 255));
        btn_moi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear20px.png"))); // NOI18N
        btn_moi.setText("Mới");
        btn_moi.setBorderPainted(false);
        btn_moi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_moi.setMinimumSize(new java.awt.Dimension(85, 35));
        btn_moi.setPreferredSize(new java.awt.Dimension(85, 35));
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Trạng Thái");

        buttonGroup1.add(rdo_con);
        rdo_con.setSelected(true);
        rdo_con.setText("Còn");

        buttonGroup1.add(rdo_het);
        rdo_het.setText("Hết");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_ma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdo_con, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(rdo_het, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txt_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_con)
                    .addComponent(rdo_het))
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 290, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        updateV();
        btn_them.setEnabled(true);
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        if (txt_ma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã để xóa");
            return;
        }
        int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xóa", JOptionPane.YES_NO_OPTION);
        if (cf == JOptionPane.YES_OPTION) {
            deleteV();
            btn_them.setEnabled(true);
            btn_sua.setEnabled(false);
            btn_xoa.setEnabled(false);
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        txt_ma.setText("");
        txtTen.setText("");
        btn_them.setEnabled(true);
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
        txt_ma.setEditable(true);
    }//GEN-LAST:event_btn_moiActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        addV();
    }//GEN-LAST:event_btn_themActionPerformed

    private void tblVGAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVGAMouseClicked
        btn_them.setEnabled(false);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);
        txt_ma.setEditable(false);
        int a = tblVGA.getSelectedRow();

        txt_ma.setText(tblVGA.getValueAt(a, 1).toString());
        txtTen.setText(tblVGA.getValueAt(a, 2).toString());
        if (tblVGA.getValueAt(a, 5).equals(1)) {
            rdo_con.setSelected(true);
        } else {
            rdo_het.setSelected(true);
        }
    }//GEN-LAST:event_tblVGAMouseClicked

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
            java.util.logging.Logger.getLogger(CRUDvga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDvga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDvga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDvga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDvga().setVisible(true);
            }
        });
    }

    private void loadTBV() {
        list = vgaS.getListDB();
        DefaultTableModel mol = (DefaultTableModel) tblVGA.getModel();
        mol.setRowCount(0);
        for (Vga v : list) {
            mol.addRow(new Object[]{v.getId(), v.getMa(), v.getTen(), v.getNgayTao(), v.getNgayNhap(), v.getTrangThai()});
        }
        tblVGA.setModel(mol);
        if (tblVGA.getRowCount() > 0) {
            mouseClickTBV(0);
            tblVGA.setRowSelectionInterval(0, 0);
        }
    }

    private void addV() {
        LocalDate date = LocalDate.now();
        String ma = txt_ma.getText();
        String ten = txtTen.getText();
        int tt = rdo_con.isSelected() ? 1 : 0;

        Vga v = new Vga(0, ma, ten, date.format(DateTimeFormatter.ISO_DATE), date.format(DateTimeFormatter.ISO_DATE), tt);
        Vga vCheck = vgaS.getDB(ma);
        if (vCheck != null) {
            JOptionPane.showMessageDialog(this, "Mã Vga đã tồn tại");
        } else {
            boolean result = vgaS.create(v);
            if (result == true) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadTBV();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        }
    }

    private void updateV() {
        LocalDate date = LocalDate.now();
        int index = tblVGA.getSelectedRow();
        list = vgaS.getListDB();
        Vga v = list.get(index);
        String ma = txt_ma.getText();
        String ten = txtTen.getText();
        Vga vCheck = vgaS.getDB(ma);
        if (vCheck == null) {
            v = new Vga(v.getId(), ma, ten, date.format(DateTimeFormatter.ISO_DATE), v.getTrangThai());
            boolean result = vgaS.update(v);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            loadTBV();
        } else if (v.getMa().equals(ma)) {
            v = new Vga(v.getId(), ma, ten, date.format(DateTimeFormatter.ISO_DATE), v.getTrangThai());
            boolean result = vgaS.update(v);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            loadTBV();
        } else {
            JOptionPane.showMessageDialog(this, "Mã hãng đã tồn tại");
        }
    }

    private void deleteV() {
        int index = tblVGA.getSelectedRow();
        Vga v = list.get(index);
        boolean result = vgaS.delete(v);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTBV();
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }

    private void mouseClickTBV(int index) {
        list = vgaS.getListDB();
        Vga v = list.get(index);
        txt_ma.setText(v.getMa().trim());
        txtTen.setText(v.getTen().trim());
        if (v.getTrangThai() == 1) {
            rdo_con.setSelected(true);
            return;
        } else {
            rdo_het.setSelected(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rdo_con;
    private javax.swing.JRadioButton rdo_het;
    private javax.swing.JTable tblVGA;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txt_ma;
    // End of variables declaration//GEN-END:variables
}
