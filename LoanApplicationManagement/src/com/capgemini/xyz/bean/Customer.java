package com.capgemini.xyz.bean;

public class Customer {
	private int custId;
	private String custName;
	private String address;
	private long mobile;
	private String emailId;
	public Customer() {
		super(); }

	public Customer(int custId, String custName, String address, long mobile, String emailId) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.mobile = mobile;
		this.emailId = emailId; }

	public Customer (String custName, String address, long mobile, String emailId) {
		this.custName = custName;
		this.address = address;
		this.mobile = mobile;
		this.emailId = emailId; }

	public int getCustId() {
		return custId; }
	public void setCustId(int custId) {
		this.custId = custId; }
	public String getCustName() {
		return custName; }
	public void setCustName(String custName) {
		this.custName = custName; }
	public String getAddress() {
		return address; }
	public void setAddress(String address) {
		this.address = address; }
	public long getMobile() {
		return mobile; }
	public void setMobile(long mobile) {
		this.mobile = mobile; }
	public String getEmailId() {
		return emailId; }
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
