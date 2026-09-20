package com.payroll;

// Abstract Parent Class
abstract class Employee {

    // Encapsulation
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    // Constructor
    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Getter Methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Abstract Methods
    public abstract String getRole();

    public abstract double getAllowances();

    public abstract double calculateSalary();

    // Common Display Method
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Employee Role: " + getRole());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Allowances: " + getAllowances());
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("----------------------------");
    }
}


// Level 1 - Developer
class Developer extends Employee {

    private double developerAllowance;

    public Developer(int employeeId, String employeeName,
                     double basicSalary, double developerAllowance) {

        super(employeeId, employeeName, basicSalary);
        this.developerAllowance = developerAllowance;
    }

    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public double getAllowances() {
        return developerAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + getAllowances();
    }
}


// Level 2 - Senior Developer
class SeniorDeveloper extends Developer {

    private double seniorAllowance;

    public SeniorDeveloper(int employeeId, String employeeName,
                           double basicSalary,
                           double developerAllowance,
                           double seniorAllowance) {

        super(employeeId, employeeName, basicSalary, developerAllowance);
        this.seniorAllowance = seniorAllowance;
    }

    @Override
    public String getRole() {
        return "Senior Developer";
    }

    @Override
    public double getAllowances() {
        return super.getAllowances() + seniorAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + getAllowances();
    }
}


// Level 3 - Team Lead
class TeamLead extends SeniorDeveloper {

    private double teamLeadAllowance;

    public TeamLead(int employeeId, String employeeName,
                    double basicSalary,
                    double developerAllowance,
                    double seniorAllowance,
                    double teamLeadAllowance) {

        super(employeeId, employeeName, basicSalary,
                developerAllowance, seniorAllowance);

        this.teamLeadAllowance = teamLeadAllowance;
    }

    @Override
    public String getRole() {
        return "Team Lead";
    }

    @Override
    public double getAllowances() {
        return super.getAllowances() + teamLeadAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + getAllowances();
    }
}


// Main Class
public class EmployeeManagement {

    public static void main(String[] args) {

        // Polymorphism

        Employee employee1 =
                new Developer(101, "Harsini", 30000, 5000);

        Employee employee2 =
                new SeniorDeveloper(102, "Padma", 40000,
                        5000, 7000);

        Employee employee3 =
                new TeamLead(103, "Chandru", 50000,
                        5000, 7000, 10000);


        // Display Employee Details

        employee1.displayEmployeeDetails();

        employee2.displayEmployeeDetails();

        employee3.displayEmployeeDetails();
    }
}