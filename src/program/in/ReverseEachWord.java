package program.in;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "Welcome to Java";
		String rev = "";
		String[] sp = s.split(" ");
		for (String st : sp) {
			for (int i = st.length() - 1; i >= 0; i--) {
				rev = rev + st.charAt(i);

			}
		}
		System.out.println(rev);

	}
}
