package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class Array_application4 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[1000];
		int n300 = 0;
		int n400 = 0;
		int n500 = 0;
		int n600 = 0;
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000); // 0~999
			if (n[i] >= 600) {
				n300++;
				n400++;
				n500++;
				n600++;
			} else if (n[i] >= 500) {
				n300++;
				n400++;
				n500++;
			} else if (n[i] >= 400) {
				n300++;
				n400++;
			} else if (n[i] >= 300) {
				n300++;
			}
		}
		System.out.println("300 이상의 개수 : " + n300 + "개");
		System.out.println("400 이상의 개수 : " + n400 + "개");
		System.out.println("500 이상의 개수 : " + n500 + "개");
		System.out.println("600 이상의 개수 : " + n600 + "개");
		System.out.println(Arrays.toString(n));
		Arrays.sort(n); // 오름차순 정렬
		System.out.println(Arrays.toString(n));
		System.out.println("최소값은 " + n[0]);
		System.out.println("최대값은 " + n[n.length - 1]);
	}
}
