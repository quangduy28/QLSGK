package dao;

import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;

import model.sachGiaoKhoa;

public class sachGiaoKhoaDAO implements DAOInterface<sachGiaoKhoa> {

	public static sachGiaoKhoaDAO getInstance() {
		return new sachGiaoKhoaDAO();
	}

	@Override
	public int insert(sachGiaoKhoa t) {
		int ketQua = 0;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = c.createStatement();
			String sql = "INSERT INTO sachGiaoKhoa (id, tenSach, namXB, tenChuBien, tenNXB, soLuong)" +
					" VALUES ('" + t.getMaSach() + "' , '" + t.getTenSach() + "' , " + t.getNamXuatBan() + " , '"
					+ t.getTenChuBien() + "' , '" + t.getTenNXB() + "')";

			ketQua = st.executeUpdate(sql); // sl dong bi thay doi

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public boolean insert2(sachGiaoKhoa t) {

		String sql = "INSERT INTO sachGiaoKhoa(id, tenSach, namXB, tenChuBien, tenNXB, soLuong) "
				+ "VALUES(?,?,?,?,?,?)";

		try {
			Connection c = JDBCUtil.getConnection();
			SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
			ps.setString(1, t.getMaSach());
			ps.setString(2, t.getTenSach());
			ps.setInt(3, t.getNamXuatBan());
			ps.setString(4, t.getTenChuBien());
			ps.setString(5, t.getTenNXB());
			ps.setInt(6, t.getSoLuong());

			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int updata(sachGiaoKhoa t) {
		int ketQua = 0;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = c.createStatement();
			String sql = "UPDATE sachGiaoKhoa" +
					"SET" +
					" tenSach='" + t.getTenSach() + "'" +
					", namXB=" + t.getNamXuatBan() +
					", tenChuBien='" + t.getTenChuBien() + "'" +
					", tenNXB='" + t.getTenNXB() + "'" +
					" WHERE id='" + t.getMaSach() + "'";

			ketQua = st.executeUpdate(sql); // sl dong bi thay doi

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public boolean updata2(sachGiaoKhoa t) {

		// try {
		// Connection c = JDBCUtil.getConnection();
		// Statement st = c.createStatement();
		//
		// return st.executeUpdate(sql) > 0;
		//
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		return false;
	}

	@Override
	public int delete(sachGiaoKhoa t) {
		int ketQua = 0;
		try {
			Connection c = JDBCUtil.getConnection();
			Statement st = c.createStatement();
			String sql = "DELETE from Book" +
					" WHERE id='" + t.getMaSach() + "'";

			ketQua = st.executeUpdate(sql); // sl dong bi thay doi

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<sachGiaoKhoa> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public sachGiaoKhoa selectById(sachGiaoKhoa t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<sachGiaoKhoa> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<sachGiaoKhoa> getList() {
		ArrayList<sachGiaoKhoa> list = new ArrayList<>();
		String sql = "SELECT *FROM sachGiaoKhoa";
		try {
			Connection c = JDBCUtil.getConnection();
			SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
			SQLServerResultSet rs = (SQLServerResultSet) ps.executeQuery();
			while (rs.next()) {
				sachGiaoKhoa sgk = new sachGiaoKhoa();
				sgk.setMaSach(rs.getString("id"));
				sgk.setTenSach(rs.getString("tenSach"));
				sgk.setNamXuatBan(rs.getInt("namXB"));
				sgk.setTenChuBien(rs.getString("tenChuBien"));
				sgk.setTenNXB(rs.getString("tenNXB"));
				sgk.setSoLuong(rs.getInt("soLuong"));

				list.add(sgk);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean delete2(sachGiaoKhoa t) {
		String sql = "delete from sachGiaoKhoa where id=?";
		try {
			Connection c = JDBCUtil.getConnection();
			SQLServerPreparedStatement ps = (SQLServerPreparedStatement) c.prepareStatement(sql);
			ps.setString(1, t.getMaSach());
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean in() {
		return false;
	}

}
