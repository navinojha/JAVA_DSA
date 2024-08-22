package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IsEvenOrOdd {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="
        // /> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n & 1) != 0){
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }
}