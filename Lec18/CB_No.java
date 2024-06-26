package Lec18;

import java.util.Scanner;

public class CB_No {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//2
		String s = sc.next();//127
		System.out.println(printsubstringbylen(s));
	}
	
	public static int printsubstringbylen(String str) {
		int count = 0;
		boolean [] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s1 = str.substring(i, j);
				//Integer.parseLong(s1); NUMERIC STRING KO INT MEI CONVERT KARTA 
				long n = Long.parseLong(s1);
				if(isCbNumber(n) == true && isValid(visited,i,j-1) == true){
					count++;
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		return count;
	}
	
	public static boolean isValid(boolean [] visited, int i, int j) {
		for(; i<j; i++) {
			if(visited[i] == true) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isCbNumber(long num) {
		if(num == 0 || num == 1) {
			return false;
		}
		
		int []arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for (int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
