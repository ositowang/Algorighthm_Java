public class findAllAnagrams {
    private findAllAnagrams() {
    };

    public List<Integer> solutions(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int[] dict = new int[256];
        for (int i = 0; i < p.length(); i++) {
            dict[p.charAt(i)]++;
        }
        int l = 0;
        int r = 0;
        int count = p.length();
        while (r < s.length()) {
            // 如果 r指針位置的字母在P中，就減一下長度count
            if (dict[s.charAt(r)] >= 1) {
                count--;
            }
            // 然後再查找表中相應的字母減一，挪動右指針
            dict[s.charAt(r)]--;
            r++;
            // 如果count減到0了，就是左右指針之間的子串就是anagram
            // 這裡因為我們會一直不停的調整左右指針的位置，所以不用擔心長度為P的長度
            // 時候，沒減到0的情況。
            if (count == 0) {
                result.add(l);
            }
            // 如果左右指針之間的距離和P的長度一樣了，count還沒到0
            // 我們就要挪動左指針縮小窗口的距離，重新找尋新的子串窗口
            if (r - l == p.length()) {
                // 如果左指針的字符在P中的話，恢復一點長度
                if (dict[s.charAt(l)] >= 0)
                    count++;
                // 因為我們把左指針的字母剔除了，需要在查找表中加回來一點
                dict[s.charAt(l)]++;
                // 挪動左指針
                l++;
            }
        }
        return result;
    }
}