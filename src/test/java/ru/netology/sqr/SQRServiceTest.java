package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/TestData.csv"})
    public void test(int a, int b, int expected) {
        SQRService service = new SQRService();
        int actual = service.numberOfSqr(a, b);

        Assertions.assertEquals(expected, actual);

    }

}
