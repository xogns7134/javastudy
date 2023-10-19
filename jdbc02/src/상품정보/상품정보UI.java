package 상품정보;

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


public class 상품정보UI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(270, 750);
		f.setTitle("상품정보 UI");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel("ID : ");
		JLabel l2 = new JLabel("NAME : ");
		JLabel l3 = new JLabel("CONTENT : ");
		JLabel l4 = new JLabel("PRICE : ");
		JLabel l5 = new JLabel("COMPANY : ");
		JLabel l6 = new JLabel("IMG : ");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
		JTextField t6 = new JTextField(10);
		
		JButton b1 = new JButton("상품정보 추가");
		JButton b2 = new JButton("상품정보 삭제");
		JButton b3 = new JButton("상품정보 수정");
		JButton b4 = new JButton("상품정보 검색");
		
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
		t4.setBackground(Color.pink);
		t4.setForeground(Color.red);
		t5.setBackground(Color.pink);
		t5.setForeground(Color.red);
		t6.setBackground(Color.pink);
		t6.setForeground(Color.red);
		
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);
		t6.setFont(font);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(l6);
		f.add(t6);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		ProductDAO dao = new ProductDAO();
		ProductVO bag = new ProductVO();
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				String content = t3.getText();
				String price = t4.getText();
				String company = t5.getText();
				String img = t6.getText();
				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(Integer.parseInt(price));
				bag.setCompany(company);
				bag.setImg(img);
				dao.insert(bag);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 ID를 입력하세요");
				bag.setId(id);
				dao.delete(bag);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("수정할 ID");
				String name = JOptionPane.showInputDialog("수정될 name");
				String content = JOptionPane.showInputDialog("수정될 content");
				String price = JOptionPane.showInputDialog("수정될 price");
				String company = JOptionPane.showInputDialog("수정될 company");
				String img = JOptionPane.showInputDialog("수정될 img");
				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(Integer.parseInt(price));
				bag.setCompany(company);
				bag.setImg(img);
				dao.update(bag);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("검색할 ID");
				ProductVO bag = dao.search(id);
				JOptionPane.showMessageDialog(f, bag);
			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
