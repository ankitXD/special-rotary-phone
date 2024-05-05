package Lec11;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-7,5,2,4,9,3};
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Sort(int[] arr) {
		// single element hamesha sorted hoga isliye i 1 se start hoga
		for (int i = 1; i < arr.length; i++) {
			int picked = arr[i];//hand picked
			int j = i-1;
			while(j>=0 && arr[j]>picked) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=picked;
		}
	}

}
