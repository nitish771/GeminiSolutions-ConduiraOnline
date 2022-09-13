import java.util.*;

class FirstNLast{

	public static void main(String[] args) {
		System.out.println(Arrays.toString(first_n_last()));

	}

	public static int[] first_n_last(){
		Scanner in = new Scanner(System.in);
		int t, n, f=-1, l=-1, e;
		t = in.nextInt();
		n = in.nextInt();

		for(int i=0; i<n; i++){
			e = in.nextInt();
			if (e == t){
			 	if(f == -1){
					f = i;
					l = i;
			 	}
				else
					l = i;
			}
		}
		int[] out = {f, l};
		return out;
	}
}