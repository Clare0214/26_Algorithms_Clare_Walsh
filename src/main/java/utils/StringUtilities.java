package utils;

import  java.util.Objects;
public class StringUtilities {
    public static String[] deduplicate(String[] text) {
        if (text == null) {
            throw new IllegalArgumentException("The array must not be null.");
        }
        String[] filtered = new String[0];

        for (String value : text) {
            boolean alreadySeen = false;

            for (String existing : filtered) {
                if (Objects.equals(existing, value)) {
                    alreadySeen = true;
                    break;
                }
            }
            if (!alreadySeen) {
                String[] largerFiltered = new String[filtered.length + 1];

                for (int i = 0; i < filtered.length; i++) {
                    largerFiltered[i] = filtered[i];
                }
                largerFiltered[filtered.length] = value;
                filtered = largerFiltered;
            }
        }
        return filtered;
    }
}
