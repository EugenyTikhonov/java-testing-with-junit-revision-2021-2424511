import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateMethodsTest {
    private CalculateMethods calculateMethods;

    @BeforeEach
    public void initTest(){
        calculateMethods = new CalculateMethods();
    }
    @Test
    public void testDivide() {
        assertEquals(10, calculateMethods.divide(100, 10));
    }

    @Test
    public void testDivideByZero() {
        int a=100;
        int b=0;
        assertThrows(ArithmeticException.class, () -> calculateMethods.divide(a, b));
    }
}
