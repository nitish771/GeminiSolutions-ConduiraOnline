import java.util.*;


public class CountElems{

	public static void count_occur(){
		System.out.println("Start");

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int e, n = in.nextInt();

		for(int i=0; i<n ; i++){
			e =	in.nextInt();
			arr.add(e);
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for( Integer i : arr){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			} else{
				map.put(i, 1);
			}
		}

		System.out.println(map.toString());
	}
	
	public static void main(String[] args){
		count_occur();
	}
}