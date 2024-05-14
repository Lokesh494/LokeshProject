package program.in;

public class SecondMinimumNumber {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 600;
		a[2] = 500;
		a[3] = 200;
		a[4] = 300;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]);
	}
}
