package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collection확인문제 {
	public static void main(String[] args) {

		System.out.println("1. 가고 싶은 여행지 5곳 프린트(set) \n");
		HashSet travel = new HashSet();
		travel.add("서울");
		travel.add("대전");
		travel.add("대구");
		travel.add("부산");
		travel.add("울산");
		System.out.println("가고 싶은 여행지 5곳 " + travel + "\n");

		System.out.println("2. 안방에는 TV, 거실에는 소파, 부엌에는 냉장고, 현관에는 신발(map) \n");
		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "소파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		System.out.println("전체 " + room);
		System.out.println("현관에 있는것은 " + room.get("현관"));
		room.replace("거실", "책상");
		System.out.println("변경 후 전체 " + room + "\n");

		System.out.println("3. 오늘 내가 할 일 우선순위 5개(list) \n");
		ArrayList work = new ArrayList();
		work.add("수업 듣기");
		work.add("소스트리 올리기");
		work.add("깃허브에 연동하기");
		work.add("로아 하기");
		work.add("큐브 돌기");
		System.out.println("전체 " + work);
		System.out.println("첫 번째 할 일은 " + work.get(0) + ", 마지막 할 일은 " + work.get(work.size() - 1));
		work.set(1, "청소");
		System.out.println("변경 후 전체 " + work);
	}
}
