package homeAssignment.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Psuedo code get original string as array declare String variable as revstr
		 * find the length of the original string Loop and get the characters(charAt)
		 * from the last index(array length -1) and store it in the revstr Once the
		 * reverse string is built come out of the loop Loop through the length if the
		 * array and check if the orgstr index value and revstr index value are not
		 * equal if not equal print "Not palindrome" and break Else print as
		 * "Palindrome"
		 */

		String orgstr = "madsm";
		String revstr = "";

		int orgstrlen = orgstr.length();
		for (int i = orgstrlen - 1; i >= 0; i--) {
			char revchar = orgstr.charAt(i);
			revstr = revstr + revchar;
		}
		/*
		 * int match = 1;
		 * for (int i = 0; i < orgstrlen - 1; i++) {
		 * if (orgstr.charAt(i) != revstr.charAt(i)) { 
		 * match = 0;
		 * break;
		 * }
		 * else
		 * {
		 * match+= 1;
		 * }
		 * }
		 * if (match == orgstrlen) {
		 * System.out.println("THe given String is a Palindrome"); }
		 * else if(match == 0)
		 * {
		 * System.out.println("THe given String is not a Palindrome"); }
		 */
		if (orgstr.equalsIgnoreCase(revstr)) {
			System.out.println("THe given String is a Palindrome");

		} else {
			System.out.println("THe given String is not a Palindrome");
		}
	}
}
