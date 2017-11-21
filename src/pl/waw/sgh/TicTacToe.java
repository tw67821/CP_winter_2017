package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TicTacToe {

    static final String FILE_LOC = "C:\\test3.txt";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(FILE_LOC);
        int i = 0;
        int b = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        Scanner scanner = new Scanner(file);
        int[][] a = new int[3][3];
        int[] colSum = new int[a[0].length];
        int[] rowSum = new int[3];
        while (scanner.hasNext()) {

            String row = scanner.nextLine();

            String[] elem = row.split(",");
            int j = 0;

            for (String el : elem) {
                a[i][j] = Integer.parseInt(el);
                j++;
            }
            i++;
        }
        //rows
        for (int k = 0; k < 3; k++) {
    sum1=0;
            for (int j = 0; j < 3; j++) {
                sum1 += a[k][j];
            }
            if (sum1 == 3) {
                System.out.println("Player X won");
                break;
            } else if (sum1 == -3) {
                System.out.println("Player O won");
                break;
            } else
                continue;
        }
       //columns
        for (int k = 0; k < 3; k++) {
    sum2=0;
            for (int j = 0; j < 3; j++) {
                sum2 += a[j][k];
            }
            if (sum2 == 3) {
                System.out.println("Player X won");
                break;
            } else if (sum2 == -3) {
                System.out.println("Player O won");
                break;
            } else
                continue;
        }
        //diagonal 1

        for (int k = 0; k < 3; k++) {
            sum3 =0;
            sum3 += a[k][k];
            if (sum3 == 3) {
                System.out.println("Player X won");
                break;
            } else if (sum3 == -3) {
                System.out.println("Player O won");
                break;
            } else
                continue;
        }
        //diagonal 2

        for (int k = 2; k >= 0; k--) {
            sum4=0;
            sum4 += a[k][-(k-2)];
            if (sum4 == 3) {
                System.out.println("Player X won");
                break;
            } else if (sum4 == -3) {
                System.out.println("Player O won");
                break;
            } else
                continue;
        }

        for (int k = 0; k < 3; k++) {

            for (int j = 0; j < 3; j++) {
                if (a[k][j] == 0) {
                    b++;
                    if (b > 0) {
                        break;} }
            }
        }
        if(b==0 && sum1!=3 && sum1!=-3 && sum2!=3 && sum2!=-3 && sum3!=3 && sum3!=-3 && sum4!=3 && sum4!=-3)
        System.out.println("Nobody won");

        if(b!=0 && sum1!=3 && sum1!=-3 && sum2!=3 && sum2!=-3 && sum3!=3 && sum3!=-3 && sum4!=3 && sum4!=-3)
            System.out.println("The game is not finished");







    }


}