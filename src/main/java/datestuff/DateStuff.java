package datestuff;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStuff {
    public static void main(String... argv) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        Date date = cal.getTime();

        String strDate = nadaChromMapFtpFileName(date);
        System.out.println("strDate: '" + strDate + "'");
        System.out.println("\"NadaChromeMap_2020Nov.zip\".equals(strDate): " + "NadaChromeMap_2020Nov.zip".equals(strDate));
    }

    static String nadaChromMapFtpFileName(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'NadaChromeMap_'yyyyMMM'.zip'");
        return simpleDateFormat.format(date);
    }
}
