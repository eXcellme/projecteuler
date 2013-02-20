package net.projecteuler;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 *Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

in problem13
 */
public class Problem13 {
	public static void main(String[] args) throws IOException {
		List<String> list = FileUtils.readLines(new File("resource/net/projecteuler/problem13"));
		long sum = 0;
		for(String line : list){
			sum += Long.parseLong(line.substring(0,13));
		}
		System.out.println(String.valueOf(sum).substring(0,10));
	}
}
