package Lec8;

import java.util.*;

public class armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		System.out.println(isArmstrongNum(n));
	}
	
	public static boolean isArmstrongNum(int n) {
		int d = countOfDigits(n);
		int sum = 0;
		int p = n;
		while(n>0) {
			int rem = n%10;
			sum = (int) (sum + Math.pow(rem, d));
			n = n/10;
		}
		if (sum==p) {
			return true;
		} else {
			return false;
		}
	}
	public static int countOfDigits(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n = n/10;
		}
		return count;
	}

}
