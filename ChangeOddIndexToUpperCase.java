package homeAssignment.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare the String
		 * change the string into Char array and store in Char variable 
		 * Loop through the array
		 * check if the index is odd 
		 * if yes - change the character to Uppercase
		 * Else - print it as is
		 * */
		String test = "changeme";
		char[] charArr = test.toCharArray(); //c - 0,h - 1. a - 2, n - 3, g - 4, e - 5, m - 6, e - 7  - cHaNgEmE
		for (int i = 0; i <= charArr.length - 1; i++) {
			if(i%2 == 1) {
				System.out.print(Character.toUpperCase(charArr[i]));
			}
			else {
				System.out.print(charArr[i]);
			}
		}
	}

}
