
package dao;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import com.sun.jdi.connect.spi.Connection;
import database.JDBCUtil;
import java.sql.Date;
import java.util.ArrayList;
import model.accountManager;
import model.nhanVien;

public class nhanVienDAO implements DAOInterface<nhanVien> {

    @Override
    public int insert(nhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert2(nhanVien t) {
        String sql = "INSERT INTO nhanVien(maNV, tenNV, gioiTinh, chucVu, diaChi) "
                + "VALUES(?,?,?,?,?)";

        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaNhanVien());
            ps.setString(2, t.getTenNhanVien());

            ps.setString(3, t.getGioiTinh());
            ps.setString(4, t.getChucVu());
            ps.setString(5, t.getDiaChi());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int updata(nhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(nhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<nhanVien> selectAll() {
        return null;
    }

    @Override
    public nhanVien selectById(nhanVien t) {
        String sql = "select *from nhanVien where maNV=?";
        try {

            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaNhanVien());
            SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
            if (rs.next()) {
                nhanVien nv = new nhanVien();
                nv.setMaNhanVien(rs.getString("maNV"));
                nv.setTenNhanVien(rs.getString("tenNV"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setDiaChi(rs.getString("diaChi"));
                return nv;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    @Override
    public ArrayList<nhanVien> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<nhanVien> getList() {
        ArrayList<nhanVien> list = new ArrayList<>();
        String sql = "SELECT *FROM nhanVien";
        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
            while (rs.next()) {
                nhanVien nv = new nhanVien();
                nv.setMaNhanVien(rs.getString("maNV"));
                nv.setTenNhanVien(rs.getString("tenNV"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setDiaChi(rs.getString("diaChi"));

                list.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean updata2(nhanVien t) {
        String sql = "update nhanVien set tenNV=?, gioitinh=?, chucVu=?, diaChi=?" + " where maNV=?";
        try {
            java.sql.Connection c = (java.sql.Connection) JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getTenNhanVien());
            ps.setString(2, t.getGioiTinh());
            ps.setString(3, t.getChucVu());
            ps.setString(4, t.getDiaChi());
            ps.setString(5, t.getMaNhanVien());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete2(nhanVien t) {
        String sql = " delete from nhanVien where maNV=?";
        // " ALTER TABLE nhanVien NOCHECK CONSTRAINT [FK_accountManager_nhanVien]"+
        // String sql2 = " select username" +
        // " from accountManager as ac join nhanVien as nv on ac.maNV = nv.maNV" +
        // " where nv.maNV=?";
        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            // SQLServerPreparedStatement ps2 = (SQLServerPreparedStatement)
            // c.prepareStatement(sql2);
            ps.setString(1, t.getMaNhanVien());
            // ps2.setString(1, t.getMaNhanVien());
            // SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
            // while(rs.next()){
            // accountManager ac = new accountManager();
            // ac.setTenDangNhap(rs.getString("username"));
            // if(!(new accountManagerDAO().delete2(ac))){
            // return ps2.executeUpdate() > 0 ;
            // }

            // }
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean in() {
        String sql = " ALTER TABLE nhanVien  CHECK CONSTRAINT [FK_accountManager_nhanVien]";
        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
