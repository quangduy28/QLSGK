/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class phieuNhap {
    private String maPN;
    private String maNV;
    private String maNCC;
    private String maSGK;
    private int soLuong;
    private String ngay;

    public phieuNhap(String maPN, String maNV, String maNCC, String maSGK, int soLuong, String ngay) {
        this.maPN = maPN;
        this.maNV = maNV;
        this.maNCC = maNCC;
        this.maSGK = maSGK;
        this.soLuong = soLuong;
        this.ngay = ngay;
    }

    public phieuNhap() {
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getMaSGK() {
        return maSGK;
    }

    public void setMaSGK(String maSGK) {
        this.maSGK = maSGK;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return "phieuNhap{" + "maPN=" + maPN + ", maNV=" + maNV + ", maNCC=" + maNCC + ", maSGK=" + maSGK + ", soLuong="
                + soLuong + ", ngay=" + ngay + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.maPN);
        hash = 79 * hash + Objects.hashCode(this.maNV);
        hash = 79 * hash + Objects.hashCode(this.maNCC);
        hash = 79 * hash + Objects.hashCode(this.maSGK);
        hash = 79 * hash + this.soLuong;
        hash = 79 * hash + Objects.hashCode(this.ngay);
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
        final phieuNhap other = (phieuNhap) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (!Objects.equals(this.maPN, other.maPN)) {
            return false;
        }
        if (!Objects.equals(this.maNV, other.maNV)) {
            return false;
        }
        if (!Objects.equals(this.maNCC, other.maNCC)) {
            return false;
        }
        if (!Objects.equals(this.maSGK, other.maSGK)) {
            return false;
        }
        return Objects.equals(this.ngay, other.ngay);
    }

}
