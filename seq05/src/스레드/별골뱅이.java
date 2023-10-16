package 스레드;

public class 별골뱅이 {
	public static void main(String[] args) {
		별스레드 t1 = new 별스레드();
		골뱅이스레드 t2 = new 골뱅이스레드();
		
		t1.start();
		t2.start();
	}
}
