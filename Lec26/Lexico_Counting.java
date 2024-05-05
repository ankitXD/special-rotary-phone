package Lec26;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		printCount(0, n);
	}

	public static void printCount(int curr, int n) {
		// TODO Auto-generated method stub
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		
		if (curr == 0) {
			i = 1;
		}
		
		for (; i <= 9; i++) {
			printCount(curr * 10 + i, n);
		}
	}

}
