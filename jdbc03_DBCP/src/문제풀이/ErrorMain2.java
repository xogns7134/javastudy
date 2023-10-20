package 문제풀이;

public class ErrorMain2 {
	public static void main(String[] args) {
		Error2 e = new Error2();
		try {
			e.arr2();
		} catch (Exception e1) {
			System.out.println("main()에서 배열 인덱스 에러 예외처리함");
		}
	}
}
