import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱݾ� �Է� : ");
		int change = sc.nextInt();
		System.out.println();
		
		System.out.printf("�ܵ� : %d��%n"
				+ "10000�� : %d��%n5000�� : %d��%n"
				+ "1000�� : %d��%n500�� : %d��%n"
				+ "100�� : %d��"
				,change,change/10000,(change%10000)/5000,
				(change%5000)/1000,(change%1000)/500,
				(change%500)/100);
		
	}

}
