import java.util.Scanner;

public class x1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			System.out.println("������һ���ַ���");
			String str = sc.next();
			System.out.println("num="+num+",str="+str);
			System.out.println("������һ������");
		}
	}
}
