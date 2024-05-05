package Lec20;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();//2
		String s = sc.next(); //aabaabaabab
		int flip_a = maxLenOfString(s, 'a', k);
		int flip_b = maxLenOfString(s, 'b', k);
		System.out.println(Math.max(flip_a, flip_b));

	}
	public static int maxLenOfString(String str, char ch, int k) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		
		while (ei<str.length()) {
			//GROWING
			if(str.charAt(ei)==ch) {
				flip++;
			}
			//Shrinking
			while(flip>k && si<=ei) {
				if(str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			//ans calculate
			ans = Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
