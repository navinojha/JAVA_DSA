package org.example;

import java.util.Scanner;

public class IthBitSet{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();

        if((n & (1 << i)) != 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
