/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author mhuy2
 */
public class TaiKhoanBL {
     public static void themTaiKhoan(String TenTK,String MatKhau,String XacNhanMK)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into TaiKhoan(TenTK,MatKhau,XacNhanMK)values(N'"+TenTK+"',N'"+MatKhau+"',N'"+XacNhanMK+"')";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
   public TaiKhoan VaoTK(String TenTk,String MK)
   {
        TaiKhoan tk=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select *from TaiKhoan where TenTK=? and MatKhau=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,TenTk);
             statement.setString(2, MK);
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                tk=new TaiKhoan();
                tk.setStrTenTK(rs.getString(1));
                tk.setStrMatKhau(rs.getString(2));
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return tk;
   }
   public TaiKhoan checkTen(String TenTK)
   {
        TaiKhoan tk=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from TaiKhoan where TenTK=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,TenTK);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                tk=new TaiKhoan();
                tk.setStrTenTK(rs.getString(1));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return tk;
   }
               
              
}
