package net.projecteuler;

import java.math.BigInteger;
import java.util.List;

/**
 *A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d  1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */
/*
 分析：

如果一个数的质因子全是2和5的话，这个数的倒数是不会无限循环的
如2，4，5，8，10
而一个数把质因子中的2和5除去后，得到一个数，我们称之为“基数”吧
这个数和它的基数的倒数循环的长度是相同的
比如说3和6的倒数的循环长度都是1
而怎么计算一个数的循环长度呢
只需要知道它能被多少长度的9整除就行了
3能被9整除，所以它的循环长度是1
7能被999999整除，商正好是循环体142857，所以它的循环长度是6
先求一个数的基数，如果是它本身，则计算它的循环长度
如果不是它自身，那它的循环长度等于基数的循环长度
我们规定1的循环长度是0，这样所以只含2，5为质因子的数的基数都为1，循环长度为0

 */
public class Problem26 {
	public static void main(String[] args) {
		System.out.println((double)999999/7);
		int max = 0;
		int m = 0;
		for(int i=10;i<=1000;i++){
			System.out.println(i);
			List<Integer> list = Problem21.divisors(i);
//			System.out.println(list);
			if(!(list.contains(2)) && (!list.contains(5))){
				int x = cycleLen1(i);
				System.out.println(i+",cycleLen:"+x);
				if(x>max){
					max = x;
					m = i;
				}
			}
		}
		System.out.println("max:"+max+",m:"+m);
		
	}

	private static int cycleLen1(int i) {
		int s = 0;
		for(BigInteger b=new BigInteger(String.valueOf(9));;b=b.multiply(BigInteger.TEN).add(BigInteger.TEN.subtract(BigInteger.ONE)),s++){
			if(b.remainder(new BigInteger(String.valueOf(i))).intValue()==0){
				return s;
			}
		}
	}
	
}
