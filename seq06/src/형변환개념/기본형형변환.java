package 형변환개념;

public class 기본형형변환 {
	public static void main(String[] args) {
		// 정수형 1, 2, 4, 8
		// byte, short, int, long
		byte x = 127;
		int y = x; // 형변환 (byte(작은) --> int(큰)) 자동 형변환
		byte z = (byte) y; // 형변환(int(큰) --> byte(작은))
		// 강제로 CPU가 가지고 와서 잘라서 RAM에 집어 넣는다.
		// 강제 형변환
		
		int a = 1000;
		byte b = (byte) a;
		System.out.println(b);
		// 이 코드가 틀린 이유
		// byte의 범위는 -128~127
		// 그러므로 b의 값이 1000이 아닌 다른 값으로 오출력 된다.
	}
}
