package 생성자;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화앨범만들기 {

    public static int start = 2;
    public static int maxIndex;

    public static void main(String[] args) {
        String[] title = { "30일", "화사한 그녀", "크리에이터", "화란", "사나-저주의 아이" };
        String[] img = { "30일.png", "화사한그녀.png", "크리에이터.png", "화란.png", "사나-저주의아이.png" };
        double[] book = { 20.8, 16.2, 11.8, 8.9, 8.1 };
        maxIndex = title.length - 1;

        JFrame f = new JFrame("영화 앨범");
        f.setSize(800, 1000);

        JLabel top = new JLabel(title[1]);
        ImageIcon icon = new ImageIcon(img[1]);
        JLabel center = new JLabel(icon);
        JLabel under = new JLabel(String.valueOf(book[1]));

        JButton left = new JButton("<<");
        JButton right = new JButton(">>");

        Font font = new Font("맑은 고딕", Font.BOLD, 15);

        f.add(top, BorderLayout.NORTH);
        f.add(right, BorderLayout.EAST);
        f.add(left, BorderLayout.WEST);
        f.add(under, BorderLayout.SOUTH);
        f.add(center, BorderLayout.CENTER);

        top.setFont(font);
        under.setFont(font);
        left.setFont(font);
        right.setFont(font);

        left.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                start--;
                top.setText(title[start]);
                under.setText(String.valueOf(book[start]));
                ImageIcon icon = new ImageIcon(img[start]);
                center.setIcon(icon);
                updateButtonState(left, right); // 버튼 상태 갱신
            }
        });

        right.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                start++;
                top.setText(title[start]);
                under.setText(String.valueOf(book[start]));
                ImageIcon icon = new ImageIcon(img[start]);
                center.setIcon(icon);
                updateButtonState(left, right); // 버튼 상태 갱신
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        // 초기 버튼 상태 갱신
        updateButtonState(left, right);
    }

    // 화살표 버튼 상태를 갱신하는 메서드
    private static void updateButtonState(JButton left, JButton right) {
        left.setEnabled(start > 0);
        right.setEnabled(start < maxIndex);
    }
}
