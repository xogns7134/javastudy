package 스레드;

public class 골뱅이스레드 extends Thread{
	
	//동시에 처리하고 싶은 코드 넣기
	@Override //표시, @ Annotation(표시)
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("@");
		}
	}
}
