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
public class ChiTietPhieuThue {
    private String strMaPT;
    private String strMaBD;
    private String strTenBD;
    private int intSL;
    private double dbDonGia;
    private float fltGiamGia;
    private double dbThanhTien;

    public String getStrMaPT() {
        return strMaPT;
    }

    public void setStrMaPT(String strMaPT) {
        this.strMaPT = strMaPT;
    }

    public String getStrMaBD() {
        return strMaBD;
    }

    public void setStrMaBD(String strMaBD) {
        this.strMaBD = strMaBD;
    }

    public String getStrTenBD() {
        return strTenBD;
    }

    public void setStrTenBD(String strTenBD) {
        this.strTenBD = strTenBD;
    }

    public int getIntSL() {
        return intSL;
    }

    public void setIntSL(int intSL) {
        this.intSL = intSL;
    }

   

    public float getFltGiamGia() {
        return fltGiamGia;
    }

    public void setFltGiamGia(float fltGiamGia) {
        this.fltGiamGia = fltGiamGia;
    }

    public double getDbDonGia() {
        return dbDonGia;
    }

    public void setDbDonGia(double dbDonGia) {
        this.dbDonGia = dbDonGia;
    }

    public double getDbThanhTien() {
        return dbThanhTien;
    }

    public void setDbThanhTien(double dbThanhTien) {
        this.dbThanhTien = dbThanhTien;
    }

   

    public ChiTietPhieuThue() {
          this.strMaPT = "";
        this.strMaBD = "";
        this.strTenBD = "";
        this.intSL = 0;
        this.dbDonGia =0;
        this.fltGiamGia = 0;
        this.dbThanhTien =0;
    }

    public ChiTietPhieuThue(String strMaPT, String strMaBD, int intSL,double dbDonGia, float fltGiamGia,double dbThanhTien) {
        this.strMaPT = strMaPT;
        this.strMaBD = strMaBD;
        this.intSL = intSL;
        this.dbDonGia = dbDonGia;
        this.fltGiamGia = fltGiamGia;
        this.dbThanhTien = dbThanhTien;
    }

   
    
}
