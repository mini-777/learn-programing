public class student {
    String n;
     int sum;
     int jumsu[] = {0, 0, 0, 0};
     String name;
     int midd;
     int fn;
     int pro;
     int ab;
     public void jumsu(int midd, int fn, int pro, int ab){
         jumsu[0] = midd;
         jumsu[1] = fn;
         jumsu[2] = pro;
         jumsu[3] = ab;
     }
     public int getSum(){
         int sum = 0;
         for (int i = 0;i<=3;i++){
 
             sum = sum + jumsu[i];
 
         }
         return sum; 
     }
 
 }
 class exam {

	public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   int[] sum = new int[5];
		 String[] hakjum = new String[5];
		 float avr;
		 int tot = 0;
		 student st1 = new student();
		 student st2 = new student();
		 student st3 = new student();
		 student st4 = new student();
		 student st5 = new student();
		 st1.n="Kim";
		 st1.midd=22;
		 st1.fn=32;
		 st1.pro=12;
		 st1.ab=10;
		 st2.n="Choi";
		 st2.midd=25;
		 st2.fn=35;
		 st2.pro=19;
		 st2.ab=10;
		 st3.n="Park";
		 st3.midd=28;
		 st3.fn=36;
		 st3.pro=17;
		 st3.ab=10;
		 st4.n="Lee";
		 st4.midd=21;
		 st4.fn=33;
		 st4.pro=20;
		 st4.ab=9;
		 st5.n="Han";
		 st5.midd=27;
		 st5.fn=37;
		 st5.pro=15;
		 st5.ab=10;
		 st1.jumsu(st1.midd, st1.fn, st1.pro, st1.ab);
		 st2.jumsu(st2.midd, st2.fn, st2.pro, st2.ab);
		 st3.jumsu(st3.midd, st3.fn, st3.pro, st3.ab);
		 st4.jumsu(st4.midd, st4.fn, st4.pro, st4.ab);
		 st5.jumsu(st5.midd, st5.fn, st5.pro, st5.ab);
		 sum[0]=st1.getSum();
		 sum[1]=st2.getSum();
		 sum[2]=st3.getSum();
		 sum[3]=st4.getSum();
		 sum[4]=st5.getSum();
		 
		 for(int i = 0;i<=4;i++){
			 if(sum[i]>=95){
				 hakjum[i]="A+";
			 }
			 else if(sum[i]>=90){
				 hakjum[i]="A";
			 }
			 else if(sum[i]>=85){
				 hakjum[i]="B+";
			 }
			 else if(sum[i]>=80){
				 hakjum[i]="B";
			 }
			 else if(sum[i]>=75){
				 hakjum[i]="C+";
			 }
			 else if(sum[i]>=70){
				 hakjum[i]="C";
			 }
			 else if(sum[i]>=65){
				 hakjum[i]="D+";
			 }
			 else if(sum[i]>=60){
				 hakjum[i]="D";
			 }
			 else{
				 hakjum[i]="F";
			 }
		
		   
		 }
		 for(int i=0; i<=4; i++){
			 tot=tot+sum[i];
		 }
		float k = Float.valueOf(tot);
			 avr=k/5;   
			 
			 System.out.println(st1.n + "의 중간고사는" + st1.midd + "점, 기말고사는 " + st1.fn + "점, 과제 점수는" + st1.pro + "점, 출석은" + st1.ab+"점 입니다. "
				  + "전체총점은"+ st1.getSum() + "점 이고, 학점은" + hakjum[0] +"입니다."); 
			 
			 System.out.println(st2.n + "의 중간고사는" + st2.midd + "점, 기말고사는 " + st2.fn + "점, 과제 점수는" + st2.pro + "점, 출석은" + st2.ab+"점 입니다. "
				  + "전체총점은"+ st2.getSum() + "점 이고, 학점은" + hakjum[1] +"입니다."); 
			 
			 System.out.println(st3.n + "의 중간고사는" + st3.midd + "점, 기말고사는 " + st3.fn + "점, 과제 점수는" + st3.pro + "점, 출석은" + st3.ab+"점 입니다. "
				  + "전체총점은"+ st3.getSum() + "점 이고, 학점은" + hakjum[2] +"입니다.");
			 
			 System.out.println(st4.n + "의 중간고사는" + st4.midd + "점, 기말고사는 " + st4.fn + "점, 과제 점수는" + st4.pro + "점, 출석은" + st4.ab+"점 입니다. "
				  + "전체총점은"+ st4.getSum() + "점 이고, 학점은" +hakjum[3] +"입니다.");
			 
			 System.out.println(st5.n + "의 중간고사는" + st5.midd + "점, 기말고사는 " + st5.fn + "점, 과제 점수는" + st5.pro + "점, 출석은" + st5.ab+"점 입니다. "
				  + "전체총점은"+ st5.getSum() + "점 이고, 학점은" + hakjum[4] +"입니다.");
			 
			 System.out.println("전체평균은" + avr + "입니다.");    
		 }
		 
 
	
 
 }
 