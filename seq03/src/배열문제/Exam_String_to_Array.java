package 배열문제;

import java.util.Scanner;

public class Exam_String_to_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String num = sc.next();
		String num1 = num.trim();
		String tel = "";
		String mid = "";
		String correct = "";
		String[] num2 = num1.split("-");
		if (num2[0].equals("011")) {
			tel = "SK";
		} else if (num2[0].equals("019")) {
			tel = "LG";
		} else {
			tel = "KT";
		}
		if (num2[1].length() >= 4) {
			mid = "최신폰";
		} else {
			mid = "올드폰";
		}
		if (num2[0].length() + num2[1].length() + num2[2].length() >= 10) {
			correct = "유효한 전화번호";
			System.out.println("해당 전화번호는 " + tel + "통신사의 " + mid + "이며 " + correct + "입니다.");
		} else {
			correct = "유효하지 않은 전화번호";
			System.out.println("해당 전화번호는 " + correct + " 입니다.");
		}
	}
}
