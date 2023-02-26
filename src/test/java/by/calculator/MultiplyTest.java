package by.calculator;

import by.calculator.util.DataProviderForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest extends BaseTest {

    @Test(dataProvider = "dataProviderForMultiplyOfIntegers", dataProviderClass = DataProviderForTests.class,
            description = "The test checks different variations for multiply of integers", priority = 3)
    public void checkMultiplication(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.multiply(a, b), expectedResult, String.format(MESSAGE, expectedResult));
    }
}
