package JDBCtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class JDBCdemo2 {
	private static final String URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
	private static final String USER = "root";
	private static final String PWD = "123";
	 public static void main(String[] args) {
		try {
			//声明Connection 连接对象
			Connection con;
			//创建数据库驱动Driver
			String driver = "com.mysql.jdbc.Driver";
			//加载驱动
			Class.forName(driver);
			//创建连接对象驱动
			con = (Connection)DriverManager.getConnection(URL, USER, PWD);
			//创建sql
			String insert = "insert into test.student(Sno,Sname,Ssex,Sage,Sdept) values(?, ?, ?, ?, ?)";
			//创建PreparedStatement对象
			PreparedStatement pstmt = con.prepareStatement(insert);
			//设置参数
			pstmt.setLong(1, 20181668);
			pstmt.setNString(2, "伍人凡");
			pstmt.setLong(3, '男');
			pstmt.setLong(4, 22);
			pstmt.setNString(5, "CS");
			//返回行数
			int row = pstmt.executeUpdate();
			if (row == 1) {
				System.out.println("mysql数据库插入一条数据成功！");
				//创建ResultSet结果集，接收主键
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("数据自动生成的ID为："+id);
					//关闭结果集对象
					//rs.close();
				}
			}
			pstmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
