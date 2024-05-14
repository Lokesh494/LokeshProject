package programs.in;

public class VowelsCount {
	public static void main(String[] args) {
		String s = "Lokeshloki";
		int count = 0;
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}

		System.out.println(count);
	}
}
