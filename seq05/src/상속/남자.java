package 상속;

public class 남자 extends 사람 {
	// 사람 클래스를 확장해서 남자 클래스를 만들겠다.
	// 2개의 멤버 변수, 3개의 멤버 메서드를 갖고 태어남.
	
	int speed;
	
	public void run() {
		System.out.println("뛰다.");
	}
}
