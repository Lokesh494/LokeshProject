package program.in;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 12321;
		int rev = 0;
		int temp = num;
		while (num > 0) {
			int n = num % 10;
			rev = (rev * 10) + n;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
