package net.projecteuler;

public class Problem27 {
	public static void main(String[] args) {
		int maxn = 0;
		int ab = 0;
		int ia = 0;
		int ib = 0;
		for(int a=-999;a<1000;a++){
			for(int b=-999;b<1000;b++){
//				System.out.println("a:"+a+",b:"+b);
				int temp = 0;
				int n=0 ;
				for(;;n++){
					int x = n*n + a*n + b ;
					if(!Problem3.isPrime(x)){
						break ;
					}
				}
				if(n>maxn){
					maxn = n ;
					ab = a * b ;
					ia = a ;
					ib = b ;
				}
				
			}
		}
		System.out.println("maxn:"+maxn+",ab:"+ab+",a:"+ia+",b:"+ib);
	}
}
