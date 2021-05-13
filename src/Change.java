import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int change = sc.nextInt();
		System.out.println();
		
		System.out.printf("잔돈 : %d원%n"
				+ "10000원 : %d개%n5000원 : %d개%n"
				+ "1000원 : %d개%n500원 : %d개%n"
				+ "100원 : %d개"
				,change,change/10000,(change%10000)/5000,
				(change%5000)/1000,(change%1000)/500,
				(change%500)/100);
		
	}

}
