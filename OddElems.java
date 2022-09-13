import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class OddElems{

	public static void find_odd_elms (){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int e, n = in.nextInt();

		for(int i=0; i<n ; i++){
			e =	in.nextInt();
			// arr.add(e);
			if(e % 2 == 1)
				arr.add(e);
		}
		System.out.println(arr.toString());
	}
	
	public static void main(String[] args){
		find_odd_elms();
	}
}