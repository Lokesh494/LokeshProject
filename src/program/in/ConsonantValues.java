package programs.in;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ConsonantValues {
	public static void main(String[] args) {
		String s = "welcome to java class";
		char[] ch = s.toCharArray();
		int count = 0;
		Map<Character, Integer> mp = new TreeMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U')) {
					if (mp.containsKey(c)) {
						Integer in = mp.get(ch[i]);
						mp.put(c, in + 1);
					} else {
						mp.put(c, 1);
					}

				}

			}
			Set<Entry<Character, Integer>> entrySet = mp.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
				System.out.println(entry);
			}
		}

	}
}
