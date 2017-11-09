package pl.waw.sgh;

import java.util.Scanner;

public class BowlingGame {
    public static void main(String[] args) {
        int n;
        int b=0;

        System.out.println("Please provide the numer of rows: ");
        n = new Scanner(System.in).nextInt();


        for (int i = 1; i <= n;i++) {
            b=b+i;
        }
        System.out.println("The numer of bowls=" +b);

    }
    }


