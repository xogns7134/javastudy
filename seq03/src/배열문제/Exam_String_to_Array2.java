package 배열문제;

import java.util.Arrays;

public class Exam_String_to_Array2 {
	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String[] all2 = all.split(",");
		int com = 0;
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
			if (all2[i].equals("컴퓨터")) {
				com = i;
			}
			if (all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println(Arrays.toString(all2));
		System.out.println("과목의 수는 " + all2.length + "개");
		System.out.println("컴퓨터의 위치는 " + com);
		System.out.println("과목명이 세 글자 미만인 과목 수는 " + count + "개");
	}
}
