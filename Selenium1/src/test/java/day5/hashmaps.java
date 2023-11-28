package day5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmaps {
	public static void main(String[] args) {
		/*
		 * Map<String, Integer> phonebook=new HashMap<>(); phonebook.put("Abhinav",
		 * 8800); phonebook.put("Smrati", 9900);
		 * 
		 * 
		 * Set<String> keys=phonebook.keySet();
		 * 
		 * for (String string : keys) {
		 * System.out.println(string+":"+phonebook.get(string));
		 * 
		 * }
		 * 
		 */

		Map<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Abhinav", 123);
		phonebook.put("Ram", 889);

		Set<String> keys = phonebook.keySet();
		for (String string : keys) {
			System.out.println(string + "-->" + phonebook.get(string));
		}
	}

}
