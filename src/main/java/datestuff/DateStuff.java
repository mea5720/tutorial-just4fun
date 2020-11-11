package datestuff;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStuff {
    public static void main(String... argv) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        Date date = cal.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'NadaChromeMap_'yyyyMMM'.zip'");
        String strDate = simpleDateFormat.format(date);
        System.out.println("strDate: '" + strDate + "'");
        System.out.println("\"NadaChromeMap_2020Nov.zip\".equals(strDate): " + "NadaChromeMap_2020Nov.zip".equals(strDate));
    }
}
