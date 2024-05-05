package Assignment_3_Arrays;

import java.util.Scanner;

public class MaximumSumPathinTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] arr1 = new int[n];
			for (int i = 0; i < n; i++) {
				arr1[i] = sc.nextInt();
			}

			int[] arr2 = new int[m];
			for (int i = 0; i < m; i++) {
				arr2[i] = sc.nextInt();
			}
			System.out.println(maximumSumPath(arr1, arr2));
		}

	}

	public static int maximumSumPath(int[] nums1, int[] nums2) {
		int i = 0;// nums1
		int j = 0;// nums2
		int p = 0;// nums1 start
		int q = 0;// nums2 start
		int ans = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				int sum1 = 0;
				int sum2 = 0;
				for (int k = p; k <= i; k++) {
					sum1 = sum1 + nums1[k];
				}
				for (int k = q; k <= j; k++) {
					sum2 = sum2 + nums2[k];
				}
				ans = ans + Math.max(sum1, sum2);
				i++;
				j++;
				p = i;
				q = j;
			}
		}
		if(i==nums1.length) {
			for (int k = q; k < nums2.length; k++) {
				ans = ans + nums2[k];
			}
		}
		if(j==nums2.length) {
			for (int k = p; k < nums1.length; k++) {
				ans = ans + nums1[k];
			}
		}

		return ans;
	}

}
