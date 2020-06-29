package javatt;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class index extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Container contentPane;
    JLabel imgLbl = new JLabel();

    index() {
        setTitle("그림파일 불러와보기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.add(imgLbl);
        MakeMenu();
        setSize(300, 300);
        setVisible(true);
    }

    void MakeMenu() {
        JMenuBar m = new JMenuBar();
        JMenu fMnu = new JMenu("파일");
        JMenuItem oItm = new JMenuItem("열기");
        JMenuItem oItm2 = new JMenuItem("저장");

        oItm.addActionListener(new OpenActionListener());
        oItm2.addActionListener(new OpenActionListener2());
        fMnu.add(oItm);
        fMnu.add(oItm2);
        m.add(fMnu);
        this.setJMenuBar(m);
    }

    class OpenActionListener implements ActionListener {
        JFileChooser choice;

        OpenActionListener() {
            choice = new JFileChooser();
        }

        public void actionPerformed(ActionEvent e) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
            choice.setFileFilter(filter);

            int ret = choice.showOpenDialog(null);
            if (ret != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "파일을 선택하지 않았네요", "주의", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String fPath = choice.getSelectedFile().getPath();
            imgLbl.setIcon(new ImageIcon(fPath));
            pack();
        }
        
    }
    class OpenActionListener2 implements ActionListener {
        JFileChooser choice;

        OpenActionListener2() {
            choice = new JFileChooser();
        }

        public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("파일 저장");
                fileChooser.setFileFilter(new FileNameExtensionFilter("jpg File", "jpg", "gif")); // 파일필터
                fileChooser.setMultiSelectionEnabled(false); // 다중 선택 불가
                try{
                    File file = new File("c:\\imgtest.jpg");        
                    ImageIO.write(imgLbl, "jpg", file);
               }
              
         
               catch(Exception e){e.printStackTrace();}
                JOptionPane.showMessageDialog(null, "파일 저장 성공", "파일 저장", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    
    


    public static void main(String[] args) {
        new index();
 }
}