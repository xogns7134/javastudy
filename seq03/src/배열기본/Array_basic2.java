package 배열기본;

public class Array_basic2 {
	public static void main(String[] args) {

		int[] s = { 10, 15, 20, 10 };
		System.out.println("배열이 들어있는 주소 " + s);

		System.out.println(s[0]); // s안의 주소가 가르키는 첫 번째 값을 프린트
		System.out.println(s[1]); // s안의 주소가 가르키는 두 번째 값을 프린트
		System.out.println(s[2]); // s안의 주소가 가르키는 세 번째 값을 프린트
		System.out.println(s[3]); // s안의 주소가 가르키는 네 번째 값을 프린트
		System.out.println(s.length); // s의 길이

		int[] s2 = { 1, 2, 3 };
		// 전체 변수의 개수, 메모리 크기
		// 참조형 변수는 4바이트 크기라고 가정
		// 총 메모리 크기 는 변수 3개 + length 1개 = 4개, 16바이트
	}
}
