/**
 * Created by palashd on 11/02/2017.
 */

import java.util.*;

public class Primes {
	
	public static Integer[] generate(int n){
		LinkedList<Integer> primes=new LinkedList<>();
		primes.push(2);
		boolean isP;
		for(int i=3; i<=n;i++){
			isP=true;
			for(int t:primes)
				if(i%t == 0){
					isP=false;
					break;
				} else if(t*t>i)
					break;
			if(isP)
				primes.addLast(i);
		}
		ArrayList<Integer> fac=new ArrayList<>();
		for(int t:primes)
			if(n%t == 0)
				fac.add(t);
		return fac.toArray(new Integer[1]);
	}

	
	public static void main(String... args){
		System.out.println(Arrays.toString(generate(30)));
	}
}
