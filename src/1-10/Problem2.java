/*  Project Euler 
 *	Problem #2: Even Fibonacci numbers
 *  http://github.com/hollyanne00/euler/
 */

public class Problem2 {
	
	public long evenFib(){
		long sum = 2;
		int prev2 = 1;
		int prev1 = 2;
		int num = 3;
		while(num<=4000000){
			if(num%2==0){ sum += num; }
			prev2 = prev1;
			prev1 = num;
			num = prev2 + prev1;
		}

		return sum;
		
	}

	public static void main(String[] args){
		Problem2 p2 = new Problem2();
		System.out.println(p2.evenFib());
	}

}