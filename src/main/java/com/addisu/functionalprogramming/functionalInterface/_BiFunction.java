package com.addisu.functionalprogramming.functionalInterface;

import java.util.function.BiFunction;

public class _BiFunction {

    static BiFunction <Integer, Integer, Integer> addByOneAndMultiplyByNFunctionalProgramming =
            (numTobeAdded, multipleNum) -> (numTobeAdded + 1) * multipleNum;

    public static void main (String[] args) {
        System.out.println ("From  imperative function: "+addByOneAndMultiplyByNLegacyApproach (1, 5));
        System.out.println ("From declarative function: "+addByOneAndMultiplyByNFunctionalProgramming.apply (1, 5));
    }
    static int addByOneAndMultiplyByNLegacyApproach (int n, int m) {
        return (n + 1) * m;
    }
}