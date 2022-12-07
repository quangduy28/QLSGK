
//Dùng cho frmLogin
package dao;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.sql.Connection;
import database.JDBCUtil;
import java.sql.SQLException;
import java.util.ArrayList;
import model.accountManager;


public class accountManagerDAO implements DAOInterface<accountManager>{

    @Override
    public int insert(accountManager t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insert2(accountManager t) {
         String sql = "INSERT INTO accountManager(username, password, role, maNV) "
                    + "VALUES(?,?,?,?)";
        
            try {
                Connection c = JDBCUtil.getConnection();
                  SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
                  ps.setString(1, t.getTenDangNhap());
                  ps.setString(2,t.getMatKhau());
                  ps.setString(3, t.getRole());
                  ps.setString(4, t.getMaNV());
                  
                  return ps.executeUpdate() > 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
    }

    @Override
    public int updata(accountManager t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(accountManager t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<accountManager> selectAll() {
//       
     return null;
    }

    @Override
    public accountManager selectById(accountManager t) {
        String sql = "select *from accountManager where username=?";
        try {
            
        
        java.sql.Connection c =JDBCUtil.getConnection();
        SQLServerPreparedStatement ps =  (SQLServerPreparedStatement) c.prepareStatement(sql);
        ps.setString(1, t.getTenDangNhap());
        SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
        if(rs.next()){
                    accountManager ac = new accountManager();
                    ac.setTenDangNhap(rs.getString("username"));
                    ac.setMatKhau(rs.getString("password"));
                    ac.setRole(rs.getString("role"));
                    ac.setMaNV(rs.getString("maNV"));
             
                    return ac;
                }
        
        c.close();
       } catch (Exception e) {
           e.printStackTrace();
        }
      
      return null;
      
    }

    @Override
    public ArrayList<accountManager> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<accountManager> getList() {
       ArrayList<accountManager> list = new ArrayList<>();
            String sql = "SELECT *FROM accountManager";
            try {
                Connection c = JDBCUtil.getConnection();
                SQLServerPreparedStatement ps =  (SQLServerPreparedStatement) c.prepareStatement(sql);
                SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
                while(rs.next()){
                    accountManager ac = new accountManager();
                    ac.setTenDangNhap(rs.getString("username"));
                    ac.setMatKhau(rs.getString("password"));
              
                    ac.setRole(rs.getString("role"));
                    ac.setMaNV(rs.getString("maNV"));
                   
                    list.add(ac);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
    }
    
    //Kiểm tra user,pass
    public accountManager checkLogin(String tenDangNhap, String matKhau){
        String sql = "SELECT username, password, role, maNV FROM accountManager"
                +" WHERE username=? and password=?";
        try {
            Connection c = (Connection) JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1,tenDangNhap);
            ps.setString(2,matKhau);
             SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
             if(rs.next()) {
             accountManager ac = new accountManager();
             ac.setTenDangNhap(tenDangNhap);
             ac.setMatKhau(matKhau);
             ac.setRole(rs.getString("role"));
             ac.setMaNV(rs.getString("maNV"));
             
             return ac;
             }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //dùng kt quên mk
     public accountManager checkLogin2(String tenDangNhap, String maNV, String role){
        String sql = "SELECT username, password, role, maNV FROM accountManager"
                +" WHERE username=? and maNV=? and role=?";
        try {
            Connection c = (Connection) JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1,tenDangNhap);
            ps.setString(2,maNV);
            ps.setString(3,role);
             SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
             if(rs.next()) {
             accountManager ac = new accountManager();
             ac.setTenDangNhap(tenDangNhap);
             ac.setMatKhau(rs.getString("password"));
             ac.setRole(role);
             ac.setMaNV(maNV);
             
             return ac;
             }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    

    @Override
    public boolean updata2(accountManager t) {
        String sql = "update accountManager set password=?, role=?, maNV=?"+" where username=?";
        try {
            Connection c = (Connection) JDBCUtil.getConnection();
            SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
            ps.setString(1,t.getMatKhau());
            ps.setString(4,t.getTenDangNhap());
            ps.setString(2, t.getRole());
            ps.setString(3, t.getMaNV());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
   

    @Override
    public boolean delete2(accountManager t) {
        String sql = "delete from accountManager where username=?";
        try {
             Connection c = JDBCUtil.getConnection();
             SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
             ps.setString(1,t.getTenDangNhap());           
             return ps.executeUpdate() > 0;
             
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete3(String tenDangNhap){
         String sql = "delete from accountManager where username=tenDangNhap";
        try {
             Connection c = JDBCUtil.getConnection();
             SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);    
             return ps.executeUpdate() > 0;
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }

    @Override
    public boolean in() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
