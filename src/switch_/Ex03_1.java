package switch_;

import java.util.Scanner;

public class Ex03_1 {

	public static void main(String[] args) {

		//문제 1번 : 날짜를 입력받아 1일이면 '월' 2일이면 '화'..7일'일' 8일'월'
		//숫자에 맞춰 요일을 출력하시오.
		/*Scanner scan = new Scanner(System.in);
		int day;
		System.out.print("날짜 입력: ");
		day = scan.nextInt();
		if(day %7==1) {
			System.out.println("월");
		}else if(day %7==2) {
			System.out.println("화");
		}else if(day %7==3) {
			System.out.println("수");
		}else if(day %7==4) {
			System.out.println("목");
		}else if(day %7==5) {
			System.out.println("금");
		}else if(day %7==6) {
			System.out.println("토");
		}else{
			System.out.println("일");
		}*/
		
		//강사님 답
		/*
		Scanner scan = new Scanner(System.in);
		while(true) {
			int num;
			System.out.println("날짜 입력: ");
			num = scan.nextInt();
			switch(num%7) {
			case 1: System.out.println(num+"월요일");break;
			case 2: System.out.println(num+"화요일");break;
			case 3: System.out.println(num+"수요일");break;
			case 4: System.out.println(num+"목요일");break;
			case 5: System.out.println(num+"금요일");break;
			case 6: System.out.println(num+"토요일");break;
			case 0: System.out.println(num+"일요일");break;
			}
		}
		*/
		
		
		
	//내가 푼 답
		Scanner scan = new Scanner(System.in);
		String home = null, work = null;
		int num;
		while(true) {
		System.out.println("1.우리집 등록");
		System.out.println("2.회사 등록");
		System.out.println("3.등록보기");

		num = scan.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("1. 우리집 등록");
			home = scan.next();
			break;

		case 2: 
			System.out.println("2. 회사 등록");
			work = scan.next();
			break;

		case 3: 
			System.out.println("우리집 : "+home+"\n회사: "+work);
			break;
			default: System.out.println("다시입력하세요.");
			}
		}
	}
}


















