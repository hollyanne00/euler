/*  Project Euler 
 *	Problem #7: 10001st prime 
 *  http://github.com/hollyanne00/euler/
 */
import java.util.*;

public class Problem7 {
	
	public long nthPrime(int n){
		List<Integer> primes = new ArrayList<Integer>();
		int p = 2;
		while(primes.size()<n){
			int i = 2;
			while(i*i<=p){
				if(p%i==0){ break; } //if divisible, not prime
				else { i++; } 
			}
			if(i*i>p){primes.add(p);}
			p++;
		}
		return primes.get(n-1);
	}	

	public static void main(String[] args){
		Problem7 p7 = new Problem7();
		System.out.println(p7.nthPrime(10001));
	}

}