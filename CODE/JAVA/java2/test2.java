package java2;

import java.awt.*;
import javax.swing.*;

class FigurePanelEx extends JFrame{
  private static final long serialVersionUID = 1L;
   public FigurePanelEx() {
    Container cp = this.getContentPane();
    cp.setLayout(new GridLayout(2, 3, 5, 5));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 200);
    cp.add(new Test02());
    cp.add(new Test03());
    cp.add(new Test04());
    cp.add(new Test05());
    cp.add(new Test06());
    cp.add(new Test07());
      
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new FigurePanelEx();

   }

   class Test02 extends JPanel{
      private static final long serialVersionUID = 1L;
        ImageIcon icon = new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\java2\\img\\us.jpg");
        Image img = icon.getImage();
      @Override
      protected void paintComponent(Graphics g) { 
      super.paintComponent(g);
      g.drawImage(img, 0, 0, 133, 80, this);



    }
    
  }
  class Test03 extends JPanel{
      private static final long serialVersionUID = 1L;
      ImageIcon icon = new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\java2\\img\\ca.jpg");
      Image img = icon.getImage();
    @Override
    protected void paintComponent(Graphics g) { 
    super.paintComponent(g);
    g.drawImage(img, 0, 0, 133, 80, this);




    }
    
  }
      
  class Test04 extends JPanel{
      private static final long serialVersionUID = 1L;
      ImageIcon icon = new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\java2\\img\\india.jpg");
      Image img = icon.getImage();
    @Override
    protected void paintComponent(Graphics g) { 
    super.paintComponent(g);
    g.drawImage(img, 0, 0, 133, 80, this);




    }
    
  }
  class Test05 extends JPanel{
      private static final long serialVersionUID = 1L;
      ImageIcon icon = new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\java2\\img\\uk.jpg");
      Image img = icon.getImage();
    @Override
    protected void paintComponent(Graphics g) { 
    super.paintComponent(g);
    g.drawImage(img, 0, 0, 133, 80, this);





    }
    
  }
  class Test06 extends JPanel{
      private static final long serialVersionUID = 1L;
      ImageIcon icon = new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\java2\\img\\china.jpg");
      Image img = icon.getImage();
    @Override
    protected void paintComponent(Graphics g) { 
    super.paintComponent(g);
    g.drawImage(img, 0, 0, 133, 80, this);




    }
    
  }
  class Test07 extends JPanel{
      private static final long serialVersionUID = 1L;
      ImageIcon icon = new ImageIcon("C:\\Users\\min\\Desktop\\program\\code\\JAVA\\java2\\img\\norway.jpg");
      Image img = icon.getImage();
    @Override
    protected void paintComponent(Graphics g) { 
    super.paintComponent(g);
    g.drawImage(img, 0, 0, 133, 80, this);



    }
    
  }
      
      
  }


