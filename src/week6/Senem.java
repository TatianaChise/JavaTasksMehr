package week6;
public class Senem {
    public static boolean validatePassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (isUppercaseLetter(ch)) {
                hasUppercase = true;
            } else if (isLowercaseLetter(ch)) {
                hasLowercase = true;
            } else if (isSpecialCharacter(ch)) {
                hasSpecialChar = true;
            } else if (isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }

    private static boolean isUppercaseLetter(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    private static boolean isLowercaseLetter(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    private static boolean isSpecialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*(),.?\":{}|<>";
        return specialCharacters.indexOf(ch) != -1;
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static void main(String[] args) {
        String password = "MyPassword123!";
        boolean isValid = validatePassword(password);
        System.out.println("Is password valid? " + isValid);
    }
}
