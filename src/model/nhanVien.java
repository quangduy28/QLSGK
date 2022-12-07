
package model;

import java.util.Date;
import java.util.Objects;

public class nhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String gioiTinh;
    private String chucVu;
    private String diaChi;

    public nhanVien() {
    }

    public nhanVien(String maNhanVien, String tenNhanVien,  String gioiTinh, String chucVu, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
 
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

   

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
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
        hash = 89 * hash + Objects.hashCode(this.maNhanVien);
        hash = 89 * hash + Objects.hashCode(this.tenNhanVien);
   
        hash = 89 * hash + Objects.hashCode(this.gioiTinh);
        hash = 89 * hash + Objects.hashCode(this.chucVu);
        hash = 89 * hash + Objects.hashCode(this.diaChi);
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
        final nhanVien other = (nhanVien) obj;
        if (!Objects.equals(this.maNhanVien, other.maNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.tenNhanVien, other.tenNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.gioiTinh, other.gioiTinh)) {
            return false;
        }
        if (!Objects.equals(this.chucVu, other.chucVu)) {
            return false;
        }
        return Objects.equals(this.diaChi, other.diaChi);
    }

    @Override
    public String toString() {
        return "nhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", gioiTinh=" + gioiTinh + ", chucVu=" + chucVu + ", diaChi=" + diaChi + '}';
    }
    
}
 