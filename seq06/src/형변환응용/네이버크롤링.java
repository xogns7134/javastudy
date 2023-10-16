package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {
	public static void main(String[] args) {
		Connection conn = Jsoup.connect("http://www.naver.com");
		System.out.println(conn); // 연결 담당
		try {
			Document doc = conn.get(); // html 문서
			System.out.println(doc);
			Elements list = doc.select("span"); // tag들의 목록을 ArrayList 안에 넣음
			// 조건에 맞는 태그들의 리스트를 객체
			System.out.println(list.size());
			//System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 위험한 상황 = 외부자원 연결(CPU, file), network 연결
		// try-catch로 해결
	}
}
