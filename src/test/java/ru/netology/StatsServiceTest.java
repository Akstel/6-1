package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateTotalSum() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateTotalSum(sales);

       assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        int [] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSum(monthlySales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldFindMonthMax() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMonthMax(sales);

        assertEquals(expected,actual);
    }

    @Test
    void shouldFindMonthMin() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMonthMin(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthBelowAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthAboveAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthAboveAverage(sales);

        assertEquals(expected, actual);
    }
}