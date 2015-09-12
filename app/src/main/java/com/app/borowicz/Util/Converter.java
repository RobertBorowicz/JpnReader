package com.app.borowicz.Util;

/**
 * Created by Robert on 9/10/2015.
 */
public class Converter {

    public String convertToHiragana(String word) {

        if (word == null) return null;
        if (word.length() == 0) return "";

        StringBuilder converted = new StringBuilder(word.length());

        for (int i = 0; i < word.length(); i++) {
            char curr_char = word.charAt(i);

            if (isFullKatakana(curr_char)) {
                curr_char = (char) (curr_char - 0x60);
            }

            converted.append(curr_char);
        }

        return converted.toString();
    }

    public boolean isHiragana(char c) {
        if (c >= '\u3041' && c <= '\u3094') return true;

        return false;
    }

    public boolean isFullKatakana(char c) {
        //Full width
        if (c >= '\u30A1' && c <= '\u30FB') return true;

        return false;
    }

    public boolean isHalfKatakana(char c) {
        //Half width
        if (c >= '\uff65' && c <= '\uff9f') return true;

        return false;
    }

    public boolean isKanji(char c) {
        if (c >= '\u4e00' && c <= '\u9fa5') return true;

        return false;
    }
}
