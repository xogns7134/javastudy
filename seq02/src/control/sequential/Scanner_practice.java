package control.sequential;

import java.util.Scanner;

public class Scanner_practice {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.");
//		String name = sc.next(); //String으로 입력한 값을 가지고 들어온다. 콘솔창에 입력
//		System.out.println("당신의 이름은 "+name+"입니다.");
//		System.out.println("나이를 입력하세요.");
//		int age = sc.nextInt(); //본래 입력은 String인데 Int로 변경해주는 함수
//		System.out.println("당신의 나이는 "+age+"살 입니다.");
		
		//Exam 1
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름은? ");
		String name = sc.next();
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		System.out.print("나의 몸무게는? ");
		double weight = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean();
		String result = "";
		if (dinner==true) {result = "나는 저녁을 먹었습니다.";}
		else {result = "나는 저녁을 먹지 않았습니다.";}
		System.out.print("나의 좌우명은? ");
		sc.nextLine();
		String word = sc.nextLine();
		System.out.println("------------------------");
		System.out.println("내 이름은 "+name+"입니다.");
		System.out.println("내 키는 "+height+"입니다.");
		System.out.println("내 몸무게는 "+weight+"입니다.");
		System.out.println(result);
		System.out.println("나의 좌우명은 "+word+" 입니다.");
	}
}
