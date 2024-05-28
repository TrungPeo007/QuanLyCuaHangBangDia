/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;

/**
 *
 * @author mhuy2
 */
public class CSDL {
    private static Connection KetNoi;
    public static Connection getKetNoi()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url="jdbc:sqlserver://DESKTOP-OM2EDAM\\SQLEXPRESS:1433;databaseName=QuanLyCuaHangBangDia";
            KetNoi=DriverManager.getConnection(url,"sa","123");
        }
        catch(ClassNotFoundException | SQLException e)
        {
           e.printStackTrace();
        }
        return KetNoi;
    }
}
