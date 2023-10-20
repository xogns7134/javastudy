package 리펙토링;

public class 매니저 extends 직원 {
	private int bonus;

	private void test() {
		System.out.println("관리할 사람 이름 : " + name);
		System.out.println("관리할 사람 월급 : " + salary);
		System.out.println("관리할 사람 주소 : " + address);
		// System.out.println("관리할 사람 주민번호 : " + rrn);
		// rrn은 private이라 상속받았어도 사용 불가능
	}
}
