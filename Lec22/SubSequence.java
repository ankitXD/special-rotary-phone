package Lec22;

public class SubSequence {

	public static void main(String[] args) {

		String ques = "abc";
		PrintSubSequence(ques, "");
	}

	public static void PrintSubSequence(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		PrintSubSequence(ques.substring(1), ans);
		PrintSubSequence(ques.substring(1), ans + ch);
	}

}
