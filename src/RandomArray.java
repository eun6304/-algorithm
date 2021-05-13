import java.util.Arrays;
import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[8];
		System.out.print("배열에 있는 모든 값 : ");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt(101);
			System.out.print(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		System.out.println("\n가장 큰 값 : " + arr[arr.length-1]);
		System.out.println("가장 작은 값 : " + arr[0]);
	}

}
