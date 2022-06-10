import java.util.Random;
import java.util.Scanner;
class Jam1 {

	 static int us ;
	 static int cs ;	
	 static int a, b, c, d, e, f, g, h;
	 
	static int ual;
	static int cal;

	
	  public static void print1(int ua,int ca) {
		  a = ua;
		  e = ca;
      System.out.println("유저 1번 카드 : " + a);
      System.out.println("봇 1번 카드 : ?? " );
	  System.out.println();}
	  
	  public static void print2(int ub,int cb) {
		  b = ub;
		  f = cb;
      System.out.println("유저 2번 카드 : " + b);
      System.out.println("봇 2번 카드 : " + f);
      System.out.println();
	  }
	  public static void print3(int uc,int cc) {
		  c = uc;
		  g = cc;
      System.out.println("유저 3번 카드 : " + c);
      System.out.println("봇 3번 카드 : " + g);
      System.out.println();
	  }
	  public static void print4(int ud,int cd) {
		  d = ud;
		  h = cd;
      System.out.println("유저 4번 카드 : " + d);
      System.out.println("봇 4번 카드 : " + h);
      System.out.println();
	  }
	  public static void print5() {
		  
      System.out.println("유저 카드 " + "1카드 [" + a +"] 2카드 [" + b + "] 3카드 [" + c + "] 4카드 [" + d + "]");
      System.out.println("봇 카드 " + "1카드 [??] " + " 2카드 [" + f + "] 3카드 [" + g + "] 4카드 [" + h + "]");
      System.out.println();
	  }
	  public static void print6() {
		  ual = (a+b+c+d);
		  cal = (e+f+g+h);
      System.out.println("유저 카드 합 " + ual);
      System.out.println("봇 카드 합 " + cal);
      System.out.println();
      
      
      }
	  
	  public static void print7() {
			 a = 0; 
			 b = 0; 
			 c = 0;
			 d = 0;
			 e = 0;
			 f = 0;
			 g = 0;
			 h = 0;
			 cal = 0;
			 ual = 0;
			 System.out.println();
	  }
	  
}


public class jamjam extends Jam1 {

		public static void main(String[] args) {
			 
			 
			 Scanner sc = new Scanner(System.in);
			 String input = "";
			 do {
				 Jam1 jj = new Jam1();
			 System.out.println("카드: 1~4 // 확인: 5 // 결과: 6 // 초기화: 7");
             System.out.print("숫자를 입력하세요 :");
       
             int user= sc.nextInt();
             int ca, cb, cc, cd, ua, ub, uc, ud;
				 
             Random user1 = new Random();
             Random user2 = new Random();
             Random user3 = new Random();
             Random user4 = new Random();
             Random b1 = new Random();
             Random b2 = new Random();
             Random b3 = new Random();
             Random b4 = new Random();
             
            
         
              if(user == 1) { 
            	ua = user1.nextInt(11)+1;
            	ca = b1.nextInt(11)+1;
            	print1(ua, ca);
             }
              if(user == 2) { 
              	ub = user2.nextInt(11)+1;
              	cb = b2.nextInt(11)+1;
              	print2(ub, cb);
               }
              if(user == 3) { 
              	uc = user3.nextInt(11)+1;
              	cc = b3.nextInt(11)+1;
              	print3(uc, cc);
               }
              if(user == 4) { 
              	ud = user4.nextInt(11)+1;
              	cd = b4.nextInt(11)+1;
              	print4(ud, cd);
               }
              if(user == 5 ) { 
            	  print5();
              }
              if(user == 6 ) { 
                  print6();
                 if(cal>21 && ual>21){System.out.println("무승부"); }
         	  	 if(ual > 21 && cal < 21) {System.out.println("유저 오버 패배"); }
         		 if(cal > 21 && ual < 21) { System.out.println("봇 오버  승리"); }
         		 if(ual > cal && ual<21) { System.out.println("유저 승리"); }
         		 if(ual < cal && cal<21) { System.out.println("유저 패배"); }
         		 if(ual == cal){System.out.println("무승부"); }
         		 
         		 }
              if(user == 7 ) { 
                  print7();
            	 }
			 }
			 while (!input.equalsIgnoreCase("Q"));{
				System.out.println("프로그램 종료"); }
			 }
		}
 			 






			 
		

