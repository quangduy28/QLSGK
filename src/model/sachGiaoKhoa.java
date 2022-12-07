package model;

import java.util.Objects;

public class sachGiaoKhoa {
	private String tenSach;
	private String maSach;
	private int namXuatBan;
	private String tenChuBien;
	private String tenNXB;
        private int soLuong;
	
	public sachGiaoKhoa() {
		
	}
	public sachGiaoKhoa(String tenSach, String maSach, int namXuatBan, String tenChuBien, String tenNXB, int soLuong) {
		this.soLuong = soLuong;
		this.tenSach = tenSach;
		this.maSach = maSach;
		this.namXuatBan = namXuatBan;
		this.tenChuBien = tenChuBien;
		this.tenNXB = tenNXB;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int double1) {
		this.namXuatBan = double1;
	}
	public String getTenChuBien() {
		return tenChuBien;
	}
	public void setTenChuBien(String tenChuBien) {
		this.tenChuBien = tenChuBien;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.tenSach);
        hash = 53 * hash + Objects.hashCode(this.maSach);
        hash = 53 * hash + this.namXuatBan;
        hash = 53 * hash + Objects.hashCode(this.tenChuBien);
        hash = 53 * hash + Objects.hashCode(this.tenNXB);
        hash = 53 * hash + this.soLuong;
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
        final sachGiaoKhoa other = (sachGiaoKhoa) obj;
        if (this.namXuatBan != other.namXuatBan) {
            return false;
        }
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (!Objects.equals(this.tenSach, other.tenSach)) {
            return false;
        }
        if (!Objects.equals(this.maSach, other.maSach)) {
            return false;
        }
        if (!Objects.equals(this.tenChuBien, other.tenChuBien)) {
            return false;
        }
        return Objects.equals(this.tenNXB, other.tenNXB);
    }

    @Override
    public String toString() {
        return "sachGiaoKhoa{" + "tenSach=" + tenSach + ", maSach=" + maSach + ", namXuatBan=" + namXuatBan + ", tenChuBien=" + tenChuBien + ", tenNXB=" + tenNXB + ", soLuong=" + soLuong + '}';
    }
    
    
	

	
	


}
