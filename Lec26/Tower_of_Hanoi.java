package Lec26;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Hanoi(n, "A", "B", "C");
	}

	public static void Hanoi(int n, String src, String hlp, String des) {
		if (n == 0) {
			return;
		}
		Hanoi(n - 1, src, des, hlp);
		System.out.println("Move " + n + "th from " + src + " to " + des);
		Hanoi(n - 1, hlp, src, des);
	}

}
