import java.util.Scanner;
public class NestedLoopTest2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 숫자를 입력하세요 : ");
        int num = scan.nextInt();
        int i = 1;
        scan.close();
        while(i<=num)
        {
            int j=1;
            while (j <= i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    
    
    }

}