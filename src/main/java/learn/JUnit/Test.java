package learn.JUnit;


public class Test {
	public static void main(String[] args) {
		// get a number in the first argument
		int number = 11;

		assert number <= 10; // stops if number > 10

		System.out.println("Pass");

	}
}
