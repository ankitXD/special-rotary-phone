package Lec10;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,0,4,6,8,9};
		int i = 0;
		int j = 5;
		reverse(arr, i, j);
		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l] + "\n");
		}
	}

	public static void reverse(int[] arr, int i, int j) {
		/*int i = 0;
		int j = arr.length - 1;*/
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
