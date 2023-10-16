package 컬렉션;

import java.util.ArrayList;
import java.util.Collections;

public class List확인문제 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		System.out.println("반칙 처리 전");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등 : " + list.get(i));
		}
		Collections.swap(list, 1, 3); // 순서 바꾸기
		System.out.println("반칙 처리 후");
		for (int i = 0; i < list.size(); i++) {
			if (i < 3) {
				System.out.println((i + 1) + "등 : " + list.get(i));
			} else {
				System.out.println("반칙으로 인한 탈락 :" + list.get(i));
			}
		}
	}
}
