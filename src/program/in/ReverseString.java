package programs.in;


public class ReverseString {
	public static void main(String[] args) {
		String s = "My name is java";
		String rev = "";
		String string = "";
		String rev1 = "";
		String[] sp = s.split(" ");
		for (String string2 : sp) {

			for (int i = string2.length() - 1; i >= 0; i--) {
				char c = string2.charAt(i);
				rev1 = rev1 + c;
			}

		}
		rev = rev1;
		System.out.println(rev);
	}
}
