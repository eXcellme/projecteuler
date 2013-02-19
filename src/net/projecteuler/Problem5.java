package net.projecteuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * ��1-20����󹫱���
 */
public class Problem5 {
	public static void main(String[] args) {
		System.out.println(GCD(380, 195));
		int r = 0;
		for(int i=1;i<20;i++){
			if(i==1)
				r = LCM(i, i+1);
			else 
				r = LCM(i,r);
		}
		System.out.println(r);
	}
	/**
	 * ���Լ��
	 * @param num1 
	 * @param num2
	 * @return
	 */
	public static int GCD(int num1,int num2){
		if ( num1 % num2 == 0){
			return num2;
		}
		else
			return GCD ( num2,num1 % num2) ;
	}

	/**
	 * ��С������
	 * @param a
	 * @param b
	 * @return
	 */
	public static int LCM(int a, int b) {
		return  a * b / GCD(a, b); // ��С��������������֮���������Լ��
		
	}
}
