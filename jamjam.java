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
      System.out.println("���� 1�� ī�� : " + a);
      System.out.println("�� 1�� ī�� : ?? " );
	  System.out.println();}
	  
	  public static void print2(int ub,int cb) {
		  b = ub;
		  f = cb;
      System.out.println("���� 2�� ī�� : " + b);
      System.out.println("�� 2�� ī�� : " + f);
      System.out.println();
	  }
	  public static void print3(int uc,int cc) {
		  c = uc;
		  g = cc;
      System.out.println("���� 3�� ī�� : " + c);
      System.out.println("�� 3�� ī�� : " + g);
      System.out.println();
	  }
	  public static void print4(int ud,int cd) {
		  d = ud;
		  h = cd;
      System.out.println("���� 4�� ī�� : " + d);
      System.out.println("�� 4�� ī�� : " + h);
      System.out.println();
	  }
	  public static void print5() {
		  
      System.out.println("���� ī�� " + "1ī�� [" + a +"] 2ī�� [" + b + "] 3ī�� [" + c + "] 4ī�� [" + d + "]");
      System.out.println("�� ī�� " + "1ī�� [??] " + " 2ī�� [" + f + "] 3ī�� [" + g + "] 4ī�� [" + h + "]");
      System.out.println();
	  }
	  public static void print6() {
		  ual = (a+b+c+d);
		  cal = (e+f+g+h);
      System.out.println("���� ī�� �� " + ual);
      System.out.println("�� ī�� �� " + cal);
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
			 System.out.println("ī��: 1~4 // Ȯ��: 5 // ���: 6 // �ʱ�ȭ: 7");
             System.out.print("���ڸ� �Է��ϼ��� :");
       
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
                 if(cal>21 && ual>21){System.out.println("���º�"); }
         	  	 if(ual > 21 && cal < 21) {System.out.println("���� ���� �й�"); }
         		 if(cal > 21 && ual < 21) { System.out.println("�� ����  �¸�"); }
         		 if(ual > cal && ual<21) { System.out.println("���� �¸�"); }
         		 if(ual < cal && cal<21) { System.out.println("���� �й�"); }
         		 if(ual == cal){System.out.println("���º�"); }
         		 
         		 }
              if(user == 7 ) { 
                  print7();
            	 }
			 }
			 while (!input.equalsIgnoreCase("Q"));{
				System.out.println("���α׷� ����"); }
			 }
		}
 			 






			 
		

