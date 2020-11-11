package stringstuff;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class MatchStringInListTest {
    @Test
    public void splitStringNormal() {
        String comma = "foo,bar,baz";
        String[] stringsComma = MatchStringInList.splitString(comma);
        assertNotNull(stringsComma);
        assertEquals(3, stringsComma.length);
        assertEquals("foo", stringsComma[0]);
        assertEquals("bar", stringsComma[1]);
        assertEquals("baz", stringsComma[2]);
    }

    @Test
    public void splitStringNoComma() {
        String noComma = "foo";
        String[] stringsNoComma = MatchStringInList.splitString(noComma);
        assertNotNull(stringsNoComma);
        assertEquals(1, stringsNoComma.length);
        assertEquals("foo", stringsNoComma[0]);
    }

    @Test
    public void splitStringEndComma() {
        String endComma = "bar,";
        String[] stringsEndComma = MatchStringInList.splitString(endComma);
        assertNotNull(stringsEndComma);
        assertEquals(1, stringsEndComma.length);
        assertEquals("bar", stringsEndComma[0]);
    }

    @Test
    public void splitStringStartComma() {
        String beginComma = ",bar";
        String[] stringsBeginComma = MatchStringInList.splitString(beginComma);
        assertNotNull(stringsBeginComma);
        assertEquals(2, stringsBeginComma.length);
        assertEquals("", stringsBeginComma[0]);
        assertEquals("bar", stringsBeginComma[1]);
    }

    @Test
    public void testStartEndWith() {
        assertTrue("bar.foo".startsWith(""));
        assertTrue("bar.foo".endsWith(""));
    }
}