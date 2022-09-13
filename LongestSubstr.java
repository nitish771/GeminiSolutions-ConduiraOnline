import java.util.*;


class LongestSubstr{

	static final int CHARS = 140;

	public static int longest(String str){
		Map<Character, Integer> seen = new HashMap<>();
		int res = 0;
	    int start = 0;
      
	    for (int end =0; end < str.length(); end++){
	        if(seen.containsKey(str.charAt(end))){
	            start = Math.max(start, seen.get(str.charAt(end)) + 1);
	        }
	        seen.put(str.charAt(end), end);
	        res = Math.max(res, end-start + 1);
	    }
		return res;
	}

	public static int longestUniqueSubsttr(String str){
		int[] arr = new int[CHARS];
		Arrays.fill(arr, -1);

		int res=0;
		int i=0, n = str.length();

		for(int j=0; j<n; j++){
			i = Math.max(i, arr[str.charAt(j)]+1);
			res = Math.max(res, j - i + 1);
			arr[str.charAt(j)] = j;
		}
		return res;
	}


	/* Driver program to test above function */
	public static void main(String[] args)
	{
		String str = "abcabbc";
		System.out.println("The input string is " + str);
		// int len = longestUniqueSubsttr(str);
		int len = longest(str);
		System.out.println("The length of "
						+ "the longest non repeating character is " + len);
	}
}
// This code is contributed by Sumit Ghosh
