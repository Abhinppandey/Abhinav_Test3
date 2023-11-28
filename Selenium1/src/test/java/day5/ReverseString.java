package day5;

public class ReverseString {
	public static void main(String[] args) {
		String S = "Selenium";
		int len = S.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + S.charAt(i);

		}
		System.out.println(rev);
	}

}
