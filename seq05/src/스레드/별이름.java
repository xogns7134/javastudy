package 스레드;

public class 별이름 {
	public static void main(String[] args) {
		별스레드 star = new 별스레드();
		이름스레드 name = new 이름스레드();
		
		star.start();
		name.start();
	}
}
