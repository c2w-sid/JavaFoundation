package com.clubs2win;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x;
        System.out.println("Enter number ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if ( x % 2 == 0 )
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
