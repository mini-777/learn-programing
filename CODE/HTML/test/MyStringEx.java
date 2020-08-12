
public class MyStringEx {
    public static void main(String[] args) {
     char [] chs = new char[] {'A', 'B', ' ', 'C', 'D'};
     MyString str1 = new MyString(chs);
     chs[0] = 'Z';   
     
     System.out.print("str1 문자열 : ");
     MyString.println(str1);  // AB CD	
     System.out.print("str1 문자열의 길이 : ");
     System.out.println(str1.length());  // 5
     
     MyString str2 = new MyString(new char[] {'A', 'B', ' ', 'C', 'D', 'E'});
     System.out.print("str2 문자열 : ");
     MyString.println(str2);  // AB CDE	
     if (str1.equals(str2))
         System.out.println("str1 과 str2 문자열은 같습니다");
     else
         System.out.println("str1 과 str2 문자열은 다릅니다");
     
     MyString str3 = new MyString(new char[] {' ','\t','A', 'b', ' ', 'C', 'd',' '});
     MyString str4 = str3.trim().toUpperCase();  	
     
     System.out.print("str4 문자열 : ");
     MyString.println(str4);  // AB CD	
     if (str1.equals(str4))
         System.out.println("str1 과 str4 문자열은 같습니다");
     else
         System.out.println("str1 과 str4 문자열은 다릅니다");
                                                 
     MyString sub = new MyString(new char[] {'B', ' ', 'C'});
     System.out.print("sub 문자열 : ");
     MyString.println(sub);  // B C	
             
     if (str1.contains(sub)) 
         System.out.println("str1은 sub 문자열을 포함합니다 ");
     else
         System.out.println("str1은 sub 문자열을 포함하지 않습니다.");
         
    }
}
class MyString{
    char[] arr;
    
    MyString(){ // MyString 기본생성자
    }
    MyString(char[] arr) { // char 배열을 파라미터로 받아서 멤버변수에 할당
        this.arr = arr.clone();
    }
    public MyString toUpperCase() { //아스키코드값을 활용해 소문자를 대문자로 변환해준다
        for(int i=0; i<this.arr.length; ++i){
            if(97<=this.arr[i] && this.arr[i]<=122){
                this.arr[i]=(char)(this.arr[i]-32);
                }
            }
        return this;
    }

    
    public MyString trim() { // character.iswhitespce 를 사용해 공백문자 인식후 해당 index 삭제후 객체 반환
        String str = new String(arr);
        str=str.trim();
        this.arr = str.toCharArray();
        return this;
    }

    public boolean contains(MyString sub) { //각각의 배열을 문자열로 변환후 contains 메소드를 사용해서 boolean 값을 반환한다
        String str1 = new String(this.arr);
        String str2 = new String(sub.arr);
        
        return str1.contains(str2);
    }

    public int length() { //length 메소드를 사용해서 배열의 개수값을 반환해준다

        return this.arr.length;
    }

    
    public static void println(MyString k) { //객체를 받아서 안에있는 멤버변수 arr의 요소들을 차례로 for문을 이용해서 출력해준다.
        for(char number : k.arr) {
            System.out.print(number);
    }
        System.out.println();
    }
   
   
}