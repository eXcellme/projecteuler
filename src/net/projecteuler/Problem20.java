package net.projecteuler;

import java.math.BigInteger;

/**
 *n! means n  (n  1)  ...  3  2  1

For example, 10! = 10  9  ...  3  2  1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 */
public class Problem20 {
	public static void main(String[] args) {
		BigInteger b = BigInteger.ONE;
		for(int i=100;i>0;i--){
			b = b.multiply(new BigInteger(String.valueOf(i)));
		}
		int sum = 0;
		for(char c : b.toString().toCharArray()){
			int i = Integer.parseInt(c+"");
			sum += i;
		}
		System.out.println(sum);
	}
}
