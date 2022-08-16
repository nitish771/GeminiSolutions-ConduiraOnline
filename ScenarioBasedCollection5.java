import java.util.*;


class ScenarioBasedCollection5{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers \n");

		for(int i=0; i<6; i++){
			Integer a = sc.nextInt();
			q.add(a);
		}

		System.out.println("The output is \n");

		for(Integer i : q)
			System.out.print(i + " ");

		Integer r1 = q.remove();
		Integer r2 = q.remove();

		System.out.print(r1 + " " + r2 + " ");

		while(!q.isEmpty()){
			System.out.print(q.peek() + " ");
			q.remove();
		}
	}
}
