package program.in;

public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 90; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of even is" + " " + sum);
	}
}
