package control.sequential;

import java.awt.FlowLayout;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sequential_statement순차문 {
	public static void main(String[] args) {
		// JFrame f 설정한 크기만큼의 창 띄우기
		JFrame f = new JFrame();
		f.setSize(300, 300);

		// FlowLayout 물 흐르듯이 배치하는 함수
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// JButton b 버튼 만들기
		JButton b = new JButton();
		b.setText("              나의 정보 확인                              ");
		f.add(b); // f에 b를 추가해라

		// JLabel 글자 써주는 함수
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		l1.setText("이름");
		l2.setText("나이");
		l3.setText("취미");

		// JTextField 텍스트 상자 만들기
		JTextField t1 = new JTextField(20); // 괄호 안의 숫자는 텍스트 상자의 크기
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);

		Date d = new Date();
		Random r = new Random();

		f.setVisible(true); // setVisible은 보이게 하는 함수이기때문에 항상 마지막에 쓰기

	}
}
