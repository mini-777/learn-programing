package javastart.java22;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AddActionListener implements ActionListener
{
 JTextField text1,text2;
 JLabel text3;//Add클래스에서 사용되는 텍스트필드 멤버 변수를 초기화 시키기 위해서 선언
 public AddActionListener(JTextField text1,JTextField text2,JLabel text3)
 {
  this.text1=text1;
  this.text2=text2;
  this.text3=text3;
 }
 public void actionPerformed(ActionEvent e)
 {
  Integer num=new Integer(Integer.parseInt(text1.getText())+Integer.parseInt(text2.getText()));
  //레퍼런스 형 타입을(String) 두개 받아서 인트형 타입으로 변환 시키고 더한후 다시 이것을
  //레퍼런스 형 매개변수 하나받는 타입으로 선언해서 받고 이 식별자로(num)toString메소드를 사용해서
  //String 형으로 변환함  그것을 텍스트3에다가 대입
  String str=num.toString();
  text3.setText(str);
 }

}