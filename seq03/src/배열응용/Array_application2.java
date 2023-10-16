package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class Array_application2 {
	public static void main(String[] args) {
		// 로또 생성하기
		Random r = new Random();
		int[] n1 = new int[1000];
		for (int i = 0; i < 1000; i++) {
			n1[i] = r.nextInt(100); // 0~99
		}
		System.out.println(Arrays.toString(n1));
		int sum = 0;
		for (int i : n1) {
			sum += i;
		}
		double avg = (double) sum / n1.length;
		System.out.println("평균은 " + avg);
	}
}
