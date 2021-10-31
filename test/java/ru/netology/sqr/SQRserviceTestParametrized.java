package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRserviceTestParametrized {
    @ParameterizedTest
    @CsvSource(value = {"random, 200, 300, 3",
            "zeroes, 0, 0, 0", "obviouslyInvalid, -200, -300, 0", "bigRange, 20, 900000000, 90"
    })
    void shouldCalculateForDifferentValues(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRservice service = new SQRservice();
        int actualCount = service.calculateCount(lowerLimit, upperLimit);
        assertEquals(actualCount, expected);
    }
}