package 상속응용;

import java.util.Date;

public class TimeThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > -1; i--) {
			Date date = new Date();
			System.out.println("현재 시각 : " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
