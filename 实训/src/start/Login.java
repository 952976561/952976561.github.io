package start;

import java.util.Scanner;

import bean.User;
import impl.UserDaoImpl;

public class Login {
	public Login() {
		// TODO �Զ����ɵĹ��캯�����
		 Scanner sc = new Scanner(System.in);
		 System.out.println("  ���¼  ");
		 System.out.print("�������û�����");
		 String name = sc.next();
		 System.out.print("���������룺");
		 String password = sc.next();
		 User user = new User();
		 user.setName(name);
		 user.setPassword(password);
		 UserDaoImpl udi = new UserDaoImpl();
		 if (udi.selectNP(user)) {
			new MainPage();
		}else {
			System.out.println("�Բ����û����������������");
			System.out.println("��ѡ�����������");
			new Begin();
		}
	}
}
