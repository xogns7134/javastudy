package 상속응용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic extends JFrame {

	JLabel count, image, day; // 전역변수 선언

	// 객체 생성
	public ThreadGraphic() {
		setTitle("PC방 모니터링 서비스");
		setSize(800, 300);
		count = new JLabel("카운터 들어가는 자리");
		image = new JLabel();
		day = new JLabel("현재 시각 들어가는 자리");
		
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		count.setFont(font);
		image.setFont(font);
		day.setFont(font);
		
		// JFrame은 BorderLayout으로 이미 설정됨.
		// 동 서 남 북 가운데만 가능
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);

		CountThread counter = new CountThread();
		TimeThread timer = new TimeThread();
		ArrayThread img = new ArrayThread();

		// 스레드 시작
		counter.start();
		timer.start();
		img.start();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// inner class
	
	// CountThread 가져오기
	public class CountThread extends Thread {
		// run(), start(), ...
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용 넣기
			for (int i = 500; i > -1; i--) {
				// System.out.println("카운트 횟수 : " + i);
				count.setText("카운트 횟수 : " + i);
				try {
					Thread.sleep(1000); // 단위 ms(밀리세컨드)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// TimeThread 가져오기
	public class TimeThread extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > -1; i--) {
				Date date = new Date();
				// System.out.println("현재 시각 : " + date);
				day.setText("현재 시각 : " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// ArrayThread 가져오기
	public class ArrayThread extends Thread {
		@Override
		public void run() {
			String[] list = {"깐풍기.png","우동.png","짜장.png","짬뽕.png","탕수육.png"};
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < list.length; j++) {
					//System.out.println("이미지 >> "+list[j]);
					ImageIcon icon = new ImageIcon(list[j]);
					image.setIcon(icon);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadGraphic THG = new ThreadGraphic();
	}
}
