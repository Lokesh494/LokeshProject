package program.in;

public class SumofDigits {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while (num > 0) {
			int i = num % 10;
			sum = sum + i;
			num = num / 10;
		}
		System.out.println("Sum of digit is" + " " + sum);
	}
}
