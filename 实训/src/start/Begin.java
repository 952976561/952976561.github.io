package start;

import java.util.Scanner;

import user.ForgetPWD;

public class Begin {
	public Begin() {
		// TODO 自动生成的构造函数存根
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int login;
		System.out.println("	              餐饮管理系统");
		while (b) {
			System.out.println("-----------------------------------------");
			System.out.println("请选择后续操作:\n 1.登录系统  2.忘记密码 3.退出");
			while (true) {
				try {
					login = sc.nextInt();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("请输入数值 型操作编号！");
					sc = new Scanner(System.in);
				}
			}
			switch (login) {
			case 1:
				b = false;
				new Login();	
				break;
			case 2:
				b = false;
				new ForgetPWD();
				break;
			case 3:
				System.out.println("已退出，谢谢使用");
				System.exit(0);
				
			default:
				System.out.println("请输入正确的操作编号");
				break;
			}
		}	
	}
	
	public static void main(String[] args) {
		new Begin();
	}
}
