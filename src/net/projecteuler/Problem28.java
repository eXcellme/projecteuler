package net.projecteuler;

/**
 *Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
public class Problem28 {
	public static void main(String[] args) {
		int n = 1001;
		int sum = 1;
		int interval = 2;
		int start = 3;
		for(int i=2;i<=n/2+1;i++,start=start+3*interval+2*(i-1),interval=2*(i-1)){
			int temp = (start + start + 3 * interval) * 4/2; //包含四项的等差数列求和
			sum+=temp;
		}
		System.out.println(sum);
	}
}
