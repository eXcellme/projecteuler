package net.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each of a and b are called amicable numbers.
For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
Evaluate the sum of all the amicable numbers under 10000. 
 */
public class Problem21 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<10000;i++){
			int s = sumup(divisors(i));
			if(s!=i && sumup(divisors(s))==i){
				System.out.println("s:"+s+",i:"+i);
				sum += s + i;
			}
		}
	System.out.println(sum/2);
	}
	private static int sumup(List<Integer> divisors) {
		int sum = 0;
		for(int i : divisors){
			sum += i	;
		}
		return sum;
	}
	private static int d(int n){
		
		return 0;
	}
	
	/** 求小于n的所有约数
	 * @param n
	 * @return
	 */
	public static List<Integer> divisors(int n){
		List<Integer> l = new ArrayList<Integer>();
		if(Math.sqrt(n) == (int) Math.sqrt(n))
			l.add((int)Math.sqrt(n));
		for(int i=1;i<Math.sqrt(n);i++){
			if(n%i==0){
				l.add(i);
				if(n/i<n)
					l.add(n/i);
			}
		}
		Collections.sort(l);
		return l;
	}
	
	
	
}
