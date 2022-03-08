package com.addisu.combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        Customer customer = new Customer (
                "Alice",
                "alice@gmail.com",
                "44900000",
                LocalDate.of (2000, 1, 28)
        );

        boolean isValidCustomer = new CustomerValidatorService ().isValid (customer);
        System.out.println (isValidCustomer);
    }
}