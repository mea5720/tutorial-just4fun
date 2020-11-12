package datestuff;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStuff {
    private static final String FILE_PATTERN = "'NadaChromeMap_'yyyyMMM'.zip'";

    static String nadaChromMapFtpFileName(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FILE_PATTERN);
        return simpleDateFormat.format(date);
    }
}
