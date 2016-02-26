package com.test.string;

public class TestString {
    
    public static void main(String[] args) {
        System.out.println(removeChar("sunita", 'a'));
    }
    
    private static String removeChar(String str, char a) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr != a) {
                strBuilder.append(chr);
            }
        }
        return strBuilder.toString();
    }

}
