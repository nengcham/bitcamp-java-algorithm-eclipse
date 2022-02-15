package level1;

public class Gugudan {
	public static void main(String[] args) {
		for (int k = 2; k < 10; k+=4) {
			for(int i =1; i<10; i++) {
				for (int j = k; j < k+4; j++) {
					System.out.print(j + "*"+ i +"="+i*j +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
