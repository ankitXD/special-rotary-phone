package Leetcode;

public class Compare_Version_Numbers_165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/compare-version-numbers/description/
		//03-05-2024
		String ver1 = "1.0.1";
		String ver2 = "1";
		System.out.println(compareVersion(ver1, ver2));
		// https://leetcode.com/problems/compare-version-numbers/solutions/5104082/detailed-explanation-no-extra-space-linear-time-1-pass-two-pointer-using-helper-function
	}

	public static int compareVersion(String version1, String version2) {

		int i = 0;
		int j = 0;

		while (i < version1.length() || j < version2.length()) {
			int v1 = 0, v2 = 0;

			while (i < version1.length() && version1.charAt(i) != '.') {
				v1 = v1 * 10 + (version1.charAt(i) - '0');
				i++;
			}
			while (j < version2.length() && version2.charAt(j) != '.') {
				v2 = v2 * 10 + (version2.charAt(j) - '0');
				j++;
			}

			if (v1 > v2) {
				return 1;
			} else if (v1 < v2) {
				return -1;
			}

			i++;
			j++;
		}

		return 0;
	}

}
