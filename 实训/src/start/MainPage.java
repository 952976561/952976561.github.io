package start;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

import dao.BaseDao;

public class MainPage {
	
		private int choose;
		
	public MainPage() {
		// TODO 自动生成的构造函数存根
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------------");
		System.out.println("1.点餐  2.结账  3.菜品管理  4.台号管理  5.用户管理  6.退出");
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
			System.out.println("已退出！");
			System.exit(0);
			break;
		default:
			break;
		}
	}
}
