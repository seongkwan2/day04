package for_;

import java.util.Scanner;

public class Ex03_6 {
	public static void main(String[] args) {
	
		/*
		 <1번 문제>

<자판기 만들기>
* 손님이 메뉴에 맞는 번호를 입력하면, 번호에 맡는 메뉴 출력하도록 만들기
* 주문하시겠습니까? ( YES(1) or NO(0) )

* YES => 1.바나나우유, 2.딸기우유, 3.초코우유, 4.원하는 메뉴가 없음 
        => 번호를 선택해주세요.

* NO => 안녕히가세요!

* EX) 메뉴 선택 했을 경우
	어서오세요!
	우유자판기입니다. 주문하시겠습니까? (YES : 1, NO : 2)

	입력 => 1

	1.바나나우유, 2.딸기우유, 3.초코우유, 4.원하는 메뉴가 없음
	번호를 선택해주세요.

	메뉴번호입력 => 2

	딸기우유를 선택하셨습니다.
	맛있게드세요!









<2번 문제>

* for문을 이용해 5번의 기회 동안 1~50까지 랜덤한 숫자 맞히기
* 5번의 기회를 모두 사용하면 패배
* 5번의 기회 안에 맞히면 승리

* 랜덤한 수 : int randNum = (int) Math.floor(Math.random() * 50);










<3번 문제>

가운데를 대칭으로하는 트리 모양을 만드시오
    *
   ***
  *****
 *******
*********




























----------------------------------정	답---------------------------------------

<1번 정답>

			int num = 0;
			int menu = 0;
			Scanner sc = new Scanner(System.in);         
			
			System.out.println("어서오세요!");
			System.out.println("우유자판기입니다. 주문하시겠습니까? (YES : 1, NO : 2)");
			System.out.print("입력 => ");
			num = sc.nextInt();
			if(num == 1) {
				System.out.println("1.바나나우유, 2.딸기우유, 3.초코우유, 4.원하는 메뉴가 없음");
				System.out.println("번호를 선택해주세요.");
				System.out.print("번호입력 => ");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					System.out.println("바나나우유를 선택하셨습니다.");
					System.out.println("맛있게드세요!");
					break;
				case 2:
					System.out.println("딸기우유를 선택하셨습니다.");
					System.out.println("맛있게드세요!");
					break;
				case 3:
					System.out.println("초코우유를 선택하셨습니다.");
					System.out.println("맛있게드세요!");
					break;
				case 4:
					System.out.println("죄송합니다!");
					System.out.println("안녕히가세요!");
					break;
				}
			}
			else {
				System.out.println("안녕히가세요!");
			}









<2번 정답>


 int randNum = (int) Math.floor(Math.random() * 50);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("수를 입력해 주세요 : ");
            int inputNum = scanner.nextInt();

            if (inputNum == randNum) {
                System.out.println("정답입니다.");
                break;
            }else if(inputNum > randNum){
                System.out.println(inputNum + "보다 더 작은 숫자입니다.");
            }else{
                System.out.println(inputNum + "보다 더 큰 숫자입니다.");
            }










<3번 정답>


for(int i=1; i<10; i+=2) {
			for(int j=9; j>i; j-=2) System.out.print(" "); //공백찍기
			for(int j=0; j<i; j++) System.out.print("*"); //별찍기
			System.out.println();
		}



		 */

	}
}
