package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		// 순서가 있는 데이터를 모으고 싶을 때
		// 컬렉션(리스트 형태)
		// ArrayList
		ArrayList list = new ArrayList();
		// Collection상속 - add(), ...
		// 모든 데이터 타입 가능
		list.add(100);
		list.add(11.1);
		list.add(true);
		list.add('a');
		list.add("Jang");
		list.add(new Button());
		System.out.println(list);
		// ArrayList 안에 toString()이 재정의(Override) 되어있다
		// list의 주소가 가리키는 데이터들을 프린트하도록

		System.out.println(list.get(0)); // 위치 값은 0부터 시작
		System.out.println(list.size());

		// Jang을 꺼내서 taehoon을 붙여 프린트
		System.out.println(list.get(4) + "taehoon");
		// for문을 이용해서 하나씩 꺼내와 모든 데이터를 아래와 같이 프린트
		// "값 >> " + 100
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i));
		}
		for (Object object : list) {
			System.out.println("값 >> " + object);
		}
		System.out.println(list.contains("Jang")); // Jang 을 포함하고 있는지
		System.out.println(list.indexOf("Jang")); // Jang 의 위치
		System.out.println(list.isEmpty());
		list.remove(0); // 파괴형함수
		list.remove(11.1);
		list.add(0, "추가"); // 0번 앞에 넣기
		list.set(0, "재수정"); // 0번에 넣기
		System.out.println(list);
	}
}
