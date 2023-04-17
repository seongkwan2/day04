package for_;

import java.util.Scanner;

public class Ex03_5 {
	public static void main(String[] args) {

		//문제 1번)
		//1. 1~100사이의 숫자 n을 입력받고
		//1~100사이에 n의 배수의 개수와 합을 구하세요
		//(1~100 범위를 벗어나면 "잘못된 입력입니다")
		/*
		int n;
		int sum = 0, num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
		n = scan.nextInt();
		if (n < 0 || n > 100) {
			System.out.println("잘못된 입력입니다.");
		} else {
			for (int i = 1; i <= 100; i++) {
				if (i % n == 0) {
					num++;
					sum += i;
				}
			}
			System.out.println("1~100 " + n + "의 배수의 개수 : " + num);
			System.out.println("1~100 " + n + "의 배수의 합 : " + sum);
		}
	}
}
		 */
		/*
		//문제2번)
		//1부터 50 사이 짝수의 합과 홀수의 합 각각 구하기 
		int even=0, odd=0;
		for(int i=0; i<=50;i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("짝수의 합: "+even);
		System.out.println("홀수의 합: "+odd);
	}
}

		 */
		/*
		//문제3번) 
		//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하세요.
		//입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		//출력 : 출력형식과 같게 N*1부터 N*9까지 출력한다.

		Scanner scan = new Scanner(System.in);
		int N = 0;
		System.out.println("숫자 입력: ");
		N = scan.nextInt();
		for(int i = 1; i<=9; i++) {
			System.out.println(N+"x"+i+"="+N*i);
		}
		 */



		//4. /*
		//			        * 
		//			      * * * 
		//			    * * * * * 
		//			  * * * * * * * 
		//			* * * * * * * * * 
		
		//			  * * * * * * * 
		//			    * * * * * 
		//			      * * * 
		//			        *     만드세요.

		for(int i=1; i<=5; i++) {   
			for (int j=1; j<=5-i; j++) {
				System.out.print("  "); 
			}
			for (int j=1; j<=i*2-1; j++) { 
				System.out.print("* "); 
			}
			System.out.println();
		}
		for(int i=4; i>0; i--) {   
			for (int j=4; j>=i; j--) {
				System.out.print("  "); 
			}
			for (int j=1; j<=i*2-1; j++) {
				System.out.print("* "); 
			} 
			System.out.println();
		}
	}
}










