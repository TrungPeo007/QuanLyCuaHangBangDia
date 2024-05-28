/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.BangDia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class BangDiaBL {
     public static int themBangDia(BangDia s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into BangDia(MaBD,Ten ,LoaiDia ,NuocSX ,NamSX ,SL,Gia) values(?,?,?,?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrMaBD());
            pst.setString(2,s.getStrTen());
            pst.setString(3,s.getStrLoaiDia());
            pst.setString(4,s.getStrNuocSX());
            pst.setInt(5,s.getIntNamSX());
            pst.setInt(6,s.getIntSL());
            pst.setDouble(7,s.getDbGia());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
     
        public static List<BangDia> dsBangDia()
    {
        
        List<BangDia> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from BangDia";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDia bd= new BangDia();
                bd.setStrMaBD(resultSet.getString("MaBD"));
                bd.setStrTen(resultSet.getString("Ten"));
                bd.setStrLoaiDia(resultSet.getString("LoaiDia"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                bd.setIntSL(resultSet.getInt("SL"));
                bd.setDbGia(resultSet.getFloat("Gia"));
                rs.add(bd);
            }
        }
         catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }

         public static void SuaBD(String MaBD,String Ten,String LoaiDia,String NuocSX,int NamSX,int SL,double Gia)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update BangDia set Ten=N'"+Ten+"',LoaiDia=N'"+LoaiDia+"',NuocSX=N'"+NuocSX+"',NamSX="+NamSX+",SL="+SL+",Gia="+Gia+"where MaBD='"+MaBD+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
         public static void XoaBD(String MaBD)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from BangDia where MaBD='"+MaBD+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
               public BangDia checkMaBD(String ma)
   {
        BangDia bd=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from BangDia where MaBD=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,ma);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                bd=new BangDia();
                bd.setStrMaBD(rs.getString(1));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return bd;
   }
               
      public static List<BangDia> timkiemBDtheoTen(String ten)
    {
        List<BangDia> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from BangDia where  Ten like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDia bd= new BangDia();
                bd.setStrMaBD(resultSet.getString("MaBD"));
                bd.setStrTen(resultSet.getString("Ten"));
                bd.setStrLoaiDia(resultSet.getString("LoaiDia"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                bd.setIntSL(resultSet.getInt("SL"));
                bd.setDbGia(resultSet.getInt("Gia"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
      
      
      
      public static List<BangDia> timkiemBDtheoNuocSX(String ten)
    {
        List<BangDia> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from BangDia where  NuocSX like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDia bd= new BangDia();
                bd.setStrMaBD(resultSet.getString("MaBD"));
                bd.setStrTen(resultSet.getString("Ten"));
                bd.setStrLoaiDia(resultSet.getString("LoaiDia"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                bd.setIntSL(resultSet.getInt("SL"));
                bd.setDbGia(resultSet.getInt("Gia"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
      public static void CapNhatSLCon(String MaBD,int SL)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update BangDia set SL="+SL+" where MaBD='"+MaBD+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
}
