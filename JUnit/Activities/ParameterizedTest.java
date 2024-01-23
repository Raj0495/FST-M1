package Examples;

import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Date;

public class ParameterizedTest {

    @org.junit.jupiter.params.ParameterizedTest
    @CsvFileSource(files = "src/test/resources/input.csv", numLinesToSkip = 1, nullValues = "-")
    public void csvTest(ArgumentsAccessor args)
    {
        System.out.println(args.getString(0) + "," + args.get(1, Date.class) + "," +args.getDouble(2)+ " " + args.get(3));
    }
}
