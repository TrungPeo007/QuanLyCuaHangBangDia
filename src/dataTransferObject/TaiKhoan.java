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
public class TaiKhoan {
    private int id;
    private String strTenTK;
    private String strMatKhau;
    private String strXacNhanMK;

    public String getStrTenTK() {
        return strTenTK;
    }

    public void setStrTenTK(String strTenTK) {
        this.strTenTK = strTenTK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrMatKhau() {
        return strMatKhau;
    }

    public void setStrMatKhau(String strMatKhau) {
        this.strMatKhau = strMatKhau;
    }

    public String getStrXacNhanMK() {
        return strXacNhanMK;
    }

    public void setStrXacNhanMK(String strXacNhanMK) {
        this.strXacNhanMK = strXacNhanMK;
    }

    public TaiKhoan() {
        this.strTenTK="";
        this.strMatKhau="";
        this.strTenTK="";
    }

    public TaiKhoan( String strTenTK,String strMatKhau, String strXacNhanMK) {
        this.strTenTK=strTenTK;
        this.strMatKhau = strMatKhau;
        this.strXacNhanMK = strXacNhanMK;
    }

   
    
    
}
