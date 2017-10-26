package pl.waw.sgh;

import java.util.Scanner;

public class CheckProfit {
    public static void main(String[] args) {
        double cost;
        double sell;
        int unitsSold;

        System.out.println("Please provide unit cost: ");
        cost = new Scanner(System.in).nextDouble();
        System.out.println("Please provide selling price: ");
        sell = new Scanner(System.in).nextDouble();
        System.out.println("Please provide units sold: ");
        unitsSold = new Scanner(System.in).nextInt();

        double profit = sell * unitsSold - (cost * unitsSold);

        System.out.println("We have earned" + profit);
    }
}
