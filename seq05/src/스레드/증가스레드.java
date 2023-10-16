package 스레드;

public class 증가스레드 extends Thread {
	public void run() {
		for (int i = 1; i < 1001; i++) {
			System.out.println("증가 " + i);
		}
	}
}
