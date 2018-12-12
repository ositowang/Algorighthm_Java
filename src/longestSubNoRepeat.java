public class longestSubStringNoRepeat {
	private longestSubStringNoRepeat() {
	};

	public solutions(String s){
		int [] freq = new int[256];
		int r = -1;
		int l = 0;
		int res = 0;
		while(l<s.length()){
			if(r+1<s.length() && freq[s.charAt(r+1)]==0){
				r ++;
				freq[s.charAt(r)] ++;
			}else{
				freq[s.charAt(l)] --;
				l++;
			}
			res = Math.max(res,r-l+1);
		}
		return res;
	}
}