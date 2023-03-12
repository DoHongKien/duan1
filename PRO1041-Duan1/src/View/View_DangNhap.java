/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class View_DangNhap extends javax.swing.JFrame {

//    TaiKhoanService taiKhoanService = new TaiKhoanService();

    public View_DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel3 = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pnl_signin = new javax.swing.JPanel();
        btn_signin = new javax.swing.JLabel();
        pnl_cancel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(186, 79, 84));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_username.setBackground(new java.awt.Color(186, 79, 84));
        txt_username.setForeground(new java.awt.Color(204, 204, 204));
        txt_username.setText("Username");
        txt_username.setBorder(null);
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
        });
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernameKeyPressed(evt);
            }
        });
        jPanel3.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, 30));

        txt_password.setBackground(new java.awt.Color(186, 79, 84));
        txt_password.setForeground(new java.awt.Color(204, 204, 204));
        txt_password.setText("Password");
        txt_password.setBorder(null);
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordFocusGained(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel3.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 180, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 30, 30));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, 10));

        pnl_signin.setBackground(new java.awt.Color(186, 79, 84));
        pnl_signin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btn_signin.setForeground(new java.awt.Color(204, 204, 204));
        btn_signin.setText("        Sign in");
        btn_signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_signinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_signinLayout = new javax.swing.GroupLayout(pnl_signin);
        pnl_signin.setLayout(pnl_signinLayout);
        pnl_signinLayout.setHorizontalGroup(
            pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_signin, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        pnl_signinLayout.setVerticalGroup(
            pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_signin, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel3.add(pnl_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, 30));

        pnl_cancel.setBackground(new java.awt.Color(186, 79, 84));
        pnl_cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("        Cancel");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_cancelLayout = new javax.swing.GroupLayout(pnl_cancel);
        pnl_cancel.setLayout(pnl_cancelLayout);
        pnl_cancelLayout.setHorizontalGroup(
            pnl_cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        pnl_cancelLayout.setVerticalGroup(
            pnl_cancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel3.add(pnl_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 90, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/z3901653711326_89afd15dfe17d6c80b7a5c28576a6243.jpg"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, 110));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(186, 79, 84));
        jLabel5.setText("SEVENT STORE");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        txt_username.setText("");
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained
        txt_password.setText("");
    }//GEN-LAST:event_txt_passwordFocusGained

    private void btn_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseClicked
//        if (checkValidate()) {
//            TaiKhoan taiKhoan = taiKhoanService.getChucVu(txt_username.getText(), String.valueOf(txt_password.getPassword()));
//            if (taiKhoan == null) {
//                JOptionPane.showMessageDialog(this, "Login Failed!");
//                return;
//            }
//            int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng nhập với tư cách " + taiKhoan.getChucVu().trim() + " không?", "Đăng nhập", JOptionPane.YES_NO_OPTION);
//            if (cf == JOptionPane.YES_OPTION) {
//                if (!txt_username.getText().isEmpty() && txt_password.getPassword().length > 0) {
//                    if (taiKhoan != null) {
//                        JOptionPane.showMessageDialog(this, "Login succesfully!");
//                        if (taiKhoan.getChucVu().trim().equalsIgnoreCase("admin")) {
//                            main form = new main(taiKhoan);
//                            form.setVisible(true);
//                        } else {
//                            main form = new main(taiKhoan);
//                            form.setVisible(true);
//                        }
//                        this.dispose();
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Login Failed!");
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
//                }
//            }
//        }

    }//GEN-LAST:event_btn_signinMouseClicked

    private void btn_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseEntered
        pnl_signin.setBackground(Color.decode("#990033"));
    }//GEN-LAST:event_btn_signinMouseEntered

    private void btn_signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseExited
        pnl_signin.setBackground(Color.decode("#BA4F54"));
    }//GEN-LAST:event_btn_signinMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        pnl_cancel.setBackground(Color.decode("#990033"));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        pnl_cancel.setBackground(Color.decode("#BA4F54"));
    }//GEN-LAST:event_jLabel4MouseExited

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (checkValidate()) {
//                TaiKhoan taiKhoan = taiKhoanService.getChucVu(txt_username.getText(), String.valueOf(txt_password.getPassword()));
//                if (taiKhoan == null) {
//                    JOptionPane.showMessageDialog(this, "Login Failed!");
//                    return;
//                }
//                int cf = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng nhập với tư cách " + taiKhoan.getChucVu().trim() + " không?", "Đăng nhập", JOptionPane.YES_NO_OPTION);
//                if (cf == JOptionPane.YES_OPTION) {
//                    if (!txt_username.getText().isEmpty() && txt_password.getPassword().length > 0) {
//                        if (taiKhoan != null) {
//                            JOptionPane.showMessageDialog(this, "Login succesfully!");
//                            if (taiKhoan.getChucVu().trim().equalsIgnoreCase("admin")) {
//                                main form = new main(taiKhoan);
//                                form.setVisible(true);
//                            } else {
//                                main form = new main(taiKhoan);
//                                form.setVisible(true);
//                            }
//                            this.dispose();
//                        } else {
//                            JOptionPane.showMessageDialog(this, "Login Failed!");
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_password.requestFocus();
        }
    }//GEN-LAST:event_txt_usernameKeyPressed

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
            java.util.logging.Logger.getLogger(View_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_DangNhap().setVisible(true);
            }
        });
    }

    private boolean checkValidate() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher username = p.matcher(txt_username.getText());
        Matcher password = p.matcher(String.valueOf(txt_password.getPassword()));

        if (username.find()) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không được chứa ký tự đặc biệt");
            txt_username.requestFocus();
            return false;
        }

        if (password.find()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được chứa ký tự đặc biệt");
            txt_password.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnl_cancel;
    private javax.swing.JPanel pnl_signin;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
