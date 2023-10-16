package 형변환개념;

import java.util.ArrayList;

public class 형변환개념확인문제 {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); //자동형변환(업캐스팅), 오토박싱
		me.add(189.1); //자동형변환(업캐스팅), 오토박싱
		me.add(false); //자동형변환(업캐스팅), 오토박싱
		me.add('남'); //자동형변환(업캐스팅), 오토박싱
		System.out.println("1. 전체 목록 프린트");
		System.out.println(me + "\n");
		System.out.println("2. 돈 1000을 꺼내서 2000을 더해 프린트");
		System.out.println((int) me.get(0) + 2000 + "\n"); // 강제형변환(다운캐스팅), 오토언박싱
		System.out.println("3. 키 189.1을 꺼내서 10을 더해 프린트");
		System.out.println((double) me.get(1) + 10 + "\n"); // 강제형변환(다운캐스팅), 오토언박싱
		System.out.println("4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요");
		if ((boolean) me.get(2)) {
			System.out.println("배불러요 \n");
		} else {
			System.out.println("배고파요 \n");
		}
		System.out.println("5. 성별 남 꺼내서 남이면 주민번호는 1,3이예요. 아니면 주민번호는 2,4예요");
		if ((char) me.get(3) == '남') {
			System.out.println("주민번호는 1,3이예요 \n");
		} else if ((char) me.get(3) == '여') {
			System.out.println("주민번호는 2,4이예요 \n");
		} else {
			System.out.println("잘못된 입력입니다 \n");
		}
	}
}
