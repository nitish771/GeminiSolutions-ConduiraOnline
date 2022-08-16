import java.util.*;


class ScenarioBasedCollection2{
	public static void main(String[] args) {
		ArrayList<Integer> set = new ArrayList<Integer>();
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
