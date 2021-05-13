
public class Plus77 {

	public static void main(String[] args) {
		int i = 77;
		int j = 1;
		int sum = 0;
		
		while(true) {
			sum += i*j;
			i--;
			j++;
			
			if(i==0 && j==78) {
				break;
			}
		}
		System.out.println(sum);
	}

}
