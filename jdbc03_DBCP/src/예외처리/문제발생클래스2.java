package 예외처리;

public class 문제발생클래스2 {
	public static void main(String[] args) {
		System.out.println("1. 실행");
		try {
			System.out.println("2. 0으로 나누기 " + 10 / 0);
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // 0~2까지인데 3 호출
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
			System.out.println("0으로 나누는 것은 불가");
		} catch (ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
			System.out.println("배열 인데스 에러 발생");
		} catch (Exception e) { //수학연산에러, 배열에러도 아닌 경우
			System.out.println("기타 에러");
		} finally {
			System.out.println();
		}
		System.out.println("3. 프린트 가능 여부");
	}
}
