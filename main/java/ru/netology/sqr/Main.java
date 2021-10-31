package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRservice service = new SQRservice();

        int lowerLimit = 20;
        int upperLimit = 300_000_000;
        int expected = 90;
        int actualCount = service.calculateCount(lowerLimit, upperLimit);
        boolean passed = expected == actualCount;

        System.out.println(actualCount);
        System.out.println("The basic test passed == " + passed);
    }
}