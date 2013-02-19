package net.projecteuler;

/**
 * 求两百万以下的素数之和
 *The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  Find the sum of all the primes below two million.
 */
public class Problem10 {
	public static void main(String[] args) {
		long sum = 0;
		for(int i=2;i<2000000;i++){
			if(Problem3.isPrime(i))
				sum += i;
		}
		System.out.println(sum);
	}
}
