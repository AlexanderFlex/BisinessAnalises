package ru.netology.stats;

public class StatsService {

    public long SummarySales(long[] sales) {
        long Summary = 0;
        for (long S : sales) {
            Summary = Summary + S;
        }
        return Summary;
    }

    public double AvarageSales(long[] sales) {
        double Average;
        double Summary = SummarySales(sales);

        Average = Summary / sales.length;
        return Average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int SalesLessAvg(long[] sales) {
        double Average = AvarageSales(sales);
        int LessAvg = 0;
        int Month = 0;

        for (long S : sales) {
            if (Average < S) LessAvg = LessAvg + 1;
        }
        return LessAvg;
    }

    public int SalesMoreAvg(long[] sales) {
        double Average = AvarageSales(sales);
        int MoreAvg = 0;
        int Month = 0;


        for (long S : sales) {
            if (Average > S) MoreAvg = MoreAvg + 1;
        }
        return MoreAvg;
    }

}