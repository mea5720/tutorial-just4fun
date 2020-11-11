package datestuff;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStuff {
    static String nadaChromMapFtpFileName(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'NadaChromeMap_'yyyyMMM'.zip'");
        return simpleDateFormat.format(date);
    }
}
