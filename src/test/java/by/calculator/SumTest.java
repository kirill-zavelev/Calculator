package by.calculator;

import by.calculator.util.DataProviderForTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {

    @Test(groups = {"smoke"}, dataProvider = "dataProviderForSumOfIntegers", dataProviderClass = DataProviderForTests.class,
            description = "The test checks different variations for sum of integers", priority = 1, threadPoolSize = 2)
    public void checkSum(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.sum(a, b), expectedResult, String.format(MESSAGE, expectedResult));
    }
}
