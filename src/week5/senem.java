package week5;

public class senem {
    public static String findUniqueCharacters(String input) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                uniqueChars.append(currentChar);
            }
        }

        return uniqueChars.toString();
    }

    public static String reverseString(String input) {
        StringBuilder reversedString = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String uniqueChars = findUniqueCharacters(input);
        System.out.println("Unique characters: " + uniqueChars);

        String reversedString = reverseString("ABCD");
        System.out.println("Reversed string: " + reversedString);
    }
}
