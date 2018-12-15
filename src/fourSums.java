import java.util.Map;

public class fourSums {
	private fourSums() {
	};

	public static int fourSumsSolution(int[] A, int[] B, int[] C, int[] D) {
		Map<Integer, Integer> record = new HashMap<>();
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < D.length; j++) {
				record.put(C[i] + D[j], record.getOrDefault(C[i] + D[j], 0) + 1);
			}
		}
		int res = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (record.containsKey(0 - A[i] - B[j])) {
					res += record.get(0 - A[i] - B[j]);
				}
			}
		}
		return res;
	}
}