package control.loop;

import java.util.Scanner;

public class Complication2 {
	public static void main(String[] args) {
		// 숫자 비교하기 게임
		Scanner sc = new Scanner(System.in);
		int big = 0; // 숫자 1이 더 큰 경우
		int small = 0; // 같은 경우
		int same = 0; // 숫자 2가 더 큰 경우
		while (true) {
			System.out.print("숫자1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("숫자2 입력 : ");
			int num2 = sc.nextInt();
			if (num1 > num2) {
				System.out.println("숫자1이 더 큽니다.");
				big++;
			} // if
			else if (num1 == num2) {
				System.out.println("숫자1과 숫자2가 같습니다.");
				same++;
			} // else if
			else {
				System.out.println("숫자2가 더 큽니다.");
				small++;
			} // else
			System.out.print("더 하시겠습니까? y or n : ");
			String exit = sc.next();
			char exit2 = exit.charAt(0); // exit의 첫글자 가져오기
			if (exit2 == 'n') {
				System.out.println("게임을 종료합니다.");
				System.out.println("숫자1이 더 큰 횟수는 " + big + "회 입니다.");
				System.out.println("숫자2가 더 큰 횟수는 " + small + "회 입니다.");
				System.out.println("숫자1과 2가 같은 횟수는 " + same + "회 입니다.");
				System.exit(0);
				break;
			} // if
		} // while
	} // main
} // class
