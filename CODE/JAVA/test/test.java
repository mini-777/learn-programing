package test;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){ //q가 입력될때 까지 계속 반복
            int[] lottoNumbers = new int[6]; //1~45사이의 랜덤 숫자로 로또번호를 담을 배열 생성
            for (int i = 0; i < lottoNumbers.length; i++) { //랜덤으로 숫자를 뽑는데 중복숫자가 나오면 안되기때문에 2중 for문으로 중복숫자가 나오면 다시 뽑도록함
                lottoNumbers[i] = (int) (Math.random() * 45) + 1; //1~45 사이 랜덤숫자를 배열에 넣는다
                for (int j = 0; j < i; j++) { // 이전에 넣었떤 숫자랑 비교하여서 같은 숫자가 있으면 다시 랜덤숫자를 얻어서 배열에 넣는다
                    if (lottoNumbers[i] == lottoNumbers[j]) { 
                        i--;
                        break;
                    }
                }
            }


            int[] myLottoNumbers = new int[6]; //내 로또번호를 담을 배열
            System.out.println("로또 번호를 입력해주세요"); 
            for (int i=0; i<6; i++){ //내 로또번호 배열에 6번에 걸쳐서 숫자를 입력받음
                System.out.println((i+1)+"번째 숫자 : ");
                myLottoNumbers[i] = Integer.parseInt(scan.nextLine().trim().replaceAll("\n","")); //입력받은 문자에서 공백을 없애고, 엔터를 없앤뒤에 숫자로 바꾸고 배열에 넣는다.
            }

            int hit = 0; //몇개의 로또번호가 적중했을지 세기 위한 변수
            for(int i=0; i<myLottoNumbers.length; i++){ //내 로또번호 배열과
                for(int j=0; j<lottoNumbers.length; j++){ // 로또번호 배열을 비교하여서
                    if(myLottoNumbers[i]==lottoNumbers[j]){ // 두 숫자가 같으면
                        hit++;                              // hit변수값을 늘려서 기록을 한다
                    }
                }
            }
            System.out.println("로또번호 : " + Arrays.toString(lottoNumbers)); 
            System.out.println("내 번호 : " + Arrays.toString(myLottoNumbers));
            System.out.println(hit+"개의 숫자를 맞히셨습니다!!!");

            System.out.println("계속하시겠습니까? (q : 종료, 아무키 : 계속)");
            String answer = scan.nextLine().trim().replaceAll("\n","");  //입력받은 문자에서 공백을 없애고, 엔터를 없앤다.
            if("q".equals(answer)){ //위에서 입력받은 문자가 q라면
                break;             //while(true)를 탈출하여서 프로그램을 종료한다.
            }
        }


    }
}