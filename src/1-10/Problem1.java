/*  Project Euler 
 *	Problem #1: Multiples of 3 and 5
 *  http://github.com/hollyanne00/euler/
 */

public class Problem1 {
	
	public long multiplesTo1000(){
		// Using arithmetic series
		return (((333*(3+999))/2) + ((199*(5+995))/2)) - ((66*(15+990))/2);
	}

	public static void main(String[] args){
		Problem1 p1 = new Problem1();
		System.out.println(p1.multiplesTo1000());
	}

}