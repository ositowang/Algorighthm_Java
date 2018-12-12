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
			if (dict.containsKey(strList[i])) {
				if (dict.get(strList[i]) != pattern.charAt(i)) {
					return false;
				}
			} else {
				if (!checkSet.contains(pattern.charAt(i))) {
					dict.put(strList[i], pattern.charAt(i));
					checkSet.add(pattern.charAt(i));
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