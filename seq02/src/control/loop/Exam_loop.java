package control.loop;

public class Exam_loop {
	public static void main(String[] args) {
		// 1번 문제
		int i = 0;
		while (i < 10) {
			System.out.print("*");
			i++;
		}
		System.out.print("\n");
		// 2번 문제
		int a = 0;
		while (a < 5) {
			System.out.print("커피*");
			a++;
		}
		System.out.print("\n");

		// 3번 문제
		int b = 0;
		while (b < 3) {
			System.out.println("커피*우유");
			b++;
		}

		// 4번 문제
		int c = 0;
		while (c < 3) {
			System.out.println(c + 1 + " : 짱!");
			c++;
		}
	}
}
