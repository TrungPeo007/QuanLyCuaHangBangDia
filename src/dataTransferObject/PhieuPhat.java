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
public class PhieuPhat {
    private String strMaPP;
    private String strMaTra;
    private String strMaPT;
    private String strTenKH;
    private int intSoNgayQuaHan;
    private double dbTongTien;

    public String getStrMaPP() {
        return strMaPP;
    }

    public void setStrMaPP(String strMaPP) {
        this.strMaPP = strMaPP;
    }

    public String getStrMaTra() {
        return strMaTra;
    }

    public void setStrMaTra(String strMaTra) {
        this.strMaTra = strMaTra;
    }

    public String getStrMaPT() {
        return strMaPT;
    }

    public void setStrMaPT(String strMaPT) {
        this.strMaPT = strMaPT;
    }

    public String getStrTenKH() {
        return strTenKH;
    }

    public void setStrTenKH(String strTenKH) {
        this.strTenKH = strTenKH;
    }
    

    public int getIntSoNgayQuaHan() {
        return intSoNgayQuaHan;
    }

    public void setIntSoNgayQuaHan(int intSoNgayQuaHan) {
        this.intSoNgayQuaHan = intSoNgayQuaHan;
    }

    public double getDbTongTien() {
        return dbTongTien;
    }

    public void setDbTongTien(double dbTongTien) {
        this.dbTongTien = dbTongTien;
    }

    public PhieuPhat() {
         this.strMaPP = "";
        this.strMaTra ="";
        this.strMaPT ="";
        this.strTenKH="";
 
        this.intSoNgayQuaHan = 0;
        this.dbTongTien = 0;
    }

    public PhieuPhat(String strMaPP, String strMaTra, int intSoNgayQuaHan, double dbTongTien) {
        this.strMaPP = strMaPP;
        this.strMaTra = strMaTra;
        this.intSoNgayQuaHan = intSoNgayQuaHan;
        this.dbTongTien = dbTongTien;
    }
}
