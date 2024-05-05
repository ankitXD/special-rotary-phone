package Lec9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,87,9,7};
		int item = 87;
		System.out.println(Search(arr, item));
	}
	public static int Search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
