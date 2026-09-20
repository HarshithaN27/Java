package com.todaytask;

public class FinalDemo {

    public static void main(String[] args) {

        // Final Variable
        Student student = new Student();
        System.out.println("Roll Number: " + student.rollNumber);

        // Final Method
        StudentDetails details = new StudentDetails();
        details.display();
        details.show();

        // Final Class
        Bank bank = new Bank();
        bank.display();
    }
}


// Final Variable
class Student {

    final int rollNumber = 101;
}


// Final Method
class StudentDetails {

    final void display() {
        System.out.println("Student Details");
    }

    void show() {
        System.out.println("Student Show Method");
    }
}


// Final Class
final class Bank {

    void display() {
        System.out.println("Bank Class");
    }
}