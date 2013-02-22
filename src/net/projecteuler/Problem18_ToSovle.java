package net.projecteuler;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:
resource/net/projecteuler/problem18
NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. 
However, Problem 67, is the same challenge with a triangle containing one-hundred rows; 
it cannot be solved by brute force, and requires a clever method! ;o)
 */
public class Problem18_ToSovle {
	public static void main(String[] args) throws IOException {
		List<String> lines = FileUtils.readLines(new File("resource/net/projecteuler/problem18"));
		int[][] trees = getTrees(lines);
		int max = 0;
		for(int i=0;i<trees.length;i++){
			
		}
		
	}

	private static int[][] getTrees(List<String> lines) {
		int[][] t = new int[lines.size()][];
		for(int i=0;i<lines.size();i++){
			String str = lines.get(i);
			String[] ss = str.split(" ");
			for(int j=0;j<ss.length;j++){
				t[i][j] = Integer.parseInt(ss[j]);
			}
		}
		return t;
	}
}
