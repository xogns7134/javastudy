package 배열응용;

import 배열기본.Print;

public class 배열심화문제 {
	public static void main(String[] args) {
		// 1.
		String s = " '휴지', '블루볼펜', '지우개' +=- ";
		s = s.replace("+=-", "");
		s = s.replace("'", "");
		s = s.trim();
		String[] s1 = s.split(", ");
		Print.arr(s1);

		// 2.
		if (s1[1].substring(0, 1).equals("블루")) {
			System.out.println("파란볼펜이군요!");
		} else {
			System.out.println("빨간볼펜이군요!");
		}

		// 3.
		int min = s1[0].length();
		int minindex = 0;
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].length() < min) {
				min = s1[i].length();
				minindex = i;
			}
		}
		System.out.println("가장 짧은 문자열 길이를 가진 것의 위치는 " + minindex);
		System.out.println("그 문자열의 길이는 " + min);

		// 4.
		int[] index = new int[s1.length];
		int sum = 0;
		for (int i = 0; i < index.length; i++) {
			index[i] = s1[i].length();
			sum += index[i];
		}
		System.out.println("총 합 : " + sum);
	}
}
