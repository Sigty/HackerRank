package solving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:22AM"));
    }

    private static String timeConversion(String s) {
        Pattern patternAM = Pattern.compile("(AM|am)");
        Pattern patternPM = Pattern.compile("(PM|pm)");
        Matcher matchAM = patternAM.matcher(s);
        Matcher matchPM = patternPM.matcher(s);
        if (matchAM.find()) {
            String baseAM = s.split(":")[0].trim();
            int am = Integer.parseInt(baseAM);
            String s0 = s.replaceAll("(PM|pm|AM|am)", "").trim();
            if (am >= 12) {
                am -= 12;
                return s0.replaceAll(baseAM, "0" + am + "").trim();
            }
            return s0;
        } else if (matchPM.find()) {
            String basePM = s.split(":")[0].trim();
            int pm = Integer.parseInt(basePM);
            String s1 = s.replaceAll("(PM|pm|AM|am)", "").trim();
            if (pm < 12) {
                pm += 12;
                return s1.replaceAll(basePM, pm + "").trim();
            }
            return s1;
        } else {
            return "invalid values";
        }
    }
}