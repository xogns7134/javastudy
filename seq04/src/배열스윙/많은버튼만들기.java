package 배열스윙;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setTitle("나의 버튼들");
		f.setLayout(null); // 배치 무작위
		f.getContentPane().setBackground(Color.black);
//		JButton b1 = new JButton();
//		b1.setText("버튼1");
//		b1.setBounds(200, 200, 70, 50); // (x좌표, y좌표, 가로, 세로)
//		b1.setBackground(Color.gray);
//		b1.setForeground(Color.white);
//		f.add(b1);

		// 버튼 200개 만들기
		Random r = new Random();

		JButton[] buttons = new JButton[200]; // {null, ... , null}
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(800);
			int y = r.nextInt(800);
			int red = r.nextInt(256);
			int green = r.nextInt(256);
			int blue = r.nextInt(256);
			Color rcolor1 = new Color(red, green, blue);
			Color rcolor2 = new Color(blue, green, red);
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(rcolor1);
			buttons[i].setForeground(rcolor2);
			buttons[i].setOpaque(true);
			buttons[i].setBorderPainted(false);
			f.add(buttons[i]);
		}

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
