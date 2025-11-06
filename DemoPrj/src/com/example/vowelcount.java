package com.example;

public class vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";

		int count=0;

		for(int i=0;i<s.length();i++) {

			char c=s.toLowerCase().charAt(i);

			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {

				System.out.println(c);

				count+=1;

			}

		}

		System.out.println(count);
	}

}
