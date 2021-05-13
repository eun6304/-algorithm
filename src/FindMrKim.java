
public class FindMrKim {

	public static void main(String[] args) {
		String[] names = {"Queen","Tod","Kim"};
		System.out.println(findKim(names));
		
		}
	public static String findKim(String[] names) {
		int kim = 0;
		for(int i = 0; i<names.length; i++) {
			if(names[i].equals("Kim")) {
				kim = i+1;
			}
		}
		return "김서방은 " + kim + "에 있다.";
	}

}
