package program.in;

public class CountofSentences {
	public static void main(String[] args) {
		String s1 = "Lokeshloki04@gmail.com";
		int s = 0, cp = 0, sp = 0, d = 0;
		String small = "", caps = "", digit = "", spcl = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c >= 48 && c <= 57) {
				d++;
				digit = digit + c;
			} else if (c >= 65 && c <= 90) {
				cp++;
				caps = caps + c;
			} else if (c >= 96 && c <= 122) {
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
