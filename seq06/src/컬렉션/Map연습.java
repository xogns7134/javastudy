package 컬렉션;

import java.util.HashMap;

public class Map연습 {
	public static void main(String[] args) {
		// map - 매핑시킨다. 연결시킨다.
		// key : 값의 쌍으로 매핑시켜서 저장. 겹쳐서는 안됨

		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "멜론");
		map.put("icecream", "아이스크림");
		System.out.println(map);
		System.out.println(map.get("apple"));
		map.put("apple", "풋사과"); // Override
		System.out.println(map.get("apple"));
		map.remove("apple");
		System.out.println(map);
		map.replace("icecream", "아이스크림", "초코아이스크림");
		System.out.println(map);
	}
}
