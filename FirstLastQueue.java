import java.util.*;

public class FirstLastQueue{

	public static void first_last(){
		System.out.println("Start");

		Scanner in = new Scanner(System.in);
		int e, n = in.nextInt();
		LinkedList<Integer> q = new LinkedList<>();
		int f, l;

		for (int i=0; i<n; i++) {
			q.add(in.nextInt());
		}

		f = q.getFirst();
		l = q.getLast();

		System.out.println(f + " " + l);
	}
	
	public static void main(String[] args){
		first_last();
	}
}