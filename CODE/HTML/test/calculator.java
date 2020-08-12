import java.awt.*;
import javax.swing.*;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String[] str = { //넣을 아이콘 배열에 삽입
    "CE",
    "계산",
    "+",
    "-",
    "x",
    "%"
};
JTextField tf1, tf2;  //TextField 2개 생성
String numStr = ""; //계산이 이루어지는 텍스트를 여기에 저장한다
public calculator() {
    setTitle("계산기프레임");
    setSize(300, 300); //사이즈를 300X300으로 설정
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    JPanel pn = new JPanel(); //pn ps pc 패널 생성
    JPanel ps = new JPanel();
    JPanel pc = new JPanel();
    pn.setBackground(Color.LIGHT_GRAY); //pn 은 입력된 연산식이 있는 jpanel이다 이 패널 색상을 LIGHT GRAY 로 지정
    ps.setBackground(Color.YELLOW); // 계산 결과가 있는 패널, 색상을 YELLOW 로 지정 
    pc.setLayout(new GridLayout(4, 4, 5, 5)); //열과 행을 4로 지정한 패널 
    JLabel label1 = new JLabel("수식입력"); 
    tf1 = new JTextField(10);
    pn.add(label1); // 위에서 만든 수식입력 jlabel 과 jtextfield add
    pn.add(tf1);
    JLabel label2 = new JLabel("계산결과");
    tf2 = new JTextField(10);
    ps.add(label2); //똑같이 "계산결과" JLabel 이랑 textfield 20칸짜리 add
    ps.add(tf2);
    
    for (int i = 0; i < 16; i++) { // 총 16개의 버튼이므로 for 문으로 16번 반복
        JButton b = new JButton();
        if (i < 10) { // 0~9까지는 0~9숫자로 버튼 텍스트를 지정
            b.setText(i + ""); 
     

    } else { //10부터 15까지는 위에 넣었던 str 배열에 넣어 놓았던 text 값으로 지정
    b.setText(str[i - 10]);
    }
    if (i > 11) 
        b.setBackground(Color.WHITE); //지정된 색상값 버튼 객체에 설정
        pc.add(b); 
        b.addActionListener(this); //버튼을 눌렀을때 지정된 함수가 실행되도록한다
        }
        c.add(pc); //pn과 ps가 위아래로 지정되어서 pc 는 자연스럽게 가운데로 레이아웃이 형성된다
        c.add(pn, BorderLayout.NORTH); //pn label 을 위로 지정
        c.add(ps, BorderLayout.SOUTH); //ps label 은 아래로 지정
        setVisible(true);
    }
    public static void main(String[] args) {
    new calculator();
    }
    @Override public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    if (str.equals("CE")) { //CE 버튼을 누르면 tf1 필드를 비워주고 numStr 값도 지워준다
        numStr = "";
        tf1.setText(numStr);
        tf2.setText("");
    } else if (str.equals("계산")) { //numStr에 입력된 문자열을 수식으로 변환시켜 계산된 결과값을 tf1에 출력
    
        StringTokenizer st = new StringTokenizer(numStr, "+-x%", true);
    
        int num1 = Integer.parseInt(st.nextToken());
        
        String op = st.nextToken();
        
        int num2 = Integer.parseInt(st.nextToken());

    switch (op) {
        case "+":
            tf2.setText(num1 + num2 + "");
            break;
        case "-":
            tf2.setText(num1 - num2 + "");
            break;
        case "x":
            tf2.setText(num1 * num2 + "");
            break;
        case "%":
            tf2.setText(num1 / num2 + "");
            break;
        default:
            tf2.setText("오류");
            break;
    }

    tf1.setText(numStr);
    } else { 
        numStr += str;
        tf1.setText(numStr);
        }
    }
}
