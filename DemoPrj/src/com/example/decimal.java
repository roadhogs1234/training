package com.example;
import java.util.Scanner;
public class decimal {

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
		System.out.println(sum);
	}

}
