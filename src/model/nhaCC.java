/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class nhaCC {
    private String maNhaCC;
    private String tenNhaCC;
    private String phone;
    private String diaChi;

    public nhaCC() {
    }

    public nhaCC(String maNhaCC, String tenNhaCC, String phone, String diaChi) {
        this.maNhaCC = maNhaCC;
        this.tenNhaCC = tenNhaCC;
        this.phone = phone;
        this.diaChi = diaChi;
    }

    public String getMaNhaCC() {
        return maNhaCC;
    }

    public void setMaNhaCC(String maNhaCC) {
        this.maNhaCC = maNhaCC;
    }

    public String getTenNhaCC() {
        return tenNhaCC;
    }

    public void setTenNhaCC(String tenNhaCC) {
        this.tenNhaCC = tenNhaCC;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final nhaCC other = (nhaCC) obj;
        if (!Objects.equals(this.maNhaCC, other.maNhaCC)) {
            return false;
        }
        if (!Objects.equals(this.tenNhaCC, other.tenNhaCC)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        return Objects.equals(this.diaChi, other.diaChi);
    }

    @Override
    public String toString() {
        return "nhaCC{" + "maNhaCC=" + maNhaCC + ", tenNhaCC=" + tenNhaCC + ", phone=" + phone + ", diaChi=" + diaChi
                + '}';
    }

}
