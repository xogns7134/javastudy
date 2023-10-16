package control.loop;

import java.util.Scanner;

public class Exam_loop2 {
	public static void main(String[] args) {
		// 1번 문제
		int result1 = 0;
		for (int a = 33; a <= 222; a++) {
			result1 += a;
		}
		System.out.println("33부터 222까지 모두 더한 숫자는? " + result1);
		int result2 = 0;
		for (int b = 55; b <= 4500; b = b + 2) {
			result2 += b;
		}
		System.out.println("55부터 4500까지 2씩 건너뛰면서 더한 숫자는? " + result2);
		int result3 = 0;
		for (int c = 0; c <= 6000; c = c + 5) {
			result3 += c;
		}
		System.out.println("0부터 6000까지 5씩 건너뛰면서 더한 숫자는? " + result3);

		// 2번 문제
		int result4 = 0;
		for (int d = 1; d <= 1000; d = d + 3) {
			if (d % 5 == 0) {
				result4 = result4;
			} else {
				result4 += d;
			}
			if (result4 > 100) {
				break;
			}
		}
		System.out.println("1부터 1000까지 3씩 건너뛰면서 5의 배수는 제외하고 더한 값이 100을 넘을 때의 값은 " + result4);

		// 3번 문제
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int you = 0;
		int bts = 0;
		int result5 = 0;
		while (true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4)종료 >> ");
			int num = sc.nextInt();
			if (num == 1) {
				iu++;
			}
			else if (num == 2) {
				you++;
			}
			else if (num == 3) {
				bts++;
			}
			else if (num == 4) {
				System.out.println("종료합니다.");
				System.out.println("아이유 득표수>> "+iu);
				System.out.println("유재석 득표수>> "+you);
				System.out.println("방탄 득표수>> "+bts);
				System.exit(0);
				break;
			}
		}
	} // main
} // class
