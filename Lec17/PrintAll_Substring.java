package Lec17;

public class PrintAll_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gagan";
		printsubstring(s);
	}
	public static void printsubstring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
