package 배열기본;

public class Array_basic {
	public static void main(String[] args) {
		// 배열 : 많은 양의 데이터를 다루기 위함.
		// 1. 배열을 만들 때 이미 값을 아는 경우
		int[] s = { 1, 2, 3, 4 }; // 참조형 변수 (변수에 주소가 저장)

		// 2. 배열을 만들 때 값을 모르고 있는 경우 (후에 값을 넣을 경우)
		int[] s2 = new int[4]; // 초기값은 자동초기화 {0,0,0,0}
		s2[0] = 100; // s2의 첫 번째 값에 100 넣기
		s2[1] = 200; // s2의 두 번째 값에 200 넣기
		s2[2] = 300; // s2의 세 번째 값에 300 넣기
		s2[s2.length - 1] = 400; // s2의 마지막 값에 400 넣기

		// s와 s2의 길이를 프린트
		System.out.println(s.length);
		System.out.println(s2.length);

		// s와 s2의 값 프린트
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[3]);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
