
public class reverseString {
	public static void main(String[] args) {
		String S = "Selenium";
		int leng = S.length();
		String rev = "";
		for (int i = leng - 1; i >= 0; i--) {
			rev = rev + S.charAt(i);

		}
		System.out.println(rev);
	}

}
