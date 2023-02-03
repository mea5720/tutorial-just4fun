package datestuff;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class DateStuffParseTest {
    @Test
    public void parseGoodStringTest() {
        Calendar cal = Calendar.getInstance();
        Date dateToday = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, 4);
        cal.set(Calendar.MONTH, Calendar.NOVEMBER);
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date dateExp = cal.getTime();

        Date dateAct = DateStuff.makeDateFromString("2022-11-04 18:25:49.0");

        int dateComparison = dateToday.compareTo(dateAct);
        assertTrue(dateComparison > 0);

        assertEquals(dateExp, dateAct);
    }

    @Test
    public void parseBadStringTest() {
        Date dateAct = DateStuff.makeDateFromString("11/4/2022");
        assertNull(dateAct);
    }
}