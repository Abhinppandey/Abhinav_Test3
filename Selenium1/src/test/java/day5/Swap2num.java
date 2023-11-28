package day5;

public class Swap2num {
	public static void main(String[] args) {
		/*
		 * int a = 1; int b = 2; int temp;
		 * System.out.println("Before swapping value of a:" + a);
		 * System.out.println("Before swapping value of b:" + b); temp = a;// temp=1 a =
		 * b; b = temp; System.out.println("After swapping value of a:" + a);
		 * System.out.println("After swapping value of b:" + b);
		 */

		int a = 1;
		int b = 2;
		System.out.println("Before swapping value of a:" + a);
		System.out.println("Before swapping value of b:" + b);
		a = a + b;// a=3
		b = a - b;// 1
		a = a - b;
		System.out.println("After swapping value of a:" + a);
		System.out.println("After swapping value of b:" + b);

	}

}
