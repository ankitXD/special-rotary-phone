package Lec18;

public class Print_Substring_By_Len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "83415";
		printsubstringbylen(s);
	}
	
	public static void printsubstringbylen(String str) {
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				System.out.println(str.substring(i, j) + " ");
			}
		}
	}


}
