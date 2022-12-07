/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import database.JDBCUtil;
import java.util.ArrayList;
import model.nhaCC;

public class nhaCCDAO implements DAOInterface<nhaCC> {

    @Override
    public int insert(nhaCC t) {
        return 1;
    }

    @Override
    public boolean insert2(nhaCC t) {
        String sql = "INSERT INTO nhaCC(maNCC, tenNCC, phone, diaChi) "
                + "VALUES(?,?,?,?)";

        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaNhaCC());
            ps.setString(2, t.getTenNhaCC());
            ps.setString(3, t.getPhone());
            ps.setString(4, t.getDiaChi());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int updata(nhaCC t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updata2(nhaCC t) {
        String sql = "update nhaCC set tenNCC=?, phone=?, diaChi=?" + " where maNCC=?";
        try {
            java.sql.Connection c = (java.sql.Connection) JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getTenNhaCC());
            ps.setString(2, t.getPhone());
            ps.setString(3, t.getDiaChi());
            ps.setString(4, t.getMaNhaCC());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int delete(nhaCC t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete2(nhaCC t) {
        String sql = "delete from nhaCC where maNCC=?";
        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaNhaCC());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<nhaCC> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public nhaCC selectById(nhaCC t) {
        String sql = "select *from nhaCC where maNCC=?";
        try {

            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1, t.getMaNhaCC());
            SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
            if (rs.next()) {
                nhaCC nv = new nhaCC();
                nv.setMaNhaCC(rs.getString("maNCC"));
                nv.setTenNhaCC(rs.getString("tenNCC"));
                nv.setPhone(rs.getString("phone"));

                nv.setDiaChi(rs.getString("diaChi"));
                return nv;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public ArrayList<nhaCC> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<nhaCC> getList() {
        ArrayList<nhaCC> list = new ArrayList<>();
        String sql = "SELECT *FROM nhaCC";
        try {
            java.sql.Connection c = JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
            while (rs.next()) {
                nhaCC nc = new nhaCC();
                nc.setMaNhaCC(rs.getString("maNCC"));
                nc.setTenNhaCC(rs.getString("tenNCC"));
                nc.setPhone(rs.getString("phone"));
                nc.setDiaChi(rs.getString("diaChi"));

                list.add(nc);
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
