package 예외처리;

public class 예외처리main2 {
	public static void main(String[] args) {
		에러발생2 error = new 에러발생2();
		try {
			error.call();
		} catch (Exception e) {
			System.out.println("함수를 호출한 곳에서 예외처리");
		}
	}
}
