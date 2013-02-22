package net.projecteuler;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 *If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class Problem17 {
	public static String[] _1_100 = get1_100();
	public static void main(String[] args) throws Exception {
		System.out.println(getRidOfSignals(numberLetter(115)));
		System.out.println( getRidOfSignals(numberLetter(115)).length());
		int sum = 0;
		for(int i=1;i<=1000;i++){
			int len = getRidOfSignals(numberLetter(i)).length();
			sum += len;
		}
		System.out.println(sum);
	}
	
	/**
	 * 去掉空格和"-"
	 * delete space and "-"
	 * @param l
	 * @return
	 */
	private static String getRidOfSignals(String l) {
		return l.replace("-", "").replace(" ", "");
	}

	/**
	 * 获取1-100的字母写法
	 * @return
	 * @throws IOException
	 */
	public static String[] get1_100() {
		try{
			String strs = FileUtils.readFileToString(new File("resource/net/projecteuler/problem17"));
			return strs.split(" ");
		}catch(Exception e){
			return null;
		}
	}
	public static String numberLetter(int n){
		String ret = "";
		if(n<=100){
			ret = _1_100[n-1];
		}else if(n>100 && n<1000){
			int bai = n/100;
			int qita = n%100;
			ret = numberLetter(bai)+" hundred " + (qita==0?"": "and "+numberLetter(qita));
		}else{
			ret = "one thousand";
		}
		
		return ret;
	}
}
