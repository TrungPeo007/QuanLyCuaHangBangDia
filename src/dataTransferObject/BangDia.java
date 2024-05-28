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
public class BangDia {
    private String strMaBD;
    private String strTen;
    private String strLoaiDia;
    private String strNuocSX;
    private int intNamSX;
    private int intSL;
    private double dbGia;

    public String getStrMaBD() {
        return strMaBD;
    }

    public void setStrMaBD(String strMaBD) {
        this.strMaBD = strMaBD;
    }

    public String getStrTen() {
        return strTen;
    }

    public void setStrTen(String strTen) {
        this.strTen = strTen;
    }

    public String getStrLoaiDia() {
        return strLoaiDia;
    }

    public void setStrLoaiDia(String strLoaiDia) {
        this.strLoaiDia = strLoaiDia;
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

    public int getIntSL() {
        return intSL;
    }

    public void setIntSL(int intSL) {
        this.intSL = intSL;
    }

    public double getDbGia() {
        return dbGia;
    }

    public void setDbGia(double dbGia) {
        this.dbGia = dbGia;
    }

    
    public BangDia() {
        this.strMaBD="";
        this.strTen="";
        this.strLoaiDia="";
        this.strNuocSX="";
        this.intNamSX=0;
        this.intSL=0;
        this.dbGia=0;
    }

    public BangDia(String strMaBD, String strTen, String strLoaiDia, String strNuocSX, int intNamSX, int intSL, double dbGia) {
        this.strMaBD = strMaBD;
        this.strTen = strTen;
        this.strLoaiDia = strLoaiDia;
        this.strNuocSX = strNuocSX;
        this.intNamSX = intNamSX;
        this.intSL = intSL;
        this.dbGia = dbGia;
    }

   
    
}
