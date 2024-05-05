package Lec11;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,2,4,9,3};
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

	public static void Sort(int[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
