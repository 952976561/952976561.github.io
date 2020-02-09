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
			//����Connection ���Ӷ���
			Connection con;
			//�������ݿ�����Driver
			String driver = "com.mysql.jdbc.Driver";
			//��������
			Class.forName(driver);
			//�������Ӷ�������
			con = (Connection)DriverManager.getConnection(URL, USER, PWD);
			//����sql
			String insert = "insert into test.student(Sno,Sname,Ssex,Sage,Sdept) values(?, ?, ?, ?, ?)";
			//����PreparedStatement����
			PreparedStatement pstmt = con.prepareStatement(insert);
			//���ò���
			pstmt.setLong(1, 20181668);
			pstmt.setNString(2, "���˷�");
			pstmt.setLong(3, '��');
			pstmt.setLong(4, 22);
			pstmt.setNString(5, "CS");
			//��������
			int row = pstmt.executeUpdate();
			if (row == 1) {
				System.out.println("mysql���ݿ����һ�����ݳɹ���");
				//����ResultSet���������������
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("�����Զ����ɵ�IDΪ��"+id);
					//�رս��������
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
