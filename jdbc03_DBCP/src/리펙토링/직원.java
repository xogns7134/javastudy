package 리펙토링;

public class 직원 {
	public String name; // 다른 패키지 등 아무데서나 접근 가능
	String address; // default, 같은 패키지에서 접근 가능
	protected int salary; // 상속 받은 곳에서만 접근 가능 (다른 패키지도 가능)
	private int rrn; // 주민번호, 해당 class에서만 가능, 거의 안씀

	public String toString() {
		return name + " " + address + " " + salary + " " + rrn;
	}
}
