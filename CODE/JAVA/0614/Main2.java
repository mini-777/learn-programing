package 0614;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {
    Container c;
    JLabel[] l = new JLabel[10]; // 0~9 까지 생성할 10개의 라벨 생성
    int flag = 0; // 라벨이 순서대로 지워지기 위한 flag

    Main() {
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null); // 라벨들을 무작위로 쏴줘야 되기 때문에 Layout을 null 값으로 설정

        rLabel(l);

        setSize(300, 300);
        setVisible(true);
    }

    class mml extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            JLabel j = (JLabel) e.getSource();
            if (j == l[flag]) // 클릭한게 순서 대로 인지 
                if (l[flag].getText().equals(Integer.toString(flag))) {
                    l[flag].setVisible(false);
                    flag++;
                    if (!l[9].isVisible()) {
                        flag = 0;
                        for (int i = 0; i < 10; i++) {
                            l[i].setVisible(true);
                            int x = (int) (Math.random() * 150) + 50;
                            int y = (int) (Math.random() * 150) + 50;
                            l[i].setLocation(x, y);
                            l[i].addMouseListener(new mml());
                        }
                    }
                }
        }
    }

    public static void main(String args[]) {
        new Main();
    }

    public void rLabel(JLabel[] l) {
        for (int i = 0; i < 10; i++) {
            l[i] = new JLabel(Integer.toString(i));
            int x = (int) (Math.random() * 200) + 50;
            int y = (int) (Math.random() * 200) + 50;
            l[i].setSize(15, 15); // 라벨 사이즈 15 * 15
            l[i].setLocation(x, y); // 랜덤으로 위치 쏴줌
            c.add(l[i]); // 라벨을 컨테이너에 붙인다
            l[i].addMouseListener(new mml()); // 마우스 리스터 이벤트 를 붙여준다.
        }
    }
}
