/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.TraBangDia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class TraBangDiaBL {
     public static List<TraBangDia> HienThiThongTinPhieuThue(String id)
    {
        List<TraBangDia> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select *from PhieuThue inner join KhachHang on PhieuThue.MaKH=KhachHang.MaKH  where MaPT='"+id+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                  TraBangDia a= new TraBangDia();
                a.setStrMaKH(resultSet.getString("MaKH"));
                a.setStrTenKH(resultSet.getString("Hoten"));
                a.setstrNgayThue(resultSet.getString("NgayThue"));
                a.setIntThoiHan(resultSet.getInt("ThoiHan"));
                rs.add(a);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
      public static List<TraBangDia> dsTraBangDia()
    {
        
        List<TraBangDia> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select *from TraDia inner join PhieuThue on TraDia.MaPT=PhieuThue.MaPT inner join KhachHang on PhieuThue.MaKH=KhachHang.MaKH";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                TraBangDia a= new TraBangDia();
                a.setStrMaTra(resultSet.getString("MaTra"));
                a.setStrMaPT(resultSet.getString("MaPT"));
                a.setStrMaKH(resultSet.getString("MaKH"));
                a.setStrTenKH(resultSet.getString("Hoten"));
                a.setstrNgayThue(resultSet.getString("NgayThue"));
                a.setIntThoiHan(resultSet.getInt("ThoiHan"));
                a.setStrQuaHan(resultSet.getString("QuaHan"));
                rs.add(a);
            }
        }
         catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
      public static int themTraBangDia(TraBangDia s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into TraDia(MaTra,MaPT,QuaHan)values(?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrMaTra());
            pst.setString(2,s.getStrMaPT());
            pst.setString(3, s.getStrQuaHan());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
       public static void SuaTraBangDia(String MaTra,String MaPT,String QuaHan)
     {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update TraDia set MaPT='"+MaPT+"',QuaHan=N'"+QuaHan+"' where MaTra='"+MaTra+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
         public static void XoaTraBangDia(String Ma)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from TraDia where MaTra='"+Ma+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
            public TraBangDia checkMaTra(String ma)
   {
        TraBangDia a=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from TraDia where MaTra=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,ma);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                a=new TraBangDia();
                a.setStrMaTra(rs.getString(1));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return a;
   }
             public static List<TraBangDia> dsTraBangDiaQuaHan()
    {
        
        List<TraBangDia> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select *from TraDia where QuaHan=N'Có'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                TraBangDia a= new TraBangDia();
                a.setStrMaTra(resultSet.getString("MaTra"));
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
