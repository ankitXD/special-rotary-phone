package Lec5;

import java.util.Scanner;

public class Bin_to_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt(); //src base 10
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n % 10; //destination base 2
			sum = sum + rem*mul;
			mul = mul * 2;
			n = n/10;
		}
		System.out.println(sum);
	}

}
