package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRserviceTest {

    @Test
    void shouldCalculateForRandom() {
        SQRservice service = new SQRservice();

        int lowerLimit = 20;
        int upperLimit = 300_000_000;
        int expected = 90;
        int actualCount = service.calculateCount(lowerLimit, upperLimit);
        assertEquals(expected, actualCount);
    }
}