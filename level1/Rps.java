package level1;

public class Rps {
	public static void main(String[] args) {
		//rps();
		int player = (int)(Math.random()*3)+1;
		int com = (int)(Math.random()*3)+1;
		System.out.println((player == com) ? "Draw":(com > (player+1)%3) ? "Win" : "Lose");
	}

	private static void rps() {
		int player = (int)(Math.random()*3)+1;
		int com = (int)(Math.random()*3)+1;
		System.out.println("플레이어: "+player+"\n"+"컴퓨터: "+com);
		String[] rps = {"가위", "바위", "보"};
		
		String s = "Draw";
		if (player != com) s = (com != player%3+1) ? "Win" : "Lose";
		System.out.println(s);
		// 1.가위 2.바위 3.보
		// 컴퓨터가 이기는 경우의 수 : player%3+1 == com 
		//
		//p c,   p%3+1 c
		//
		//1 2      2   2
		//2 3      3   3
		//3 1      1   1
		//
	}

}
