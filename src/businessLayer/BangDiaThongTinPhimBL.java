/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.BangDiaThongTinPhim;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class BangDiaThongTinPhimBL {
     public static List<BangDiaThongTinPhim> timkiemTTPtheoTenBD(String ten)
    {
        List<BangDiaThongTinPhim> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinPhim inner join BangDia on ThongTinPhim.MaBD=BangDia.MaBD  where  Ten like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinPhim bd= new BangDiaThongTinPhim();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenPhim(resultSet.getString("TenPhim"));
                bd.setStrDienVien(resultSet.getString("DienVien"));
                bd.setStrDaoDien(resultSet.getString("DaoDien"));
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
       public static List<BangDiaThongTinPhim> timkiemTTPtheoTenPhim(String ten)
    {
        List<BangDiaThongTinPhim> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinPhim inner join BangDia on ThongTinPhim.MaBD=BangDia.MaBD  where  TenPhim like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinPhim bd= new BangDiaThongTinPhim();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenPhim(resultSet.getString("TenPhim"));
                bd.setStrDienVien(resultSet.getString("DienVien"));
                bd.setStrDaoDien(resultSet.getString("DaoDien"));
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
         public static List<BangDiaThongTinPhim> timkiemTTPtheoDienVien(String ten)
    {
        List<BangDiaThongTinPhim> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinPhim inner join BangDia on ThongTinPhim.MaBD=BangDia.MaBD  where  DienVien like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinPhim bd= new BangDiaThongTinPhim();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenPhim(resultSet.getString("TenPhim"));
                  bd.setStrDienVien(resultSet.getString("DienVien"));
                bd.setStrDaoDien(resultSet.getString("DaoDien"));
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
           public static List<BangDiaThongTinPhim> timkiemTTPtheoDaoDien(String ten)
    {
        List<BangDiaThongTinPhim> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinPhim inner join BangDia on ThongTinPhim.MaBD=BangDia.MaBD   where  DaoDien like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinPhim bd= new BangDiaThongTinPhim();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenPhim(resultSet.getString("TenPhim"));
                bd.setStrDienVien(resultSet.getString("DienVien"));
                bd.setStrDaoDien(resultSet.getString("DaoDien"));
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
             public static List<BangDiaThongTinPhim> timkiemTTPtheoNuocSX(String ten)
    {
        List<BangDiaThongTinPhim> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinPhim inner join BangDia on ThongTinPhim.MaBD=BangDia.MaBD   where  NuocSX like N'%"+ten+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinPhim bd= new BangDiaThongTinPhim();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenPhim(resultSet.getString("TenPhim"));
                bd.setStrDienVien(resultSet.getString("DienVien"));
                bd.setStrDaoDien(resultSet.getString("DaoDien"));
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
               public static List<BangDiaThongTinPhim> timkiemTTPtheoNamSX(String Nam)
    {
        List<BangDiaThongTinPhim> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="Select * from ThongTinPhim inner join BangDia on ThongTinPhim.MaBD=BangDia.MaBD   where  NamSX like N'%"+Nam+"%'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                BangDiaThongTinPhim bd= new BangDiaThongTinPhim();
                bd.setStrTenBangDia(resultSet.getString("Ten"));
                bd.setStrTenPhim(resultSet.getString("TenPhim"));
                bd.setStrDienVien(resultSet.getString("DienVien"));
                bd.setStrDaoDien(resultSet.getString("DaoDien"));
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
