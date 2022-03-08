package com.addisu.functionalprogramming.functionalInterface;

import java.util.function.BiConsumer;

public class _Consumer {

    static BiConsumer <Customer, Boolean> greetCustomerConsumerApproach = (customer, showPhoneNumber) -> System.out.println ("Hello " + customer.customerName +
                                                                                                                                     ", thanks for registering phone number: " +
                                                                                                                                     customer.customerPhoneNumber);

    public static void main (String[] args) {
        Customer maria = new Customer ("Maria", "999999");
        greetCustomer (maria, false);
        greetCustomerConsumerApproach.accept (maria, true);
    }

    static void greetCustomer (Customer customer, boolean showphoneNumber) {
        System.out.println ("Hello " + customer.customerName +
                                    ", thanks for registering phone number: " +
                                    (showphoneNumber ? customer.customerPhoneNumber : "Don't have read access"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;
        public Customer (String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}