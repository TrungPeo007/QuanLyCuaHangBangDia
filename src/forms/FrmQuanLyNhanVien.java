/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import businessLayer.NhanVienBL;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import dataTransferObject.NhanVien;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.jar.Attributes;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author mhuy2
 */
public class FrmQuanLyNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form FrmQuanLyNhanVien
     */
    public FrmQuanLyNhanVien() {
        initComponents();
        initNhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPhai = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongTinNV = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtHoTenNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý nhân viên");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tên nhân viên cần tìm:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 30));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 110, -1));

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modify.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 110, -1));

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 110, -1));

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sua.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 110, -1));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-icon .png"))); // NOI18N
        btnThem.setText("Làm mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 110, -1));

        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/timkiem.png"))); // NOI18N
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        getContentPane().add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 50, 40));

        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });
        txtTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimKeyTyped(evt);
            }
        });
        getContentPane().add(txtTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 410, 30));

        tblThongTinNV.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblThongTinNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Địa chỉ"
            }
        ));
        tblThongTinNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinNVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblThongTinNV);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 740, 150));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Họ tên:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ngày Sinh:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giới tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radNam.setBackground(new java.awt.Color(153, 204, 255));
        btnPhai.add(radNam);
        radNam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radNam.setSelected(true);
        radNam.setText("Nam");
        radNam.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(radNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));

        radNu.setBackground(new java.awt.Color(153, 204, 255));
        btnPhai.add(radNu);
        radNu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radNu.setText("Nữ");
        jPanel2.add(radNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 24, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 120, 60));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Mã nhân viên:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaNV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaNVFocusLost(evt);
            }
        });
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });
        jPanel3.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 290, 30));

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 500, 30));

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSDTKeyTyped(evt);
            }
        });
        jPanel3.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 290, 30));

        txtNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });
        txtNgaySinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNgaySinhKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgaySinhKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNgaySinhKeyTyped(evt);
            }
        });
        jPanel3.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 290, 30));

        txtHoTenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenNVActionPerformed(evt);
            }
        });
        txtHoTenNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoTenNVKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoTenNVKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoTenNVKeyTyped(evt);
            }
        });
        jPanel3.add(txtHoTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 290, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 740, 240));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background .jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    
    DefaultTableModel model;
    void initNhanVien()
    {
        List<NhanVien> listNV;
        listNV=NhanVienBL.dsNhanVien();
        if(listNV.size()>0)
        {
            model=(DefaultTableModel)tblThongTinNV.getModel();
            for(NhanVien nv:listNV)
            {
               
                model.addRow(new Object[]{nv.getStrMaNV(),nv.getStrHoTen(),nv.getdNgay(),nv.getbPhai(),nv.getStrSDT(),nv.getStrDChi()});
            }
    }
}
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMain all=new FrmMain();
        all.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    

            
    void ResetAll()
{
    btnLuu.setEnabled(true);
    txtMaNV.setEnabled(true);
    txtMaNV.setText("");
    txtHoTenNV.setText("");
   txtNgaySinh.setText("");
   txtTim.setText("");
    radNam.setSelected(true);
    radNu.setSelected(false);
    txtSDT.setText("");
    txtDiaChi.setText("");
    tblThongTinNV.clearSelection();
    btnXoa.setEnabled(false);
    btnSua.setEnabled(false);
    model =(DefaultTableModel)tblThongTinNV.getModel();
        model.setRowCount(0);
    initNhanVien();
}
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed

     String Ngay=txtNgaySinh.getText();
     String So=txtSDT.getText();
     String ma=txtMaNV.getText();
   NhanVienBL nv=new NhanVienBL();
         NhanVien a=nv.checkMaNV(txtMaNV.getText());
     if(txtMaNV.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Vui lòng điển mã nhân viên! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtMaNV.requestFocus();
       }
     
      else if(!ma.matches("NV[0-9]{3}"))
     {
          JOptionPane.showMessageDialog(this, "Mã nhân viên phải định dạng NVxxx!.\nVí dụ NV001 ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtMaNV.requestFocus();
     }
       else if(a!=null)
         {
             JOptionPane.showMessageDialog(null, "Mã nhân viên này đã tồn tại vui lòng chọn mã khác ","Thông báo",JOptionPane.WARNING_MESSAGE);
              txtMaNV.requestFocus();
                
         }
       else if(txtHoTenNV.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên nhân viên! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtHoTenNV.requestFocus();
       }
       else if(txtNgaySinh.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày sinh! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtNgaySinh.requestFocus();        
       }
         else if(!Ngay.matches("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$"))
       {
           JOptionPane.showMessageDialog(rootPane,"'"+txtNgaySinh.getText()+"'"+" không đúng định định dạng.\nPhải nhập đúng định dạng yyyy-MM-dd","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtNgaySinh.requestFocus();  
       }
       else if(txtSDT.getText().equals(""))
       {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtSDT.requestFocus();     
       }
       else if(txtSDT.getText().length()<10|txtSDT.getText().length()>11)
       {
        JOptionPane.showMessageDialog(this, "Số điện thoại phải 10 số hoặc 11 số! ","Thông báo",JOptionPane.WARNING_MESSAGE);
        txtSDT.requestFocus(); 
        }
      
       else if(txtDiaChi.getText().equals(""))
       {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtDiaChi.requestFocus();     
       }
        
     
       else
       {
            String MaNV=txtMaNV.getText();
     String hoten=txtHoTenNV.getText();
     Date NgaySinh=Date.valueOf(txtNgaySinh.getText());
       String gt=radNam.isSelected()?"Nam":"Nữ";
       String SDT=txtSDT.getText();
       String DChi=txtDiaChi.getText();
     NhanVien s=new NhanVien(MaNV,hoten,NgaySinh,gt,SDT,DChi);
     int smt= NhanVienBL.themNhanVien(s);
     if(smt>0)
     {
        JOptionPane.showMessageDialog(rootPane, "Lưu nhân viên "+txtHoTenNV.getText()+" thành công");
        model =(DefaultTableModel)tblThongTinNV.getModel();
        model.setRowCount(0);
        initNhanVien();
        ResetAll();
     }
     else
        JOptionPane.showMessageDialog(rootPane,"Lưu thất bại","Thông báo",JOptionPane.WARNING_MESSAGE);
    }  
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtMaNVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaNVFocusLost
           
    }//GEN-LAST:event_txtMaNVFocusLost

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed

    }//GEN-LAST:event_txtMaNVActionPerformed

    private void tblThongTinNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinNVMouseClicked
        
        int row=tblThongTinNV.getSelectedRow();
        if(row>-1)
        {
        txtMaNV.setEnabled(false);
        btnXoa.setEnabled(true);
        btnSua.setEnabled(true);
        btnLuu.setEnabled(false);
        txtMaNV.setText(String.valueOf(model.getValueAt(tblThongTinNV.getSelectedRow(),0)));
        txtHoTenNV.setText(String.valueOf(model.getValueAt(tblThongTinNV.getSelectedRow(),1)));
        txtNgaySinh.setText(String.valueOf(model.getValueAt(tblThongTinNV.getSelectedRow(),2)));
        String gt=tblThongTinNV.getValueAt(row, 3).toString();
        if(gt.equalsIgnoreCase("Nam"))
        {
            radNam.setSelected(true);
            radNu.setSelected(false);
        }  else
        {
            radNu.setSelected(true);
            radNam.setSelected(false);
        }
        
        txtSDT.setText(String.valueOf(model.getValueAt(tblThongTinNV.getSelectedRow(),4)));
        txtDiaChi.setText(String.valueOf(model.getValueAt(tblThongTinNV.getSelectedRow(),5)));
        }
        else
         JOptionPane.showMessageDialog(rootPane,"Vui lòng click vào 1 dòng!","Thông báo",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_tblThongTinNVMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
 
     String Ngay=txtNgaySinh.getText();
       
     
        if(txtHoTenNV.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên nhân viên! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtHoTenNV.requestFocus();
       }
       else if(txtNgaySinh.getText().equals(""))
       {
             JOptionPane.showMessageDialog(rootPane,"'"+txtNgaySinh.getText()+"'"+" không đúng định định dạng.\nPhải nhập đúng định dạng yyyy-MM-dd","Thông báo",JOptionPane.WARNING_MESSAGE);
             txtNgaySinh.requestFocus();
       }
          else if(!Ngay.matches("^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$"))
       {
           JOptionPane.showMessageDialog(rootPane,"'"+txtNgaySinh.getText()+"'"+" không đúng định định dạng.\nPhải nhập đúng định dạng yyyy-MM-dd","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtNgaySinh.requestFocus();  
       }
       else if(txtSDT.getText().equals(""))
       {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtSDT.requestFocus();     
       }
        else if(txtSDT.getText().length()<10|txtSDT.getText().length()>11)
       {
        JOptionPane.showMessageDialog(this, "Số điện thoại phải 10 số hoặc 11 số! ","Thông báo",JOptionPane.WARNING_MESSAGE);
        txtSDT.requestFocus(); 
        }
      
       else if(txtDiaChi.getText().equals(""))
       {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ! ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtDiaChi.requestFocus();     
       }
       else
       {
        String MaNV=txtMaNV.getText();
     String hoten=txtHoTenNV.getText();
     Date NgaySinh=Date.valueOf(txtNgaySinh.getText());
       String gt=radNam.isSelected()?"Nam":"Nữ";
       String SDT=txtSDT.getText();
       String DChi=txtDiaChi.getText();
       NhanVien s=new NhanVien(MaNV,hoten,NgaySinh,gt,SDT,DChi);
     int tb=JOptionPane.showConfirmDialog(this, "Bạn muốn sửa lại nhân viên "+txtHoTenNV.getText()+" chứ ?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(tb==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(rootPane,"Đã sửa thành công");
           NhanVienBL.SuaNhanVien(s);
        model =(DefaultTableModel)tblThongTinNV.getModel();
        model.setRowCount(0);
        initNhanVien();
        ResetAll();  
        } 
       }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnXoa.setEnabled(false);
        btnSua.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
       
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
     
    }//GEN-LAST:event_txtSDTKeyPressed

    private void txtSDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyTyped
         char c=evt.getKeyChar();
            if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtSDTKeyTyped

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ResetAll();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtNgaySinhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgaySinhKeyPressed
        
    }//GEN-LAST:event_txtNgaySinhKeyPressed

    private void txtNgaySinhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgaySinhKeyReleased

      
    }//GEN-LAST:event_txtNgaySinhKeyReleased

    private void txtNgaySinhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgaySinhKeyTyped
       
    }//GEN-LAST:event_txtNgaySinhKeyTyped

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
     
     int tb=JOptionPane.showConfirmDialog(this, "Bạn muốn xóa nhân viên "+txtHoTenNV.getText()+" chứ ?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(tb==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(rootPane,"Đã xóa thành công");
           NhanVienBL.XoaNV(txtMaNV.getText());
        model =(DefaultTableModel)tblThongTinNV.getModel();
        model.setRowCount(0);
        initNhanVien();
        ResetAll();  
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimActionPerformed

    private void txtTimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKeyReleased

    }//GEN-LAST:event_txtTimKeyReleased

    private void txtTimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKeyTyped

    }//GEN-LAST:event_txtTimKeyTyped

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

        if(txtTim.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Vui lòng điển họ tên nhân viên cần tìm ","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtTim.requestFocus();
        }
        else
        {

            List<NhanVien> listNV;
            String hoten=txtTim.getText();
            listNV=NhanVienBL.timkiemNV(hoten);
              model =(DefaultTableModel)tblThongTinNV.getModel();
                model.setRowCount(0);
            if(listNV.size()<=0)
            {

                JOptionPane.showMessageDialog(rootPane,"Không tìm thấy nhân viên !");
             

            }
            else

            for(NhanVien s:listNV)
            {
              
                model.addRow(new Object[]{s.getStrMaNV(),s.getStrHoTen(),s.getdNgay(),s.getbPhai(),s.getStrSDT(),s.getStrDChi()});
            }
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void txtHoTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenNVActionPerformed

    private void txtHoTenNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoTenNVKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenNVKeyPressed

    private void txtHoTenNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoTenNVKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenNVKeyReleased

    private void txtHoTenNVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoTenNVKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenNVKeyTyped

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
            java.util.logging.Logger.getLogger(FrmQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLuu;
    private javax.swing.ButtonGroup btnPhai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tblThongTinNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTenNV;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
