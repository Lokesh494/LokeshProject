package program.in;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "malayalam";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("The String is Palindrome");
		} else {
			System.out.println("The String is not Palindrome");
		}
	}
}
