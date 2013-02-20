package net.projecteuler;

/**
 * 1000000以内用给出关系组合链条(到1为止)最长的
 *The following iterative sequence is defined for the set of positive integers:
n  n/2 (n is even)
n  3n + 1 (n is odd)
Using the rule above and starting with 13, we generate the following sequence:
13  40  20  10  5  16  8  4  2  1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under one million, produces the longest chain?
NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {
	public static void main(String[] args) {
		long maxLen = 0;
		long max = 2 ;
		for(long i=2;i<=1000000;i++){
			long t = 0;
			long v = i;
			while(true){
				v = func(v);
				t ++;
				if(v==1){
					if(t>maxLen){
						maxLen = t;
						max = i;
					}
					break;
				}
			}
		}
		System.out.println("max:"+max+",maxChain:"+maxLen);
	}
	
	private static long func(long n){
		if(n==1) 
			throw new RuntimeException();
		if(n%2==0)
			return n/2;
		else 
			return 3*n + 1;
	}
}
