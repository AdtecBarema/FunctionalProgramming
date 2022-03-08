package com.addisu.functionalprogramming.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main (String[] args) {
        System.out.println (getDBConnectionUrl ());
        System.out.println ("Functional Interface approach, Supplier");
        System.out.println (connectionUrlSupplier.get ());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> connectionUrlSupplier=()->"jdbc://localhost:5432/users";
}
