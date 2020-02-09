package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//�����ר���������ݿ���������Դ�ر�
public class BaseDao {
	private static final String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8"; ;
	private static final String user = "root" ;
	private static final String pwd = "123" ;
	Connection conn = null;
	Statement stamt = null;
	ResultSet res = null ;
	//�������ݿ�
	protected Connection getConnetion(){
		//��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ����
			conn = DriverManager.getConnection(url, user, pwd);
			//System.out.println(conn);
			return conn ;
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return conn;
	}
	
	//�ر����ݿ����Դ
	protected void closeAll(Connection conn , Statement stat , ResultSet res) {
		//�ر���Դ
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
		//�ر���Դ
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
