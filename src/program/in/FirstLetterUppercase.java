package programs.in;

public class FirstLetterUppercase {
	public static void main(String[] args) {
		String s = "welcome to java world";
		String s1 = "";
		String[] sp = s.split(" ");
		for (String str : sp) {
			char ch = str.charAt(0);
			char uC = Character.toUpperCase(ch);
			String substr = str.substring(1);
			s1 = s1 + uC + substr + " ";
		}
		System.out.println(s1);
	}
}
