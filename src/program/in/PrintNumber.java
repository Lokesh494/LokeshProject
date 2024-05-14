package program.in;

public class PrintNumber {
	public static void main(String[] args) {
		String s = "Lokesh123";
		String s2 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (Character.isDigit(c)) {
				s2 = s2 + c;
			}
		}
		System.out.println(s2);
	}
}
