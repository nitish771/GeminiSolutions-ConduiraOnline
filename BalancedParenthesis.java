import java.util.*;


class BalancedParenthesis{
	public static int countParenthesis(){
		String str;
		int res = 0;
		Scanner in = new Scanner(System.in)	;
		str = in.next();

		Stack<Character> st = new Stack<Character>();

		for(char s : str.toCharArray()){
			if(s == '{' || s == '[' || s == '('){
				st.push(s);
			}
			else{
				st.pop();
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(countParenthesis());
	}
}