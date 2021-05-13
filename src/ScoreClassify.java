
public class ScoreClassify {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] str = score.split(",");
		String [] hak = {"A","B","C","D","F"};
		int [] cnt = new int[5];
		
		for(int i = 0; i<hak.length; i++) {
			int num = 0;
			for(int j = 0; j<str.length; j++) {
				if(hak[i].equals(str[j])) {
					num++;
				}
			}
			cnt[i] = num;
			System.out.println(hak[i] + " : " + cnt[i] + "Έν");
		}
		
	}

}
