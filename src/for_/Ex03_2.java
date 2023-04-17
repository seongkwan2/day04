package for_;

public class Ex03_2 {
public static void main(String[] args) {
	/*- 문제 1 : 
		두 개의 정수를 입력 받아 두 정수 사이 수들의 합을 구하시오.

		결과 예시 : 
		첫 번째 정수 입력 : 5
		두 번째 정수 입력 : 11
		5부터 11까지의 합은 56이다



		- 문제 2 : 
		입력한 구구단 단수에 맞게 출력하는 구구단 프로그램을 작성하세요.



		- 문제 3 : 
		문제 0부터 20까지 짝수만 출력해보자




		=========================================================




		- 문제 1 코드 : 
		package for_;

		import java.util.Scanner;

		public class Ex04 {
		   public static void main(String[] args) {
		      Scanner input = new Scanner(System.in);
		      System.out.print("첫 번째 정수 입력 : ");
		      int n1 = input.nextInt();
		      System.out.print("두 번째 정수 입력 : ");
		      int n2 = input.nextInt();
		      int sum = 0, max = 0, min = 0;
		      
		      if (n1 > n2) {
		    	  max = n1;
		    	  min = n2;
		      }
		      else {
		    	  max = n2;
		    	  min = n1;
		      }
		      
		      for (int i = min; i <= max; i++) {
		    	  sum += i;
		      }
		      
		      System.out.println(min + "부터 " + max + "까지의 합은 " + sum + "이다");
		   }
		}



		- 문제 2 코드 : 
		package if_;

		import java.util.Scanner;

		public class test01 {
		   public static void main(String[] args) {

		      Scanner sc = new Scanner(System.in);
		      
		      System.out.println("구구단 단수 입력: ");
		      int dan = sc.nextInt();
		      
		      for(int i = 1; i < 10; i++) {
		         System.out.println(dan + " X " + i + " = " + (dan * i));
		      }
		    }
		}



		- 문제 3 코드 : 
		public class Ex03 {
		   public static void main(String[] args) {
		   
		      for(int i=0; i<21; i++) {
		         if(i%2==0) {
		         System.out.println(i + " ");
		         }
		      }
		   }
		}
}
}*/
}
}
