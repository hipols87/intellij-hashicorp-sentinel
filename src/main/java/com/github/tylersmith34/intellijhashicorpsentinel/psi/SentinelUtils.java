package com.github.tylersmith34.intellijhashicorpsentinel.psi;

public class SentinelUtils {
    public static String removeQuotes(String text) {
        if ((isFirst(text, "\"") || isFirst(text, "'")) &&
                (isLast(text, "\"") || isLast(text, "'"))) {
            return text.substring(1, text.length() - 1);
        }
        return text;
    }

    private static boolean isLast(String sb, String s) {
        return sb.lastIndexOf(s) == sb.length() - 1;
    }

    private static boolean isFirst(String text, String toFind) {
        return text.indexOf(toFind) == 0;
    }
}
