import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[6];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt(99) + 1;
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			System.out.println("행운의숫자 : " + arr[i]);
		}

	}

}
