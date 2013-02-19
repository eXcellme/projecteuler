package net.projecteuler;

/**
 * 第10001个素数
 *By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	What is the 10 001st prime number?	
 */
public class Problem7 {
	public static void main(String[] args) {
		int i = nthPrime(10001);
		System.out.println(i);
	}

	/**
	 * 第几个素数
	 * @param i
	 * @return
	 */
	private static int nthPrime(int i) {
		if(i==1)
			return 2;
		int count = 1;
		for(int j=2;;j++){
			if(Problem3.isPrime(j) && (++count)==i)
				return j;
		}
	}
}
