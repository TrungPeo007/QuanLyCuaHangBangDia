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
public class ThongTinBaiHat {
    private int ID;
    private String strTenBai;
    private String strCaSi;
    private String strNhacSi;
    private String strMaBD;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStrTenBai() {
        return strTenBai;
    }

    public void setStrTenBai(String strTenBai) {
        this.strTenBai = strTenBai;
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

    public String getStrMaBD() {
        return strMaBD;
    }

    public void setStrMaBD(String strMaBD) {
        this.strMaBD = strMaBD;
    }

    public ThongTinBaiHat() {
        this.strTenBai="";
        this.strCaSi="";
        this.strNhacSi="";
        this.strMaBD="";
    }

    public ThongTinBaiHat(String strTenBai, String strCaSi, String strNhacSi, String strMaBD) {
        this.strTenBai = strTenBai;
        this.strCaSi = strCaSi;
        this.strNhacSi = strNhacSi;
        this.strMaBD = strMaBD;
    }
    
}
