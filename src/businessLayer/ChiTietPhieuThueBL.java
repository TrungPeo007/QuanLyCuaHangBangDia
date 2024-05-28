/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.ChiTietPhieuThue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class ChiTietPhieuThueBL {
     public static List<ChiTietPhieuThue> dsCTPT(String id)
    {
        List<ChiTietPhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select *from CTPT inner join  BangDia on CTPT.MaBD=BangDia.MaBD where MaPT='"+id+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                ChiTietPhieuThue a= new ChiTietPhieuThue();
                a.setStrMaPT(resultSet.getString("MaPT"));
                a.setStrMaBD(resultSet.getString("MaBD"));
                a.setStrTenBD(resultSet.getString("Ten"));
                a.setIntSL(resultSet.getInt("SL"));
                a.setDbDonGia(resultSet.getFloat("Gia"));
                a.setFltGiamGia(resultSet.getFloat("GiamGia"));
                a.setDbThanhTien(resultSet.getFloat("ThanhTien"));
                
                rs.add(a);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
        public static List<ChiTietPhieuThue> HienThiTenBD(String id)
    {
        List<ChiTietPhieuThue> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select *from BangDia where MaBD='"+id+"'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
               ChiTietPhieuThue a= new ChiTietPhieuThue();
                a.setStrTenBD(resultSet.getString("Ten"));
                a.setIntSL(resultSet.getInt("SL"));
                a.setDbDonGia(resultSet.getFloat("Gia"));
                rs.add(a);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
        public static int themCTPT(ChiTietPhieuThue s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into CTPT(MaPT,MaBD,SL,DonGia,GiamGia,ThanhTien) values(?,?,?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrMaPT());
            pst.setString(2,s.getStrMaBD());
            pst.setInt(3,s.getIntSL());
            pst.setDouble(4,s.getDbDonGia());
            pst.setFloat(5,s.getFltGiamGia());
            pst.setDouble(6,s.getDbThanhTien());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
        public ChiTietPhieuThue checkMaPTvaBD(String ma,String ma2)
   {
        ChiTietPhieuThue ct=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from CTPT where MaPT=? and MaBD=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,ma);
             statement.setString(2, ma2);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                ct=new ChiTietPhieuThue();
                ct.setStrMaPT(rs.getString(1));
                ct.setStrMaBD(rs.getString(2));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return ct;
   }
         public static void XoaCTPT(String MaPT,String MaBD)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from CTPT where MaPT='"+MaPT+"' and MaBD='"+MaBD+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
           public static void SuaCTPT(String MaPT,String MaBD,int SL,double DonGia,float GiamGia,double ThanhTien)
     {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update CTPT set SL="+SL+",DonGia="+DonGia+",GiamGia="+GiamGia+",ThanhTien="+ThanhTien+" where MaPT='"+MaPT+"' and MaBD='"+MaBD+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
          
}
