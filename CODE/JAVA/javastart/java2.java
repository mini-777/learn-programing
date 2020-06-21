package javastart;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class JMenuEx extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JMenuEx() {
        this.setTitle("메뉴바 만들기 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu a = new JMenu("파일");
        JMenu b = new JMenu("편집");
        JMenu c = new JMenu("보기");
        JMenu d = new JMenu("입력");
        JMenu e = new JMenu("인쇄");
        
        c.add(new JMenuItem("화면확대"));
        c.add(new JMenuItem("화면축소"));
        c.addSeparator();//분리선 삽입
        c.add(new JMenuItem("쪽윤곽"));

        
        menuBar.add(a);
        menuBar.add(b);
        menuBar.add(c);
        menuBar.add(d);
        menuBar.add(e);
        this.setJMenuBar(menuBar);
        
        JToolBar tool = new JToolBar("Kitae Menu");
        tool.setBackground(Color.gray);
        tool.add(new JButton("New"));
        tool.add(new JButton("Open"));
        JButton save1 = new JButton(new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\javastart\\saveprint\\save.png"));
        tool.add(save1);
        save1.setToolTipText("SAVE"); 
        JButton print1 = new JButton(new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\javastart\\saveprint\\print.png"));
        tool.add(print1);
        print1.setToolTipText("PRINT");
        tool.add(new JLabel("Search"));
        tool.add(new JTextField());
        JComboBox combo=new JComboBox();
        combo.addItem("apple");
        combo.addItem("banana");
        combo.addItem("kiwi");
        combo.addItem("mango");
        tool.add(combo);
        
        this.add(tool, BorderLayout.NORTH);
        this.setLocationRelativeTo(null);
        this.setSize(400, 200);
        this.setVisible(true);


        
     
    }
}
public class java2 {
    public static void main(String[] args) {
        new JMenuEx();
    }
}
