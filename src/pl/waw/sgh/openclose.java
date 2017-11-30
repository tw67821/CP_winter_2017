package pl.waw.sgh;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;


public class openclose {

    public static void main(String[] args) throws IOException {

        File folder = new File("C:\\CP");
        File[] listOfFiles = folder.listFiles();
        double[][] b = new double[25][9];
        for (int a = 0; a < listOfFiles.length; a++) {
            int i = 1;

            if (listOfFiles[a].isFile()) {
                System.out.println("File " + listOfFiles[a].getName());
                Scanner scanner = new Scanner(listOfFiles[a]);
                scanner.nextLine();
                while (scanner.hasNext()) {

                    String row = scanner.nextLine();

                    String[] elem = row.split(",");
                    int j = 0;
                    for (String el : elem) {

                        if (j > 0)
                            b[i][j] = Double.parseDouble(el);
                        j++;

                    }
                    i++;}

                for (int k = 1;k <= 22; k++) {

                        b[k][6] = (b[k][4] - b[k][1]) / b[k][1];


                        FileWriter fw = new FileWriter(listOfFiles[a], true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(Double.toString(b[k][6]));
                        bw.newLine();
                        bw.close();
                        fw.close();

                    }}
                  else if (listOfFiles[a].isDirectory()) {
                            System.out.println("Directory " + listOfFiles[a].getName());

                        }}


    }}
