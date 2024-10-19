import java.util.regex.Pattern;
import java.util.*;
public class PasswordChecker {
    public static void main(String[] args) {

        String password = "oiuoiu12!JHHGUY";
System.out.println(password);

        if (isStrongPassword(password)) {
            System.out.println("The password is strong.");
        } else {
            System.out.println("The password is not strong.");
        }
    }

    public static boolean isStrongPassword(String password) {
        // Password must be at least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        // Check for at least one uppercase letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        // Check for at least one lowercase letter
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }

        // Check for at least one digit
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return false;
        }

        // Check for at least one special character
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) {
            return false;
        }

        return true;
    }
}
