import java.util.Set;
import java.util.TreeSet;

public class containsDuplicate3 {
	private containsDuplicate3() {
	};

	public boolean solutions(int[] nums, int k, int t) {
		// 贱人CASE，整形溢出
		TreeSet<Long> dict = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (dict.ceiling((long) nums[i] - (long) t) != null
					&& dict.ceiling((long) nums[i] - (long) t) <= (long) nums[i] + (long) t) {
				return true;
			}
			dict.add((long) nums[i]);
			if (dict.size() == k + 1) {
				dict.remove((long) nums[i - k]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		containsDuplicate3 test = new containsDuplicate3();
		int[] testdata = { 1, 0, 1, 1 };
		boolean result = test.solutions(testdata, 1, 2);
		System.out.print(result);
	}
}