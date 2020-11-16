package datestuff;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class DateStuffTest {
    @Test
    public void nadaChromMapFtpFileName() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, Calendar.JUNE);
        cal.set(Calendar.YEAR, 2020);
        Date date = cal.getTime();

        String strDate = DateStuff.nadaChromMapFtpFileName(date);
        assertEquals("NadaChromeMap_2020Jun.zip", strDate);
    }
}