package level1;

import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		//dice5TimeSum();
		//diceUntillOddSum();
		diceGame();
	}

	private static void diceGame() {
		// 플레이어(Math 랜덤 값)와 컴퓨터(Random 랜덤 값) 주사위 굴리기를 해 이기면
		//"You Win!", 비기면 "Draw", 지면 "You Lose!"를 출력하시오.
		int player = (int)(Math.random()*6)+1;
		int com = new Random().nextInt(6)+1;
		
		System.out.println("플레이어 주사위눈: "+player+"\n"
				+"컴퓨터 주사위눈: "+ com);
		String res = "Draw";
		if (player != com) res = (player > com) ? "You Win!" : "You Lose!"; 
		System.out.println("승부결과: "+res);
	}

	private static void diceUntillOddSum() {
		// 홀수가 나올때까지 주사위를 굴려 합을 구하시오.
		//Random random = new Random();
		Random random = new Random();
		int result = 0;
		while(true) {
			int r = random.nextInt(5)+1;
			System.out.println("나온 주사위 값: "+r);
			if (r%2==1) {
				break;
			}
			result += r;
		}
		
		System.out.println(result);
	}

	private static void dice5TimeSum() {
		// 6면인 주사위를 5회 굴려서 나온 합계를 구하시오.
		// (int)(Math.random()*최댓값) + 최솟값;
		
		int result = 0;
		for(int i = 0; i < 5; i++) {
			double d = Math.random();
			int temp = (int)(d * 6)+1; // 랜덤으로 (1~6) 정수값
			System.out.println(i+1+"번째 숫자: "+temp);
			result += temp;
		}
		System.out.println("주사위눈 합계: "+result);
	}

}
/**
 랜덤값을 구하는 방법 두가지 
  (int)(Math.random()*최댓값) + 최솟값; -> 클래스메소드 사용
  Random random = new Random(); -> 인스턴스 메소드 방식

  자바의 타입 : 프리미티브(소문자: int, boolean, double), 레퍼런스타입(대문자)
  상위구조에서 
 */