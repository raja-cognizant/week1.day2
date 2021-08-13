package homeAssignment.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,7,6,8};
		// Sorting the array
		Arrays.sort(arr);
		// looping through the array
		for (int i = 0; i < arr.length; ++i) {
			int temp = i + 1;
			if (temp != arr[i]) {
				System.out.println("The missing number is " + temp);
				break;
			}

		}

	}

}
