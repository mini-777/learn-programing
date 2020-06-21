package javastart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Main extends JFrame {
    /**
   *
   */
  private static final long serialVersionUID = 1L;

  public Main() {
        this.setTitle("FlagAnimation");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        this.setContentPane(new GamePanel());
        
        this.setResizable(false);
        this.setSize(300, 200);
        this.setVisible(true);
    }
    
    private class Bubble extends JLabel {
        /**
       *
       */
      private static final long serialVersionUID = 1L;

      public Bubble() {
            setSize(50, 50);
        }
        public void paint(Graphics g) {
            super.paint(g);
            
            Image img = new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\java2\\img\\ca.jpg").getImage();
            g.drawImage(img, 0, 0, 50, 50, this);
        }
    }
    
    private class GamePanel extends JPanel {
        /**
       *
       */
      private static final long serialVersionUID = 1L;
      private Bubble b;
        public GamePanel() {
            setLayout(null);
            b = new Bubble();
            this.addMouseListener(new MouseAdapter() {
                
                public void mousePressed(MouseEvent e) {
                    
                    
                    add(b);
                    b.setLocation(e.getPoint());
                    
                    if(b != null) {
                        Thread t = new Thread(new thread(b));
                        t.start();
                    }
                }
            });
        }
    }
    
    private class thread implements Runnable {
        private Bubble b;
        public thread(Bubble b) {
            this.b = b;
        }
        public void run() {
            while(true) {
                int x = b.getX();
                int y = b.getY() + 5;
                
                if(y + b.getHeight() + 10 < 0) {
                    b = null;
                    return;
                }
                else b.setLocation(x, y);
                
                try {
                    Thread.sleep(400);
                }
                catch(InterruptedException e) { return; }
            }
        }
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
