package control.conditional;

import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String result = "";
		//if문
		if (name.equals("자바")) {
			result = "1101호로 가세요.";
		}
		else if (name.equals("파이썬")) {
			result = "1102호로 가세요.";
		}
		else if (name.equals("리눅스")) {
			result = "1103호로 가세요.";
		}
		else {result = "카운터에 가서 문의하세요.";}
		System.out.println(result);
		
		//switch문 데이터타입 : 정수만 가능, 실수는 불가능, 크기는 long 불가능
		switch (name) {
		case "자바" :
			result = "1101호로 가세요.";
			break;
		case "파이썬" :
			result = "1102호로 가세요.";
			break;
		case "리눅스" :
			result = "1103호로 가세요.";
			break;
		default :
			result = "카운터에 가서 문의하세요.";
			break;
		}
		System.out.println(result);
	}
}
