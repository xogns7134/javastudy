package control.loop;

import java.util.Random;
import java.util.Scanner;

public class Complication3 {

	public static void main(String[] args) {
		int count = 0; // 시행횟수
		int win = 0; // 승리횟수
		int lose = 0; // 패배횟수
		int draw = 0; // 무승부횟수
		// 내가 낼 가위바위보
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("내가 낼 것은? ");
			String me = sc.next();
			System.out.println("가위, 바위, 보!");
			// 컴퓨터가 낼 가위바위보
			Random r = new Random();
			int com = r.nextInt(3); // 0, 1, 2
			String result = "";
			if (com == 0) {
				result = "가위";
			} else if (com == 1) {
				result = "바위";
			} else {
				result = "보";
			}
			System.out.println("컴퓨터 : " + result);
			// 결과 출력
			if (me.equals("가위")) {
				if (result.equals("가위")) {
					System.out.println("무승부");
					draw++;
				}
				if (result.equals("바위")) {
					System.out.println("패배");
					lose++;
				}
				if (result.equals("보")) {
					System.out.println("승리");
					win++;
				}
				count++;
			} else if (me.equals("바위")) {
				if (result.equals("가위")) {
					System.out.println("승리");
					win++;
				}
				if (result.equals("바위")) {
					System.out.println("무승부");
					draw++;
				}
				if (result.equals("보")) {
					System.out.println("패배");
					lose++;
				}
				count++;
			} else if (me.equals("보")) {
				if (result.equals("가위")) {
					System.out.println("패배");
					lose++;
				}
				if (result.equals("바위")) {
					System.out.println("승리");
					win++;
				}
				if (result.equals("보")) {
					System.out.println("무승부");
					draw++;
				}
				count++;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.print("계속하시겠습니까? 네 or 아니오 : ");
			String exit = sc.next();
			if (exit.equals("아니오")) {
				System.out.println("게임을 종료합니다.");
				System.out.println("총 시행 횟수는 "+count+"번 그 중 ");
				System.out.println("승리 횟수는 " + win + "번");
				System.out.println("패배 횟수는 " + lose + "번");
				System.out.println("무승부 횟수는 " + draw + "번 입니다.");
				System.exit(0);
				break;
			}
		} // while
	} // main
} // class
