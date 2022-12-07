/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import database.JDBCUtil;
import java.util.ArrayList;
import model.phieuNhap;
import model.phieuXuat;

public class phieuXuatDAO implements DAOInterface<phieuXuat> {

    @Override
    public int insert(phieuXuat t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert2(phieuXuat t) {
        String sql = "INSERT INTO phieuXuat(MaPX, MaNV, MaNCC, MaSGK, Ngay,SL) "
                + "VALUES(?,?,?,?,?,?)";

        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaPX());
            ps.setString(2, t.getMaNV());

            ps.setString(3, t.getMaNCC());
            ps.setString(4, t.getMaSGK());
            ps.setString(5, t.getNgay());
            ps.setInt(6, t.getSoLuong());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int updata(phieuXuat t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updata2(phieuXuat t) {

        String sql = "update phieuNhap set MaNV=?, MaNCC=?, MaSGK=?, Ngay=?, SL=?" + " where MaPX=?";
        try {
            java.sql.Connection c = (java.sql.Connection) JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaNV());
            ps.setString(2, t.getMaNCC());
            ps.setString(3, t.getMaSGK());
            ps.setString(4, t.getNgay());
            ps.setInt(5, t.getSoLuong());
            ps.setString(6, t.getMaPX());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int delete(phieuXuat t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete2(phieuXuat t) {
        String sql = " delete from phieuXuat where MaPX=?";

        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaPX());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<phieuXuat> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public phieuXuat selectById(phieuXuat t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<phieuXuat> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<phieuXuat> getList() {
        ArrayList<phieuXuat> list = new ArrayList<>();
        String sql = "SELECT *FROM phieuXuat";
        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
            while (rs.next()) {
                phieuXuat nv = new phieuXuat();
                nv.setMaPX(rs.getString("MaPX"));
                nv.setMaNV(rs.getString("MaNV"));
                nv.setMaNCC(rs.getString("MaNCC"));
                nv.setMaSGK(rs.getString("MaSGK"));
                nv.setNgay(rs.getString("Ngay"));
                nv.setSoLuong(rs.getInt("SL"));
                list.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean in() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
