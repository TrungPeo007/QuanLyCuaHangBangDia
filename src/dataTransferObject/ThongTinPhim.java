/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

/**
 *
 * @author mhuy2
 */
public class ThongTinPhim {
    private int ID;
    private String strTenPhim;
    private String strDienVien;
    private String strDaoDien;
    private String strMaBD;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStrTenPhim() {
        return strTenPhim;
    }

    public void setStrTenPhim(String strTenPhim) {
        this.strTenPhim = strTenPhim;
    }

    public String getStrDienVien() {
        return strDienVien;
    }

    public void setStrDienVien(String strDienVien) {
        this.strDienVien = strDienVien;
    }

    public String getStrDaoDien() {
        return strDaoDien;
    }

    public void setStrDaoDien(String strDaoDien) {
        this.strDaoDien = strDaoDien;
    }

    public String getStrMaBD() {
        return strMaBD;
    }

    public void setStrMaBD(String strMaBD) {
        this.strMaBD = strMaBD;
    }

    public ThongTinPhim() {
        this.strTenPhim="";
        this.strDienVien="";
        this.strDaoDien="";
        this.strMaBD="";
    }

    public ThongTinPhim( String strTenPhim, String strDienVien, String strDaoDien, String strMaBD) {
        
        this.strTenPhim = strTenPhim;
        this.strDienVien = strDienVien;
        this.strDaoDien = strDaoDien;
        this.strMaBD = strMaBD;
    }
    
}
