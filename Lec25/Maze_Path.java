package Lec25;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;// row
		int m = 3;// col
		System.out.println("\n" + PrintPath(0, 0, n - 1, m - 1, ""));
	}

//cc--> current col, cr -->current row, ec-->end col, er-->end row
	public static int PrintPath(int cc, int cr, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int a1 = PrintPath(cc + 1, cr, er, ec, ans + "H");
		int a2 = PrintPath(cc, cr + 1, er, ec, ans + "V");
		return a1 + a2;
	}

}
