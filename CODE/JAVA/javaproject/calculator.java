package javaproject;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends  JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JTextArea jtf = new JTextArea(5, 25);
    JButton plus, mai, gun, nanum, result, c, but0, but1, but2, but3, but4, but5, but6, but7, but8, but9;
    int total = 0, temp = 0;
    boolean  count = false;
    String str;
        
    public calculator() {
        
        Container ct = getContentPane();
        JPanel jp = new JPanel();
        JPanel jp1 = new JPanel();
        GridLayout gl = new GridLayout(4,3,5,5);
        GridLayout gl1 = new GridLayout(4,1,5,5);

        numPad np = new numPad();
        plus pl = new plus();
        subtraction sbt = new subtraction();
        multiply mtp = new multiply();
        divide dv = new divide();
        C cc = new C();
        result re = new result();

        ct.setLayout(new BorderLayout());
         ct.setLayout(new FlowLayout());
        jp.setLayout(gl);
        jp1.setLayout(gl1);


        plus = new JButton("+");
        mai = new JButton("-");
        gun = new JButton("*");
        nanum = new JButton("/");
        result = new JButton("=");

        c = new JButton("C");
        but0 = new JButton("0");
        but1 = new JButton("1");
        but2 = new JButton("2");
        but3 = new JButton("3");
        but4 = new JButton("4");
        but5 = new JButton("5");
        but6 = new JButton("6");
        but7 = new JButton("7");
        but8 = new JButton("8");
        but9 = new JButton("9");

        result.setBackground(new Color(178,178,178));
        nanum.setBackground(new Color(178,178,178));
        c.setBackground(new Color(178,178,178));
        gun.setBackground(new Color(178,178,178));
        plus.setBackground(new Color(178,178,178));
        mai.setBackground(new Color(178,178,178));
        result.setPreferredSize(new Dimension(60, 40));
        nanum.setPreferredSize(new Dimension(60, 40));


        ct.add(jtf);
        jp1.add(plus);
        jp1.add(mai);
        jp1.add(gun);
        jp1.add(nanum);
        
        jp.add(but7);
        jp.add(but8);
        jp.add(but9);
        jp.add(but4);
        jp.add(but5);
        jp.add(but6);
        jp.add(but1);
        jp.add(but2);
        jp.add(but3);
        jp.add(but0);
        jp.add(result);
        jp.add(c);
        ct.add(jp);
        ct.add(jp1);
        
        but0.addActionListener(np);
        but1.addActionListener(np);
        but2.addActionListener(np);
        but3.addActionListener(np);
        but4.addActionListener(np);
        but5.addActionListener(np);
        but6.addActionListener(np);
        but7.addActionListener(np);
        but8.addActionListener(np);
        but9.addActionListener(np);

        plus.addActionListener(pl);
        mai.addActionListener(sbt);
        gun.addActionListener(mtp);
        nanum.addActionListener(dv);
        result.addActionListener(re);
        c.addActionListener(cc);
    }

    class numPad implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
             if(ae.getSource() == but0)
                jtf.append("0");
            else if(ae.getSource() == but1)
                jtf.append("1");
            else if(ae.getSource() == but2)
                jtf.append("2");
            else if(ae.getSource() == but3)
                jtf.append("3");
            else if(ae.getSource() == but4)
                jtf.append("4");
            else if(ae.getSource() == but5)
                jtf.append("5");
            else if(ae.getSource() == but6)
                jtf.append("6");
            else if(ae.getSource() == but7)
                jtf.append("7");
            else if(ae.getSource() == but8)
                jtf.append("8");
            else if(ae.getSource() == but9)
                jtf.append("9");
        }
    }

    class plus implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
                temp = Integer.parseInt(jtf.getText());
                if(str.equals("+"))
                    total+=temp;
                else if(str.equals("-"))
                    total-=temp;
                else if(str.equals("*"))
                    total*=temp;
                else if(str.equals("/"))
                    total/=temp;
            } catch(NullPointerException e) {}
            finally {
                if(!count)
                    total = temp;
                str = "+";
                count = true;
                jtf.setText("");
            }
        }
    }

    class subtraction implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
                temp = Integer.parseInt(jtf.getText());
                if(str.equals("+"))
                    total+=temp;
                else if(str.equals("-"))
                    total-=temp;
                else if(str.equals("*"))
                    total*=temp;
                else if(str.equals("/"))
                    total/=temp;
            } catch(NullPointerException e) {}
            finally {
                if(!count)
                    total = temp;
                str = "-";
                count = true;
                jtf.setText("");
            }
        }
    }

    class multiply implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
                temp = Integer.parseInt(jtf.getText());
                if(str.equals("+"))
                    total+=temp;
                else if(str.equals("-"))
                    total-=temp;
                else if(str.equals("*"))
                    total*=temp;
                else if(str.equals("/"))
                    total/=temp;
            } catch(NullPointerException e) {}
            finally {
                if(!count)
                    total = temp;
                str = "*";
                count = true;
                jtf.setText("");
            }
        }
    }

    class divide implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
                temp = Integer.parseInt(jtf.getText());
                if(str.equals("+"))
                    total+=temp;
                else if(str.equals("-"))
                    total-=temp;
                else if(str.equals("*"))
                    total*=temp;
                else if(str.equals("/"))
                    total/=temp;
            } catch(ArithmeticException e) {
                total = 0;
                str = "/";
                count = true;
                jtf.setText("");
            }
            catch(NullPointerException e) {    }
            finally {
                if(!count)
                    total = temp;
                str = "/";
                count = true;
                jtf.setText("");
            }
        }
    }

    class C implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            jtf.setText("");
            total = 0;
            temp = 0;
            count = false;
        }
    }

    class result implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if(temp == 0){
                jtf.setText(jtf.getText());

            }
            else {
                try {
                    temp = Integer.parseInt(jtf.getText());
                    if(str.equals("+"))
                        total+=temp;
                    else if(str.equals("-"))
                        total-=temp;
                    else if(str.equals("*"))
                        total*=temp;
                    else if(str.equals("/"))
                        total/=temp;
                    jtf.setText(total+"");
                } catch(Exception e) {
                    jtf.setText("0");
                    
                }
            }
            temp = 0;
            count = false;
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(300,320);
    }
        

    public static void main(String args[]) {
        calculator cal = new calculator();
        
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setTitle("calculator");
        cal.setForeground(Color.black);
        cal.setBackground(Color.lightGray);
        cal.setSize(cal.getPreferredSize());
        cal.setVisible(true);
    }
}
