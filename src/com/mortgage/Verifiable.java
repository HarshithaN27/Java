package com.mortgage;
public interface Verifiable {

    void verify();

    default void verificationMessage() {
        System.out.println("Verification process started.");
    }
}
