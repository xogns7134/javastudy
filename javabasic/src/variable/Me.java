package variable;

public class Me {

	public static void main(String[] args) {
		// 기본형 데이터 변수에 저장하는 것 연습
		// 기본형 데이터 = 정수, 실수, 문자1, 논리
		int age = 27;
		double height = 175.5;
		char gender = '남'; 	// 한 글자만 입력할 때는 무조건 ''
		boolean food = false;
		
		System.out.println("오늘은 월요일입니다.");
		System.out.println("내 나이는 " + age +"살 입니다.");
		System.out.println("내 키는 "+height+"cm 입니다.");
		System.out.println("내 성별은 "+gender+"성 입니다.");
		if (!food == true)
		{System.out.println("오늘 밥을 먹었습니다.");}
		else
		{System.out.println("오늘 밥을 먹지 않았습니다.");}

	}

}
