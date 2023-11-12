package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String product;
    static double price;
    static int quota;
    static double days;
    static double cost;
    static double avgSale;
    private final static String CURRENCY = "EUR";
    static Scanner scanner;

    public static void main(String[] args) {

        product = "smartphone";
        price = 305.99;

        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Input quota of sold " +
                "smartphones, pcs.: ");
        quota = scanner.nextInt();

        System.out.print("Input quantity of sale days:");
        days = scanner.nextDouble();
        cost = price * quota;
        avgSale = cost / days;

        System.out.printf("%n Product No1: %s,%n total sales " +
                        "for %.1f days: %s %.2f, %n sales by " +
                        "day: %s %.2f %n",
                product, days, CURRENCY, cost, CURRENCY, avgSale);

        product = "laptop";
        price = 570.95;
        System.out.println();

        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Input quota of sold " +
                "laptops, pcs.: ");
        quota = scanner.nextInt();

        System.out.print("Input quantity of sale days:");
        days = scanner.nextDouble();
        cost = price * quota;
        avgSale = cost / days;


        System.out.printf("%n Product No2: %s,%n total sales " +
                        "for %.1f days: %s %.2f, %n sales by " +
                        "day: %s %.2f",
                product, days, CURRENCY, cost, CURRENCY, avgSale);

        scanner.close();

    }
}

