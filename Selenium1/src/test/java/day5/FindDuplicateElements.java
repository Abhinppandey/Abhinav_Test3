package day5;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		String names[] = { "Java", "Python", "Java", "C#" };
		Set<String> Store = new HashSet<String>();
		for (String name : names) {
			if (Store.add(name) == false) {
				System.out.println("Duplicate element is :" + name);

			}

		}
	}

}
