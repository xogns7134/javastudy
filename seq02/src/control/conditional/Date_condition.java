package control.conditional;

import java.util.Date;

public class Date_condition {
	public static void main(String[] args) {
		Date day = new Date();
		int hour = day.getHours(); // 시
		int min = day.getMinutes(); // 분
		int sec = day.getSeconds(); // 초
		int year = day.getYear() + 1900; // 년
		int month = day.getMonth() + 1; // 월
		int today = day.getDate(); // 일 0~6, 0이 일요일
		int day1 = day.getDay(); // 요일

		String result1 = "";
		String result2 = "";
		String result3 = "";
		// 1번 문제
		if (year >= 2000) {
			result1 = "밀레니엄 세대시군요.";
		} else {
			result1 = "밀레니엄 세대가 아니시군요.";
		}
		// 2번 문제
		switch (day1) {
		case 0:
		case 6:
			result2 = "오늘은 쉬는 날";
			break;
		default:
			result2 = "오늘은 열심히 공부하는 날";
			break;
		}
		// 3번 문제
		switch (month) {
		case 2:
			result3 = month + "월은 28일까지 있다.";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			result3 = month + "월은 30일까지 있다.";
			break;
		default:
			result3 = month + "월은 31일까지 있다.";
		}
		// 출력
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
