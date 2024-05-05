package Leetcode;

public class Valid_Palindrome_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/valid-palindrome/description/
		//14-04-2024
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		//String ko lowercase mein aur digit aur ko remove krna
		String op = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch))
            	op += Character.toLowerCase(ch);
        }
        //two pointer approach
        int pointer_a = 0;
        int pointer_b = op.length()-1;
        
        while(pointer_a<=pointer_b) {
        	if(op.charAt(pointer_a)!=op.charAt(pointer_b)) {
        		return false;
        	}
        	pointer_a++;
        	pointer_b--;
        }
        return true;
    }

}
