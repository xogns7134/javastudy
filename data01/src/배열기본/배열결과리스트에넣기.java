package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열결과리스트에넣기 {
	public static void main(String[] args) {
		int[] n = { 100, 200, 300, 400, 500 };

		// 1. 전체 목록 프린트
		Print.arr(n);
		
		// 2. 300이상 값이 몇 개인지 카운트해서 프린트
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				count++;
			}
		} // for
		System.out.println("300 이상 값의 개수 : " + count);

		// 3. 300이상 들어있는 위치를 arraylist에 모으기
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				list.add(i);
			}
		}

		// 4. arraylist 안 인덱스의 배열의 값들에서 100 빼기
		for (int i = 0; i < list.size(); i++) {
			n[list.get(i)] -= 100;
			// n[list.get(i)] = n[list.get(i)] - 100;

		}

		// 5. 수정된 배열 전체 프린트
		Print.arr(n);
	} // main
} // class
