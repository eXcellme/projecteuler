package net.projecteuler.test;

import java.text.DecimalFormat;

public class Format {

		/**
		 * @param args
		 */
		public static void main(String[] args) {

			double d = 1231423.3823;
			System.out.println("��ʽ��ǰ��"+d);
			DecimalFormat f = new DecimalFormat();
			
			f.applyPattern("#.##");		
			System.out.println("applyPattern{#.##} ��ʽ����"+f.format(d));
			
			f.applyPattern("0000000000.000000");
			System.out.println("applyPattern{0000000000.000000} ��ʽ����"+f.format(d));
			
			f.applyPattern("-#,###.###");		
			System.out.println("applyPattern{##,###.##} ��ʽ����"+f.format(d));
			
			f.applyPattern("0.00KG");
			System.out.println("applyPattern{0.00KG} ��ʽ����"+f.format(d));
			
			f.applyPattern("#000.00KG");
			System.out.println("applyPattern{#000.00KG} ��ʽ����"+f.format(d));
			
			f.applyPattern("0.00%");
			System.out.println("applyPattern{0.00%} ��ʽ����"+f.format(d));
			
			//E�������ָ���ĸ�ʽ ǰ���ǵ����ĸ�ʽ
			f.applyPattern("#.##E000");
			System.out.println("applyPattern{#.##E000} ��ʽ����"+f.format(d));
			
			// /u2030 ��ʾ����1000����ʾ�� �룬�������
			f.applyPattern("0.00/u2030");
			System.out.println("applyPattern{0.00/u2030%} ��ʽ����"+f.format(d));
		}
	}

