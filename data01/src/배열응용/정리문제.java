package 배열응용;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import 배열기본.Print;

public class 정리문제 {
	public static void main(String[] args) {
		// 1. int값 5개 55, 66, 77, 22, 33 입력받아서 최소값 구해서 프린트
		Scanner sc = new Scanner(System.in);
		int[] n1 = new int[5];
		for (int i = 0; i < n1.length; i++) {
			n1[i] = sc.nextInt();
		} // for
		int n1min = n1[0];
		for (int i = 0; i < n1.length; i++) {
			if (n1[i] < n1min) {
				n1min = n1[i];
			} // if
		} // for
		System.out.println(n1min);

		// 2. 랜덤 값 20개 발생시켜 값의 범위 0~899를 배열에 넣고 최대값 프린트
		Random r = new Random();
		int[] n2 = new int[20];
		int n2max = n2[0];
		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextInt(900);
			if (n2[i] > n2max) {
				n2max = n2[i];
			} // if
		} // for
		System.out.println(n2max);

		// 3. s1, s2 두 문자열이 동일한지, 글자 수를 비교하여 누가 더 큰지 프린트
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		boolean eq = s1.equals(s2);
		System.out.println("두 문자열이 동일한가? " + eq);
		if (s1.length() > s2.length()) {
			System.out.println("s1의 글자 수가 더 크다.");
		} else if (s1.length() < s2.length()) {
			System.out.println("s2의 글자 수가 더 크다.");
		} else {
			System.out.println("글자 수가 동일하다.");
		}

		// 4. s3 에서 특정 글자 추출해서 대문자로 변경해서 프린트
		String s3 = "나는 진짜 java programmer가 되었어";
		int s3beginindex = s3.indexOf("j");
		int s3endindex = s3.lastIndexOf("r");
		String s3sub = s3.substring(s3beginindex, s3endindex + 1);
		System.out.println(s3sub.toUpperCase());

		// 5. s4에서 첫글자를 추출하여 1인 경우 남자, 2인 경우 여자로 프린트
		String s4 = "2056521";
		if (s4.charAt(0) == '1') {
			System.out.println("남자");
		} else if (s4.charAt(0) == '2') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 입력입니다.");
		}

		// 6. 배열에서 모든 데이터를 꺼내어 합한 값을 프린트
		String s5 = "[10, 20, 50, 40, 30]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5 = s5.trim(); // 양 옆 공백 제거
		String[] s6 = s5.split(", ");
		int sum = 0;
		for (int i = 0; i < s6.length; i++) {
			sum = sum + Integer.parseInt(s6[i]);
		}
		Print.arr(s6);
		System.out.println(sum);
		
		// 7. 위 6번에서 생성된 배열의 값을 int[]로 옮겨서 오름차순 정렬 후 프린트
		int[] s7 = new int[5];
		for (int i = 0; i < s7.length; i++) {
			s7[i] = Integer.parseInt(s6[i]);
		}
		Arrays.sort(s7);
		Print.arr(s7);
	} // main
} // class
