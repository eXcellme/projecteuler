package net.projecteuler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 *Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938  53 = 49714.
What is the total of all the name scores in the file?
 */
public class Problem22 {
	public static void main(String[] args) throws IOException {
		String str = FileUtils.readFileToString(new File("resource/net/projecteuler/problem22-names.txt"));
		List<String> list = new ArrayList<String>();
		for(String s : str.split(",")){
			s = s.replace("\"","");
			list.add(s);
		}
		// 1 sort 
		Collections.sort(list);
		System.out.println(list.get(937));
		// 2 eval
		long sum = 0;
		for(int i=0;i<list.size();i++){
			String name = list.get(i);
			int q = 0;
			for(char c : name.toCharArray()){
				int ii = c-'A' + 1 ;
				q += ii;
			}
			sum += q * (i+1);
		}
		System.out.println(sum);
	}
}
