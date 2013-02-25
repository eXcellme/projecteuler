package net.projecteuler;

/**
 *In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1£1 + 150p + 220p + 15p + 12p + 31p
How many different ways can £2 be made using any number of coins?
 */
public class Problem31 {
	public static void main(String[] args) {
		int total = 8;
		int sum = 200;
		for(int a=0;a<200;a++){
			for(int b=0;b<100;b++){
				for(int c=0;c<40;c++){
					for(int d=0;d<20;d++){
						for(int e=0;e<10;e++){
							for(int f=0;f<4;f++){
								for(int g=0;g<2;g++){
									if(sum == a + b*2+c*5+10*d+20*e+50*f+100*g)
										total ++;
								}	
							}	
						}	
					}	
				}	
			}	
		}
		System.out.println(total);
	}
}
