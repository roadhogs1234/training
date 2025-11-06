package com.example;

import java.util.Scanner;

public class Product {

int id;

String name;

double price;

//search,delete,update

public static void main(String[] args) {

Product p[] = new Product[5];

Scanner sc = new Scanner(System.in);

for (int i = 0; i < p.length; i++) {

p[i] = new Product();

System.out.println("Enter the id:");

p[i].id = sc.nextInt();

System.out.println("Enter the name:");

p[i].name = sc.next();

System.out.println("Enter the price:");

p[i].price = sc.nextDouble();

}

for (int i = 0; i < p.length; i++) {

System.out.println(p[i].id);

System.out.println(p[i].name);

System.out.println(p[i].price);

}
sc.close();

}

}