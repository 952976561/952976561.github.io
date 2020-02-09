package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

import bean.User;
import dao.BaseDao;
import dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao{
	Connection conn = null;
	Statement stamt = null;
	ResultSet res = null ;
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	
		//用于登录验证
	@Override
	public boolean selectNP(User user) {
		// TODO Auto-generated method stub
		//连接数据库
		conn = getConnetion();
		String sql = "select * from `user`"
				+ " where name='"+user.getName()+"' and "
						+ "password='"+user.getPassword()+"'";
		
		try {
			stamt  = conn.createStatement();
			res = stamt.executeQuery(sql);
			System.out.println("登录成功!");
			return res.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(conn, stamt, res);
		}
		return false;
	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
