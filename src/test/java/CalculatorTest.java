import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest{

    private Main calculator;

    @Before
    public void setUp() {calculator = new Main();}

    // Addition

    @Test
    public void test_add_positive(){
        int a = 1;
        int b = 2;

        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b));
    }

   @Test
    public void test_add_negative(){
        int a = 1;
        int b = 2;

        int expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }


    // Subtraction

    @Test
    public void test_sub_positive(){
        int a = 5;
        int b = 2;

        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.subtract(a, b));
    }

   @Test
    public void test_sub_negative(){
        int a = 5;
        int b = 2;

        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.subtract(a, b));
    }



    // Multiplication

    @Test
    public void test_mul_positive(){
        int a = 5;
        int b = 2;

        int expectedResult = 10;
        Assert.assertEquals(expectedResult, calculator.multiply(a, b));
    }

   @Test
    public void test_mul_negative(){
        int a = 5;
        int b = 2;

        int expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.multiply(a, b));
    }


    // Division

    @Test
    public void test_div_positive(){
        int a = 6;
        int b = 2;

        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.divide(a, b));
    }

   @Test
    public void test_div_negative(){
        int a = 5;
        int b = 2;

        int expectedResult = 4;
        Assert.assertNotEquals(expectedResult, calculator.divide(a, b));
    }

}