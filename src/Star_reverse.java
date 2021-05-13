import java.util.Scanner;

public class Star_reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Çà °³¼ö : ");
		int num = sc.nextInt();
		
		for(int line = 1; line<=num; line++) {
			for(int star = num; star>=line; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
