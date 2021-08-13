package homeAssignment.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calObj = new Calculator();

		int sum = calObj.add(5, 100, 15);
		int sub = calObj.sub(78, 66);
		double product = calObj.mul(10, 50);
		float divide = calObj.divide(4f, 8f);

		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The Subtraction of the numbers is " + sub);
		System.out.println("The product of the numbers is " + product);
		System.out.println("The Division of the numbes is " + divide);
	}

}
