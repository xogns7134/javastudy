package operator;

import javax.swing.JOptionPane;

public class Exam_data_oper {
	public static void main(String[] args) {
		
		//Exam 1
		char pw1 = 'p';
		String pw2 = JOptionPane.showInputDialog("암호를 입력하세요");
		char pw = pw2.charAt(0);
		boolean pwcorrect;
		if (pw1 == pw) {System.out.println("PASS!"); pwcorrect = true;}
		else {System.out.println("재입력!"); pwcorrect = false;}
		
		//Exam 2
		String weight1 = JOptionPane.showInputDialog("어제의 몸무게를 입력하세요");
		String weight2 = JOptionPane.showInputDialog("오늘의 몸무게를 입력하세요");
		
		//Exam 3
		int weight11 = Integer.parseInt(weight1);
		int weight22 = Integer.parseInt(weight2);
		int weight3 = weight11 - weight22;
		boolean diet;
		if (weight3 > 2) {System.out.println("다이어트 성공!"); diet = true;}
		else {System.out.println("다이어트 실패!"); diet = false;}
		
		if (pwcorrect == true && diet == true) {System.out.println("오늘은 성공!");}
		else {System.out.println("내일 다시 도전!");};
		
		//Exam 4
		int physics = 66;
		int math = 77;
		int english = 88;
		int language = 99;
		int total = physics + math + english + language;
		double avg = total/4.0;
		System.out.println("평균 점수는 " + avg);
		
		//Exam 5
		double pi = 3.14;
		double radius = 2.2;
		double circle = radius*radius*pi;
		System.out.printf("원의 면적은 %.4f", circle); 
		System.out.print("\n");
		
		//Exam 6
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String doing = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		String today = "오늘 "+day+"에 수업 후 나는 "+doing+"할 예정";
		System.out.println(today);
		
		//Exam 7
		int num1 = 30;
		int num2 = 40;
		int sum = num1+num2;
		double div = (double)num1/(double)num2;
		int rest = num1%num2;
		System.out.println("두 수를 더한 값은 "+sum);
		System.out.println("두 수를 나누면 "+div);
		System.out.println("두 수를 나눈 나머지는 "+rest);
	}
}
