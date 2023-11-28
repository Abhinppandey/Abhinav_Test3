package day6;

import java.util.HashSet;
import java.util.Set;

public class FinDuplicatElements {
	public static void main(String[] args) {
		String names[] = { "Java", "Python", "Java", "c#" };
		Set<String> Store = new HashSet<String>();
		for (String name : names) {
			if (Store.add(name) == false) {
				System.out.println("Duplicate element is :" + name);
			}

		}
	}

}