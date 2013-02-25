package net.projecteuler;

/**
 * Surprisingly there are only three numbers that can be written as the sum of
 * fourth powers of their digits:
 * 
 * 1634 = 14 + 64 + 34 + 44 8208 = 84 + 24 + 04 + 84 9474 = 94 + 44 + 74 + 44 As
 * 1 = 14 is not a sum it is not included.
 * 
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * 
 * Find the sum of all the numbers that can be written as the sum of fifth
 * powers of their digits. 5位数=5个数5次方和。
 */
public class Problem30 {
	public static void main(String[] args) {
		System.out.println(Math.pow(9,5));//59049
		long s1 = System.currentTimeMillis();
//		int x = 1634;
		long sum = 0;
		for (int i = 2; i <= 590490; i++) {
			String num = String.valueOf(i);
			int s = 0;
			for(char c : num.toCharArray()){
				int n = Integer.parseInt(c+"");
				s += Math.pow(n,5 );
			}
			if(i == s){
				System.out.println(s);
				sum += s;
			}
		}
		long s2 = System.currentTimeMillis();
		System.out.println(sum+",耗时："+(s2-s1)+"毫秒");
	}
}
