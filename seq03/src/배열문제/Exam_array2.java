package 배열문제;

import java.util.Scanner;

public class Exam_array2 {
	public static void main(String[] args) {
		// Exam 1
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("숫자 입력 : ");
			a[i] = sc.nextInt();
		}
		System.out.println(a[0]+a[2]);
		
		// Exam 2
		String b[] = new String[3];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.next();
		}
		System.out.println(b[0]+" 보다는 "+b[1]);
	}
}
