package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Java_application2 {
	private static int count = 0;
	private static int counta = 0;
	private static int countb = 0;
	private static int countc = 0;
	private static JLabel l1;

	public static void main(String[] args) {
		int a = 6000; // 짬뽕 가격
		int b = 5000; // 우동 가격
		int c = 5500; // 짜장 가격

		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.getContentPane().setBackground(Color.orange);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		b1.setText("짬뽕");
		b2.setText("우동");
		b3.setText("짜장");

		l1 = new JLabel("개수 : " + count);
		JLabel l2 = new JLabel();
		ImageIcon icon1 = new ImageIcon("image2.png");
		ImageIcon icon2 = new ImageIcon("image3.png");
		ImageIcon icon3 = new ImageIcon("image4.png");
		ImageIcon icon4 = new ImageIcon("image5.png");
		l2.setIcon(icon1);
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel("6000원       5000원      5500원              ");

		l1.setForeground(Color.black);
		l3.setForeground(Color.black);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);

		Font font = new Font("굴림", 1, 25);
		Font font2 = new Font("굴림", 1, 15);
		Font font3 = new Font("굴림", 1, 20);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		l1.setFont(font3);
		l3.setFont(font);
		l4.setFont(font2);
		l5.setFont(font2);
		
		// 버튼 클릭 이벤트 처리
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				counta++;
				int result = a * counta + b * countb + c * countc;
				l3.setText("결제 금액 : " + result);
				l1.setText("개수 : " + count);
				l2.setIcon(icon2);
				l4.setText("짬뽕 " + counta + "개, " + "우동 " + countb + "개, " + "짜장 " + countc + "개");
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				countb++;
				int result = a * counta + b * countb + c * countc;
				l3.setText("결제 금액 : " + result);
				l1.setText("개수 : " + count);
				l2.setIcon(icon3);
				l4.setText("짬뽕 " + counta + "개, " + "우동 " + countb + "개, " + "짜장 " + countc + "개");
			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				countc++;
				int result = a * counta + b * countb + c * countc;
				l3.setText("결제 금액 : " + result);
				l1.setText("개수 : " + count);
				l2.setIcon(icon4);
				l4.setText("짬뽕 " + counta + "개, " + "우동 " + countb + "개, " + "짜장 " + countc + "개");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l5);
		f.add(l2);
		f.add(l4);
		f.add(l3);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
}
