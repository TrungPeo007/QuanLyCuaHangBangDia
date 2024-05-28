/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.ThongTinPhim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class ThongTinPhimBL {
     public static int themPhim(ThongTinPhim s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into ThongTinPhim(TenPhim,DienVien,DaoDien,MaBD) values(?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrTenPhim());
            pst.setString(2,s.getStrDienVien());
             pst.setString(3,s.getStrDaoDien());
              pst.setString(4,s.getStrMaBD());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
     
      public static void XoaPhim(int id)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from ThongTinPhim where MaPhim='"+id+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
      
       public static void SuaPhim(int id,String Ten,String DienVien,String DaoDien,String MaBD) 
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update ThongTinPhim set TenPhim=N'"+Ten+"',DienVien=N'"+DienVien+"',DaoDien=N'"+DaoDien+"',MaBD='"+MaBD+"' where MaPhim='"+id+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        
        
    }

      public static List<ThongTinPhim> dsPhim(String ma)
    {
        
        List<ThongTinPhim> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinPhim where MaBD='"+ma+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                ThongTinPhim nv= new ThongTinPhim();
                nv.setID(resultSet.getInt("MaPhim"));
                nv.setStrTenPhim(resultSet.getString("TenPhim"));
                 nv.setStrDienVien(resultSet.getString("DienVien"));
                nv.setStrDaoDien(resultSet.getString("DaoDien"));
                nv.setStrMaBD(resultSet.getString("MaBD"));
                rs.add(nv);
            }
        }
         catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
    
          
}
