package program.in;

public class SwapwithThirdVariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swaping a is " + " " + a);
		System.out.println("before swaping b is " + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swaping a is " + " " + a);
		System.out.println("after swaping b is " + " " + b);
	}
}
