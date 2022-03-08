package com.addisu.functionalprogramming.optionals;
import java.util.Optional;
import java.util.function.Supplier;
public class Main {

    public static void main (String[] args) {
       Supplier<IllegalStateException> exception= ()->new IllegalStateException ("exception");
        Object value = Optional.ofNullable ("Hello")
                .orElseThrow (()->new IllegalStateException ("exception"));
        System.out.println (value);

         Optional.ofNullable (null)
                .ifPresentOrElse (email-> System.out.println ("Sending emial to"+email),
                                  ()-> System.out.println ("cant send email"));
    }
}