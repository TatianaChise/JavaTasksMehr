package week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class senem {
    public static String getFrequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result.append((char) i);
                result.append(frequency[i]);
            }
        }

        return result.toString();
    }

    public static boolean isSameLetters(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            uniqueChars.add(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : uniqueChars) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Frequency of Characters
        String input1 = "AAABBCDD";
        String frequencyResult = getFrequencyOfChars(input1);
        System.out.println("Frequency of Characters: " + frequencyResult);

        // Same Letters
        String input2 = "abc";
        String input3 = "cab";
        boolean sameLettersResult = isSameLetters(input2, input3);
        System.out.println("Same Letters: " + sameLettersResult);

        // Remove Duplicates
        String input4 = "AAABBBCCC";
        String removeDuplicatesResult = removeDuplicates(input4);
        System.out.println("Remove Duplicates: " + removeDuplicatesResult);
    }
}