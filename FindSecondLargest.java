package homeAssignment.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 11, 4, 6, 7 }; 
		Arrays.sort(data); // 2,3,4,6,7,11
		int arrlength = data.length;
		System.out.println("The second largest number in the array is: " + data[arrlength - 2]);

	}

}
