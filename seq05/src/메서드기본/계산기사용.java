package 메서드기본;

import org.omg.CORBA.PUBLIC_MEMBER;

public class 계산기사용 {
	public static void main(String[] args) {
		// 계산기의 add()기능을 사용하고 싶으면
		// 램에 계산기 원본을 이용해서
		// 대상을 가져다 놓고 난 다음
		// 필요한 메서드를 사용한다.
		// ->객체 생성 먼저 한 후, 필요한 메서드를 선택해서 사용
		// cal 변수 안에 계산기 생성된 것의 위치(주소)가 들어있음.
		// ->생성된 주소가 있어야 메서드 사용이 가능
		계산기 cal = new 계산기();
		cal.add();
		// 계산기.add는 불가능
		// 반드시 new 사용
		int total = cal.add2();
		System.out.println(total - 1000);

		int total2 = cal.add3(3500, 5);
		System.out.println(total2 - 1000);

		int total3 = cal.add4(10000);
		// 입력한 값 10000원에 미수금 2000원을 더해서 리턴한 다음
		// 1000을 빼서 출력
		System.out.println(total3 - 1000);
	}
}
