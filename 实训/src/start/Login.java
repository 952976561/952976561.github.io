package start;

import java.util.Scanner;

import bean.User;
import impl.UserDaoImpl;

public class Login {
	public Login() {
		// TODO 自动生成的构造函数存根
		 Scanner sc = new Scanner(System.in);
		 System.out.println("  请登录  ");
		 System.out.print("请输入用户名：");
		 String name = sc.next();
		 System.out.print("请输入密码：");
		 String password = sc.next();
		 User user = new User();
		 user.setName(name);
		 user.setPassword(password);
		 UserDaoImpl udi = new UserDaoImpl();
		 if (udi.selectNP(user)) {
			new MainPage();
		}else {
			System.out.println("对不起，用户名或密码输入错误！");
			System.out.println("请选择后续操作：");
			new Begin();
		}
	}
}
