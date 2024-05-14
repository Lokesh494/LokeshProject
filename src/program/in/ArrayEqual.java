package program.in;

import java.util.Arrays;

public class ArrayEqual {
	public static void main(String[] args) {
		int a1[] = { 1, 3, 4, 6, 7, 9 };
		int a2[] = { 1, 3, 4, 6, 7, 9 };
		boolean equals = Arrays.equals(a1, a2);
		if (equals) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
	}
}
