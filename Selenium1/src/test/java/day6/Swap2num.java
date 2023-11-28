package day6;

public class Swap2num {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int temp;
		System.out.println("Before swapping value of A:"+a);
		System.out.println("Before swapping value of B:"+b);
		temp=a;//
		a=b;
		b=temp;
		
		System.out.println("After swapping value of A:"+a);
		System.out.println("After swapping value of B:"+b);
	}

}
