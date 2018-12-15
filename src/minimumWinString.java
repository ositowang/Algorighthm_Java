public class minimumWinString {
	private minimumWinString() {
	};

	public String minimumSolutions(String s, String t) {
		int[] dict = new int[256];
		for (int i = 0; i < t.length(); i++) {
			dict[t.charAt(i)]++;
		}
		int l = 0;
		int r = 0;
		int count = t.length();
		int d = Integer.MAX_VALUE;
		int head = 0;
		while (r < s.length()) {
			if (dict[s.charAt(r)] > 0)
				count--;
			dict[s.charAt(r)]--;
			r++;
			// count==0 就是已经找到了一个有效子字符串
			while (count == 0) {
				// 更新一下最短子串的长度
				if (r - l < d) {
					d = r - l;
					head = l;
				}
				if (dict[s.charAt(l)] == 0) {
					count++;
				}
				dict[s.charAt(l)]++;
				l++;
			}
		}
		return d == Integer.MAX_VALUE ? "" : s.substring(head, head + d);
	}
}