package com.addisu.functionalprogramming.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {

    public static void main (String[] args) {
        Customer maria = new Customer ("Maria", "999999");
        greetCustomer (maria,false);
        greetCustomerBiConsumerApproach.accept (maria,true);

    }

    static BiConsumer <Customer, Boolean> greetCustomerBiConsumerApproach =
            (customer, showPhoneNumber )-> System.out.println ("Hello " + customer.customerName +", thanks for registering phone number: " +(showPhoneNumber?customer.customerPhoneNumber:"Not allowed"));

    static void greetCustomer (Customer customer, Boolean showPhoneNumber) {
        System.out.println ("Hello " + customer.customerName +
                                    ", thanks for registering phone number: " +
                                    (showPhoneNumber?customer.customerPhoneNumber:"Not allowed"));
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