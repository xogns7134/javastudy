package 컬렉션;

import java.util.HashMap;

public class Map확인문제 {
	public static void main(String[] args) {
		HashMap client = new HashMap();
		client.put(100, "김데이");
		client.put(200, "김사전");
		client.put(300, "김구조");
		client.put(400, "김자료");
		System.out.println("초기자료 " + client);
		client.remove(200);
		client.replace(300, "김충성");
		System.out.println("최신화자료" + client);
	}
}
