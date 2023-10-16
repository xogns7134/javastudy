package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인화면");
		f.setSize(1200, 930); // void

		// 라벨3개, 텍스트필드2개, 버튼2개
		JLabel top = new JLabel();
		// top.setText("<<<이미지 들어가는 곳>>>> "); //void
		JLabel id1 = new JLabel();
		id1.setText("ID: ");
		JLabel pw1 = new JLabel();
		pw1.setText("PW: ");

		JTextField id2 = new JTextField(10);
		JTextField pw2 = new JTextField(10);
		id2.setBackground(Color.pink);
		id2.setForeground(Color.blue);
		pw2.setBackground(Color.pink); // 배경색
		pw2.setForeground(Color.blue); // 글자색

		JButton login = new JButton();
		login.setText("로그인");
		JButton reset = new JButton();
		reset.setText("지우기");
		login.setBackground(Color.yellow);
		login.setForeground(Color.blue);
		login.setOpaque(true); // 불투명 true
		login.setBorderPainted(false);
		reset.setBackground(Color.yellow);
		reset.setForeground(Color.red);
		reset.setOpaque(true); // 불투명 true
		reset.setBorderPainted(false);

		// 레이아웃 flowlayout
		// 폰트
		Font font = new Font("맑은 고딕", 1, 50);
		top.setFont(font);
		id1.setFont(font);
		pw1.setFont(font);
		id2.setFont(font);
		pw2.setFont(font);
		login.setFont(font);
		reset.setFont(font);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // void
		f.add(top); // void
		f.add(id1); // 라벨
		f.add(id2); // 텍스트필드
		f.add(pw1); // 라벨
		f.add(pw2); // 텍스트필드
		f.add(login); // 버튼
		f.add(reset); // 버튼

		// 버튼에 이벤트기능을 붙여줍시다.
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Login버튼을 눌렀을 때 실행할 내용을 넣어주세요.
				// 버튼하나당 함수하나로 매칭!!
				System.out.println("로그인버튼 클릭함. ");
				// 1. id2, pw2에서 입력한 데이터를 가지고 온다.
				String id3 = id2.getText();
				String pw3 = pw2.getText();
				// 2. id2의 값이 root인지, pw2의 값이 1234인지 확인
				// 둘다맞으면 맞아요! 출력, 둘 중 하나라도 틀리면 틀려요! 출력
				// equals(); 
				if (id3.equals("root") &&  pw3.equals("1234")) {
					//System.out.println("맞아요!");
					JOptionPane.showMessageDialog(f, "로그인성공! 일기장이 오픈됩니다.");
					//일기장화면떠라.!!!
				} else {
					//System.out.println("틀려요!");
					JOptionPane.showMessageDialog(f, "로그인실패! 재입력해주세요.");
				}

				// 정식코드는 아닌데 가짜로 이런식으로 하겠다라고 써넣은 것
				// 주석형태로 여기에 써놓았음.
				// 가짜코드 ==> 의사코드(수도코드)
			}
		}); // login

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset버튼을 눌렀을 때 처리하고 싶은 내용 넣어주세요.,
				System.out.println("리셋버튼 클릭함. ");
				// 1. id2, pw2의 내용을 지우자!
				id2.setText("");
				// void <--> String id3 = id2.getText(); voidXXX
				pw2.setText("");
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 위에서 설정한 것을 다 보여라.!
		f.setVisible(true); // void
	}
}