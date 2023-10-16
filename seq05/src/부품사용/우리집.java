package 부품사용;

import 부품만들기.Phone;
import 부품만들기.TV;

public class 우리집 {
	public static void main(String[] args) {
		TV mytv = new TV();
		mytv.ch = 7;
		mytv.vol = 9;
		mytv.onOff = false;
		System.out.println(mytv.ch);
		System.out.println(mytv.vol);
		System.out.println(mytv.onOff);
		
		TV yourtv = new TV();
		yourtv.ch = 9;
		yourtv.vol = 12;
		yourtv.onOff = true;
		System.out.println(yourtv.ch);
		System.out.println(yourtv.vol);
		System.out.println(yourtv.onOff);
		
		Phone p1 = new Phone();
		p1.size = 11;
		p1.speaker = "바나나사";
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		System.out.println("p1 >> "+p1);
		
		
		Phone p2 = new Phone();
		p2.size = 9;
		p2.speaker = "메론사";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		System.out.println("p2 >> "+p2);
	}
}
