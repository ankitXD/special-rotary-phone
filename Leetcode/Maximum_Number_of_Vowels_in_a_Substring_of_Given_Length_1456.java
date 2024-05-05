package Leetcode;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length_1456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
		//20-04-2024
		String s = "abciiidef";
		int k = 3;
		System.out.println(maxVowels(s, k));
	}

	 public static int maxVowels(String s, int k) {
	        int count = 0;
	        for (int i = 0; i < k; ++i) {
	            if (isVowel(s.charAt(i))) {
	            	count++;
	            }
	        }
	        int ans = count;
	        for (int i = k; i < s.length(); ++i) {
	            if (isVowel(s.charAt(i))) {
	            	count++;
	            }
	            if (isVowel(s.charAt(i - k))) {
	            	count--;
	            }
	            ans = Math.max(ans, count);
	        }
	        return ans;
	    }

	public static boolean isVowel(char c) {
		// TODO Auto-generated method stub
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

}
