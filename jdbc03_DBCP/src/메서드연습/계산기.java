package 메서드연습;

public class 계산기 {
	public void add(int x, int y) {
		int sum = x + y;
		System.out.println("x + y = " + sum);
	}

	public int add2(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public int mul(int x, int y) {
		int mul = x * y;
		return mul;
	}

	public int[] array() {
		int[] arr = { 1, 2, 3 };
		return arr;
	}

	public double[] array2() {
		double[] arr = { 1.1, 2.2, 3.3 };
		return arr;
	}

	public void get1() {
		MemberVO bag = new MemberVO();
		bag.setId("win");
		bag.setPw("1234");
		bag.setName("win");
		bag.setTel("010");
		System.out.println(bag);
	}

	public MemberVO get2(String id, String pw, String name, String tel) {
		MemberVO bag = new MemberVO();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		return bag;
	}

	public String get4(String name, int age) {
		String s = "제 이름은 " + name + "이고 나이는 " + age + "살 입니다.";
		return s;
	}

}
