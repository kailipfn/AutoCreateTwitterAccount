package blm.utils;

public class NumberUtils {
    public static boolean isNumber(String val) {
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException nfex) {
            return false;
        }
    }

    public static int parseInt(String val) {
        return Integer.parseInt(val);
    }
}

