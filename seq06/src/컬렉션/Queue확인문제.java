package 컬렉션;

import java.util.LinkedList;

public class Queue확인문제 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		System.out.println("전체 시험 볼 과목 : " + list);
		for (int i = 0; i < list.size() + 1; i++) {
			list.remove(0);
			System.out.println((i + 1) + "일차 시험 본 후 남은 과목 : " + list);
		}
	}
}
