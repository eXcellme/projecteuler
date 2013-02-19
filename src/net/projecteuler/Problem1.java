package net.projecteuler;

/**
 * Problem 1 
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
    The sum of these multiples is 23.
	Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class Problem1 {
	// 遍历
	public static long ergodic(long max){
		long sum = 0;
		int t3 = 0;
		int t5 = 0;
		for(int i=1;i < max;i++){
			if(i%3==0 || i%5==0){
				sum += i;
				if(i%3==0)
					t3++;
				else 
					t5++;
			}
		}
		return sum;
	}
	//排容原理 3的等差数列求和+5的等差数列求和 - 15的等差数列求和
	public static long pairong(long n){
		int total3 = (int)Math.floor((n-1)/3);
		int total5 = (int)Math.floor((n-1)/5);
		int total15 = (int)Math.floor((n-1)/15);
		long sum3 = sumdengcha(3, 3, total3);
		long sum5 = sumdengcha(5, 5,total5);
		long sum15 = sumdengcha(15,15,total15);
		return sum3 + sum5 - sum15;
	}
	public static long sumdengcha(int a1,int d,int n){
		return n * a1 + n * (n-1) * d/2;
	}
	public static void main(String[] args) {
		long s1 = System.currentTimeMillis();
		long sum1 = ergodic(100000);
		long s2 = System.currentTimeMillis();
		System.out.printf("计算结果：%d，耗时：%d毫秒\n",sum1,(s2-s1));
		long q1 = System.currentTimeMillis();
		long sum2 = pairong(100000);
		long q2 = System.currentTimeMillis();
		System.out.printf("计算结果：%d，耗时：%d毫秒\n",sum2,(q2-q1));
	}
}
