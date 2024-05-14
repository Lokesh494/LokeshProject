package program.in;

public class TwoDimension {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 4, 5 }, { 2, 4, 5, 8 } };
		int min = a[0][0];
		for (int i = 0; i < 2; i++) { // row
			for (int j = 0; j < 4; j++) { // column
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
