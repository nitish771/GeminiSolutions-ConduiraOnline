import java.util.*;


class ScenarioBasedCollection4{
	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> s = new Stack<Integer>();

		System.out.println("Enter the numbers \n");
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<6; i++){
			q.add(sc.nextInt());
		}

		// printing
		System.out.println("Original Elements : ");
		for(Integer i : q)
			System.out.print(i + " ");
		System.out.println();

		for(int i=0; i<2; i++){
			s.add(q.peek());
			q.remove();
		}

		Stack<Integer> s1 = new Stack<Integer>();

		while(!q.isEmpty()){
			s1.add(q.peek());
			q.remove();
		}

		System.out.println("Removed Elements : ");
		while(!s.isEmpty()){
			System.out.print(s.peek() + " ");
			s.pop();
		}

		System.out.println("\nExisting Elements : ");
		while(!s1.isEmpty()){
			System.out.print(s1.peek() + " ");
			s1.pop();
		}
		
	}
}
