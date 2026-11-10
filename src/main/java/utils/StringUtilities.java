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
    //Searching for data in a String array using standard linear search
    /**
     * Searches for the first occurrence of a string.
     *
     * @param text the array to search
     * @param value the string to find
     * @return the index of the first match, or -1 if it is not found
     */
    public static int linearSearch(String[] text, String value){
        for(int i = 0; i < text.length; i ++) {
            if (text[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

}
