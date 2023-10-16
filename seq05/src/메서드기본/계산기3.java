package 메서드기본;

public class 계산기3 {
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return Math.abs(a - b);
	}
	public int amprice(int a, int b) {
		return a*b;
	}
	public int totalprice(int a, int b, int c) {
		return a*(b+c);
	}
	public int div(int a, int b, int c) {
		return a*(b+c)/(b+c);
	}
}
