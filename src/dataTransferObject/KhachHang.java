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
public class KhachHang {
    private String strMaKH;
    private String strHoTen;
    private String strCMND;
    private String strPhai;
    private String strSDT;
    private String strDChi;

    public String getStrMaKH() {
        return strMaKH;
    }

    public void setStrMaKH(String strMaKH) {
        this.strMaKH = strMaKH;
    }

    public String getStrHoTen() {
        return strHoTen;
    }

    public void setStrHoTen(String strHoTen) {
        this.strHoTen = strHoTen;
    }

    public String getStrCMND() {
        return strCMND;
    }

    public void setStrCMND(String strCMND) {
        this.strCMND = strCMND;
    }

    public String getStrPhai() {
        return strPhai;
    }

    public void setStrPhai(String strPhai) {
        this.strPhai = strPhai;
    }

    public String getStrSDT() {
        return strSDT;
    }

    public void setStrSDT(String strSDT) {
        this.strSDT = strSDT;
    }

    public String getStrDChi() {
        return strDChi;
    }

    public void setStrDChi(String strDChi) {
        this.strDChi = strDChi;
    }

    public KhachHang() {
        this.strMaKH="";
        this.strHoTen="";
        this.strCMND="";
        this.strPhai="";
        this.strSDT="";
        this.strDChi="";
 }

    public KhachHang(String strMaKH, String strHoTen,String strCMND, String strPhai, String strSDT, String strDChi) {
        this.strMaKH = strMaKH;
        this.strHoTen = strHoTen;
        this.strCMND=strCMND;
        this.strPhai = strPhai;
        this.strSDT = strSDT;
        this.strDChi = strDChi;
    }
    
}





