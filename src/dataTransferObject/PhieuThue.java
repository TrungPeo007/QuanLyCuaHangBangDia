/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

import java.sql.Date;

/**
 *
 * @author mhuy2
 */
public class PhieuThue {
    private String strMaPT;
    private String strMaNV;
    private String strTenNV;
    private Date dNgayThue;
    private String strMaKH;
    private String strTenKH;
    private int intThoiHan;
    private double dbTongTien;

    public String getStrMaPT() {
        return strMaPT;
    }

    public void setStrMaPT(String strMaPT) {
        this.strMaPT = strMaPT;
    }

    public String getStrMaNV() {
        return strMaNV;
    }

    public void setStrMaNV(String strMaNV) {
        this.strMaNV = strMaNV;
    }

    public String getStrTenNV() {
        return strTenNV;
    }

    public void setStrTenNV(String strTenNV) {
        this.strTenNV = strTenNV;
    }

    public Date getdNgayThue() {
        return dNgayThue;
    }

    public void setdNgayThue(Date dNgayThue) {
        this.dNgayThue = dNgayThue;
    }

    public String getStrMaKH() {
        return strMaKH;
    }

    public String getStrTenKH() {
        return strTenKH;
    }

    public void setStrTenKH(String strTenKH) {
        this.strTenKH = strTenKH;
    }

    public void setStrMaKH(String strMaKH) {
        this.strMaKH = strMaKH;
    }

    public int getIntThoiHan() {
        return intThoiHan;
    }

    public void setIntThoiHan(int intThoiHan) {
        this.intThoiHan = intThoiHan;
    }

  
   
    public double getDbTongTien() {
        return dbTongTien;
    }

    public void setDbTongTien(double dbTongTien) {
        this.dbTongTien = dbTongTien;
    }

   
    public PhieuThue() {
         this.strMaPT = "";
        this.strMaNV = "";
        this.strTenNV = "";
        this.dNgayThue = new Date(1900-1-1);
        this.strMaKH = "";
        this.strTenKH="";
        this.intThoiHan=0;
        this.dbTongTien = 0;
    }

    public PhieuThue(String strMaPT, String strMaNV, Date dNgayThue, String strMaKH, int intThoiHan, double dbTongTien) {
        this.strMaPT = strMaPT;
        this.strMaNV = strMaNV;
        this.dNgayThue = dNgayThue;
        this.strMaKH = strMaKH;
        this.intThoiHan=intThoiHan;
        this.dbTongTien = dbTongTien;
    }
    
    
}
