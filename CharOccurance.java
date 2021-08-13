package homeAssignment.day2;

import java.util.Iterator;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		/*
		 * int orglen = str.length();		
		 * String newstr = str.replace("e", "");
		 * int newlen = newstr.length();
		 * int occurance = orglen - newlen;
		 * System.out.println("The Character 'e' has " + occurance + " occurrences in the given String");
		 *  
		 */
		char[] charArr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i] == 'e') {
				count++;
			}
			
		}
		System.out.println("The Character 'e' has " + count + " occurrences in the given String");
	}
}
