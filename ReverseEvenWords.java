package homeAssignment.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare the String
		 * split the String with a space delimiter
		 * divide by 2
		 * if reminder is 1, that is the even word, now reverse it using a for loop
		 * else print as is 
		 * */
		String test = "I am a software tester";
		String[] splitArr = test.split(" ");
		for (int i = 0; i < splitArr.length; i++) {
		if(i%2 == 1) {
			char[] evenWord = splitArr[i].toCharArray();
			for (int j = evenWord.length -1 ; j >= 0; j--) {
				System.out.print(evenWord[j]);
			}
		}
		else {
		System.out.print(splitArr[i]);
		}
		System.out.print(" ");
		}
		
		
	}

}
