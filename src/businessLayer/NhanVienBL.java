/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author mhuy2
 */
public class NhanVienBL {
    public static int themNhanVien(NhanVien s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into NhanVien(MaNV,HoTen,NgaySinh,GioiTinh,SDT,DiaChi) values(?,?,?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrMaNV());
            pst.setString(2,s.getStrHoTen());
            
            pst.setDate(3,s.getdNgay());
            pst.setString(4,s.getbPhai());
            pst.setString(5,s.getStrSDT());
            pst.setString(6,s.getStrDChi());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
     public static List<NhanVien> dsNhanVien()
    {
        
        List<NhanVien> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from NhanVien";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                NhanVien nv= new NhanVien();
                nv.setStrMaNV(resultSet.getString("MaNV"));
                nv.setStrHoTen(resultSet.getString("HoTen"));
                nv.setdNgay(resultSet.getDate("NgaySinh"));
                nv.setbPhai(resultSet.getString("GioiTinh"));
                nv.setStrSDT(resultSet.getString("SDT"));
                nv.setStrDChi(resultSet.getString("DiaChi"));
                rs.add(nv);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
  
     public static int SuaNhanVien(NhanVien s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update NhanVien set HoTen=?,NgaySinh=?,GioiTinh=?,SDT=?,DiaChi=? where MaNV=?";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrHoTen());
            pst.setDate(2,s.getdNgay());
            pst.setString(3,s.getbPhai());
            pst.setString(4,s.getStrSDT());
            pst.setString(5,s.getStrDChi());
            pst.setString(6,s.getStrMaNV());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
       public static void XoaNV(String Ma)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from NhanVien where MaNV='"+Ma+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
           public static List<NhanVien> timkiemNV(String Hoten)
    {
        List<NhanVien> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from NhanVien where  Hoten like N'%"+Hoten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                NhanVien nv= new NhanVien();
                nv.setStrMaNV(resultSet.getString("MaNV"));
                nv.setStrHoTen(resultSet.getString("Hoten"));
                nv.setdNgay(resultSet.getDate("NgaySinh"));
                nv.setbPhai(resultSet.getString("GioiTinh"));
                nv.setStrSDT(resultSet.getString("SDT"));
                nv.setStrDChi(resultSet.getString("DiaChi"));
                rs.add(nv);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
       
           
           
            public NhanVien checkMaNV(String ma)
   {
        NhanVien nv=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from NhanVien where MaNV=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,ma);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                nv=new NhanVien();
                nv.setStrMaNV(rs.getString(1));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return nv;
   }
               
}
