package net.projecteuler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Problem29 {
	public static void main(String[] args) {
		Set<MyBigInteger> set = new HashSet<MyBigInteger>();
		for(int a=2;a<=100;a++){
			for(int b=2;b<=100;b++){
				MyBigInteger mbi = new MyBigInteger(new BigInteger(a+"").pow(b));
				set.add(mbi);
			}
		}
		System.out.println(set.size());
	}
	static class MyBigInteger extends BigInteger{
		public MyBigInteger(String i) {
			super(i);
		}
		public MyBigInteger(BigInteger i){
			super(i.toString());
//			this.toString() = i.toString();
		}
		@Override
		public boolean equals(Object x) {
			if(x instanceof MyBigInteger){
				MyBigInteger mbi = (MyBigInteger) x;
				return mbi.toString().equals(this.toString());
			}
			return false;
		}
	}
}
