package leetcode.FAANG;

public class FindPeakElement {

	public static int findPeakElement(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int index = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i+1]) {
				index = i+1;
			}
		}
		return index;
	}
}
