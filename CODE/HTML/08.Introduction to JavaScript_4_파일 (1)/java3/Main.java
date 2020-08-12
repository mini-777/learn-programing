package java3;

import java.util.Scanner;


class Play {
    int[] number = new int[6];
    Scanner scanner = new Scanner(System.in);
    public void Manual() {
       System.out.println("몇개의 번호를 뽑겠습니까 >>");
       int num = scanner.nextInt();
       int[] choice = new int[6-num];
       System.out.print("이미 생각했던 번호를 입력하세요 >> ");
       for(int i = 0; i <6-num; i++) {
       System.out.print((i+1)+"번째 >> ");
       choice[i] = scanner.nextInt();
       }
       for(int i = 0; i<num; i++) {
          number[i] = (int)(Math.random()*20) + 1;
    /*      
       for(int j=0; j<num; j++) {
          if(number[i] == number[j]) {
             i--;
             break;
          }
       }
       */
       for(int j=0; j<choice.length; j++) { //선택한거에서 중복제거
          if(number[i] == choice[j] ) {
             i--;
             break;
          }   
       }   
    }
       for (int i = 0; i <num; i++) {         //내림차순으로 정렬
            for (int j = i + 1; j < num; j++) {
                    if (number[i] > number[j]) {
                        int temp = number[i];
                        number[i] = number[j];
                        number[j] = temp;
                    }
                }  
          }
       
       for ( int i = 0; i<num; i++) {
          System.out.print(" "+number[i]+" ");
       }
    }