package Leetcode;

public class Reverse_Prefix_of_Word_2000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefd";
		char c = 'd';
		System.out.println(reversePrefix(s, c));
	}
	public static String reversePrefix(String word, char ch) {
		
		int left = 0;
		int right = word.indexOf(ch);
		
		char[] arr = word.toCharArray();
		
		while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }

}
