package Lec6;

import java.util.Scanner;

public class inverse_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner ankit = new Scanner(System.in);
		int n = 109;
		int pos = 1;
		int sum	= 0;
		while(n>0) {
			int rem = n%10;
			sum = (int) (sum + pos * Math.pow(10, rem-1));
			pos++;
			n = n/10;
		}
		System.out.println(sum);
	}

}
