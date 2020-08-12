
package simplecalculator;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Erwin P. Acedillo
 */
public class SimpleCalculator extends JFrame{
    /**
    *
    */
   private static final long serialVersionUID = 1L;
   // buttons
    JButton jbCancel;
    JButton jbClearEntry;
    JButton jbBackSpace;
    JButton jbOne;
    JButton jbTwo;
    JButton jbThree;
    JButton jbFour;
    JButton jbFive;
    JButton jbSix;
    JButton jbSeven;
    JButton jbEight;
    JButton jbNine;
    JButton jbZero;
    JButton jbPeriod;
    
    //Operation 
    JButton jbAddition;
    JButton jbSubtraction;
    JButton jbMultiplication;
    JButton jbDivision;
    JButton jbEquals;
    
    
    //Display Result
    JTextField jtfResult;
    
    double opr1;
    double opr2;
    private char operation;
    
    public SimpleCalculator(){
        super("CALCULATOR");
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
 
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(5,4));
        panel2.add(jbClearEntry = new JButton("CE"));
        panel2.add(jbCancel = new JButton("C"));
        panel2.add(jbBackSpace = new JButton("<--"));
        panel2.add(jbDivision = new JButton("/"));
        
        panel2.add(jbOne = new JButton("1"));
        panel2.add(jbTwo = new JButton("2"));
        panel2.add(jbThree = new JButton("3"));
        panel2.add(jbMultiplication = new JButton("*"));
        
        panel2.add(jbFour = new JButton("4"));
        panel2.add(jbFive = new JButton("5"));
        panel2.add(jbSix = new JButton("6"));
        panel2.add(jbAddition = new JButton("+"));
        
        panel2.add(jbSeven = new JButton("7"));
        panel2.add(jbEight = new JButton("8"));
        panel2.add(jbNine = new JButton("9"));
        panel2.add(jbSubtraction = new JButton("-"));
        
        panel2.add(jbZero = new JButton("0"));
        panel2.add(jbPeriod = new JButton("."));
        panel2.add(jbEquals = new JButton("="));
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(panel1,BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.SOUTH);
        add(panel);
        
        numberButtonAction Listener = new numberButtonAction();
        jbClearEntry.addActionListener(Listener);
        jbCancel.addActionListener(Listener);
        jbOne.addActionListener(Listener);
        jbTwo.addActionListener(Listener);
        jbThree.addActionListener(Listener);
        jbFour.addActionListener(Listener);
        jbFive.addActionListener(Listener);
        jbSix.addActionListener(Listener);
        jbSeven.addActionListener(Listener);
        jbEight.addActionListener(Listener);
        jbNine.addActionListener(Listener);
        jbZero.addActionListener(Listener);
        jbPeriod.addActionListener(Listener);
        
        calcAction calC = new calcAction();
        jbAddition.addActionListener(calC);
        jbSubtraction.addActionListener(calC);
        jbMultiplication.addActionListener(calC);
        jbDivision.addActionListener(calC);
        jbEquals.addActionListener(calC);
    }
    
    public class numberButtonAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {           
            if(e.getSource()==jbClearEntry){
                jtfResult.setText("");
            }
            else if(e.getSource()==jbCancel){
                opr1 = 0;
                opr2 = 0;
                jtfResult.setText("");
            }
            else if(e.getSource()==jbOne){
               jtfResult.setText(jtfResult.getText() + jbOne.getText());
            }
            else if(e.getSource()==jbTwo){
               jtfResult.setText(jtfResult.getText() + jbTwo.getText());
            }
            else if(e.getSource()==jbThree){
               jtfResult.setText(jtfResult.getText() + jbThree.getText());
            }
            else if(e.getSource()==jbFour){
               jtfResult.setText(jtfResult.getText() + jbFour.getText());
            }
            else if(e.getSource()==jbFive){
               jtfResult.setText(jtfResult.getText() + jbFive.getText());
            }
            else if(e.getSource()==jbSix){
               jtfResult.setText(jtfResult.getText() + jbSix.getText());
            }
            else if(e.getSource()==jbSeven){
               jtfResult.setText(jtfResult.getText() + jbSeven.getText());
            }
            else if(e.getSource()==jbEight){
               jtfResult.setText(jtfResult.getText() + jbEight.getText());
            }
            else if(e.getSource()==jbNine){
               jtfResult.setText(jtfResult.getText() + jbNine.getText());
            }
            else if(e.getSource()==jbZero){
               jtfResult.setText(jtfResult.getText() + jbZero.getText());
            }
            else if(e.getSource()==jbPeriod){
               jtfResult.setText(jtfResult.getText() + jbPeriod.getText());
            }
        }
    }
    
    public class calcAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String displayFieldText = jtfResult.getText();
            
            if(!"".equals(displayFieldText)){
               opr2 = Double.parseDouble(displayFieldText);
            }
            if(e.getSource()==jbAddition){
               operation = '+';
               opr1 = opr2;
               jtfResult.setText("");
            }
            else if(e.getSource()==jbSubtraction){
               operation = '-';
               opr1 = opr2;
               jtfResult.setText("");
            }
            else if(e.getSource()==jbMultiplication){
               operation = '*';
               opr1 = opr2;
               jtfResult.setText("");
            }
            else if(e.getSource()==jbDivision){
               operation = '/';
               opr1 = opr2;
               jtfResult.setText("");
            }
            else if(e.getSource()==jbEquals){
                if(operation=='+'){
                    opr1 += opr2;
                   jtfResult.setText(""+opr1);
                }
                else if(operation=='-'){
                    opr1 -= opr2;
                    jtfResult.setText(""+opr1);
                }
                else if(operation=='*'){
                    opr1 *= opr2;
                    jtfResult.setText(""+opr1);
                }
                else if(operation=='/'){
                    opr1 /=opr2;
                    jtfResult.setText(""+opr1);
                }
                else if(operation=='%'){
                    opr1 %=opr2;
                    jtfResult.setText(""+opr1);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
    
}

    