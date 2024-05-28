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
public class TraBangDia {
    private String strMaTra;
    private String strMaPT;
    private String strMaKH;
    private String StrTenKH;
    private String strNgayThue;
    private int intThoiHan;
    private String strQuaHan;

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

    public String getStrMaKH() {
        return strMaKH;
    }

    public void setStrMaKH(String strMaKH) {
        this.strMaKH = strMaKH;
    }

    public String getStrTenKH() {
        return StrTenKH;
    }

    public void setStrTenKH(String StrTenKH) {
        this.StrTenKH = StrTenKH;
    }

    public String getstrNgayThue() {
        return strNgayThue;
    }

    public void setstrNgayThue(String strNgayThue) {
        this.strNgayThue = strNgayThue;
    }

    public int getIntThoiHan() {
        return intThoiHan;
    }

    public void setIntThoiHan(int intThoiHan) {
        this.intThoiHan = intThoiHan;
    }

    public String getStrQuaHan() {
        return strQuaHan;
    }

    public void setStrQuaHan(String strQuaHan) {
        this.strQuaHan = strQuaHan;
    }

    public TraBangDia() {
        this.strMaTra = "";
        this.strMaPT = "";
        this.strMaKH = "";
        this.StrTenKH="";
        this.strNgayThue="";
        this.intThoiHan = 0;
        this.strQuaHan = "";
    }

    public TraBangDia(String strMaTra, String strMaPT, String strQuaHan) {
        this.strMaTra = strMaTra;
        this.strMaPT = strMaPT;
        this.strQuaHan = strQuaHan;
    }
    
}
