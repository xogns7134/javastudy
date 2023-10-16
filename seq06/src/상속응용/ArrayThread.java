package 상속응용;

public class ArrayThread extends Thread {
	@Override
	public void run() {
		String[] list = {"깐풍기.png","우동.png","짜장.png","짬뽕.png","탕수육.png"};
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.println("이미지 >> "+list[j]);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
