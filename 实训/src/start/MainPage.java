package start;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

import dao.BaseDao;

public class MainPage {
	
		private int choose;
		
	public MainPage() {
		// TODO �Զ����ɵĹ��캯�����
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------");
		System.out.println("1.���  2.����  3.��Ʒ����  4.̨�Ź���  5.�û�����  6.�˳�");
		System.out.println("---------------------------------------------------");
		choose = sc.nextInt();
		switch (choose) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
	
			break;
		case 6:
			System.out.println("���˳���");
			System.exit(0);
			break;
		default:
			break;
		}
	}
}
