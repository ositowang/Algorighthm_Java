public class threeSumsCloset {
	private threeSumsCloset() {
	};

	public static int threeSumsClosetSolutions(int[] nums, int target) {
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum > target) {
					r--;
				} else {
					l++;
				}
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
			}
		}
		return result;

	}
}