/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import dataTransferObject.PhieuPhat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhuy2
 */
public class PhieuPhatBL {
    public static List<PhieuPhat> HienThiThongTinPhieuTra(String id)
    {
        List<PhieuPhat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select *from TraDia inner join PhieuThue on TraDia.MaPT=PhieuThue.MaPT  inner join KhachHang on KhachHang.MaKH=PhieuThue.MaKH where MaTra='"+id+"'";
             
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuPhat a= new PhieuPhat();
                a.setStrMaPT(resultSet.getString("MaPT"));
                a.setStrTenKH(resultSet.getString("Hoten"));
  
                
                rs.add(a);
            }
        }
        catch(Exception ex)
        {
                System.out.println("Bị lỗi:"+ex.getMessage());
        }
    return rs;
    }
      public static List<PhieuPhat> dsPhieuPhat()
    {
        
        List<PhieuPhat> rs=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
         rs=new ArrayList<>();
         java.sql.Statement statement=KetNoi.createStatement();
         String sql="select *from PhieuPhat inner join TraDia on PhieuPhat.MaTra=TraDia.MaTra inner join PhieuThue on TraDia.MaPT=PhieuThue.MaPT inner join KhachHang on KhachHang.MaKH=PhieuThue.MaKH where QuaHan=N'Có'";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next())
            {
                PhieuPhat a= new PhieuPhat();
                a.setStrMaPP(resultSet.getString("MaPP"));
                a.setStrMaTra(resultSet.getString("MaTra"));
                a.setStrMaPT(resultSet.getString("MaPT"));
                a.setStrTenKH(resultSet.getString("Hoten"));
                a.setIntSoNgayQuaHan(resultSet.getInt("SoNgayQuaHan"));
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
       public static int themPhieuPhat(PhieuPhat s)
    {
        int smt=0;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="insert into PhieuPhat(MaPP,MaTra,SoNgayQuaHan,TongTien) values(?,?,?,?)";
            PreparedStatement pst=KetNoi.prepareCall(sql);
            pst.setString(1,s.getStrMaPP());
            pst.setString(2,s.getStrMaTra());
            pst.setInt(3,s.getIntSoNgayQuaHan());
           pst.setDouble(4,s.getDbTongTien());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
        return smt;
    }
        public static void XoaPhieuPhat(String Ma)
    {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="delete from PhieuPhat where MaPP='"+Ma+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
         public static void SuaPhieuPhat(String MaPP,String MaTra,int SoNgayQuaHan,double TongTien)
     {
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="update PhieuPhat set MaTra='"+MaTra+"',SoNgayQuaHan="+SoNgayQuaHan+",TongTien="+TongTien+" where MaPP='"+MaPP+"'";
            PreparedStatement statement=KetNoi.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
    }
          public PhieuPhat checkMaPP(String ma)
   {
        PhieuPhat pp=null;
        try(Connection KetNoi=CSDL.getKetNoi())
        {
            String sql="select * from PhieuPhat where MaPP=?";
             PreparedStatement statement=KetNoi.prepareStatement(sql);
             statement.setString(1,ma);
   
           ResultSet rs= statement.executeQuery();
            if(rs.next())
            {
                pp=new PhieuPhat();
                pp.setStrMaPP(rs.getString(1));
            
             
            }
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi:"+ex.getMessage());
        }
       return pp;
   }
          
}
