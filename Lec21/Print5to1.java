package Lec21;

public class Print5to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		print(a);
	}

	public static void print(int a) {
		if(a == 0) {
			return;
		}
		
		System.out.println(a);
		print(a-1);
	}

}
