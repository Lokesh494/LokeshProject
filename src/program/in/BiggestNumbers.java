package program.in;

public class BiggestNumbers {
	public static void main(String[] args) {
		int a = 23, b = 78, c = 34, d = 92;
		if (a > b && a > c && a > d) {
			System.out.println("A is greatest number" + " " + a);
		} else if (b > a && b > c && b > d) {
			System.out.println("B is greatest number" + " " + b);
		} else if (c > a && c > b && c > d) {
			System.out.println("C is greatest number" + " " + c);
		} else {
			System.out.println("D is greatest number" + " " + d);
		}
	}
}
