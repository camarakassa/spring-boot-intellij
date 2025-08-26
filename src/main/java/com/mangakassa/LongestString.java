package com.mangakassa;

import java.util.List;

public class LongestString {

    public String find(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return null; // or throw an exception if you prefer
        }

        String longest = "";
        longest = getString(strings, longest);
        return longest;
    }

    private static String getString(List<String> strings, String longest) {
        for (String str : strings) {
            if (str != null && str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}
