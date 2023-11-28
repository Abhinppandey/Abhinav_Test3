package day6;

public class RemoveJunk {
	public static void main(String[] args) {
		String S="WTY%^*Abhinav";
		S=S.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S);
	}

}
