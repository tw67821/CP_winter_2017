package pl.waw.sgh;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class test {

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
                        i++;
                    }
                }
                    System.out.println(b[1][6]);
                }}}
