package com.capgemini.xyz.dao;

import java.util.HashMap;
import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface ILoanDAO {
public  Customer customerEntry(Customer cust);
public HashMap<Integer, Loan>loanEntry(Loan loan);

public long applyLoan(Loan loan);
public long insertCust(Customer cust);
}
