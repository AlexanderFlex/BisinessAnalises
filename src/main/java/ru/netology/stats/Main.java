package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService min = new StatsService();
                int minMonth = min.minSales(sales);

        System.out.println(minMonth);
    }
}
