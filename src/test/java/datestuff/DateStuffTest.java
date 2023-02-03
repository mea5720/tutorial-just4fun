package datestuff;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class DateStuffTest {
    @Test
    public void nadaChromMapFtpFileName() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 11);
        cal.set(Calendar.MONTH, Calendar.JUNE);
        cal.set(Calendar.YEAR, 2020);
        Date date = cal.getTime();

        String strDate = DateStuff.nadaChromMapFtpFileName(date);
        assertEquals("NadaChromeMap_2020Jun.zip", strDate);

    }

    @Test
    public void dateMinus90Tesyt() {
        LocalDate localDate = LocalDate.of(2022, Month.NOVEMBER, 20);
        String dateMinus90 = DateStuff.lossDateMinus90(localDate);
        assertEquals("August 22, 2022", dateMinus90);
    }
}