package operator;

public class 연산시주의점 {
	public static void main(String[] args) {
		// 정수와 정수의 계산값은 반드시 정수로 나타난다
		// 소수점을 구하고 싶으면 실수연산자 사용
		
		int n1 = 5;
		int n2 = 4;
		int sum = n1 + n2;
		
		int avg1 = sum / 2;
		System.out.println(avg1); //정수연산자이기에 4로 나온다
		
		double avg2 = sum / 2;
		System.out.println(avg2); //2가 정수이기에 4.0으로 나온다
		
		double avg3 = sum / 2.0;
		System.out.println(avg3); //2.0은 실수이기에 4.5로 나온다
		
		double avg4 = (double)sum / 2;
		System.out.println(avg4); //강제타입변환(강제형변환)을
								  //이용한 계산이라 4.5로 나온다
								  //이는 기본데이터타입만 가능하다
	}
}
