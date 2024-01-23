package Examples;

import org.junit.jupiter.api.*;

import java.util.Random;

public class CalculatorTest {

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
    @Tag("A")
    @DisplayName("Test for add function")
    public void addTest() {
        int result = calc.add(20, 30);
        System.out.println("Add test is executed");
        System.out.println(result);
        //Assertions
        Assertions.assertEquals(50, result);
    }
    @AfterEach
    public void after()
    {
        System.out.println("after the testing of every Test function");
    }
    @RepeatedTest(4)
    public void addTest1() {
        Random r = new Random();
        int result1 = calc.add(r.nextInt(5), r.nextInt(10));
        Assertions.assertEquals(7, result1);
    }
    @Test
    public void multiplyTest() {
        int result = calc.multiply(10, 10);
        System.out.println("multiplyTest is executed");
        Assertions.assertEquals(100, result);
    }
    @AfterAll
    public static void end()
    {
        System.out.println("Last step of the test");
    }

}

