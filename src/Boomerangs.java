import java.util.HashMap;

public class Boomerangs {
	private Boomerangs() {
	};

	public int numberOfBoomerangs(int[][] points) {
		int result = 0;
		for (int i = 0; i < points.length; i++) {
			// 创建一个键为距离，值为有i到所有点距离多少种情况的哈希表
			HashMap<Integer, Integer> dict = new HashMap<>();
			for (int j = 0; j < points.length; j++) {
				// 如果两个点不同的话
				if (j != i) {
					int temp = distance(points[i], points[j]);
					dict.put(temp, dict.getOrDefault(temp, 0) + 1);
				}
			}
			// 犯了一下蠢，应该是这个点的所有情况都loop完了再来数可能性。
			for (Integer dis : dict.values()) {
				result += dis * (dis - 1);
			}
		}
		return result;
	}

	public int distance(int[] point1, int[] point2) {
		// 因为取值范围的原因，我们不用担心整形溢出
		return (point1[0] - point2[0]) * (point1[0] - point2[0]) + (point1[1] - point2[1]) * (point1[1] - point2[1]);
	}

	public static void main(String[] args) {
		Boomerangs test = new Boomerangs();
		int[][] testdata = { { 0, 0 }, { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		int result = test.numberOfBoomerangs(testdata);
		System.out.print(result);
	}
}