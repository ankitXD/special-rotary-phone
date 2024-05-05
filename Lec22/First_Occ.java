package Lec22;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 5, 7, 5, 6, 5, 15, 5 };
		int item = 5;
		System.out.println(firstindex(arr, 0, item));
	}

	public static int firstindex(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return firstindex(arr, i + 1, item);

	}

}
