package 배열응용;

import 배열기본.Print;

public class 배열최소값찾기 {
	public static void main(String[] args) {
		int[] n = { 90, 80, 20, 60, 70 };
		int min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
			}
		}
		System.out.println(min);
		Print.arr(n);
	} // main
} // class
