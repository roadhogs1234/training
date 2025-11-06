package com.example;

import java.util.Scanner;

public class ArrOp {

	Scanner sc=new Scanner(System.in);
	String a[]=new String[5];
	void add()
	{
 for(int i=0;i<5;i++)
 {
 System.out.println("Enter a name:");
 a[i]=sc.next();
 }

	}

	void display()

	{

 for(int i=0;i<5;i++)

 {

 System.out.println(a[i]);

 }

	}

	void update()

	{

	System.out.println("Enter index:");

	int i=sc.nextInt();

	System.out.println("Enter a name:");

	a[i]=sc.next();

	}

	void delete()

	{

 System.out.println("Enter index:");

 int i=sc.nextInt();

 a[i]=null;

	}

	public static void main(String[] args) {

 Scanner s=new Scanner(System.in);

 ArrOp ao=new ArrOp();

 int op=0;

 do

 {

 System.out.println("1.Add\n2.Display\n3.Update\n4.Delete\n5.Exit");

 System.out.println("Enter your choice:");

 op=s.nextInt();

 switch(op)

 {

 case 1:ao.add();break;

 case 2:ao.display();break;

 case 3:ao.update();break;

 case 4:ao.delete();break;

 case 5:break;

 }

 }while(op!=5);

 
s.close();
	}


}