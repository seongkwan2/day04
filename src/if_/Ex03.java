package if_;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 정수를 입력받아 아래와 같이 출력
		 3의 배수이며 4의배수
		 3의 배수
		 4의 배수
		 3,4의 배수 아님
		 0은 잘못입력
		 */
		
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("정수 입력: ");
		num = scan.nextInt();
		if(num == 0) {
			System.out.println("잘못 입력 하셨습니다.");
		}else if(num %3 ==0 && num %4 ==0 ) {
			System.out.println("3의 배수이면서 4의 배수 입니다.");
		}else if(num %3 ==0) {
			System.out.println("3의 배수 입니다.");
		}else if(num %4 ==0) {
			System.out.println("4의 배수 입니다.");
		}else {
			System.out.println("3의배수, 4의배수가 아닙니다.");
		}

		
	}
}















