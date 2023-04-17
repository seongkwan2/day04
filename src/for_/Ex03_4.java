package for_;

import java.util.Scanner;

public class Ex03_4 {
	public static void main(String[] args) {
	
		//문제1. 입력받은 정수(학생수)만큼 성적을 입력하고, 총점과 평균을 구하세요😁
		Scanner scan = new Scanner(System.in);
		
		int score, su, avr, total = 0;
		System.out.print("학생수 입력: ");
		su = scan.nextInt();
		System.out.println("점수 입력: ");
		for(int i=1; i<=su; i++) {
			score = scan.nextInt();
			total += score;
		}
		avr = total/su;
		System.out.println("총점: "+total+"점 평균: "+avr+"점");
		
		
		
		
		
		
	
		
		//문제2. while문으로 원하는 만큼 정수를 받고, 그 값들의 합을 구하세요✌️ 
		  //(0을 누르면 while문을 종료하고 최종 값을 보여준다!)

		//문제3. 하나의 정수를 입력받아 1부터 입력받은 수까지의 합을 출력세요😅
	}
}
