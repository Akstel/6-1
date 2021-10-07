package ru.netology;

public class StatsService {
    //Сумма всех продаж
    public int calculateTotalSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public int calculateAverageSum(int[] monthlySales) {

        return calculateTotalSum (monthlySales) / monthlySales.length;

    }

    // Номер месяца с пиком продаж
    public int findMonthMax(int[] sales) {
        int monthMax = 0;
        int maxSale = sales [0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    // Номер месяца с минимумом продаж
    public int findMonthMin(int[] sales) {
        int monthMin = 0;
        int minSale = sales [0];
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int calculateMonthBelowAverage(int[] sales) {
        int monthAverage = calculateAverageSum(sales);
        int amountBelow = 0;
        for (int sale : sales) {
            if (sale < monthAverage) {
                amountBelow++;
            }
        }
        return amountBelow;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int calculateMonthAboveAverage(int[] sales) {
        int monthAverage = calculateAverageSum(sales);
        int amountAbove = 0;
        for (int sale : sales) {
            if (sale > monthAverage) {
                amountAbove++;
            }
        }
        return amountAbove;
    }
}
