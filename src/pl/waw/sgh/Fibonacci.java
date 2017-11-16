package pl.waw.sgh;

import java.util.Scanner;

public class Fibonacci {

        public static int fib ( int n){
            if (n==1)
                return 0;
            if (n==2)
                return 1;
            else
                return fib(n-1)+fib(n-2);}

public static void main(String[] args) {

    int n;
    System.out.println("How many terms of the Fibonnaci Sequence do you want to see? ");
    n = new Scanner(System.in).nextInt();
    if (n < 1) {
        System.out.println("You have to provide the number greater than or equal to 1");
    }
    if(n>=1){
        for (int i=1;i<=n;i++){

            System.out.println(fib(i));}

            }
                                    }
                        }

