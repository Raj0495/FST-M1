package Examples;

import org.junit.jupiter.api.*;

public class TestCalculator {

    static Calculator calc;
    @BeforeAll
    public static void setUp() {
        calc = new Calculator();
        System.out.println("Before All tests object is created");
    }
    @BeforeEach
    public void each()
    {
        System.out.println("Before the every Test function");
    }


    @Test
    @Tag("B")
    public void multiplyTest() {
        int result = calc.multiply(10, 10);
        System.out.println("multiplyTest is executed");
        System.out.println(result);
        Assertions.assertEquals(100, result);
    }
    @AfterAll
    public static void end()
    {
        System.out.println("Last step of the test");
    }
}
