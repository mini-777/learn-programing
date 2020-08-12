import javax.swing.*;
import java.awt.*;

public class graphics extends JFrame {
	/**
     *
     */
    private static final long serialVersionUID = 1L;

    graphics() {
		setTitle("Graphics 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel()); //패널을 MyPanel 로 작성

		setSize(250,200);
		setVisible(true);
    }
    class MyPanel extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public void paintComponent(Graphics g) { 
        super.paintComponent(g);
        g.setColor(Color.BLUE); //g 색상을 파란색으로 지정
        g.drawString("자바 그래픽", 20,20); //20, 20위치에 문자열 작성
        g.setColor(Color.RED);//g 색상을 빨간색으로 지정
        g.drawRect(30,30,80,80); //30, 30좌표에 80X80으로 사각형 그린다
        g.setColor(Color.GREEN);
        g.fillOval(120,30,80,80); //120, 30 좌표에 80, 80 채워진 원을 그린다
        
    }
}
	public static void main(String [] args) {
		new graphics(); 
	}
}