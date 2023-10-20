package 메서드연습;

import java.util.Arrays;

public class 가게 {
	public static void main(String[] args) {
		int coffeePrice = 5000;
		int coffeeCount = 15;
		계산기 cal = new 계산기();
		int coffeetotal = cal.mul(coffeePrice, coffeeCount);
		if (coffeetotal >= 50000) {
			System.out.println("최종 계산 금액 : " + (coffeetotal - 5000));
		} else {
			System.out.println("최종 계산 금액 : " + coffeetotal);
		}

		// 1. array()를 호출하고 결과 받아온 후, 배열 첫번째 값에 100 더해서 프린트
		int[] arr = cal.array();
		arr[0] = arr[0] + 100;
		System.out.println(Arrays.toString(arr));
		
		// 2. get2()호출하여 결과 받아온 후 비밀번호 1111로 수정 후 전체 멤버 정보 프린트
		MemberVO bag = cal.get2("win2", "1234", "win2", "010");
		bag.setPw("1111");
		System.out.println(bag);
		
		// 3. get4() 호출하여 결과 받아온 후, 맨 뒤에 "입니다. 환영해주세요."를 붙여서 프린트
		String s = cal.get4("홍길동", 100);
		System.out.println(s+"입니다. 환영해주세요.");
	}
}
