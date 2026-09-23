package com.mortgage;
public class Employment {

    private String companyName;
    private String jobTitle;
    private double annualIncome;

    public Employment(String companyName, String jobTitle, double annualIncome) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.annualIncome = annualIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void verifyIncome() {
        System.out.println("Employment verification completed.");
        System.out.println("Company        : " + companyName);
        System.out.println("Job Title      : " + jobTitle);
        System.out.println("Annual Income  : ₹" + annualIncome);
    }
}
