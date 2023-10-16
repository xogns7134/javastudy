package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Set연습 {
	public static void main(String[] args) {
		Random r = new Random();

		// 배열
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(lotto));

		// ArrayList, 중복 가능성 있음
		ArrayList lotto2 = new ArrayList();
		while (lotto2.size() < 6) {
			int lotto2num = r.nextInt(45) + 1;
			if (!lotto2.contains(lotto2num)) {
				lotto2.add(lotto2num);
			}
		}
		System.out.println(lotto2);

		// HashSet, 중복 없음
		HashSet lotto3 = new HashSet();
		while (lotto3.size() < 6) {
			lotto3.add(r.nextInt(45) + 1);
		}
		System.out.println(lotto3);
	}
}
