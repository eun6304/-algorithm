import java.util.Scanner;

public class GcfLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ����� & �ּҰ���� ���ϱ�");
		System.out.print("����1�Է�>> ");
		int num1 = sc.nextInt();
		System.out.print("����2�Է�>> ");
		int num2 = sc.nextInt();
		int div = 2;
		while(true) {
			if(num1 % div == 0 && num2 % div == 0) {
				break;
			}else {
				div++;
			}

		}
		System.out.println("�ִ����� : " + div);
		System.out.println("�ּҰ���� : " + (num1*num2)/div);
	}

}
