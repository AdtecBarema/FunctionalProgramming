package com.addisu.functionalprogramming.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main (String[] args) {

        System.out.println ("Imperative  approach");
        System.out.println (isPhoneNumberValid ("07000000000"));
        System.out.println (isPhoneNumberValid ("070000000000"));
        System.out.println (isPhoneNumberValid ("06000000000"));

        System.out.println ("Functional Interface approach");
        System.out.println (phoneValidator_Predicate.test ("07000000000"));
        System.out.println (phoneValidator_Predicate.test ("070000000000"));
        System.out.println (phoneValidator_Predicate.test ("06000000000"));phoneValidator_Predicate.and(containsNumber).test ("070030000");
    }

    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith ("07") && phoneNumber.length () == 11;
    }
    static Predicate<String> phoneValidator_Predicate=phone->phone.startsWith ("07")&&phone.length ()==11;
static Predicate<String> containsNumber=phoneNumber->phoneNumber.contains ("3");
}