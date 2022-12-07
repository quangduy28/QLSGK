package database;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class JDBCUtil {
	public static Connection getConnection() {
	Connection c = null;
	
	try {
		
		// Đăng ký MySQL Driver với DriverManager
		DriverManager.registerDriver(new SQLServerDriver());
		
		// Các thông số
		  String url = "jdbc:sqlserver://DESKTOP-EN53EGC\\SQLEXPRESS:1433;databaseName=QLSGK" + ";encrypt=true;trustServerCertificate=true";
		String username = "sa";
		String password = "1234567890";
		
		// Tạo kết nối
		c = DriverManager.getConnection(url, username, password);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return c;
}
   
//        public static Connection getConnectionLogin() {
//                Connection c = null;
//	
//	try {
//		
//		// Đăng ký MySQL Driver với DriverManager
//		DriverManager.registerDriver(new SQLServerDriver());
//		
//		// Các thông số
//		String url = "jdbc:sqlserver://DESKTOP-8VLUOQR\\SQLEXPRESS:1433;databaseName=accountManager" + ";encrypt=true;trustServerCertificate=true";
//		String username = "sa";
//		String password = "123123";
//		
//		// Tạo kết nối
//		c = DriverManager.getConnection(url, username, password);
//		
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//        }
//              return c;  
//        }
   
   
   public static void closeConnection(Connection c) {
	   try {
		if (c!=null) {
			c.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
   
   
}