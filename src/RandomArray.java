import java.util.Arrays;
import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[8];
		System.out.print("�迭�� �ִ� ��� �� : ");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt(101);
			System.out.print(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		System.out.println("\n���� ū �� : " + arr[arr.length-1]);
		System.out.println("���� ���� �� : " + arr[0]);
	}

}
