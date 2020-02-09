package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//这个类专门用于数据库连接与资源关闭
public class BaseDao {
	private static final String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8"; ;
	private static final String user = "root" ;
	private static final String pwd = "123" ;
	Connection conn = null;
	Statement stamt = null;
	ResultSet res = null ;
	//连接数据库
	protected Connection getConnetion(){
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//获取连接
			conn = DriverManager.getConnection(url, user, pwd);
			//System.out.println(conn);
			return conn ;
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return conn;
	}
	
	//关闭数据库等资源
	protected void closeAll(Connection conn , Statement stat , ResultSet res) {
		//关闭资源
		try {
			if (res!=null) {
				res.close();
			}
			if (stat!=null) {
				stat.close();
			}
			if (conn!=null) {
				conn.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void closeAll(Connection conn , PreparedStatement pstat , ResultSet res) {
		//关闭资源
		try {
			if (res!=null) {
				res.close();
			}
			if (pstat!=null) {
				pstat.close();
			}
			if (conn!=null) {
				conn.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
