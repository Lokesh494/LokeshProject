package program.in;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 6, 7, 8, 4 };
		List<int[]> asList = Arrays.asList(a);
		Collections.shuffle(asList);
		System.out.println(Arrays.toString(a));
	}
}
