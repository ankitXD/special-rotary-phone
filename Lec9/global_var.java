package Lec9;

public class global_var {
	static int val = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int x = 60;
		System.out.println(val);
		fun(x);
		System.out.println(val);
	}
	public static void fun(int x) {
		int a = 90;
		System.out.println(x);
		
		int val = 19;
		System.out.println(val);
		
		global_var.val = 120;
		System.out.println(global_var.val);
	}

}
