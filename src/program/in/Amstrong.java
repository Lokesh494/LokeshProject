package program.in;

public class Amstrong {
	public static void main(String[] args) {
		int num = 153;
		int arm = 0;
		int temp = num;
		while (num > 0) {
			int n = num % 10;
			arm = arm + (n * n * n);
			num = num / 10;
		}
		if (arm == temp) {
			System.out.println("Amstrong number");
		} else {
			System.out.println("Not amstrong numer");
		}
	}
}
