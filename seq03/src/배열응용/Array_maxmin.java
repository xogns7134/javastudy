package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class Array_maxmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("숫자 입력 : ");
			a[i] = sc.nextInt();
			System.out.println(Arrays.toString(a));

			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			int min = a[0];
			int max = a[a.length - 1];
			System.out.println("최소값 : " + min);
			System.out.println("최대값 : " + max);
		}
	}
}
