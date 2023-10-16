package control.loop;

import java.util.Scanner;

public class Exam_loop3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Exam1
		int result1 = 0;
		System.out.print("시작값1 입력 : ");
		int start1 = sc.nextInt();
		System.out.print("종료값1 입력 : ");
		int end1 = sc.nextInt();
		while (start1 <= end1) {
			result1 += start1;
			start1++;
		}
		System.out.println("숫자1부터 숫자2까지 모두 더한 값은 " + result1);
		
		// Exam2
		int result2 = 0;
		System.out.print("시작값2 입력 : ");
		int start2 = sc.nextInt();
		System.out.print("종료값2 입력 : ");
		int end2 = sc.nextInt();
		System.out.print("점프값 입력 : ");
		int jump = sc.nextInt();
		while (start2 <= end2) {
			result2 += start2;
			start2 = start2 + jump;
			if (result2 > 100) {
				break;
			} //if
		} //while
		System.out.println("더한 값은 "+result2);
	} //main
} //class
