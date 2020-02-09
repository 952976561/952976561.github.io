package JDBCtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.zip.InflaterInputStream;

import com.mysql.jdbc.Driver;

public class DogDemo {
	private static final String URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
	private static final String USER = "root";
	private static final String PWD = "123";
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Dog dog = new Dog();
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PWD);
			String sql = "insert into test.dog(dogId,dogName) values(?,?) ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dog.getId());
			pstmt.setString(2, dog.getName());
			//pstmt.executeUpdate();
			int row = pstmt.executeUpdate();
			if (row == 1) {
				System.out.println("�ɹ�����һ����Ϣ��");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("�������ݿ�ʧ�ܣ�");
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
	}
}
