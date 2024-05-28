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
public class BangDiaThongTinBaiHat {
    private String strTenBangDia;
    private String strTenBaiHat;
    private String strCaSi;
    private String strNhacSi;
    private String strNuocSX;
    private int    intNamSX;

    public String getStrTenBangDia() {
        return strTenBangDia;
    }

    public void setStrTenBangDia(String strTenBangDia) {
        this.strTenBangDia = strTenBangDia;
    }

    public String getStrTenBaiHat() {
        return strTenBaiHat;
    }

    public void setStrTenBaiHat(String strTenBaiHat) {
        this.strTenBaiHat = strTenBaiHat;
    }

    public String getStrCaSi() {
        return strCaSi;
    }

    public void setStrCaSi(String strCaSi) {
        this.strCaSi = strCaSi;
    }

    public String getStrNhacSi() {
        return strNhacSi;
    }

    public void setStrNhacSi(String strNhacSi) {
        this.strNhacSi = strNhacSi;
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

    public BangDiaThongTinBaiHat() {
         this.strTenBangDia ="";
        this.strTenBaiHat = "";
        this.strCaSi = "";
        this.strNhacSi = "";
        this.strNuocSX = "";
        this.intNamSX = 0;
    }

    public BangDiaThongTinBaiHat(String strTenBangDia, String strTenBaiHat, String strCaSi, String strNhacSi, String strNuocSX, int intNamSX) {
        this.strTenBangDia = strTenBangDia;
        this.strTenBaiHat = strTenBaiHat;
        this.strCaSi = strCaSi;
        this.strNhacSi = strNhacSi;
        this.strNuocSX = strNuocSX;
        this.intNamSX = intNamSX;
    }
    
}
