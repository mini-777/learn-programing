import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class dragg extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JPanel panel = new JPanel();
 JLabel la;
 
 dragg(){
  setTitle("MouseListener Ex");
  setSize(300,200);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JButton button1 = new JButton("Yellow");	
  JButton button2 = new JButton("Blue");	
  panel.add(button1);
  panel.add(button2);
  setContentPane(panel); // panel 직접 생성
  button1.addActionListener(new ActionListener() {    //버튼을 누르면 실행될 함수
    public void actionPerformed(ActionEvent e)      
    {
        panel.setBackground(Color.YELLOW); //패널 배경값을 노란색으로 변경
    }
});
  button2.addActionListener(new ActionListener() {    
    public void actionPerformed(ActionEvent e)      
    {
        panel.setBackground(Color.BLUE);//패널 배경값을 파란색으로 변경
    }
});

  panel.addMouseMotionListener(new MyMouseEvent());
  panel.addMouseListener(new MyMouseEvent());
  setVisible(true);
 }
 
 class MyMouseEvent implements MouseListener, MouseMotionListener
 {

  @Override
  public void mouseDragged(MouseEvent e) { //마우스가 드래그를 했다는걸 인식했을때 실행될 함수
   setTitle("MouseDragged ("+e.getX()+","+e.getY()+")");// 드래그 하면 좌표값을 출력
   
  }

  @Override
  public void mouseMoved(MouseEvent e) {
   
   
  }

  @Override
  public void mouseClicked(MouseEvent e) {
 
   
  }

  @Override
  public void mouseEntered(MouseEvent e) {

   
  }

  @Override
  public void mouseExited(MouseEvent e) {

   
   
  }

  @Override
  public void mousePressed(MouseEvent e) {

   
  }

  @Override
  public void mouseReleased(MouseEvent e) {
 
   
  }
  
 }
 
 public static void main(String[] ar)
 {
  new dragg();
 }

}