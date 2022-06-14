package org.example;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        final String string = "Test string";
        System.out.println("Original string: " + string);

        final char charAt = string.charAt(1);
        System.out.println("Char at index '1': " + charAt);

        final String substring = string.substring(2);
        System.out.println("Substring starting from index '2': " + substring);

        final String substring1 = string.substring(2, 6);
        System.out.println("Substring from index '2' to index '6' (not inclusive) : " + substring1);

        final String[] split = string.split("t");
        System.out.println("Array of substrings split by 't': " + Arrays.toString(split));

        final CharSequence charSequence = string.subSequence(2, 6);
        System.out.println("Char sequence from index '2' to index '6': " + charSequence);

        final String anotherString = "   Another test String    ";
        System.out.println("String before trim():" + anotherString + ":String after trim():" + anotherString.trim());

        final int indexOfTChar = string.indexOf('t');
        System.out.println("First index of 't' char: " + indexOfTChar);

        final int lastIndexOfTChar = string.lastIndexOf('t');
        System.out.println("Last index of 't' char: " + lastIndexOfTChar);

        final int indexOfSTString = string.indexOf("st");
        System.out.println("First index of 'st' substring: " + indexOfSTString);

        final int lastIndexOfSTString = string.lastIndexOf("st");
        System.out.println("Last index of 'st' substring: " + lastIndexOfSTString);

        final boolean containsSTString = string.contains("st");
        System.out.println("Original string contains substring 'st': " + containsSTString);

        final boolean containsHJK = string.contains("hjk");
        System.out.println("Original string contains substring: 'hjk': " + containsHJK);

        final String replaceTWithF = string.replace("t", "f");
        System.out.println("Original string after replacing 't' with 'f': " + replaceTWithF);

        final String replaceSTWithFR = string.replace("st", "fr");
        System.out.println("Original string after replacing 'st' with 'fr': " + replaceSTWithFR);

        final String replaceFirst = string.replaceFirst("st", "fr");
        System.out.println("Original string after replacing first 'st' with 'fr': " + replaceFirst);

        final boolean startsWith = string.startsWith("Test");
        System.out.println("Original string starts with 'Test': " + startsWith);

        final boolean endsWith = string.endsWith("foo");
        System.out.println("Original string ends with 'foo': " + endsWith);

        final StringBuilder stringBuilder = new StringBuilder("String builder test");

        final StringBuilder appendedStringBuilder = stringBuilder.append(" with appended string");
        System.out.println("Original string builder string after appending: " + appendedStringBuilder);
        System.out.println(stringBuilder.hashCode());
        System.out.println(appendedStringBuilder.hashCode());
        System.out.println(stringBuilder.equals(appendedStringBuilder));
    }
}
