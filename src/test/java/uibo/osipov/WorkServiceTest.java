package uibo.osipov;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class WorkServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv")
    void shouldCalculateCsv(int expected, int income, int expenses, int threshold) {
        WorkService test = new WorkService();
        int actual = test.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
