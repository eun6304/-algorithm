import java.util.Scanner;

public class twoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Á¤¼ö : ");
		int N = sc.nextInt();
		int num = 1;
		int[][] arr = new int [N][N];
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				arr[j][i] += num;
				num++;
				}
	
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				System.out.print(arr[i][j]+"\t");
				}
			System.out.println();
	}

}
}