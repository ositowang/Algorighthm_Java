import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class groupAnagrams {
	private groupAnagrams() {
	};

	public List<List<String>> solutions(String[] strs) {
		List<List<String>> results = new ArrayList<List<String>>();
		HashMap<String, List<String>> anaMap = new HashMap<>();
		String temp;
		List<String> templist;
		for (String s : strs) {
			// 不重复添加重复的键，排序之后就可以了
			temp = sort(s);
			if (!anaMap.containsKey(temp)) {
				templist = new ArrayList<String>();
				templist.add(s);
				anaMap.put(temp, templist);
			} else {
				valList = (ArrayList<String>) anaMap.get(temp);
				valList.add(s);
			}
		}
		for (List<String> l : anaMap.values()) {
			results.add(l);
		}
		return results;
	}

	public String sort(String s) {
		char[] charArr = s.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
}