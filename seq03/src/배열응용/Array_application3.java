package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class Array_application3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] n1 = new int[10000];
		int max = 0;
		int min = 0;
		int sum = 0;
		int dev = 0;
		System.out.print("만점자 번호는 ");
		for (int i = 0; i < n1.length; i++) {
			n1[i] = r.nextInt(451); // 0~450
			if (n1[i] == 450) {
				max++;
				System.out.print(i + " ");
			} else if (n1[i] == 0) {
				min++;
			}
		}
		System.out.println();
		for (int i : n1) {
			sum += i;
		}
		double avg = (double) sum / n1.length;
		System.out.println("만점자는 " + max + "명");
		System.out.println("0점자는 " + min + "명");
		System.out.println("평균은 " + avg + "점");

		for (int i = 0; i < n1.length; i++) {
			if (n1[i] >= avg + 50 || n1[i] <= avg - 50) {
				dev++;
			}
		}
		System.out.println("평균+50 보다 높거나 평균-50 보다 낮은 점수를 가진 사람의 수는 " + dev + "명");

		Arrays.sort(n1); // 오름차순 정렬
	}
}
