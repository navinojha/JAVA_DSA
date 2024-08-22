package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IsEvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        OBSERVATION: If the 0th bit of any number is set (i.e 1) that number is odd number

        For e.x -> 17 -> 1 0 0 0 1
        For e.x -> 5 ->  1 0 1
        For e.x -> 11 -> 1 0 1 1
        */

        int n = in.nextInt();
        if((n & 1) != 0){
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }
}