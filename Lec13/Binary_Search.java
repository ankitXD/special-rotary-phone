package Lec13;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15 };
		int item = 11;
		System.out.print(Search(arr, item));
	}

	public static int Search(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
