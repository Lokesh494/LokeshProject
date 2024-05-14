package program.in;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelsValues {
	public static void main(String[] args) {
		String s = "i welcome you to java";
		char[] ch = s.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				if (mp.containsKey(c)) {
					Integer inte = mp.get(ch[i]);
					mp.put(c, inte + 1);

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
