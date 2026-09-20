package com.todaytask;

class Company {

    // private
    private int employeeId = 101;

    // default
    String employeeName = "Harshitha";

    // protected
    protected double salary = 25000;

    // public
    public String company = "ABC Company";

    void displayPrivate() {
        System.out.println("Private Employee ID: " + employeeId);
    }
}

public class AccessModifier {

    public static void main(String[] args) {

        Company emp = new Company();

        // private
        emp.displayPrivate();

        // default
        System.out.println("Default Employee Name: " + emp.employeeName);

        // protected
        System.out.println("Protected Salary: " + emp.salary);

        // public
        System.out.println("Public Company: " + emp.company);
    }
}