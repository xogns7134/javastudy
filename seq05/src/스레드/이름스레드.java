package 스레드;

public class 이름스레드 extends Thread{
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.print("장태훈");
		}
		System.out.println("");
	}
}
