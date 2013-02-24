package net.projecteuler;

import java.math.BigInteger;

/**
 *The Fibonacci sequence is defined by the recurrence relation:
Fn = Fn1 + Fn2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:
F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem25 {
	public static void main(String[] args) {
		for(int i=0;;i++){
			if(fib(i).toString().length()>=1000){
				System.out.println(i);
				break;
			}
				
		}
	}

	public static BigInteger fib(int n){
		BigInteger[] temp = new BigInteger[n+1];
		if(n<=1){
			return BigInteger.ONE;
		}
		temp[0] = BigInteger.ZERO;
		temp[1] = BigInteger.ONE;
		for(int i=2;i<=n;i++){
			temp[i] = temp[i-1].add(temp[i-2]);
		}
		return temp[n];
	}
}
