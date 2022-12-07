
package model;

import java.util.Objects;

public class accountManager {
    private String tenDangNhap;
    private String matKhau;
    private String role;
    private String maNV;

    public accountManager() {
    }

    public accountManager(String tenDangNhap, String matKhau, String role, String maNV) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.role = role;
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getRole() {
        return role;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.tenDangNhap);
        hash = 71 * hash + Objects.hashCode(this.matKhau);
        hash = 71 * hash + Objects.hashCode(this.role);
        hash = 71 * hash + Objects.hashCode(this.maNV);
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
        final accountManager other = (accountManager) obj;
        if (!Objects.equals(this.tenDangNhap, other.tenDangNhap)) {
            return false;
        }
        if (!Objects.equals(this.matKhau, other.matKhau)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return Objects.equals(this.maNV, other.maNV);
    }

    @Override
    public String toString() {
        return "accountManager{" + "tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", role=" + role + ", maNV="
                + maNV + '}';
    }

}
