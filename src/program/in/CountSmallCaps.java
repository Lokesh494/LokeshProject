package programs.in;

public class CountSmallCaps {
	public static void main(String[] args) {
		String s1 = "LokeshLoki47@gmail.com";
		int small = 0, caps = 0, digits = 0, ch = 0;
		String s = "", c = "", n = "", spl = "";
		for (int i = 0; i < s1.length(); i++) {
			char chAt = s1.charAt(i);
			if (Character.isLowerCase(chAt)) {
				small++;
				s=s+chAt;
			}else if (Character.isUpperCase(chAt)) {
				caps++;
				c=c+chAt;
			}else if (Character.isDigit(chAt)) {
				digits++;
				n=n+chAt;
			}else {
				ch++;
				spl=spl+chAt;
			}
		}
		System.out.println("Lower case is "+ " "+small);
		System.out.println("Upper case is "+" "+caps);
		System.out.println("Digit Count is"+" "+digits);
		System.out.println("Special Charcter"+" "+ch);
	}
}
