package net.projecteuler;

import java.math.BigInteger;

/**
 *A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
012   021   102   120   201   210
What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
0 1 2 3 4 5 6 7 8 9 
组成的组合的第100万个数字
 */
public class Problem24 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			
		}
	}
	/**
	 * 阶乘
	 * @param i
	 * @return
	 */
	public static BigInteger factorial(int i){
		if(i==1)
			return BigInteger.ONE ;
		else
			return factorial(i-1).multiply(new BigInteger(i+""));
		
	}
}
