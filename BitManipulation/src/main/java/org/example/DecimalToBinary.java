package org.example;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = "";

        // Convert Decimal to Binary
        while(n > 0){
            result += n%2;
            n = n/2;
        }
        StringBuilder ans = new StringBuilder();

        // append a string into StringBuilder input1
        ans.append(result);

        // reverse StringBuilder input1
        ans.reverse();
        System.out.println(ans);

    }
}
