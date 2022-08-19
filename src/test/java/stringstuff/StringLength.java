package stringstuff;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringLength {

    @Test
    public void testStringTruncate() {
        String str = "1234567890";
        assertEquals(10, str.length());
        String shortStr = str.substring(0, 5);
        assertEquals(5, shortStr.length());
        assertEquals("12345", shortStr);
    }
}
