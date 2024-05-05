package Leetcode;

public class Score_of_a_String_3110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/score-of-a-string/description/
		//18-04-2024
		String s = "hello";
		System.out.println(scoreOfString(s));
	}
    public static int scoreOfString(String s) {
        int score = 0;
         for(int i=0;i<s.length()-1;i++){
            score+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }

}
