import java.util.Scanner;

public class Wage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		double wage;
		
		if(time>8) {
			wage = (time -8)*5000*1.5 + 40000;
			
		}else {
			wage = time*5000;
		}
		
		System.out.println("총 임금은 " + (int)wage + "원 입니다.");
	}

}
