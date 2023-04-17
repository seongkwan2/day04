package if_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 if , else if 또는 else 하나만 실행된다.
		 if(조건식){
		 	종속문장
		 }else if(조건식){
		 	종속문장
		 }else if(조건식)
		 ...
		 else{
		 	종속문장
		 }
		 */
		/* Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("수 입력: ");
		num = scan.nextInt();
		if(num > 100) {
			System.out.println("100보다 크다");
		}else if(num > 50) {
			System.out.println("50보다 크다");
		}else if(num > 30) {
			System.out.println("30보다 크다");
		}else {
			System.out.println("30과 같거나 작은 수");
		}System.out.println("다음 문장들 실행~"); */
		
		/* 커피의 개당 가격은 2000원이다. 10개 초과하면 초과하는 양에 대해서만
		 * 개당 1500씩 받는다.
		 * 커피의 개수를 입력받아 금액을 출력하시오.
		 * 10 : 20000
		 * 11 : 21500
		 */
		
		//내가 풀이한 답
		Scanner scan = new Scanner(System.in);
		int su;
		int su1;
		System.out.println("커피 개수 입력: ");
		su = scan.nextInt();
		if(su <= 10) {
			System.out.println(su*2000 +"원 입니다.");
		}else if(su > 10) {
			su1 = su-10;
			System.out.println(20000 + su1*1500+"원 입니다.");
		}else {
			System.out.println("다시 입력해주세요.");
		}
		
		
		//강사님 답
		int num;
		int money = 0;
		System.out.println("커피 개수 입력");
		num = scan.nextInt();
		if(num <= 10) {
			money = 2000 * num;
		}else {
			money = 20000 + (num - 10) * 1500;
		}
		System.out.println(num+"개수 값 : "+money);
	}
}







