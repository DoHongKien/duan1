package View;

import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
//import com.lowagie.text.Document;
//import com.lowagie.text.DocumentException;
//import com.lowagie.text.Phrase;
//import com.lowagie.text.pdf.PdfPCell;
//import com.lowagie.text.pdf.PdfPTable;
//import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
//import service.HoaDonChiTietService;
//import viewmodel.QLHoaDon;
//import viewmodel.QLHoaDonChiTiet;

/**
 *
 * @author admin
 */
public class JPanelHoaDon extends javax.swing.JPanel {

//    DefaultTableModel defaultTableModelHoaDon;
//    DefaultTableModel defaultTableModelSanPham;
//    HoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietService();
//    List<QLHoaDonChiTiet> listSanPham = new ArrayList<>();
    private static final Pattern DATE_PATTERN = Pattern.compile("^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$"
            + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
            + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
            + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");

    public JPanelHoaDon() {
        initComponents();
        String[] tt = {"Tất cả", "Đã thanh toán", "Chưa thanh toán"};
        String[] date = {"Ngày Tạo", "Ngày Thanh Toán"};
        for (String tt1 : tt) {
            cbo_trangthai.addItem(tt1);
        }
        for (String date1 : date) {
            cbo_date.addItem(date1);
        }
//        fillTable(hoaDonChiTietService.getListHoaDon());
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbo_trangthai = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hoadon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cbo_date = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_startdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_enddate = new javax.swing.JTextField();
        btn_inhoadon = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1070, 680));
        setPreferredSize(new java.awt.Dimension(1070, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(147, 214, 255));

        jLabel1.setBackground(new java.awt.Color(147, 214, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          Hóa Đơn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tìm Kiếm");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, -1, -1));

        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyPressed(evt);
            }
        });
        jPanel2.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 35, 162, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Trạng Thái");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 6, -1, -1));

        cbo_trangthai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_trangthaiItemStateChanged(evt);
            }
        });
        jPanel2.add(cbo_trangthai, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 35, 158, -1));

        tbl_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Tên NV", "Tên KH", "Sđt", "Ngày tạo", "Ngày thanh toán", "Tổng tiền", "Trạng Thái"
            }
        ));
        tbl_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hoadon);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 77, 1025, 220));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sản Phẩm");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 315, -1, -1));

        tbl_sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Giá bán", "Khuyến mãi (%)", "Số lượng", "Đơn giá"
            }
        ));
        jScrollPane2.setViewportView(tbl_sanpham);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 341, 1025, 157));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ngày");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 6, -1, -1));

        cbo_date.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_dateItemStateChanged(evt);
            }
        });
        jPanel2.add(cbo_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 35, 127, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Từ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 35, -1, -1));
        jPanel2.add(txt_startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 35, 116, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Đến");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 35, -1, -1));

        txt_enddate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_enddateKeyPressed(evt);
            }
        });
        jPanel2.add(txt_enddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 35, 116, -1));

        btn_inhoadon.setBackground(new java.awt.Color(147, 214, 255));
        btn_inhoadon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inhoadon.setForeground(new java.awt.Color(255, 255, 255));
        btn_inhoadon.setText("In hóa đơn");
        btn_inhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inhoadonActionPerformed(evt);
            }
        });
        jPanel2.add(btn_inhoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 533, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 1070, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hoadonMouseClicked
//        try {
//            int index = tbl_hoadon.getSelectedRow();
//            listSanPham = hoaDonChiTietService.getListHoaDonChiTiet(tbl_hoadon.getValueAt(index, 0).toString());
//            fillSanPham(listSanPham);
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_tbl_hoadonMouseClicked

    private void btn_inhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inhoadonActionPerformed
//        int index = tbl_hoadon.getSelectedRow();
//        if (index < 0) {
//            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn để in");
//            return;
//        }
//
//        String path = "";
//        JFileChooser chooser = new JFileChooser("D:\\");
//        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int x = chooser.showSaveDialog(this);
//
//        if (x == JFileChooser.APPROVE_OPTION) {
//            path = chooser.getSelectedFile().getPath();
//        }
//
//        Document doc = new Document();
//
//        try {
//            PdfWriter.getInstance(doc, new FileOutputStream(path + "hoadonchitiet.pdf"));
//            doc.open();
//
//            String ma = tbl_hoadon.getValueAt(index, 0).toString();
//            String tenKH = tbl_hoadon.getValueAt(index, 2).toString();
//            String ngayTao = tbl_hoadon.getValueAt(index, 4).toString();
//            String ngayThanhToan = tbl_hoadon.getValueAt(index, 5).toString();
//            double tongTien = Double.parseDouble(tbl_hoadon.getValueAt(index, 6).toString());
//
//            PdfPTable tbl3 = new PdfPTable(3);
//            PdfPTable tblTenCuaHang = new PdfPTable(1);
//            PdfPTable tblLoiCamOn = new PdfPTable(1);
//            PdfPTable tblDanhSach = new PdfPTable(2);
//            PdfPTable tblTongTien = new PdfPTable(2);
//
//            for (int i = 0; i < tbl_sanpham.getRowCount(); i++) {
//                String tenSP = tbl_sanpham.getValueAt(i, 0).toString();
//                String soLuong = tbl_sanpham.getValueAt(i, 3).toString();
//                String donGia = tbl_sanpham.getValueAt(i, 4).toString();
//                PdfPCell cellTenSP = new PdfPCell(new Phrase(tenSP));
//                PdfPCell cellDonGia = new PdfPCell(new Phrase(donGia));
//                PdfPCell cellSoLuong = new PdfPCell(new Phrase("SL: " + soLuong));
//                cellTenSP.setBorderColor(Color.WHITE);
//                cellDonGia.setBorderColor(Color.WHITE);
//                cellSoLuong.setBorderColor(Color.WHITE);
//                cellTenSP.setPaddingLeft(30);
//                cellTenSP.setPaddingBottom(10);
//                cellDonGia.setPaddingLeft(72);
//                cellDonGia.setPaddingBottom(10);
//                cellSoLuong.setPaddingLeft(10);
//                cellSoLuong.setPaddingBottom(10);
//                tbl3.addCell(cellTenSP);
//                tbl3.addCell(cellDonGia);
//                tbl3.addCell(cellSoLuong);
//            }
//
//            PdfPCell cellTitle = new PdfPCell(new Phrase("SEVENT STORE"));
//            PdfPCell cellEnd = new PdfPCell(new Phrase("CAM ON QUY KHACH"));
//            PdfPCell cellLater = new PdfPCell(new Phrase("HEN GAP LAI!"));
//            cellTitle.setBorderColor(Color.WHITE);
//            cellEnd.setBorderColor(Color.WHITE);
//            cellLater.setBorderColor(Color.WHITE);
//            cellTitle.setPaddingBottom(50);
//            cellTitle.setPaddingLeft(130);
//            tblTenCuaHang.addCell(cellTitle);
//            cellEnd.setPaddingTop(50);
//            cellEnd.setPaddingLeft(100);
//            cellLater.setPaddingTop(10);
//            cellLater.setPaddingLeft(120);
//
//            PdfPCell cellMa = new PdfPCell(new Phrase("Ma Hoa Don"));
//            PdfPCell cellMa1 = new PdfPCell(new Phrase(ma));
//            PdfPCell cellKH = new PdfPCell(new Phrase("Khach Hang"));
//            PdfPCell cellKH1 = new PdfPCell(new Phrase(tenKH));
//            PdfPCell cellNgayTao = new PdfPCell(new Phrase("Ngay Tao"));
//            PdfPCell cellNgayTao1 = new PdfPCell(new Phrase(ngayTao));
//            PdfPCell cellNgayThanhToan = new PdfPCell(new Phrase("Ngay Thanh Toan"));
//            PdfPCell cellNgayThanhToan1 = new PdfPCell(new Phrase(ngayThanhToan));
//            PdfPCell cellVachKe = new PdfPCell(new Phrase("--------------------------------------------"));
//            PdfPCell cellVachKe1 = new PdfPCell(new Phrase("--------------------------------------------"));
//            PdfPCell cellTongTien = new PdfPCell(new Phrase("Tong Tien"));
//
//            PdfPCell cellKhuyenMai = new PdfPCell(new Phrase("Khuyen Mai"));
//
//            cellMa.setBorderColor(Color.WHITE);
//            cellMa1.setBorderColor(Color.WHITE);
//            cellMa.setPaddingBottom(10);
//            cellMa.setPaddingLeft(30);
//            cellKH.setBorderColor(Color.WHITE);
//            cellKH1.setBorderColor(Color.WHITE);
//            cellKH.setPaddingBottom(10);
//            cellKH.setPaddingLeft(30);
//            cellNgayTao.setBorderColor(Color.WHITE);
//            cellNgayTao1.setBorderColor(Color.WHITE);
//            cellNgayTao.setPaddingBottom(10);
//            cellNgayTao.setPaddingLeft(30);
//            cellNgayThanhToan.setBorderColor(Color.WHITE);
//            cellNgayThanhToan1.setBorderColor(Color.WHITE);
//            cellNgayThanhToan.setPaddingBottom(10);
//            cellNgayThanhToan.setPaddingLeft(30);
//            cellVachKe.setBorderColor(Color.WHITE);
//            cellVachKe1.setBorderColor(Color.WHITE);
//            cellVachKe.setPaddingBottom(10);
//            cellVachKe.setPaddingLeft(30);
//
//            cellKhuyenMai.setBorderColor(Color.WHITE);
//            cellKhuyenMai.setPaddingBottom(10);
//            cellKhuyenMai.setPaddingLeft(30);
//
//            tblDanhSach.addCell(cellMa);
//            tblDanhSach.addCell(cellMa1);
//            tblDanhSach.addCell(cellKH);
//            tblDanhSach.addCell(cellKH1);
//            tblDanhSach.addCell(cellNgayTao);
//            tblDanhSach.addCell(cellNgayTao1);
//            tblDanhSach.addCell(cellNgayThanhToan);
//            tblDanhSach.addCell(cellNgayThanhToan1);
//            tblDanhSach.addCell(cellVachKe);
//            tblDanhSach.addCell(cellVachKe1);
//
//            tblTongTien.addCell(cellKhuyenMai);
//            int khuyenMai = 0;
//            for (int i = 0; i < 1; i++) {
//                khuyenMai = Integer.parseInt(tbl_sanpham.getValueAt(i, 2).toString());
//                PdfPCell cellKhuyenMai1 = new PdfPCell(new Phrase(khuyenMai + "%"));
//                cellKhuyenMai1.setBorderColor(Color.WHITE);
//                tblTongTien.addCell(cellKhuyenMai1);
//            }
//
//            double giaTri = (tongTien * khuyenMai) / 100;
//            double tienPhaiTra = tongTien - giaTri;
//            PdfPCell cellTongTien1 = new PdfPCell(new Phrase(String.valueOf(tienPhaiTra)));
//            cellTongTien.setBorderColor(Color.WHITE);
//            cellTongTien1.setBorderColor(Color.WHITE);
//            cellTongTien.setPaddingBottom(10);
//            cellTongTien.setPaddingLeft(30);
//
//            tblTongTien.addCell(cellTongTien);
//            tblTongTien.addCell(cellTongTien1);
//            tblLoiCamOn.addCell(cellEnd);
//            tblLoiCamOn.addCell(cellLater);
//
//            doc.add(tblTenCuaHang);
//            doc.add(tblDanhSach);
//            doc.add(tbl3);
//            doc.add(tblTongTien);
//            doc.add(tblLoiCamOn);
//
//        } catch (FileNotFoundException | DocumentException ex) {
//            ex.getMessage();
//        }
//        doc.close();
    }//GEN-LAST:event_btn_inhoadonActionPerformed

    private void cbo_trangthaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_trangthaiItemStateChanged
//        int tt = cbo_trangthai.getSelectedIndex();
//        switch (tt) {
//            case 0 ->
//                fillTable(hoaDonChiTietService.getListHoaDon());
//            case 1 ->
//                fillTable(hoaDonChiTietService.filterHoaDonByTrangThai(1));
//            case 2 ->
//                fillTable(hoaDonChiTietService.filterHoaDonByTrangThai(0));
//            default -> {
//            }
//        }
    }//GEN-LAST:event_cbo_trangthaiItemStateChanged

    private void cbo_dateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_dateItemStateChanged
//        if (!txt_startdate.getText().isEmpty() && !txt_enddate.getText().isEmpty()) {

//        }
    }//GEN-LAST:event_cbo_dateItemStateChanged

    private void txt_enddateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_enddateKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (checkValidate()) {
//                String ngay = (String) cbo_date.getSelectedItem();
//                String ngay1 = ngay.equalsIgnoreCase("Ngày Tạo") ? "NgayTao" : "NgayThanhToan";
//                fillTable(hoaDonChiTietService.filterHoaDonByNameAndDate(txt_timkiem.getText(), ngay1, txt_startdate.getText(), txt_enddate.getText()));
//            }
//        }
    }//GEN-LAST:event_txt_enddateKeyPressed

    private void txt_timkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (txt_timkiem.getText().isEmpty()) {
//                fillTable(hoaDonChiTietService.getListHoaDon());
//            } else {
//                fillTable(hoaDonChiTietService.filterHoaDonByNameNV(txt_timkiem.getText()));
//            }
//        }

    }//GEN-LAST:event_txt_timkiemKeyPressed

//    private void fillTable(List<QLHoaDon> list) {
//        defaultTableModelHoaDon = (DefaultTableModel) tbl_hoadon.getModel();
//        defaultTableModelHoaDon.setRowCount(0);
//        for (QLHoaDon ql : list) {
//            String tt = ql.getTrangThai() == 1 ? "Đã thanh toán" : "Chưa thanh toán";
//            defaultTableModelHoaDon.addRow(new Object[]{ql.getMaHD(), ql.getTenNV(), ql.getTenKH(), ql.getSdt(), ql.getNgayTao(), ql.getNgayThanhToan(), ql.getTongTien(), tt});
//        }
//    }
//
//    private void fillSanPham(List<QLHoaDonChiTiet> list) {
//        defaultTableModelSanPham = (DefaultTableModel) tbl_sanpham.getModel();
//        defaultTableModelSanPham.setRowCount(0);
//        for (QLHoaDonChiTiet ql : list) {
//            defaultTableModelSanPham.addRow(new Object[]{ql.getTenSP(), ql.getGiaBan(), ql.getGiaTri(), ql.getSoLuong(), ql.getDonGia()});
//        }
//    }
//
//    private boolean matches(String date) {
//        return DATE_PATTERN.matcher(date).matches();
//    }
//
//    private boolean checkValidate() {
//        if (txt_startdate.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không được trống");
//            txt_startdate.requestFocus();
//            return false;
//        } else if (!matches(txt_startdate.getText())) {
//            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không đúng định dạng");
//            txt_startdate.requestFocus();
//            return false;
//        }
//
//        if (txt_enddate.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Ngày kết thức không được trống");
//            txt_enddate.requestFocus();
//            return false;
//        } else if (!matches(txt_enddate.getText())) {
//            JOptionPane.showMessageDialog(this, "Ngày kết thúc không đúng định dạng");
//            txt_enddate.requestFocus();
//            return false;
//        }
//
//        return true;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inhoadon;
    private javax.swing.JComboBox<String> cbo_date;
    private javax.swing.JComboBox<String> cbo_trangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_hoadon;
    private javax.swing.JTable tbl_sanpham;
    private javax.swing.JTextField txt_enddate;
    private javax.swing.JTextField txt_startdate;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
