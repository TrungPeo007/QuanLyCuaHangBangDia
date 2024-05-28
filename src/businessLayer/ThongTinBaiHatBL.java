/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.ThongTinBaiHat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dataTransferObject.BangDia;
import java.sql.PreparedStatement;

/**
 *
 * @author mhuy2
 */
public class ThongTinBaiHatBL {
    
     public static int themBaiHat(ThongTinBaiHat s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="INSERT INTO ThongTinBaiHat (BaiHat,CaSi,NhacSi, MaBD) values(?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrTenBai());
            pst.setString(2,s.getStrCaSi());
             pst.setString(3,s.getStrNhacSi());
              pst.setString(4,s.getStrMaBD());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
     
      public static void XoaBH(int id)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from ThongTinBaiHat where MaBaiHat='"+id+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
      
       public static void SuaBH(int id,String Tenbai,String Casi,String NhacSi,String MaBD) 
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update ThongTinBaiHat set BaiHat=N'"+Tenbai+"',CaSi=N'"+Casi+"',NhacSi=N'"+NhacSi+"',MaBD='"+MaBD+"' where MaBaiHat='"+id+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        
        
    }

      public static List<ThongTinBaiHat> dsBH(String ma)
    {
        
        List<ThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat where MaBD='"+ma+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                ThongTinBaiHat nv= new ThongTinBaiHat();
                nv.setID(resultSet.getInt("MaBaiHat"));
                nv.setStrTenBai(resultSet.getString("BaiHat"));
                nv.setStrCaSi(resultSet.getString("CaSi"));
                nv.setStrNhacSi(resultSet.getString("NhacSi"));
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
         public static List<ThongTinBaiHat> timkiemBHtheoTen(String Hoten)
    {
        List<ThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat where  BaiHat like N'%"+Hoten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                ThongTinBaiHat cs= new ThongTinBaiHat();
                 cs.setStrMaBD(resultSet.getString("MaBD"));
                cs.setStrTenBai(resultSet.getString("BaiHat"));
                cs.setStrCaSi(resultSet.getString("CaSi"));
                cs.setStrNhacSi(resultSet.getString("NhacSi"));
                
                rs.add(cs);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
             public static List<ThongTinBaiHat> timkiemBHtheoCaSi(String Casi)
    {
        List<ThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat where  CaSi like N'%"+Casi+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                ThongTinBaiHat cs= new ThongTinBaiHat();
                 cs.setStrMaBD(resultSet.getString("MaBD"));
                cs.setStrTenBai(resultSet.getString("BaiHat"));
                cs.setStrCaSi(resultSet.getString("CaSi"));
                cs.setStrNhacSi(resultSet.getString("NhacSi"));
                
                rs.add(cs);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
             
               public static List<ThongTinBaiHat> timkiemBHtheoNhacSi(String NhacSi)
    {
        List<ThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat where  NhacSi like N'%"+NhacSi+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                ThongTinBaiHat cs= new ThongTinBaiHat();
                 cs.setStrMaBD(resultSet.getString("MaBD"));
                cs.setStrTenBai(resultSet.getString("BaiHat"));
                cs.setStrCaSi(resultSet.getString("CaSi"));
                cs.setStrNhacSi(resultSet.getString("NhacSi"));
                
                rs.add(cs);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
}
