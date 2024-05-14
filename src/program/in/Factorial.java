package program.in;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		while (num > 0) {
			fact = num * fact;
			num = num - 1;
		}
		System.out.println("Factorial of 5 is " + " " + fact);
	}
}
