package program.in;

public class ButterflyShuttle {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 6, 7, 8, 2, 4, 9 };
		int in = a.length / 2;
		for (int i = in - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		for (int i = a.length - 1; i >= in; i--) {
			System.out.println(a[i]);
		}
	}
}
