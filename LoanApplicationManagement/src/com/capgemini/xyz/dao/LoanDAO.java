package com.capgemini.xyz.dao;

import java.util.HashMap;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public class LoanDAO implements ILoanDAO {
	public HashMap<Integer, Customer>cust=new HashMap<Integer, Customer>();

	@Override
	public long applyLoan(Loan loan) {

		return 0;
	}

	@Override
	public long insertCust(Customer cust) {
		
		return 0;
	}

	@Override
	public HashMap<Integer, Customer> customerEntry(Customer cust) {
		cust.setCustId(getCustId());
		cust.put
		return cus ;
	}

	@Override
	public HashMap<Integer, Loan> loanEntry(Loan loan) {
		
		return null;
	}
	public static int custId=(int) Math.random();
	public static int getCustId() {
		return custId;
	}

	public static void setCustId(int custId) {
		LoanDAO.custId = custId;
	}
	
	

}
