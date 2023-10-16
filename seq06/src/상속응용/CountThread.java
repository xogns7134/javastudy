package 상속응용;

public class CountThread extends Thread {
// run(), start(), ...
	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용 넣기
		for (int i = 500; i > -1; i--) {
			System.out.println("카운트 횟수 : " + i);
			try {
				Thread.sleep(1000); // 단위 ms(밀리세컨드)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 외부의 자원(CPU)을 연결할 때는
			// 아주 위험한 순간이기 때문에
			// 위험한 순간이 발생했을 때
			// 어떻게 처리할지를 명시해야 한다

			// 위험한 순간
			// 1. 외부자원(CPU)을 연결
			// 2. network 연결 - dbms 연결
			// 3. file 연결
			// 해결법
			//	try {
			//		위험한 상황
			//	} catch (Exception e) {
			//		위험한 상황이 발생했을 때 처리 내용
			//	}
		}
	}
}
