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
import javax.swing.JTextField;

public class Java_application {
	public static void main(String[] args) {
		// 사칙연산 계산기 만들기

		// f 프레임 설정
		JFrame f = new JFrame(); // 따로 나오는 프레임 만들기
		f.setSize(300, 500); // 프레임 크기 설정
		f.getContentPane().setBackground(Color.black);

		// 레이아웃 설정
		FlowLayout flow = new FlowLayout(); // 물 흐르듯 순서대로 붙혀준다
		f.setLayout(flow);

		// 라벨 및 텍스트 상자 설정
		JLabel top = new JLabel(); // 이미지 넣을 라벨 만들기
		ImageIcon icon = new ImageIcon("image.png"); // 이미지 넣는 함수
		top.setIcon(icon); // top 라벨에 이미지 넣기
		JLabel num1 = new JLabel(); // 숫자1 글자 넣는 부품 만들기
		num1.setText("num1 ");
		JTextField t1 = new JTextField(15); // 텍스트 상자 만들기 (길이)
		JLabel num2 = new JLabel(); // 숫자2 글자 넣는 부품 만들기
		num2.setText("num2 ");
		JTextField t2 = new JTextField(15); // 텍스트 상자 만들기 (길이)
		JLabel space = new JLabel("------------------------");
		JLabel answer = new JLabel();
		answer.setSize(200, 20);
		t1.setBackground(Color.darkGray);
		t1.setForeground(Color.white);
		t2.setBackground(Color.darkGray);
		t2.setForeground(Color.white);
		num1.setForeground(Color.white);
		num2.setForeground(Color.white);
		answer.setBackground(Color.gray);
		answer.setForeground(Color.white);

		// 버튼 설정
		JButton plus = new JButton(); // plus 버튼 함수 만들기
		JButton minus = new JButton(); // minus 버튼 함수 만들기
		JButton multi = new JButton(); // multi 버튼 함수 만들기
		JButton div = new JButton(); // div 버튼 함수 만들기
		plus.setText("+"); // plus 버튼 함수에 들어가는 글자
		minus.setText("-"); // minus 버튼 함수에 들어가는 글자
		multi.setText("×"); // multi 버튼 함수에 들어가는 글자
		div.setText("÷"); // div 버튼 함수에 들어가는 글자
		plus.setBackground(Color.gray);
		minus.setBackground(Color.gray);
		multi.setBackground(Color.gray);
		div.setBackground(Color.gray);
		plus.setForeground(Color.white);
		minus.setForeground(Color.white);
		multi.setForeground(Color.white);
		div.setForeground(Color.white);

		// 버튼 액션 추가하기
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1Val = Double.parseDouble(t1.getText());
				double num2Val = Double.parseDouble(t2.getText());
				double result = num1Val + num2Val;
				String result1 = String.format("%.3f", result);
				answer.setText("num1 + num2 = " + result1);
			}
		});

		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1Val = Double.parseDouble(t1.getText());
				double num2Val = Double.parseDouble(t2.getText());
				double result = num1Val - num2Val;
				String result1 = String.format("%.3f", result);
				answer.setText("num1 - num2 = " + result1);
			}
		});

		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1Val = Double.parseDouble(t1.getText());
				double num2Val = Double.parseDouble(t2.getText());
				double result = num1Val * num2Val;
				String result1 = String.format("%.3f", result);
				answer.setText("num1 × num2 = " + result1);
			}
		});

		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1Val = Double.parseDouble(t1.getText());
				double num2Val = Double.parseDouble(t2.getText());
				double result = num1Val / num2Val;
				String result1 = String.format("%.3f", result);
				answer.setText("num1 ÷ num2 = " + result1);
			}
		});

		// f 프레임에 추가하기
		f.add(top); // f 프레임에 이미지 넣기
		f.add(num1); // f 프레임에 num1 글자 넣기
		f.add(t1); // f 프레임에 t1 텍스트 상자 넣기
		f.add(num2); // f 프레임에 num2 글자 넣기
		f.add(t2); // f 프레임에 t2 텍스트 상자 넣기
		f.add(plus); // f 프레임에 plus 버튼 넣기
		f.add(minus); // f 프레임에 minus 버튼 넣기
		f.add(multi); // f 프레임에 multi 버튼 넣기
		f.add(div); // f 프레임에 div 버튼 넣기
		f.add(space);
		f.add(answer); // f 프레임에 결과 칸 넣기

		// 폰트 설정
		Font font1 = new Font("Consolas", 1, 40); // 글자 관련된 함수 만들기
		Font font2 = new Font("Consolas", 1, 20); // 글자 관련된 함수 만들기
		plus.setFont(font1); // plus 버튼에 font 함수 넣기
		minus.setFont(font1); // minus 버튼에 font 함수 넣기
		multi.setFont(font1); // multi 버튼에 font 함수 넣기
		div.setFont(font1); // div 버튼에 font 함수 넣기
		t1.setFont(font2);
		t2.setFont(font2);
		num1.setFont(font2);
		num2.setFont(font2);
		answer.setFont(font2);
		space.setFont(font2);
		// x를 누르면 종료, 이 설정이 없으면 종료되는게 아닌 보이지만 않게 된 것
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true); // 항상 마지막에 넣기
	}
}
