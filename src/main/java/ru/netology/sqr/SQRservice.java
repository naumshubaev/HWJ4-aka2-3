package ru.netology.sqr;

public class SQRservice {
    public int calculateCount(int lowerLimit, int upperLimit) {
        int count = 0;


        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                count++;


/*
 for reference only - if i <= 99 then нет разницы, корректно работает i * i

        for (int i = 10; i <= 99; i++) {
            double iSquare = java.lang.Math.pow(i, 2);
            if (iSquare >= lowerLimit && i * i <= upperLimit) {
                count++;
*/
            }
        }
        return count;
    }
}