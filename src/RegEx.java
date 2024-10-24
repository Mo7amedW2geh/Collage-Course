import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        Pattern usernamePattern = Pattern.compile("^[^{#%^~?/“|‘\\-\\\\\\s}]{5,8}$");
        Pattern emailAddressPattern = Pattern.compile("^([\\w.]{2,})@([\\w]{2,})\\.([\\w]{2,4})$");
        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9]).{8,}$");



        String username, emailAddress, password;
        Scanner ni = new Scanner(System.in);
        System.out.print("Username: ");
        //Check for username
        while (true) {
            username = ni.nextLine();
            Matcher matcher = usernamePattern.matcher(username);
            if (!matcher.matches()) {
                System.out.println("-Username mustn't contain any of these characters {# % ^ ~ ? / \\ “ | ‘ -} in addition\n" +
                        "to the white space.");
                System.out.println("-Username must be more than 5 characters and less than 8");
                System.out.print("Username: ");
                continue;
            }
            break;
        }
        System.out.print("Email address: ");
        //Check for email address
        while (true) {
            emailAddress = ni.nextLine();
            Matcher matcher = emailAddressPattern.matcher(emailAddress);
            if (!matcher.matches()) {
                System.out.println("-Email address must contain @ and <.> or <_> i.e. mo_salah");
                System.out.println("-Domain must contain <.> i.e. .net or .com");
                System.out.println("-Domain name length mustn't be shorter than 2 characters i.e. gmail");
                System.out.print("Email address: ");
                continue;
            }
            break;
        }
        System.out.print("Password: ");
        //Check for password
        while (true) {
            password = ni.nextLine();
            Matcher matcher = passwordPattern.matcher(password);
            if (!matcher.matches()){
                System.out.println("-Password must contains one number");
                System.out.println("-Password length must be more than or equals eight characters");
                System.out.print("Password: ");
                continue;
            }
            break;
        }
        System.out.println("You have been logged in successfully.");
    }
}
