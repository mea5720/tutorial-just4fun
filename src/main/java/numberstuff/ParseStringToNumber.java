package numberstuff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseStringToNumber {
    private static Pattern pattern = Pattern.compile("^[0-9]+$");

    public static void main(String... args) {
        String twoZs = "00";
        String fourZs = "0000";
        String twoZsTrailing = "00abce";
        String twoZsPreceding = "abcd00";


        Matcher matcher = null;
        if (pattern.matcher(twoZs).matches()) {
            System.out.printf("'%s' -> %d\n", twoZs, Integer.parseInt(twoZs));
        } else {
            System.out.printf("'%s' is not a number\n", twoZs);
        }
        if (pattern.matcher(fourZs).matches()) {
            System.out.printf("'%s' -> %d\n", fourZs, Integer.parseInt(fourZs));
        } else {
            System.out.printf("'%s' is not a number\n", fourZs);
        }
        matcher = pattern.matcher(twoZsTrailing);
        if (matcher.matches()) {
            System.out.printf("'%s' -> %d\n", twoZsTrailing, Integer.parseInt(twoZsTrailing));
        } else {
            System.out.printf("'%s' is not a number\n", twoZsTrailing);
        }
        matcher = pattern.matcher(twoZsPreceding);
        if (matcher.matches()) {
            System.out.printf("'%s' -> %d\n", twoZsPreceding, Integer.parseInt(twoZsPreceding));
        } else {
            System.out.printf("'%s' is not a number\n", twoZsPreceding);
        }
        String foo = null;
        if (foo != null && pattern.matcher(foo).matches()) {
            System.out.printf("'%s' -> %d\n", foo, Integer.parseInt(foo));
        } else {
            System.out.printf("'%s' is not a number\n", foo);
        }
    }
}
