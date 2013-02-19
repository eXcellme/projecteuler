package net.projecteuler;

/**
   The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
	public static void main(String[] args) {
		normalSovle(18613879621L);
		long s1 = System.currentTimeMillis();
		normalSovle(600851475143L);
		long s2 = System.currentTimeMillis();
		System.out.println(s2-s1);
	}

	/**
	 * ��ӡn�������������
	 * @param n
	 */
	private static void normalSovle(long n) {
		long maxPrime = 1;
		for(long s = 2;s<1+Math.sqrt(n);s++){
			if(n%s==0 && isPrime(s))
				maxPrime = s ;
		}
		System.out.println(maxPrime);		
	}

	/**
	 * ���ĳ���Ƿ�Ϊ����
	 * @param s
	 * @return
	 */
	public static boolean isPrime(long s) {
		if(s==2)
			return true;
		for(long i=2;i<1+Math.sqrt(s);i++){
			if(s%i ==0)
				return false;
		}
		return true;
	}
	
}
