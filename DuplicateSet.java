import java.util.*;

public class DuplicateSet{

	public static void find_duplicates(){
		System.out.println("Start");

		Scanner in = new Scanner(System.in);
		int e, n = in.nextInt();
		Set<Integer> s = new HashSet<>();
		Set<Integer> res = new HashSet<>();
		int f, l;

		for (int i=0; i<n; i++) {
			e = in.nextInt();
			if(s.contains(e)){
				res.add(e);
			} else{
				s.add(e);
			}
		}

		System.out.println(res.toString());
	}
	
	public static void main(String[] args){
		find_duplicates();
	}
}