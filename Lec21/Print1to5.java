package Lec21;

public class Print1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		print(a);
	}

	public static void print(int a) {
		if(a == 0) {
			return;
		}
		print(a-1);
		System.out.println(a);
		
	}

}
