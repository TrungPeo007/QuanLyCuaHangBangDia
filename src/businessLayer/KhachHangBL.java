/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;


import dataTransferObject.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class KhachHangBL {
     public static int themKhachHang(KhachHang s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into KhachHang(MaKH,HoTen,CMND,GioiTinh,SDT,DiaChi) values(?,?,?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrMaKH());
            pst.setString(2,s.getStrHoTen());
            pst.setString(3,s.getStrCMND());
            pst.setString(4,s.getStrPhai());
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
     
      public static List<KhachHang> dsKhachHang()
    {
        
        List<KhachHang> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from KhachHang";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                KhachHang kh= new KhachHang();
                kh.setStrMaKH(resultSet.getString("MaKH"));
                kh.setStrHoTen(resultSet.getString("HoTen"));
                kh.setStrCMND(resultSet.getString("CMND"));
                kh.setStrPhai(resultSet.getString("GioiTinh"));
                kh.setStrSDT(resultSet.getString("SDT"));
                kh.setStrDChi(resultSet.getString("DiaChi"));
                rs.add(kh);
            }
        }
         catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
      
      
       public static int SuaKhachHang(KhachHang s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update KhachHang set HoTen=?,CMND=?,GioiTinh=?,SDT=?,DiaChi=? where MaKH=?";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrHoTen());
            pst.setString(2,s.getStrCMND());
            pst.setString(3,s.getStrPhai());
            pst.setString(4,s.getStrSDT());
            pst.setString(5,s.getStrDChi());
            pst.setString(6,s.getStrMaKH());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
       
       
          public static void XoaKH(String Ma)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from KhachHang where MaKH='"+Ma+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
         
              public KhachHang checkMaKH(String ma)
   {
        KhachHang kh=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from KhachHang where MaKH=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,ma);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                kh=new KhachHang();
                kh.setStrMaKH(rs.getString(1));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return kh;
   }
              public static List<KhachHang> timkiemKH(String Hoten)
    {
        List<KhachHang> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from KhachHang where  Hoten like N'%"+Hoten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                KhachHang kh= new KhachHang();
                kh.setStrMaKH(resultSet.getString("MaKH"));
                kh.setStrHoTen(resultSet.getString("Hoten"));
                kh.setStrCMND(resultSet.getString("CMND"));
                kh.setStrPhai(resultSet.getString("GioiTinh"));
                kh.setStrSDT(resultSet.getString("SDT"));
                kh.setStrDChi(resultSet.getString("DiaChi"));
                rs.add(kh);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
               
}
