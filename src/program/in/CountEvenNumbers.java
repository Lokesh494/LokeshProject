package program.in;

public class CountEvenNumbers {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 102; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("Count is" + " " + count);
	}
}
