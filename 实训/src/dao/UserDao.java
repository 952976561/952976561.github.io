package dao;

import java.util.List;

import bean.User;

public interface UserDao {
	boolean insert(User user);
	boolean delete(User user);
	boolean selectNP(User user);
	List<User> select();
	boolean update(User user);
}
