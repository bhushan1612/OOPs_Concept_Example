package com.example.abstraction;

public interface Service {

	public abstract long callToCustomerSupport(long mobileNo);
	public abstract String reportIssue(String issue);
	public abstract String complaintLog(String complaint);
	public abstract String checking(String productChecking);
	public abstract String repair(String productRepair);
}
