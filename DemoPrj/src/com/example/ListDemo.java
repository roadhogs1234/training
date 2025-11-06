package com.example;

import java.util.ArrayList;
import java.util.Iterator;

import inner.pack.Employee;

public class ListDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(101);
		e1.setEmpname("Karthik");
		e1.setEmpsal(55000);
		
		Employee e2 = new Employee();
		e2.setEmpid(102);
		e2.setEmpname("Vijay");
		e2.setEmpsal(65000);
		
		Employee e3 = new Employee();
		e3.setEmpid(103);
		e3.setEmpname("Praveen");
		e3.setEmpsal(75000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Employee e = (Employee)itr.next();
			System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getEmpsal());
		}
	}

}
