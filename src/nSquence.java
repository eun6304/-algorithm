import java.util.Scanner;

public class nSquence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n ют╥б : ");
		int num = sc.nextInt();
		int start = 1;
		
		for(int i = 0; i<num; i++) {
			start += i;
			System.out.print(start + " ");
		}
	}

}
