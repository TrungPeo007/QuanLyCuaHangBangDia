/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.PhieuThue;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class PhieuThueBL {
       public static List<PhieuThue> HienThiTenNV(String id)
    {
        List<PhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select *from NhanVien where MaNV='"+id+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuThue nv= new PhieuThue();
   
                nv.setStrTenNV(resultSet.getString("HoTen"));
                rs.add(nv);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
        public static List<PhieuThue> HienThiTenKH(String id)
    {
        List<PhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select *from KhachHang where MaKH='"+id+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuThue kh= new PhieuThue();
   
                kh.setStrTenKH(resultSet.getString("HoTen"));
                rs.add(kh);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
          public static List<PhieuThue> dsPhieuThue()
    {
        
        List<PhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select *from PhieuThue ";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuThue a= new PhieuThue();
                a.setStrMaPT(resultSet.getString("MaPT"));
                a.setStrMaNV(resultSet.getString("MaNV"));
                a.setdNgayThue(resultSet.getDate("NgayThue"));
                a.setStrMaKH(resultSet.getString("MaKH"));
                a.setIntThoiHan(resultSet.getInt("ThoiHan"));
                a.setDbTongTien(resultSet.getFloat("TongTien"));
              
                rs.add(a);
            }
        }
         catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
      public static int themPT(PhieuThue s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into PhieuThue(MaPT,MaNV,NgayThue,MaKH,ThoiHan,TongTien) values(?,?,?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrMaPT());
            pst.setString(2,s.getStrMaNV());
            pst.setDate(3,s.getdNgayThue());
            pst.setString(4,s.getStrMaKH());
           pst.setInt(5,s.getIntThoiHan());
            pst.setDouble(6,s.getDbTongTien());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
       public static void XoaPT(String Ma)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from PhieuThue where MaPT='"+Ma+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
         public PhieuThue checkMaPT(String ma)
   {
        PhieuThue a=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from PhieuThue where MaPT=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,ma);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                a=new PhieuThue();
                a.setStrMaPT(rs.getString(1));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return a;
   }
          public static void SuaPT(String MaPT,String MaNV,Date NgayThue,String MaKH,int ThoiHan)
     {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update PhieuThue set MaNV='"+MaNV+"',NgayThue='"+NgayThue+"',MaKH='"+MaKH+"',ThoiHan='"+ThoiHan+"' where MaPT='"+MaPT+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
            public static void CapNhatTongTien(double TongTien,String MaPT)
     {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update PhieuThue set TongTien="+TongTien+" where MaPT='"+MaPT+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
             public static List<PhieuThue> timkiemMaPT(String ma)
    {
        List<PhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from PhieuThue where  MaPT like N'%"+ma+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuThue a= new PhieuThue();
                a.setStrMaPT(resultSet.getString("MaPT"));
                a.setStrMaNV(resultSet.getString("MaNV"));
                a.setdNgayThue(resultSet.getDate("NgayThue"));
                a.setStrMaKH(resultSet.getString("MaKH"));
                a.setIntThoiHan(resultSet.getInt("ThoiHan"));
                a.setDbTongTien(resultSet.getFloat("TongTien"));
              
                rs.add(a);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    } 
              public static List<PhieuThue> dsThongKePhieuThueTrongThang(String thang)
    {
        
        List<PhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select * from PhieuThue inner join KhachHang on KhachHang.MaKH=PhieuThue.MaKH where MONTH(NgayThue) ='"+thang+"' Order by TongTien desc ";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuThue a= new PhieuThue();
                a.setStrMaPT(resultSet.getString("MaPT"));
                 a.setStrTenKH(resultSet.getString("Hoten"));
                a.setdNgayThue(resultSet.getDate("NgayThue"));
                a.setDbTongTien(resultSet.getFloat("TongTien"));
              
                rs.add(a);
            }
        }
         catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    } 
               public static List<PhieuThue> dsThongKePhieuThueTrongNam(String nam)
    {
        
        List<PhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select * from PhieuThue inner join KhachHang on KhachHang.MaKH=PhieuThue.MaKH where YEAR(NgayThue) ='"+nam+"' Order by TongTien desc ";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuThue a= new PhieuThue();
                a.setStrMaPT(resultSet.getString("MaPT"));
                 a.setStrTenKH(resultSet.getString("Hoten"));
                a.setdNgayThue(resultSet.getDate("NgayThue"));
                a.setDbTongTien(resultSet.getFloat("TongTien"));
              
                rs.add(a);
            }
        }
         catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    } 
}
