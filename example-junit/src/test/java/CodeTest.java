import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

public class CodeTest {

    @Test
    public void testSayHello() {
        Code code = new Code();
        assertEquals("Hello world!", code.sayHello());
    }
}
