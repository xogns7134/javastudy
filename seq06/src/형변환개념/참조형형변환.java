package 형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {
	public static void main(String[] args) {
		// 참조형 형변환은 상속 관계에서만 가능
		// 가변 길이, 타입 여러개일 때 사용
		ArrayList list = new ArrayList();
		list.add("String");
		// 자동으로 Object로 변환되어서 들어감
		// String(작) --> Object(큰)
		list.add(100); // Integer(작) --> Object(큰)
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i));
		}
		String s = (String) list.get(0);
		// 이미 Object로 들어가있기 때문에 (String)이 없으면 
		// Object(큰) --> String(작) 이라서 불가능하다
		// 강제형변환
		
		list.add(new JButton("Button"));
		JButton b1 = (JButton)list.get(2);
		// 위와 마찬가지
	}
}
