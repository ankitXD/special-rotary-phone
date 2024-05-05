package Lec22;

public class Last_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 5, 7, 5, 6, 5, 15, 5 };
		int item = 15;
		System.out.println(lastindex(arr, item, arr.length - 1));
	}

	public static int lastindex(int[] arr, int item, int i) {
		if (i < 0) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return lastindex(arr, item, i - 1);

	}

}
