package Lec4;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int a=0;
		int b=1;
		for (int i = 1; i <= n; i++) {
			int c = a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}

}
