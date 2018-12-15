import java.util.HashMap;
import java.util.HashSet;

import com.sun.xml.internal.ws.encoding.HasEncoding;

public class wordPattern {
	priave wordPatter() {
	};

	public boolean wordPatternSolutions(String pattern, String str) {
		String[] strList = str.split(" ");
		if (pattern.length() != strList.length)
			return false;
		HashMap<String, Character> dict = new HashMap<String, Character>();
		HashSet<Character> checkSet = new HashSet<Character>();
		for (int i = 0; i < strList.length; i++) {
			// 如果已经有这组数据了，看看存入的数据和现有数据是不是一致，不一致就是错的
			if (dict.containsKey(strList[i])) {
				if (dict.get(strList[i]) != pattern.charAt(i)) {
					return false;
				}
			} else {
				// 如果我们没有添加过这个值得话，就可以放心添加
				if (!checkSet.contains(pattern.charAt(i))) {
					dict.put(strList[i], pattern.charAt(i));
					checkSet.add(pattern.charAt(i));
					// 如果我们没有这个键，但是这个值却添加过了，那么就肯定是不符合的。
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		wordPattern test = new wordPattern();
		boolean result = test.wordPatternSolutions("abba", "dog cat cat fish");
		System.out.print(result);
	}
}