package 스레드;

public class 별스레드 extends Thread{
	//동시에 돌아가는 부품이 된다
	// run() --> 동시에 실행하고 싶은 프로세스를 넣어주면 된다
	// start() --> 동시에 시작한다
	
	@Override //표시, @ Annotation(표시)
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
