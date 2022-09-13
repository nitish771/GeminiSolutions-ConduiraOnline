import java.util.*;

public class Pangram{

	public static void is_pangram(){
		System.out.println("Start");

		Scanner in = new Scanner(System.in);
		// int e, n = in.nextInt();
		String no = in.next();
		Set<Character> chars = new HashSet<>();
		
		for (Character c : no.toCharArray()) {
			if(!chars.contains(c)){
				chars.add(c);
			}
		}
		System.out.println(chars.size()==10);
	}
	
	public static void main(String[] args){
		is_pangram();
	}
}