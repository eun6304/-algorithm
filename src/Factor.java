
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");
		for(int i = 2; i <Math.sqrt(num); i++) {
			while(num % i == 0) {
				System.out.print(i + "*");
				num /= i;
			}
		}
		if(num != 1) {
			System.out.println(num);
		}
	}

}
