import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class sortCharaters {
	private sortCharaters() {
	};

	public static String sortCharacterSolutions(String s) {
		// java真的是一个废话很多的语言了！！
		// fuck java...verbose language
		// "".join([char * times for char, times in
		// collections.Counter(str).most_common()]) python 1 line
		HashMap<Character, Integer> map = new HashMap<>();
		TreeMap<Integer, Set<Character>> orderedMap = new TreeMap<>(Collections.reverseOrder());
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : map.keySet()) {
			int fre = map.get(c);
			if (!orderedMap.containsKey(fre)) {
				orderedMap.put(fre, new HashSet<>());
			}
			orderedMap.get(fre).add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (Integer freq : orderedMap.keySet()) {
			for (char cur : orderedMap.get(freq)) {
				for (int i = 0; i < freq; i++) {
					sb.append(cur);
				}
			}
		}
		return sb.toString();

	}
}