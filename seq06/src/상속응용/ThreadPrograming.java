package 상속응용;

public class ThreadPrograming {

	public static void main(String[] args) {
		CountThread counter = new CountThread();
		TimeThread timer = new TimeThread();
		ArrayThread img = new ArrayThread();
		
		// 스레드 시작
		counter.start();
		timer.start();
		img.start();
	}
}
