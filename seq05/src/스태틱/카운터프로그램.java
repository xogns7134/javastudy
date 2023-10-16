package 스태틱;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	public static int count = 0;
	public static void main(String[] args) {		
		JFrame f = new JFrame("카운터 프로그램");
		f.setSize(300, 400);
		f.setLayout(new FlowLayout());
		
		JButton plus = new JButton("+1");		
		JButton reset = new JButton("초기화");		
		JButton minus = new JButton("-1");		
		JLabel number = new JLabel("0");		

		Font font = new Font("굴림", Font.BOLD, 15);
		plus.setFont(font);
		minus.setFont(font);
		reset.setFont(font);
		number.setFont(new Font("궁서", Font.BOLD, 200));
		
		f.add(plus);
		f.add(minus);
		f.add(reset);
		f.add(number);
		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(String.valueOf(count));
			}
		});
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(String.valueOf(count));
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
