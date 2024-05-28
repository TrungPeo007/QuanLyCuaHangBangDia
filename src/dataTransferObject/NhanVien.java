/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTransferObject;

import java.sql.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author mhuy2
 */
public class NhanVien {
    private String strMaNV;
    private String strHoTen;
    private Date dNgay;
    private String bPhai;
    private String strSDT;
    private String strDChi;

    public String getStrMaNV() {
        return strMaNV;
    }

    public void setStrMaNV(String strMaNV) {
        this.strMaNV = strMaNV;
    }

    public String getStrHoTen() {
        return strHoTen;
    }

    public void setStrHoTen(String strHoTen) {
        this.strHoTen = strHoTen;
    }

    public Date getdNgay() {
        return dNgay;
    }

    public void setdNgay(Date dNgay) {
        this.dNgay = dNgay;
    }

    public String getbPhai() {
        return bPhai;
    }

    public void setbPhai(String bPhai) {
        this.bPhai = bPhai;
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

    public NhanVien() {
        this.strMaNV="";
        this.strHoTen="";
        this.dNgay=new Date(1900-1-1);
        this.bPhai="";
        this.strSDT="";
        this.strDChi="";
    }

    public NhanVien(String strMaNV, String strHoTen, Date dNgay, String bPhai,String strSDT,String strDChi) {
        this.strMaNV = strMaNV;
        this.strHoTen = strHoTen;
        this.dNgay = dNgay;
        this.bPhai = bPhai;
        this.strSDT=strSDT;
        this.strDChi=strDChi;
    }
}
