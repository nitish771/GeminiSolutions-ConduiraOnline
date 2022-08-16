import java.util.*;


class ScenarioBasedCollection1{
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println("Enter the numbers \n");
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine()){
			String s = sc.nextLine();
			try{
				Integer i = Integer.valueOf(s);
				set.add(i);
			} catch(Exception NumberFormatException){
				break;
			}
		}

		System.out.println(set);
	}
}
