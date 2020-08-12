import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class text extends JFrame {
	/**
     *
     */
    private static final long serialVersionUID = 1L;

    text() {
		setTitle("텍스트필드 입력과 파일 저장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

        c.add(new JLabel("이름 ")); //이름이라는 텍스트값을 가진 JLabel 을 생성과 동시에 container 에 추가
        JTextField name = new JTextField(20); //JTextField를 20칸까지 입력할수있게 설정한뒤 name이라는이름의 객체로 생성
        JTextField address = new JTextField(20); 
        JTextField univ = new JTextField(20);
		c.add(name); //위에서 생성했던 JTextField객체를 container 에 추가한다
		c.add(new JLabel("학과 "));
		c.add(univ); 
		c.add(new JLabel("주소 "));
        c.add(address); 	
        JButton button1 = new JButton("확인"); // 버튼 객체 생성
        JButton button2 = new JButton("취소");	
        c.add(button1); //컨테이너에 버튼객체 add
        c.add(button2);
        button1.addActionListener(new ActionListener() {   // 버튼을 누르면 실생되는 함수   
            public void actionPerformed(ActionEvent e)       
            {
                String filePath = "text.txt"; //생성파일명이자 위치, 위치의 기본값은 현재위치이다
                try {
                FileWriter fileWriter = new FileWriter(filePath);
                fileWriter.write(name.getText()+"\n"); //JTextField에 입력한 값을 불러와서 txt파일에 작성
                fileWriter.write(univ.getText()+"\n");
                fileWriter.write(address.getText()+"\n");
                
                fileWriter.close();
                } catch (IOException k) {
                k.printStackTrace();
                }
            }
        });
        button2.addActionListener(new ActionListener() {    
            public void actionPerformed(ActionEvent e)      
            {
                System.exit(0); //프로그램 종료
            }
        });
		setSize(300,160); //300X160으로 생성
		setVisible(true);
	}
	public static void main(String [] args) {
		new text();
	}
}