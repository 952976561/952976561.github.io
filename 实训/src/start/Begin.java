package start;

import java.util.Scanner;

import user.ForgetPWD;

public class Begin {
	public Begin() {
		// TODO �Զ����ɵĹ��캯�����
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int login;
		System.out.println("	              ��������ϵͳ");
		while (b) {
			System.out.println("-----------------------------------------");
			System.out.println("��ѡ���������:\n 1.��¼ϵͳ  2.�������� 3.�˳�");
			while (true) {
				try {
					login = sc.nextInt();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("��������ֵ �Ͳ�����ţ�");
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
				System.out.println("���˳���ллʹ��");
				System.exit(0);
				
			default:
				System.out.println("��������ȷ�Ĳ������");
				break;
			}
		}	
	}
	
	public static void main(String[] args) {
		new Begin();
	}
}
