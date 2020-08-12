

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

class combo extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JTextField tf = new JTextField(10);
    JComboBox box = new JComboBox();
    int x;
    combo(){
        this.setTitle("Question-1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        tf.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) { 
                if(e.getKeyCode()==KeyEvent.VK_ENTER){ //엔터키를 누르면 JTextField 에 입력된 값을 불러와서 콤보박스에 추가한다
                    box.addItem(tf.getText());
                    tf.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
        });
        this.add(tf);
        this.add(box);
        this.setSize(300,200);
        this.setVisible(true);
    }
}
public class jcombo {

    public static void main(String[] args) {
        new combo();
    }
    
}
