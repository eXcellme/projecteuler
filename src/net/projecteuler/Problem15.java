package net.projecteuler;

import java.math.BigDecimal;

public class Problem15 {
	public static void main(String[] args) {
		findRoutes(20,20);
	}
	/**
	 * 
	 * 1. from 0,0 to m,n, it needs m+n steps.
	 * 
	 * 2. u need m steps to forward right.
	 * 
	 * 3. so, it's a simple permutation (m+n)!/(m!n!)
	 * 
	 * 4. It just like that u have 20 same red balls and 20 same blue balls.
	 * how many permutation there are.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static long findRoutes(int m, int n) {
		BigDecimal bd = BigDecimal.ONE;
		for (int i = n + 1; i <= m + n; i++) {
			bd = bd.multiply(new BigDecimal(i));
		}

		for (int i = 1; i <= m; i++) {
			bd = bd.divide(new BigDecimal(i));
		}
		System.out.println("----" + bd);
		return bd.longValue();
	}

}
