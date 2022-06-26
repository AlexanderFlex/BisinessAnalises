package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServicesTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void FindSummaryTest() {
        StatsService Sum = new StatsService();

        long expectedSum = 180;
        long actualSum = Sum.SummarySales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void FindAvarageTest() {
        StatsService Avg = new StatsService();

        double expectedAvg = 15.0;
        double actualAvg = Avg.AvarageSales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void FindMaxSalesMonth() {
        StatsService MaxMonth = new StatsService();

        int excpectedMonth = 8;
        int actualMonth = MaxMonth.maxSales(sales);

        Assertions.assertEquals(excpectedMonth, actualMonth);
    }

    @Test
    public void FindMinSalesMonth() {
        StatsService MinMonth = new StatsService();

        int excpectedMonth = 9;
        int actualMonth = MinMonth.minSales(sales);

        Assertions.assertEquals(excpectedMonth, actualMonth);
    }

    @Test
    public void FindSalesLessAvg() {
        StatsService LessAvg = new StatsService();

        int excpectedLessAvg = 5;
        int actualLessAvg = LessAvg.SalesLessAvg(sales);

        Assertions.assertEquals(excpectedLessAvg, actualLessAvg);
    }

    @Test
    public void FindSalesMoreAvg() {
        StatsService MoreAvg = new StatsService();

        int excpectedMoreAvg = 5;
        int actualMoreAvg = MoreAvg.SalesLessAvg(sales);

        Assertions.assertEquals(excpectedMoreAvg, actualMoreAvg);
    }
}