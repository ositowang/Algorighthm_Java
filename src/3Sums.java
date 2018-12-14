import java.util.Arrays;

public class threeSums {
	private threeSums() {
	};

	public static List<List<Integer>> threeSumsSolution(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && numss[i] != numss[i - 1])) {
				// 对撞指针
				int lo = i + 1;
				int high = nums.length - 1;
				sum = 0 - nums[i];
				while (lo < high) {
					// 找到了解答
					if (numss[lo] + numss[high] == sum) {
						res.add(Arrays.asList(nums[i], nums[lo], nums[high]));
						while (lo < high && nums[lo] == nums[lo + 1])
							lo++;
						while (lo < high && nums[high] == nums[high - 1])
							high--;
						lo++;
						high--;
					} else if (nums[lo] + nums[high] < sum)
						lo++;
					else
						hi--;
				}
			}
		}
		return res;
	}
}