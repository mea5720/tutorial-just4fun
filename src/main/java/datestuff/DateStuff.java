package datestuff;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateStuff {
    private static final String FILE_PATTERN = "'NadaChromeMap_'yyyyMMM'.zip'";

    static String nadaChromMapFtpFileName(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FILE_PATTERN);
        return simpleDateFormat.format(date);
    }

    static String lossDateMinus90(LocalDate lossDate) {
        GregorianCalendar calLossDate = new GregorianCalendar();

        //String calLossDateStr = fmt.format(calLossDate.getTime());
        String lossDateStr = DateTimeFormatter.ofPattern("MMMM dd, yyyy").format(lossDate);
        System.out.println("lossDateStr =" + lossDateStr);
        LocalDate lossDateMinus90 = lossDate.minusDays(90);
        String lossDateMinus90Str = DateTimeFormatter.ofPattern("MMMM dd, yyyy").format(lossDateMinus90);
        return lossDateMinus90Str;
    }

    static Date makeDateFromString(String dateStr) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = fmt.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Whoa... bummer, man: can't parse " + dateStr);
        }
        return date;
    }
}
