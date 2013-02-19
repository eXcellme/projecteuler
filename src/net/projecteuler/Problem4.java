package net.projecteuler;


/**
 *A palindromic number reads the same both ways. The largest palindrome made from the product of 
 *two 2-digit numbers is 9009 = 91 99.
  Find the largest palindrome made from the product of two 3-digit numbers.	
  回文数字从两边读都一样。
 */
public class Problem4 {
	public static void main(String[] args) {
		normalSovle();
	}

	public static void normalSovle() {
		int largest = 0;
		for(int m=100;m<=999;m++){
			for(int n=100;n<=999;n++){
				int i = m * n ;
				if(isPalindrome(i)&&i>largest)
					largest = i;
			}
		}
		
		System.out.println(largest);
	}
	
	/**
	 * 是否为回文数字
	 * @param i
	 * @return
	 */
	public static boolean isPalindrome(int i){
		String str = String.valueOf(i);
		for(int j=0;j<=str.length()/2;j++){
			if(str.charAt(j) != str.charAt(str.length() - 1 - j))
				return false;
		}
		return true;
	}
}
