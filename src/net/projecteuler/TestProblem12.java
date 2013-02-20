package net.projecteuler;

public class TestProblem12 {
	public static void main(String[] args) {
		long s1 = System.currentTimeMillis();
//		Problem12.getDivisorN(1000000000);
		long s2 = System.currentTimeMillis();
		Problem12.getDivisorNPro(1000000001);
		long s3 = System.currentTimeMillis();
		
		System.out.println("1:"+(s2-s1) +",2:"+(s3-s2));
	}
}
