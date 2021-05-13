import java.util.Scanner;

public class GcfLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수 & 최소공배수 구하기");
		System.out.print("숫자1입력>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		int num2 = sc.nextInt();
		int div = 2;
		while(true) {
			if(num1 % div == 0 && num2 % div == 0) {
				break;
			}else {
				div++;
			}

		}
		System.out.println("최대공약수 : " + div);
		System.out.println("최소공배수 : " + (num1*num2)/div);
	}

}
