package control.conditional;

import java.util.Scanner;

public class Exam_condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		System.out.println("짜장면, 라면, 회 중에 하나를 골라주세요.");
		String food = sc.next();
		switch (food) {
		case "짜장면":
			result = "중국집으로 가요";
			break;
		case "라면":
			result = "분식집으로 가요";
			break;
		case "회":
			result = "횟집으로 가요";
			break;
		default: result = "그냥 안먹어요";
			break;
		}
		System.out.println(result);
	}
}
