package 게시판정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class 게시판정보UI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(270, 530);
		f.setTitle("게시판정보 UI");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel("이미지 들어갈 곳");
		JLabel l2 = new JLabel("title : ");
		JLabel l3 = new JLabel("content : ");
		JLabel l4 = new JLabel("writer : ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		
		JButton b1 = new JButton("게시판 작성");
		JButton b2 = new JButton("게시판 삭제");
		JButton b3 = new JButton("게시판 수정");
		JButton b4 = new JButton("게시판 검색");
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.BLUE);
		b1.setOpaque(true);
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.BLUE);
		b2.setOpaque(true);
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.BLUE);
		b3.setOpaque(true);
		b4.setBackground(Color.yellow);
		b4.setForeground(Color.BLUE);
		b4.setOpaque(true);
		
		t1.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.red);
		
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		BbsDAO dao = new BbsDAO();
		BbsVO bag = new BbsVO();
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = t1.getText();
				String content = t2.getText();
				String writer = t3.getText();
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				dao.insert(bag);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = JOptionPane.showInputDialog("탈퇴할 no를 입력하세요");
				bag.setNo(Integer.parseInt(no));
				dao.delete(bag);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = JOptionPane.showInputDialog("수정할 no");
				String title = JOptionPane.showInputDialog("수정될 title");
				String content = JOptionPane.showInputDialog("수정될 content");
				bag.setNo(Integer.parseInt(no));
				bag.setTitle(title);
				bag.setContent(content);
				dao.update(bag);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = JOptionPane.showInputDialog("검색할 no");
				bag.setNo(Integer.parseInt(no));
				dao.search(bag);
			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
