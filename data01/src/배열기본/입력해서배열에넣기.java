package 배열기본;

import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열에넣기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자 입력 : ");
			numbers[i] = sc.nextDouble();
		}
		sc.close(); // 통로 닫기
		System.out.println(Arrays.toString(numbers));
	}
}
