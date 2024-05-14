package program.in;

public class CountWithSpecialMethods {
	public static void main(String[] args) {
		String s1 = "Lokeshloki04@gmail.com";
		int s = 0, cp = 0, sp = 0, d = 0;
		String small = "", caps = "", digit = "", spcl = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (Character.isDigit(c)) {
				d++;
				digit = digit + c;
			} else if (Character.isUpperCase(c)) {
				cp++;
				caps = caps + c;
			} else if (Character.isLowerCase(c)) {
				s++;
				small = small + c;
			} else {
				sp++;
				spcl = spcl + c;
			}
		}
		System.out.println("digits count is" + " " + d);
		System.out.println("small count is" + " " + s);
		System.out.println("caps count is" + " " + cp);
		System.out.println("spl count is" + " " + sp);
	}
}
