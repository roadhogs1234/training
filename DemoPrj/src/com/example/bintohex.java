package com.example;

import java.util.Scanner;

public class bintohex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i = 0;
		int sum=0;
		while(num>0) {
			sum+=(num%10)*((int)Math.pow(2,i));
			num=num/10;
			i++;
		}
		String hex="";
		int rem = 0;
		while(sum>0) {
			rem = sum%16;
				switch(rem) {
					case 10:
						hex+="A";
						break;
					case 11:
						hex+="B";
						break;
					case 12:
						hex+="C";
						break;
					case 13:
						hex+="D";
						break;
					case 14:
						hex+="E";
						break;
					case 15:
						hex+="F";
						break;
					default:
						hex+=Integer.toString(rem);
						break;
					
				}
			sum = sum/16;
		}
		StringBuilder s=new StringBuilder(hex);
		s.reverse();
		System.out.println(s.toString());
		sc.close();
		}

}