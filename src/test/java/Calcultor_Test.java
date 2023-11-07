import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Calcultor_Test{
    private Main calculator;
    @Before
    public void setUp(){
        calculator = new Main();
    }

    @Test
    public void test_add_positive(){
        int x = 1;
        int y = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(x, y));
    }

    @Test
    public void test_add_negative(){
        int x = 1;
        int y = 2;

        int expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.add(x, y));
    }

    @Test
    public void test_sub_positive(){
        int x = 5;
        int y = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.sub(x, y));
    }

    @Test
    public void test_sub_negative(){
        int x = 5;
        int y = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.sub(x, y));
    }

    @Test
    public void test_mul_positive(){
        int x = 5;
        int y = 2;
        int expectedResult = 10;
        Assert.assertEquals(expectedResult, calculator.mul(x, y));
    }

    @Test
    public void test_mul_negative(){
        int x = 5;
        int y = 2;
        int expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.mul(x, y));
    }

    @Test
    public void test_div_positive(){
        int x = 6;
        int y = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.div(x, y));
    }
    @Test
    public void test_div_negative(){
        int x = 5;
        int y = 2;
        int expectedResult = 4;
        Assert.assertNotEquals(expectedResult, calculator.div(x, y));
    }

}