import java.util.Scanner;
import java.util.ArrayList;


public class MiddleElem{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int n = in.nextInt();

		for(int i=0; i<n ; i++){
			arr.add(in.nextInt());
		}

		int m = arr.size()/2;
		System.out.println(arr.get(m));
	}
}