import java.util.HashSet;
import java.util.Set;

public class containsDuplicate2 {
	private containsDuplicate2() {
	};

	public boolean solutions(int[] nums, int k) {
		// 查找表
		Set<Integer> dict = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (!dict.contains(nums[i])) {
				dict.add(nums[i]);
			} else {
				return true;
			}
			// 保持查找表代表的窗口长度为K
			if (dict.size() == k + 1) {
				dict.remove(nums[i - k]);
			}
		}
		return false;
	}
}