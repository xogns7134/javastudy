package 예외처리;

public class 문제발생클래스 {
	public static void main(String[] args) {
		System.out.println("1. 실행");
		try {
			System.out.println("2. 0으로 나누기 " + 10 / 0);
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // 0~2까지인데 3 호출
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("0으로 나누는 것은 불가");
		}
		System.out.println("3. 프린트 가능 여부");
	}
}
