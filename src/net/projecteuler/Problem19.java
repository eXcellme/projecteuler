package net.projecteuler;

import java.util.Calendar;

/**
 You are given the following information, but you may prefer to do some research for yourself.
1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem19 {
	public static void main(String[] args) {
		System.out.println(1000*12 / 7);
		normal();
	}

	private static void normal() {
		Calendar cal = Calendar.getInstance();
		cal.set(1901, 0, 1);
		int sum = 0;
		while(true){
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				sum ++;
			cal.add(Calendar.MONTH, 1);
			if(cal.get(Calendar.YEAR) > 2000)
				break;
		}
		System.out.println(sum);
	}
}
