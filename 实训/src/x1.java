import java.util.Scanner;

public class x1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			System.out.println("请输入一个字符串");
			String str = sc.next();
			System.out.println("num="+num+",str="+str);
			System.out.println("请输入一个整数");
		}
	}
}
