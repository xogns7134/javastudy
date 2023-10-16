package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 문자판독기 extends JFrame {
	JLabel ch, words, chCount, wordsCount;
	JTextArea area;
	JButton b1, b2, b3;
	// 전역변수는 자동초기화, 참조형 : null, 기본형 : 0

	public 문자판독기() {
		setTitle("문자판독기");
		setSize(500, 600);

		ch = new JLabel("글자 수 : ");
		words = new JLabel("단어 수 : ");
		chCount = new JLabel();
		wordsCount = new JLabel();

		area = new JTextArea(10, 25); // 세로 10줄, 가로 25글자 크기로 만들기

		b1 = new JButton("Count");
		b2 = new JButton("Change Background Color");
		b3 = new JButton("Change Text Color");

		setLayout(new FlowLayout());

		add(ch);
		add(chCount);
		add(words);
		add(wordsCount);
		add(area);
		add(b1);
		add(b2);
		add(b3);

		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		ch.setFont(font);
		chCount.setFont(font);
		words.setFont(font);
		wordsCount.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		chCount.setForeground(Color.white);
		wordsCount.setForeground(Color.white);
		area.setBackground(Color.darkGray);
		area.setForeground(Color.white);
		getContentPane().setBackground(Color.gray);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = area.getText();
				String[] s1 = s.split(" ");
				int wordspelling = 0;
				for (String word : s1) {
					if (!word.isEmpty()) {
						wordspelling++;
					}
				}
				wordsCount.setText(String.valueOf(wordspelling));
				s = s.replaceAll("\\s", "");
				int spelling = s.length();
				chCount.setText(String.valueOf(spelling) + " (띄어쓰기 제외)");
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int rgb1 = r.nextInt(256);
				int rgb2 = r.nextInt(256);
				int rgb3 = r.nextInt(256);
				Color rColor = new Color(rgb1, rgb2, rgb3);
				area.setBackground(rColor);
			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int rgb1 = r.nextInt(256);
				int rgb2 = r.nextInt(256);
				int rgb3 = r.nextInt(256);
				Color rColor = new Color(rgb1, rgb2, rgb3);
				area.setForeground(rColor);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		문자판독기 name = new 문자판독기();
	}
}
