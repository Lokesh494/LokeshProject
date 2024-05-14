package program.in;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(a + "");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}
