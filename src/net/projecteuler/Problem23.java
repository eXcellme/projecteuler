package net.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 *A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
小于28123的正整数，不能写成两个abundant数的数的和。
 */
public class Problem23 {
	static long s1 = System.currentTimeMillis();
	static List<Integer> abundants = allAbundants();
	public static void main(String[] args) {
//		System.out.println(l);
//		System.out.println(Problem21.divisors(4));
		int sum = 0;
		for(int i=1;i<28123;i++){
			if(!isSumOfAbundant(i)){
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println((System.currentTimeMillis()-s1)+" ms");
	}

	private static boolean isSumOfAbundant(int i) {
		for(int a : abundants){
			int ab = i - a;
			if(abundants.contains(ab)){
//				System.out.println(i + " is sum of abundants");
				return true ;
			}
		}
		return false;
	}
	public static List<Integer> allAbundants(){
		List<Integer> l = new ArrayList<Integer>();
		for(int i=1;i<=28123;i++){
			List<Integer> divisors = Problem21.divisors(i);
			int sum = 0;
			for(int m : divisors){
				sum += m;
			}
			if(sum > i)
				l.add(i);
		}
		return l;
	}
}
