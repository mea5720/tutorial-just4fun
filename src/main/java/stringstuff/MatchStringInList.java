package stringstuff;

import java.util.ArrayList;
import java.util.List;

public class MatchStringInList {
    static List<String> stringList = new ArrayList<>();

    public static void main(String... argv) {
        stringList.add("blah.txt");
        stringList.add("blahFoo_2020.txt");
        String blah = "blah";
        doesMatch(blah);
        String blahTxt = "blah.txt";
        doesMatch(blahTxt);
        String blahFoo = "blahFoo";
        doesMatch(blahFoo);
        String blahFooTxt = "blahFoo.txt";
        doesMatch(blahFooTxt);
        
    }

    static String[] splitString(String stringToSplit) {
        return splitString(stringToSplit, null);
    }

    static String[] splitString(String stringToSplit, String splitter) {
        String[] retval = null;
        String splitString = ((splitter) != null ? splitter : ",");
        if (stringToSplit != null) {
            retval = stringToSplit.split(",");
        }
        return retval;
    }

    private static void doesMatch(String argString) {
        if (stringList.contains(argString)) {
            System.out.println("stringList contains: " + argString);

        }
    }
}
