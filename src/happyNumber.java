import java.util.HashSet;

public class happyNumber {
	private happyNumber() {
	};

	public Boolean happyNumberSolutions(int n) {
		HashSet<Integer> dict = new HashSet<>();
		dict.add(n);
		while (n != 1) {
			int result = 0;
			while (n != 0) {
				result += (n % 10) * (n % 10);
				n = n / 10;
			}
			if (dict.contains(result)) {
				return false;
			}
			dict.add(result);
			n = result;
		}
		return true;
	}
}