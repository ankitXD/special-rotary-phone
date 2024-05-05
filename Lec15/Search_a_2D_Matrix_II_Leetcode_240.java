package Lec15;

public class Search_a_2D_Matrix_II_Leetcode_240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},
						{3,6,9,16,22},{10,13,14,17,24},
						{18,21,23,26,30}};
		int x = 5;
	}
	public static boolean Search(int[][] arr,int x) {
		int r = 0;
		int c = arr[0].length;
		while(r<arr.length && c>=0) {
			if(arr[r][c]==x) {
				return true;
			} else if (arr[r][c]>x){
				 c--;
			} else {
				r++;
			}
		}
		return false;
	}

}
