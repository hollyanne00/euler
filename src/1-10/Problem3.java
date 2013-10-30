/*  Project Euler 
 *	Problem #3: Largest prime factor 
 *  http://github.com/hollyanne00/euler/
 */

public class Problem3 {
	
	public long largestPrime(long num){
		long div = 2;
		long max = 0;
		while(num>1){
			if(div*div>num){ if(num>max){ return num; } else { return max; } }
			while(num%div==0){
				if(div>max){ max = div; }
				num = num/div;
			}
			div++;
		}
		return max;
	}

	public static void main(String[] args){
		Problem3 p3 = new Problem3();
		System.out.println(p3.largestPrime(600851475143L));
	}

}