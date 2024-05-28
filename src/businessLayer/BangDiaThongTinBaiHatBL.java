/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.BangDiaThongTinBaiHat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class BangDiaThongTinBaiHatBL {
     public static List<BangDiaThongTinBaiHat> timkiemTTBHtheoTenBD(String ten)
    {
        List<BangDiaThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat inner join BangDia on ThongTinBaiHat.MaBD=BangDia.MaBD  where  Ten like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinBaiHat bd= new BangDiaThongTinBaiHat();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenBaiHat(resultSet.getString("BaiHat"));
                bd.setStrCaSi(resultSet.getString("CaSi"));
                bd.setStrNhacSi(resultSet.getString("NhacSi"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
          public static List<BangDiaThongTinBaiHat> timkiemTTBHtheoTenBaiHat(String ten)
    {
        List<BangDiaThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat inner join BangDia on ThongTinBaiHat.MaBD=BangDia.MaBD  where  BaiHat like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinBaiHat bd= new BangDiaThongTinBaiHat();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenBaiHat(resultSet.getString("BaiHat"));
                bd.setStrCaSi(resultSet.getString("CaSi"));
                bd.setStrNhacSi(resultSet.getString("NhacSi"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
            public static List<BangDiaThongTinBaiHat> timkiemTTBHtheoCaSi(String ten)
    {
        List<BangDiaThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat inner join BangDia on ThongTinBaiHat.MaBD=BangDia.MaBD  where  CaSi like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinBaiHat bd= new BangDiaThongTinBaiHat();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenBaiHat(resultSet.getString("BaiHat"));
                bd.setStrCaSi(resultSet.getString("CaSi"));
                bd.setStrNhacSi(resultSet.getString("NhacSi"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
              public static List<BangDiaThongTinBaiHat> timkiemTTBHtheoNhacSi(String ten)
    {
        List<BangDiaThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat inner join BangDia on ThongTinBaiHat.MaBD=BangDia.MaBD  where  NhacSi like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinBaiHat bd= new BangDiaThongTinBaiHat();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenBaiHat(resultSet.getString("BaiHat"));
                bd.setStrCaSi(resultSet.getString("CaSi"));
                bd.setStrNhacSi(resultSet.getString("NhacSi"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
                 public static List<BangDiaThongTinBaiHat> timkiemTTBHtheoNuocSX(String ten)
    {
        List<BangDiaThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat inner join BangDia on ThongTinBaiHat.MaBD=BangDia.MaBD  where  NuocSX like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinBaiHat bd= new BangDiaThongTinBaiHat();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenBaiHat(resultSet.getString("BaiHat"));
                bd.setStrCaSi(resultSet.getString("CaSi"));
                bd.setStrNhacSi(resultSet.getString("NhacSi"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
                   public static List<BangDiaThongTinBaiHat> timkiemTTBHtheoNamSX(String ten)
    {
        List<BangDiaThongTinBaiHat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinBaiHat inner join BangDia on ThongTinBaiHat.MaBD=BangDia.MaBD  where  NamSX like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinBaiHat bd= new BangDiaThongTinBaiHat();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenBaiHat(resultSet.getString("BaiHat"));
                bd.setStrCaSi(resultSet.getString("CaSi"));
                bd.setStrNhacSi(resultSet.getString("NhacSi"));
                bd.setStrNuocSX(resultSet.getString("NuocSX"));
                bd.setIntNamSX(resultSet.getInt("NamSX"));
                rs.add(bd);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return rs;
    }
}
