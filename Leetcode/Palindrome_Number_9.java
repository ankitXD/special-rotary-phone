package Leetcode;

public class Palindrome_Number_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 121;
		System.out.println(isPalindrome(x));
	}
	
	public static boolean isPalindrome(int a) {
		int copy = a;
		int rev = 0;
		while(a > 0) {
			int rem=a%10;
			
            //if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
           //   return false;
           // }
	          rev=rev*10+rem;
	          a/=10;
			}
		
		return copy == rev;
	}

}
