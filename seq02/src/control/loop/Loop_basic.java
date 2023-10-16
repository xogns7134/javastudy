package control.loop;

public class Loop_basic {
	public static void main(String[] args) {
		// 반복문은 처음값, 증감값, 조건식이 필요
		for (int i = 0; i < 10; i++)
		// 처음값; 조건식; 증감값
		{
			System.out.println(i + " i");
		}

		int start = 0; // 시작값
		while (start < 10) { // 조건식
			System.out.println(start + " start");
			start++; // 증감값
		}
	}
}
