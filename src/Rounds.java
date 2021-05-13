import java.util.Scanner;

public class Rounds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int round;
		if(num%10>=5) {
			round = (10-num%10) + num;
		}else {
			round = num - (num%10);
		}
		System.out.println("반올림 수 : " + round);
	}

}
