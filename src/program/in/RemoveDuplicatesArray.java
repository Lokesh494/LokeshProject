package program.in;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		int a[] = new int[7];
		a[0] = 10;
		a[1] = 40;
		a[2] = 20;
		a[3] = 30;
		a[4] = 10;
		a[5] = 20;
		a[6] = 10;
		Set<Integer> s = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		for (Integer inte : s) {
			System.out.println(inte);
		}
	}
}
