package javastart.java22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Add
{
 public static void main(String []args)
 {
  JFrame frame=new JFrame("다이얼로그 만들기");
  frame.setPreferredSize(new Dimension(200,200));
  frame.setLocation(500,400);
  Container contentPane=frame.getContentPane();
  JPanel panel=new JPanel();
  JPanel panel1=new JPanel();
  panel.setLayout(new FlowLayout());
  JButton button1=new JButton("calculate");

  JTextField text1=new JTextField(10);
  JTextField text2=new JTextField(10);


  panel.add(text1);
  panel.add(text2);
  JLabel result = new JLabel("계산결과출력");
  result.setOpaque(true); 
  result.setBackground(Color.GREEN);
  panel.add(result);


  panel1.add(button1);

  
  contentPane.add(panel,BorderLayout.CENTER);
  contentPane.add(panel1,BorderLayout.SOUTH);
  ActionListener listener1=new AddActionListener(text1,text2,result);
  button1.addActionListener(listener1);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
 }
  

}