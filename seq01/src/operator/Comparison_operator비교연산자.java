package operator;

public class Comparison_operator비교연산자 {
	public static void main(String[] args) {
		// 비교연산자의 결과는 반드시 boolean(논리형)
		// 비교연산자의 비교값은 반드시 기본데이터만 가능하다.
		int x = 200;
		int y = 100;
		System.out.println("x와 y가 일치하는가 " + (x == y));
		System.out.println("x와 y가 다른 값인가 " + (x != y));
		System.out.println("x가 y 이상인가 " + (x >= y));
		System.out.println("x가 y 초과인가 " + (x > y));
		System.out.println("y가 x 이상인가 " + (x <= y));
		System.out.println("y가 x 초과인가 " + (x < y));
	}
}
