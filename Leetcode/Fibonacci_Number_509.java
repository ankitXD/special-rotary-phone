package Leetcode;

public class Fibonacci_Number_509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/fibonacci-number/description/
		//14-04-2024
		int n = 0;
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		int a=0;
		int b=1;
		int sum = a + b;
		while(n>1) {
			sum = a+b;
			a=b;
			b=sum;
			
			n--;
		}
		return sum;
    }

}
