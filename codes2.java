import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator { // public classs

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Not a Valid Password");
        }
    }

    private static boolean isValidPassword(String password) {
        // Minimum and maximum length criteria
        if (password.length() < 6 || password.length() > 16) {
            return false;
        }

        // At least 1 letter between [a-z] and 1 letter between [A-Z]
        if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*")) {
            return false;
        }

        // At least 1 number between [0-9]
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // At least 1 character from [$#@]
        Pattern specialCharPattern = Pattern.compile("[$#@]");
        Matcher matcher = specialCharPattern.matcher(password);
        if (!matcher.find()) {
            return false;
        }

        // All criteria met, the password is valid
        return true;
    }
}
