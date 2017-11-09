package pl.waw.sgh;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n;
        System.out.println("Please provide the numer: ");
        n = new Scanner(System.in).nextInt();
        int a = 0;
        for (int i = 2;i <= n/2;i++){
            if (n%i==0){
                a++;
             if (a>0){break;}
            }}
        if (a==0 && n>1){
            System.out.println("This is a prime numer");
        }else
            System.out.println("This is not a prime number");
        }


    }

