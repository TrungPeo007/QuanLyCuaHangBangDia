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
public class BangDiaThongTinPhim {
   private String strTenBangDia;
   private String strTenPhim;
   private String strDienVien;
   private String strDaoDien;
   private String strNuocSX;
   private int    intNamSX;

    public String getStrTenBangDia() {
        return strTenBangDia;
    }

    public void setStrTenBangDia(String strTenBangDia) {
        this.strTenBangDia = strTenBangDia;
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

    public String getStrNuocSX() {
        return strNuocSX;
    }

    public void setStrNuocSX(String strNuocSX) {
        this.strNuocSX = strNuocSX;
    }

    public int getIntNamSX() {
        return intNamSX;
    }

    public void setIntNamSX(int intNamSX) {
        this.intNamSX = intNamSX;
    }

    public BangDiaThongTinPhim() {
        this.strTenBangDia ="";
        this.strTenPhim = "";
        this.strDienVien ="";
        this.strDaoDien = "";
        this.strNuocSX = "";
        this.intNamSX = 0;
    }

    public BangDiaThongTinPhim(String strTenBangDia, String strTenPhim, String strDienVien, String strDaoDien, String strNuocSX, int intNamSX) {
        this.strTenBangDia = strTenBangDia;
        this.strTenPhim = strTenPhim;
        this.strDienVien = strDienVien;
        this.strDaoDien = strDaoDien;
        this.strNuocSX = strNuocSX;
        this.intNamSX = intNamSX;
    }
   
   
}
