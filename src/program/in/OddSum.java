package program.in;

public class OddSum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 80; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of Odd is" + " " + sum);
	}
}
