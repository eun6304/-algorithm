import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[10];
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		int i = 0;
		
		while(num>0) {
			arr[i] = num % 2;
			num /= 2;
			i++;
		}
		
		i--;
		
		for(; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
