package control.loop;

import java.util.Random;

import javax.swing.JOptionPane;

public class Complication {
	public static void main(String[] args) {
		// 숫자 맞추기 게임
		Random r = new Random();
		int target = r.nextInt(99) + 1; // 0부터 ()안의 숫자보다 하나 적은 범위까지
										// 지정하지 않으면 +-21억
		int count = 1;
		while (true) {
			String data1 = JOptionPane.showInputDialog("숫자 입력");
			int data2 = Integer.parseInt(data1); // 데이터 타입 통일하기
			if (target == data2) {
				System.out.println("정답입니다. 정답은 " + target);
				System.out.println("게임을 종료합니다.");
				System.out.println("총 시도 횟수 " + count + "회");
				System.exit(0);
				break;
			} else {
				System.out.println("정답이 아닙니다.");
				System.out.println("다시 시도해주세요.");
				count++;
				if (target > data2) {
					System.out.println("정답은 " + data2 + " 이상 입니다.");
				} else {
					System.out.println("정답은 " + data2 + " 이하 입니다.");
				} // else
			} // else
		} // while

	} // main
} // class
