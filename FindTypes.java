package homeAssignment.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
	char[] charArr = test.toCharArray();
	for (int i = 0; i < charArr.length; i++) {
		if(Character.isLetter(charArr[i])) {
			letter++;
		}
		else if(Character.isDigit(charArr[i])){
			num++;
		}
		else if (Character.isSpaceChar(charArr[i])) {
			space++;
		}
		else {
			specialChar++;
		}
	}
	System.out.println("letter: " + letter);
	System.out.println("space: " + space);
	System.out.println("number: " + num);
	System.out.println("specialCharcter: " + specialChar);
	}

}
