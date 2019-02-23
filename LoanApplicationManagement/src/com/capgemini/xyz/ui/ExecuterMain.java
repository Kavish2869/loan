package com.capgemini.xyz.ui;

import java.util.Scanner;
import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;
import com.capgemini.xyz.service.LoanService;

public class ExecuterMain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	 Customer customer=new Customer();
	 Loan loan=new Loan();
	 LoanService service=new LoanService();
	 System.out.println("XYZ FINANCE COMPANY WELCOME YOU\n1-Register Customer\n2-Exit\n\nEnter you choice");
	int choice =sc.nextInt();
	switch(choice) {
	case 1:
	System.out.println("Enter Customer Name :");
	String custName=sc.nextLine();
	//service.validateCustomer(customer.getCustName());
System.out.println("Enter Address :");
String address=sc.next();
//service.validateCustomer(customer.getAddress());
System.out.println("Enter Email");
String emailId=sc.next();
System.out.println("Enter mobile number");
long mobile= sc.nextLong();
customer=new Customer(custName, address, mobile, emailId);

	}
	
	 	}


}
