package com.capgemini.xyz.bean;

public class Loan {
	private long loanId;
	private double loanAmount;
	private int custId;
	private int duration;
	public Loan() {
		super(); }
	public Loan(long loanId, double loanAmount, int custId, int duration) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration; }

	public Loan(double loanAmount, int custId, int duration) {
		super();
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration; }

	public long getLoanId() {
		return loanId; }

	public void setLoanId(long loanId) {
		this.loanId = loanId; }

	public double getLoanAmount() {
		return loanAmount; }

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount; }

	public int getCustId() {
		return custId; }

	public void setCustId(int custId) {
		this.custId = custId; }

	public int getDuration() {
		return duration; }

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
