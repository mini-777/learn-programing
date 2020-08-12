package java;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Container c;
    JLabel[] l = new JLabel[10]; 
    int flag = 0;
    Main() {
        setTitle("레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null); 

        rLabel(l);

        setSize(300, 300);
        setVisible(true);
    }

    class mml extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            JLabel j = (JLabel) e.getSource();
            if (j == l[flag])
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
            l[i].setSize(15, 15); 
            l[i].setLocation(x, y); 
            c.add(l[i]);
            l[i].addMouseListener(new mml());
        }
    }
}
