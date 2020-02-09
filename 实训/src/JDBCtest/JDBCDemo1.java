package JDBCtest;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCDemo1 {
	private static final String URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
	private static final String USER = "root";
	private static final String PWD = "123";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection)DriverManager.getConnection(URL, USER, PWD);
			stmt = conn.createStatement();
			String sql = "select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getLong("Sno")+",");
				System.out.print(rs.getString("Sname")+",");
				System.out.print(rs.getString("Ssex")+",");
				System.out.print(rs.getInt("Sage")+",");
				System.out.println(rs.getString("Sdept"));
				//System.out.println("\n");
			}
			stmt.close();
			conn.close();
			} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
