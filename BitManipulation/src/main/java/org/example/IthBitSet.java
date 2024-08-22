package org.example;

import java.util.Scanner;

public class IthBitSet{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();

        /*
        OBSERVATION: If the ith bit of any number is set (i.e 1) and we do a bitwise & of that number with the mask (1 << i)
        the number will be non-zero or else zero

        1) For e.x -> num = 5, i = 2

        if we shift 1 by 2 position on the left we will get the mask 1 << 2 (100)
        101
        100
        ----
        100

        2) For e.x -> num = 5, i = 1

        if we shift 1 by 2 position on the left we will get the mask 1 << 2 (100)
        101
        010
        ----
        000

        */

        if((n & (1 << i)) != 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
