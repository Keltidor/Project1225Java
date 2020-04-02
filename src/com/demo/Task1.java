package com.demo;

import static java.lang.StrictMath.round;
import static java.lang.StrictMath.sin;

public class Task1 {

    public static void main(String[] args) {

        handleAndShowBinary((byte) 122);
        showAllTypes((int) 5092001);
        MathOperation((double) (3.14));

    }


    private static void handleAndShowBinary(byte bitNumber) {

        int move = 2;
        int result = (bitNumber >> move);

        System.out.println(Integer.toBinaryString(bitNumber));
        System.out.println(Integer.toBinaryString(result));
        System.out.println("//////////////\n");

    }

    private static void showAllTypes(int birthday) {

        double del = (birthday / 2020);
        double mod = (birthday % 2020);
        double tag = (long) (birthday * del * mod);
        double tag1 = (int) (birthday * del * mod);
        double tag2 = (short) (birthday * del * mod);
        double tag3 = (byte) (birthday * del * mod);

        System.out.println(tag);
        System.out.println(tag1);
        System.out.println(tag2);
        System.out.println(tag3);
        System.out.println("//////////////");

    }

    public static void MathOperation(double pi) {

        double random = Math.random() * 145;
        double res = (random - 0.5) / round(sin(pi));
        System.out.println(res);

    }

}









