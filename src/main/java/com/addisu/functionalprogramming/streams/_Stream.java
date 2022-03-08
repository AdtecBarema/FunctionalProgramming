package com.addisu.functionalprogramming.streams;

import java.util.List;

public class _Stream {

    public static void main (String[] args) {

        List <Person> people = List.of (
                new Person ("John", Gender.MALE),
                new Person ("Maria", Gender.FEMALE),
                new Person ("Aisha", Gender.FEMALE),
                new Person ("Alex", Gender.MALE),
                new Person ("Alice", Gender.FEMALE),
                new Person ("Bob", Gender.PREFER_NOT_TO_SAY)
        );

        people.stream ()
                .map (person -> person.name)
                .mapToInt (String::length)
                //  .collect (Collectors.toSet ())//removing duplicates
                //.forEach (gender -> System.out.println (gender));
                .forEach (System.out::println);

    }

    enum Gender {MALE, FEMALE, PREFER_NOT_TO_SAY}

    static class Person {
        private final String name;
        private final Gender gender;

        public Person (String name, Gender gender) {
            this.gender = gender;
            this.name = name;
        }

        public String getName () {
            return name;
        }

        public Gender getGender () {
            return gender;
        }

        @Override
        public String toString () {
            return "Person{" +
                    "gender=" + gender +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}