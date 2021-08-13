package homeAssignment.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			String text1 = "stopa";
			String text2 = "potss"; 
			int word1len = text1.length();
			int word2len = text2.length();
			if(word1len != word2len) {
				System.out.println("Two strings that are provided are not Anagram");
			}
			else {
			char[] charArr1 = text1.toCharArray();
			Arrays.sort(charArr1);//apsst
			char[] charArr2 = text2.toCharArray();
			Arrays.sort(charArr2);//opsst
			int count = 0;
			for (int i = 0; i < charArr1.length; i++) {
				if(charArr1[i] != charArr2[i] ) {
					count = 0;
					break;
					
				}
				else {
					count++;
				}
			}
			if(count == 5) {
				System.out.println("Two strings that are provided are Anagram");
			}
			else if (count == 0){
				System.out.println("Two strings that are provided are NOT Anagram");
			}
			}
	}

}
