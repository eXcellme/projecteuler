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
 ������

���һ������������ȫ��2��5�Ļ���������ĵ����ǲ�������ѭ����
��2��4��5��8��10
��һ�������������е�2��5��ȥ�󣬵õ�һ���������ǳ�֮Ϊ����������
����������Ļ����ĵ���ѭ���ĳ�������ͬ��
����˵3��6�ĵ�����ѭ�����ȶ���1
����ô����һ������ѭ��������
ֻ��Ҫ֪�����ܱ����ٳ��ȵ�9����������
3�ܱ�9��������������ѭ��������1
7�ܱ�999999��������������ѭ����142857����������ѭ��������6
����һ�����Ļ�������������������������ѭ������
�������������������ѭ�����ȵ��ڻ�����ѭ������
���ǹ涨1��ѭ��������0����������ֻ��2��5Ϊ�����ӵ����Ļ�����Ϊ1��ѭ������Ϊ0

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
